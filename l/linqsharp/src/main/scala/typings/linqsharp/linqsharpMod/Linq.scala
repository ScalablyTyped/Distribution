package typings.linqsharp.linqsharpMod

import typings.linqsharp.linqsharpMod.LinqSharp.IEqualityComparer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Wrapper class for an array that provides Linq functionallity.
  *
  * @class Linq<T>
  */
@js.native
trait Linq[T] extends js.Object {
  /** {T[]} Internal array reference. */
  var a: js.Array[T] = js.native
  /**
    * Applies an accumulator function over a sequence.
    *
    * @param func An accumulator function to be
    * invoked on each element.
    * @param {T} [initialValue] The initial accumulator value.
    *
    * @throws Error if array is empty.
    *
    * @returns {T} The final accumulator value.
    */
  def Aggregate[TResult](func: js.Function2[/* previous */ T, /* next */ T, TResult]): T = js.native
  def Aggregate[TResult](func: js.Function2[/* previous */ T, /* next */ T, TResult], initialValue: T): T = js.native
  /**
    * Determines whether all elements of a sequence satisfy a condition.
    *
    * @param predicate A function to test each element for a condition.
    *
    * @returns true if every element of the source sequence passes the test in the specified
    * predicate, or if the sequence is empty; otherwise, false.
    */
  def All(predicate: js.Function1[/* value */ T, Boolean]): Boolean = js.native
  /**
    * Determines whether a sequence contains any elements.
    *
    * @param [predicate] A function to test each element for a condition.
    *
    * @returns true if any elements in the source sequence pass the test in the specified predicate;
    * otherwise, false. If no predicate is specified return true if the source sequence contains any elements;
    * otherwise, false.
    */
  def Any(): Boolean = js.native
  def Any(predicate: js.Function1[/* value */ T, Boolean]): Boolean = js.native
  /**
    * Computes the average of a sequence of {number} values.
    *
    * @param [selector] A transform function to apply to each element.
    *
    * @returns The average of the sequence of values.
    */
  def Average(): Double = js.native
  def Average(selector: js.Function1[/* value */ T, Double]): Double = js.native
  /**
    * Concatenates two sequences.
    *
    * @param array The sequence to concatenate to the first sequence.
    *
    * @returns An array that contains the concatenated elements of the two input sequences.
    */
  def Concat(array: js.Array[T]): Linq[T] = js.native
  /**
    * Determines whether a sequence contains a specified element by using a specified comparer.
    *
    * @param value The value to locate in the sequence.
    * @param [comparer] An IEqualityComparer<T> to compare values.
    *
    * @returns true if the source sequence contains an element that has the specified value;
    * otherwise, false.
    */
  def Contains(value: T): Boolean = js.native
  def Contains(value: T, comparer: IEqualityComparer[T]): Boolean = js.native
  /**
    * Returns a number that represents how many elements in the specified sequence satisfy a condition.
    *
    * @param [selector] A function to test each element for a condition.
    *
    * @returns A number that represents how many elements in the sequence satisfy the condition
    * in the predicate function.
    */
  def Count(): Double = js.native
  def Count(selector: js.Function1[/* value */ T, Boolean]): Double = js.native
  /**
    * Returns distinct elements from a sequence by using a specified IEqualityComparer<T>
    * to compare values.
    *
    * @param [comparer] An IEqualityComparer<T> to compare values.
    *
    * @returns An array that contains distinct elements from the source sequence.
    */
  def Distinct(): Linq[T] = js.native
  def Distinct(comparer: IEqualityComparer[T]): Linq[T] = js.native
  /**
    * Returns distinct elements from a sequence by using a specified IEqualityComparer<T>
    * to compare values.
    *
    * @param selector A function to test each element for a condition.
    * @param [comparer] An IEqualityComparer<T> to compare values.
    *
    * @returns An array that contains distinct elements from the source sequence.
    */
  def DistinctBy[U](selector: js.Function1[/* e */ T, U]): Linq[T] = js.native
  def DistinctBy[U](selector: js.Function1[/* e */ T, U], comparer: IEqualityComparer[T]): Linq[T] = js.native
  /**
    * Returns the element at a specified index in a sequence.
    *
    * @param index The zero-based index of the element to retrieve.
    *
    * @throws index is less than 0 or greater than or equal to the number of elements in source.
    *
    * @returns The element at the specified position in the source sequence.
    */
  def ElementAt(index: Double): T = js.native
  /**
    * Returns the element at a specified index in a sequence or a default value if
    * the index is out of range.
    *
    * @param index The zero-based index of the element to retrieve.
    * @param defaultValue A default value if no element is found.
    *
    * @returns defaultValue if the index is outside the bounds of the source sequence;
    * otherwise, the element at the specified position in the source sequence.
    */
  def ElementAtOrDefault(index: Double, defaultValue: T): T = js.native
  /**
    * Produces the set difference of two sequences by using the specified IEqualityComparer<T>
    * to compare values.
    *
    * @param except An array whose elements that also occur in the first sequence will cause
    * those elements to be removed from the returned sequence.
    * @param [comparer] An IEqualityComparer<T> to compare values.
    *
    * @returns A sequence that contains the set difference of the elements of two sequences.
    */
  def Except(except: js.Array[T]): Linq[T] = js.native
  def Except(except: js.Array[T], comparer: IEqualityComparer[T]): Linq[T] = js.native
  /**
    * Returns the first element in a sequence that satisfies a specified condition.
    *
    * @param [selector] A function to test each element for a condition.
    *
    * @throws No element satisfies the condition in predicate.-or-The source sequence is empty.
    *
    * @returns The first element in the sequence that passes the test in the specified predicate function.
    */
  def First(): T = js.native
  def First(selector: js.Function1[/* e */ T, Boolean]): T = js.native
  /**
    * Returns the first element of the sequence that satisfies a condition or a default
    * value if no such element is found.
    *
    * @param [selector] A function to test each element for a condition.
    * @param [defaultValue] A default value to return if no element is found.
    *
    * @returns defaultValue if source is empty or if no element passes the test specified by predicate;
    * otherwise, the first element in source that passes the test specified by predicate.
    */
  def FirstOrDefault(): T = js.native
  def FirstOrDefault(selector: js.Function1[/* e */ T, Boolean]): T = js.native
  def FirstOrDefault(selector: js.Function1[/* e */ T, Boolean], defaultValue: T): T = js.native
  /**
    * Performs the specified action on each element of the array.
    *
    * @param callback The function delegate to perform on each element of the array.
    */
  def ForEach(callback: js.Function2[/* e */ T, /* index */ Double, _]): Unit = js.native
  /**
    * Groups the elements of a sequence according to a specified key selector function.
    *
    * @param keySelector A function to extract the key for each element.
    * @param [elementSelector] A function to create a result value from each group.
    * @param [comparer] An IEqualityComparer<TKey> to compare keys with.
    *
    * @returns A collection of elements of type TResult where each element represents a projection
    * over a group and its key.
    */
  def GroupBy[TKey, TElement](keySelector: js.Function1[/* e */ T, TKey]): Linq[_] = js.native
  def GroupBy[TKey, TElement](keySelector: js.Function1[/* e */ T, TKey], elementSelector: js.Function1[/* e */ T, TElement]): Linq[_] = js.native
  def GroupBy[TKey, TElement](
    keySelector: js.Function1[/* e */ T, TKey],
    elementSelector: js.Function1[/* e */ T, TElement],
    comparer: IEqualityComparer[TKey]
  ): Linq[_] = js.native
  /**
    * Searches for the specified object and returns the zero-based index of the first
    * occurrence within the entire array.
    *
    * @param e The object to locate in the array.
    * @param [comparer] An IEqualityComparer<T> to compare elements with.
    *
    * @returns The zero-based index of the first occurrence of item within the entire array, if found;
    * otherwise, –1.
    */
  def IndexOf(e: T): Double = js.native
  def IndexOf(e: T, comparer: IEqualityComparer[T]): Double = js.native
  /**
    * Produces the set intersection of two sequences by using the specified IEqualityComparer<T>
    * to compare values.
    *
    * @param array An array whose distinct elements that also appear in the first sequence will be returned.
    * @param [comparer] An IEqualityComparer<T> to compare values.
    *
    * @returns A sequence that contains the elements that form the set intersection of two sequences.
    */
  def Intersect(array: js.Array[T]): Linq[T] = js.native
  def Intersect(array: js.Array[T], comparer: IEqualityComparer[T]): Linq[T] = js.native
  /**
    * Correlates the elements of two sequences based on matching keys. A specified IEqualityComparer<T> is used to compare keys.
    *
    * @param array The sequence to join to the first sequence.
    * @param outerKeySelector A function to extract the join key from each element of the first sequence.
    * @param innerKeySelector A function to extract the join key from each element of the second sequence.
    * @param resultSelector A function to create a result element from two matching elements.
    * @param [comparer] An IEqualityComparer<T> to hash and compare keys.
    *
    * @returns An array that has elements of type TResult that are obtained by performing an inner join on two sequences.
    */
  def Join[TInner, TKey, TResult](
    array: js.Array[TInner],
    outerKeySelector: js.Function1[/* e */ T, TKey],
    innerKeySelector: js.Function1[/* e */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult]
  ): Linq[TResult] = js.native
  def Join[TInner, TKey, TResult](
    array: js.Array[TInner],
    outerKeySelector: js.Function1[/* e */ T, TKey],
    innerKeySelector: js.Function1[/* e */ TInner, TKey],
    resultSelector: js.Function2[/* outer */ T, /* inner */ TInner, TResult],
    comparer: IEqualityComparer[TKey]
  ): Linq[TResult] = js.native
  /**
    * Returns the last element of a sequence that satisfies a specified condition.
    *
    * @param [predicate] A function to test each element for a condition.
    *
    * @throws No element satisfies the condition in predicate.-or-The source sequence is empty.
    *
    * @returns The last element in the sequence that passes the test in the specified predicate function.
    */
  def Last(): T = js.native
  def Last(predicate: js.Function1[/* e */ T, Boolean]): T = js.native
  /**
    * Returns the last element of a sequence that satisfies a condition or a default
    * value if no such element is found.
    *
    * @param [predicate] A function to test each element for a condition.
    * @param [defaultValue] A default value to return if no element is found.
    *
    * @returns defaultValue if the sequence is empty or if no elements pass the test in
    * the predicate function; otherwise, the last element that passes the test in the
    * predicate function.
    */
  def LastOrDefault(): T = js.native
  def LastOrDefault(predicate: js.Function1[/* e */ T, Boolean]): T = js.native
  def LastOrDefault(predicate: js.Function1[/* e */ T, Boolean], defaultValue: T): T = js.native
  /**
    * Returns the maximum value in a sequence of System.Double values.
    *
    * @param [selector] A transform function to apply to each element.
    *
    * @returns The maximum value in the sequence.
    */
  def Max(): T = js.native
  def Max[TResult](selector: js.Function1[/* e */ T, TResult]): TResult = js.native
  @JSName("Max")
  def Max_TResult_TResult[TResult](): TResult = js.native
  /**
    * Returns the minimum value in a sequence of System.Int64 values.
    *
    * @param [selector] A transform function to apply to each element.
    *
    * @returns The minimum value in the sequence.
    */
  def Min(): T = js.native
  def Min[TResult](selector: js.Function1[/* e */ T, TResult]): TResult = js.native
  @JSName("Min")
  def Min_TResult_TResult[TResult](): TResult = js.native
  /**
    * Sorts the elements of a sequence in ascending order according to a key.
    *
    * @param keySelector A function to extract a key from an element.
    * @param [comparer] An IEqualityComparer<T> to compare values.
    *
    * @returns An array whose elements are sorted according to a key.
    */
  def OrderBy[TKey](keySelector: js.Function1[/* e */ T, TKey]): Linq[T] = js.native
  def OrderBy[TKey](
    keySelector: js.Function1[/* e */ T, TKey],
    comparer: js.Function2[/* a */ TKey, /* b */ TKey, Double]
  ): Linq[T] = js.native
  /**
    * Sorts the elements of a sequence in descending order according to a key.
    *
    * @param keySelector A function to extract a key from an element.
    * @param [comparer] An IEqualityComparer<T> to compare values.
    *
    * @returns An array whose elements are sorted in descending order according to a key.
    */
  def OrderByDescending[TKey](keySelector: js.Function1[/* e */ T, TKey]): Linq[T] = js.native
  def OrderByDescending[TKey](
    keySelector: js.Function1[/* e */ T, TKey],
    comparer: js.Function2[/* a */ TKey, /* b */ TKey, Double]
  ): Linq[T] = js.native
  /**
    * Inverts the order of the elements in a sequence.
    *
    * @returns A sequence whose elements correspond to those of the input sequence in reverse order.
    */
  def Reverse(): Linq[T] = js.native
  /**
    * Projects each element of a sequence into a new form.
    *
    * @param selector A transform function to apply to each element.
    *
    * @returns An array whose elements are the result of invoking the transform function on each element of source.
    */
  def Select[TResult](selector: js.Function2[/* e */ T, /* i */ js.UndefOr[Double], TResult]): Linq[TResult] = js.native
  /**
    * Projects each element of a sequence to an array flattens the resulting sequences into one sequence,
    * and invokes a result selector function on each element therein.
    *
    * @param selector A transform function to apply to each element of the input sequence.
    * @param [resultSelector] A transform function to apply to each element of the intermediate sequence.
    *
    * @returns An array whose elements are the result of invoking the one-to-many transform function
    * selector on each element of source and then mapping each of those sequence elements and
    * their corresponding source element to a result element.
    */
  def SelectMany[TResult](selector: js.Function1[/* e */ T, js.Array[T]]): Linq[TResult] = js.native
  def SelectMany[TResult](selector: js.Function1[/* e */ T, js.Array[T]], resultSelector: js.Function1[/* e */ T, TResult]): Linq[TResult] = js.native
  /**
    * Determines whether two sequences are equal by comparing their elements by using
    * a specified IEqualityComparer<T>.
    *
    * @param second An array to compare to the first sequence.
    * @param [comparer] An equality comparer to compare values.
    *
    * @returns true if the two source sequences are of equal length and their corresponding
    * elements compare equal according to comparer; otherwise, false.
    */
  def SequenceEqual(second: js.Array[T]): Boolean = js.native
  def SequenceEqual(second: js.Array[T], comparer: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = js.native
  /**
    * Returns the only element of a sequence that satisfies a specified condition,
    * and throws an exception if more than one such element exists.
    *
    * @param [predicate] A function to test an element for a condition.
    *
    * @returns The single element of the input sequence that satisfies a condition.
    */
  def Single(): T = js.native
  def Single(predicate: js.Function1[/* e */ T, Boolean]): T = js.native
  /**
    * Returns the only element of a sequence that satisfies a specified condition or
    * a default value if no such element exists; this method throws an exception if
    * more than one element satisfies the condition.
    *
    * @param [predicate] A function to test an element for a condition.
    * @param [defaultValue] A default value if no element is found.
    *
    * @returns The single element of the input sequence that satisfies the condition,
    * or defaultValue if no such element is found.
    */
  def SingleOrDefault(): T = js.native
  def SingleOrDefault(predicate: js.Function1[/* e */ T, Boolean]): T = js.native
  def SingleOrDefault(predicate: js.Function1[/* e */ T, Boolean], defaultValue: T): T = js.native
  /**
    * Bypasses a specified number of elements in a sequence and then returns the remaining
    * elements.
    *
    * @param count The number of elements to skip before returning the remaining elements.
    *
    * @returns An array that contains the elements that occur
    * after the specified index in the input sequence.
    */
  def Skip(count: Double): Linq[T] = js.native
  /**
    * Bypasses elements in a sequence as long as a specified condition is true and
    * then returns the remaining elements.
    *
    * @param predicate A function to test an element for a condition.
    *
    * @returns An array that contains the elements from the
    * input sequence starting at the first element in the linear series that does not
    * pass the test specified by predicate.
    */
  def SkipWhile(predicate: js.Function1[/* e */ T, Boolean]): Linq[T] = js.native
  /**
    * Computes the sum of a sequence values.
    *
    * @param [selector] A transform function to apply to each element.
    *
    * @returns The sum of the values in the sequence.
    */
  def Sum(): Double = js.native
  def Sum(selector: js.Function1[/* value */ T, Double]): Double = js.native
  /**
    * Returns a specified number of contiguous elements from the start of a sequence.
    *
    * @param count The number of elements to skip before returning the remaining elements.
    *
    * @returns An array that contains the specified number of elements from the start
    * of the input sequence.
    */
  def Take(count: Double): Linq[T] = js.native
  /**
    * Returns elements from a sequence as long as a specified condition is true.
    *
    * @param predicate A function to test an element for a condition.
    *
    * @returns An array that contains the elements from the
    * input sequence that occur before the element at which the test no longer passes.
    */
  def TakeWhile(predicate: js.Function1[/* e */ T, Boolean]): Linq[T] = js.native
  /**
    * Retrieves the internal array.
    *
    * @returns Internal array.
    */
  def ToArray(): js.Array[T] = js.native
  /**
    * Produces the set union of two sequences by using a specified IEqualityComparer<T>.
    *
    * @param second An array whose distinct elements form the second set for the union.
    * @param [comparer] An equality comparer to compare values.
    *
    * @returns An array that contains the elements from both
    * input sequences, excluding duplicates.
    */
  def Union(second: js.Array[T]): Linq[T] = js.native
  def Union(second: js.Array[T], comparer: IEqualityComparer[T]): Linq[T] = js.native
  /**
    * Filters a sequence of values based on a predicate.
    *
    * @param selector A transform function to apply to each element.
    *
    * @returns  An array that contains elements from the input sequence
    * that satisfy the condition.
    */
  def Where(selector: js.Function1[/* value */ T, Boolean]): Linq[T] = js.native
  /**
    * Applies a specified function to the corresponding elements of two sequences,
    * producing a sequence of the results.
    *
    * @param array The second sequence to merge.
    * @param resultSelector A function that specifies how to merge the elements from the two sequences.
    *
    * @returns An array that contains merged elements of two input sequences.
    */
  def Zip[TInner, TResult](array: js.Array[TInner], resultSelector: js.Function2[/* o */ T, /* i */ TInner, TResult]): Linq[TResult] = js.native
}

