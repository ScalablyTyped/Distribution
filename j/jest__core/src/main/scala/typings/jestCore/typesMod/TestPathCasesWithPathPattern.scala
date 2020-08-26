package typings.jestCore.typesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.jestCore.anon.IsMatch
import typings.jestTypes.configMod.Path
import typings.std.FlatArray
import typings.std.IterableIterator
import typings.std.anon.CopyWithin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jest/core.@jest/core/build/types.TestPathCases & {testPathPattern (path : @jest/types.@jest/types.Config.Path): boolean} */
@js.native
trait TestPathCasesWithPathPattern extends /* n */ NumberDictionary[IsMatch] {
  /** Iterator */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[IsMatch]] = js.native
  /**
    * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
    */
  var length: Double = js.native
  /**
    * Returns an object whose properties have the value 'true'
    * when they will be absent when used in a 'with' statement.
    */
  @JSName(js.Symbol.unscopables)
  var unscopables: js.Function0[CopyWithin] = js.native
  /**
    * Combines two or more arrays.
    * @param items Additional items to add to the end of array1.
    */
  def concat(items: (js.Array[IsMatch] | IsMatch)*): js.Array[IsMatch] = js.native
  /**
    * Returns the this object after copying a section of the array identified by start and end
    * to the same array starting at position target
    * @param target If target is negative, it is treated as length+target where length is the
    * length of the array.
    * @param start If start is negative, it is treated as length+start. If end is negative, it
    * is treated as length+end.
    * @param end If not specified, length of the this object is used as its default value.
    */
  def copyWithin(target: Double, start: Double): this.type = js.native
  def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
  /**
    * Returns an iterable of key, value pairs for every entry in the array
    */
  def entries(): IterableIterator[js.Tuple2[Double, IsMatch]] = js.native
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param callbackfn A function that accepts up to three arguments. The every method calls
    * the callbackfn function for each element in the array until the callbackfn returns a value
    * which is coercible to the Boolean value false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def every(
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], _]
  ): Boolean = js.native
  def every(
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], _],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Returns the this object after filling the section identified by start and end with value
    * @param value value to fill array section with
    * @param start index to start filling the array at. If start is negative, it is treated as
    * length+start where length is the length of the array.
    * @param end index to stop filling the array at. If end is negative, it is treated as
    * length+end.
    */
  def fill(value: IsMatch): this.type = js.native
  def fill(value: IsMatch, start: js.UndefOr[scala.Nothing], end: Double): this.type = js.native
  def fill(value: IsMatch, start: Double): this.type = js.native
  def fill(value: IsMatch, start: Double, end: Double): this.type = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def filter(
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], _]
  ): js.Array[IsMatch] = js.native
  def filter(
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], _],
    thisArg: js.Any
  ): js.Array[IsMatch] = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  @JSName("filter")
  def filter_S_IsMatch[S /* <: IsMatch */](
    callbackfn: js.Function3[
      /* value */ IsMatch, 
      /* index */ Double, 
      /* array */ js.Array[IsMatch], 
      /* is S */ Boolean
    ]
  ): js.Array[S] = js.native
  @JSName("filter")
  def filter_S_IsMatch[S /* <: IsMatch */](
    callbackfn: js.Function3[
      /* value */ IsMatch, 
      /* index */ Double, 
      /* array */ js.Array[IsMatch], 
      /* is S */ Boolean
    ],
    thisArg: js.Any
  ): js.Array[S] = js.native
  def find(predicate: js.Function3[/* value */ IsMatch, /* index */ Double, /* obj */ js.Array[IsMatch], _]): js.UndefOr[IsMatch] = js.native
  def find(
    predicate: js.Function3[/* value */ IsMatch, /* index */ Double, /* obj */ js.Array[IsMatch], _],
    thisArg: js.Any
  ): js.UndefOr[IsMatch] = js.native
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def find[S /* <: IsMatch */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ IsMatch, 
      /* index */ Double, 
      /* obj */ js.Array[IsMatch], 
      /* is S */ Boolean
    ]
  ): js.UndefOr[S] = js.native
  def find[S /* <: IsMatch */](
    predicate: js.ThisFunction3[
      /* this */ Unit, 
      /* value */ IsMatch, 
      /* index */ Double, 
      /* obj */ js.Array[IsMatch], 
      /* is S */ Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S] = js.native
  /**
    * Returns the index of the first element in the array where predicate is true, and -1
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found,
    * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def findIndex(predicate: js.Function3[/* value */ IsMatch, /* index */ Double, /* obj */ js.Array[IsMatch], _]): Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ IsMatch, /* index */ Double, /* obj */ js.Array[IsMatch], _],
    thisArg: js.Any
  ): Double = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
  def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
  /**
    * Calls a defined callback function on each element of an array. Then, flattens the result into
    * a new array.
    * This is identical to a map followed by flat with depth 1.
    *
    * @param callback A function that accepts up to three arguments. The flatMap method calls the
    * callback function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callback function. If
    * thisArg is omitted, undefined is used as the this value.
    */
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ IsMatch, 
      /* index */ Double, 
      /* array */ js.Array[IsMatch], 
      U | js.Array[U]
    ]
  ): js.Array[U] = js.native
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ IsMatch, 
      /* index */ Double, 
      /* array */ js.Array[IsMatch], 
      U | js.Array[U]
    ],
    thisArg: This
  ): js.Array[U] = js.native
  /**
    * Performs the specified action for each element in an array.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], Unit],
    thisArg: js.Any
  ): Unit = js.native
  /**
    * Determines whether an array includes a certain element, returning true or false as appropriate.
    * @param searchElement The element to search for.
    * @param fromIndex The position in this array at which to begin searching for searchElement.
    */
  def includes(searchElement: IsMatch): Boolean = js.native
  def includes(searchElement: IsMatch, fromIndex: Double): Boolean = js.native
  /**
    * Returns the index of the first occurrence of a value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
    */
  def indexOf(searchElement: IsMatch): Double = js.native
  def indexOf(searchElement: IsMatch, fromIndex: Double): Double = js.native
  /**
    * Adds all the elements of an array separated by the specified separator string.
    * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
    */
  def join(): String = js.native
  def join(separator: String): String = js.native
  /**
    * Returns an iterable of keys in the array
    */
  def keys(): IterableIterator[Double] = js.native
  /**
    * Returns the index of the last occurrence of a specified value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
    */
  def lastIndexOf(searchElement: IsMatch): Double = js.native
  def lastIndexOf(searchElement: IsMatch, fromIndex: Double): Double = js.native
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], U]
  ): js.Array[U] = js.native
  def map[U](
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  /**
    * Removes the last element from an array and returns it.
    */
  def pop(): js.UndefOr[IsMatch] = js.native
  /**
    * Appends new elements to an array, and returns the new length of the array.
    * @param items New elements of the Array.
    */
  def push(items: IsMatch*): Double = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ IsMatch, 
      /* currentValue */ IsMatch, 
      /* currentIndex */ Double, 
      /* array */ js.Array[IsMatch], 
      IsMatch
    ]
  ): IsMatch = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ IsMatch, 
      /* currentValue */ IsMatch, 
      /* currentIndex */ Double, 
      /* array */ js.Array[IsMatch], 
      IsMatch
    ],
    initialValue: IsMatch
  ): IsMatch = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduce[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ IsMatch, 
      /* currentIndex */ Double, 
      /* array */ js.Array[IsMatch], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ IsMatch, 
      /* currentValue */ IsMatch, 
      /* currentIndex */ Double, 
      /* array */ js.Array[IsMatch], 
      IsMatch
    ]
  ): IsMatch = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ IsMatch, 
      /* currentValue */ IsMatch, 
      /* currentIndex */ Double, 
      /* array */ js.Array[IsMatch], 
      IsMatch
    ],
    initialValue: IsMatch
  ): IsMatch = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduceRight[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ IsMatch, 
      /* currentIndex */ Double, 
      /* array */ js.Array[IsMatch], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * Reverses the elements in an Array.
    */
  def reverse(): js.Array[IsMatch] = js.native
  /**
    * Removes the first element from an array and returns it.
    */
  def shift(): js.UndefOr[IsMatch] = js.native
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array. This is exclusive of the element at the index 'end'.
    */
  def slice(): js.Array[IsMatch] = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): js.Array[IsMatch] = js.native
  def slice(start: Double): js.Array[IsMatch] = js.native
  def slice(start: Double, end: Double): js.Array[IsMatch] = js.native
  /**
    * Determines whether the specified callback function returns true for any element of an array.
    * @param callbackfn A function that accepts up to three arguments. The some method calls
    * the callbackfn function for each element in the array until the callbackfn returns a value
    * which is coercible to the Boolean value true, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def some(
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], _]
  ): Boolean = js.native
  def some(
    callbackfn: js.Function3[/* value */ IsMatch, /* index */ Double, /* array */ js.Array[IsMatch], _],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Sorts an array.
    * @param compareFn Function used to determine the order of the elements. It is expected to return
    * a negative value if first argument is less than second argument, zero if they're equal and a positive
    * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
    * ```ts
    * [11,2,22,1].sort((a, b) => a - b)
    * ```
    */
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ IsMatch, /* b */ IsMatch, Double]): this.type = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    */
  def splice(start: Double): js.Array[IsMatch] = js.native
  def splice(start: Double, deleteCount: Double): js.Array[IsMatch] = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    * @param items Elements to insert into the array in place of the deleted elements.
    */
  def splice(start: Double, deleteCount: Double, items: IsMatch*): js.Array[IsMatch] = js.native
  def testPathPattern(path: Path): Boolean = js.native
  /**
    * Inserts new elements at the start of an array.
    * @param items  Elements to insert at the start of the Array.
    */
  def unshift(items: IsMatch*): Double = js.native
  /**
    * Returns an iterable of values in the array
    */
  def values(): IterableIterator[IsMatch] = js.native
}

