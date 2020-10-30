import java.util.*;

/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        if (array.length > 0) {
            return array[0];
        } else {
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        if (array.length > 1) {
            return array[1];
        } else {
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        if (array.length > 0) {
            return array[array.length - 1];
        } else {
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        if (array.length > 1) {
            return array[array.length - 2];
        } else {
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (String temp : array) {
            if (temp.equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        if (array.length > 0) {
            int start = 0;
            int end = array.length - 1;
            while (start < end) {
                String temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
            return array;
        } else {
            return null;
        }
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            if (!array[start].equals(array[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Set<Character> set = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            set.add(ch);
        }
        for (String str : array) {
            for (char c : str.toLowerCase().toCharArray()) {
                set.remove(c);
            }
        }
        return set.isEmpty();
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int res = 0;
        for (String temp : array) {
            if (temp.equals(value)) {
                res++;
            }
        }
        return res;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> res = new ArrayList<>();
        for (String s : array) {
            if (!s.equals(valueToRemove)) {
                res.add(s);
            }
        }
        return res.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> res = new ArrayList<>();
        res.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                res.add(array[i]);
            }
        }
        return res.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                res.add(sb.toString());
                sb.setLength(0);
                sb.append(array[i]);
            } else {
                sb.append(array[i]);
            }
        }
        res.add(sb.toString());
        return res.toArray(new String[0]);
    }
}