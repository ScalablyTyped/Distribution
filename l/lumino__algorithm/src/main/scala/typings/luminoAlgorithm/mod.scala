package typings.luminoAlgorithm

import org.scalablytyped.runtime.StringDictionary
import typings.luminoAlgorithm.anon.Index
import typings.luminoAlgorithm.typesArrayMod.ArrayExt.MutableArrayLike
import typings.luminoAlgorithm.typesArrayMod.ArrayExt.slice.IOptions
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoAlgorithm.typesIterMod.IterableOrArrayLike
import typings.luminoAlgorithm.typesRetroMod.RetroableOrArrayLike
import typings.luminoAlgorithm.typesStringMod.StringExt.IMatchResult
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/algorithm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object ArrayExt {
    
    @JSImport("@lumino/algorithm", "ArrayExt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Fill an array with a static value.
      *
      * @param array - The mutable array-like object to fill.
      *
      * @param value - The static value to use to fill the array.
      *
      * @param start - The index of the first element in the range to be
      *   filled, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   filled, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * #### Notes
      * If `stop < start` the fill will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = ['one', 'two', 'three', 'four'];
      * ArrayExt.fill(data, 'r');        // ['r', 'r', 'r', 'r']
      * ArrayExt.fill(data, 'g', 1);     // ['r', 'g', 'g', 'g']
      * ArrayExt.fill(data, 'b', 2, 3);  // ['r', 'g', 'b', 'b']
      * ArrayExt.fill(data, 'z', 3, 1);  // ['z', 'z', 'b', 'z']
      * ```
      */
    inline def fill[T](array: MutableArrayLike[T], value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fill[T](array: MutableArrayLike[T], value: T, start: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fill[T](array: MutableArrayLike[T], value: T, start: Double, stop: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def fill[T](array: MutableArrayLike[T], value: T, start: Unit, stop: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fill")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Find the index of the first value which matches a predicate.
      *
      * @param array - The array-like object to search.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the first matching value, or `-1` if no
      *   matching value is found.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [1, 2, 3, 4, 3, 2, 1];
      * ArrayExt.findFirstIndex(data, isEven);       // 1
      * ArrayExt.findFirstIndex(data, isEven, 4);    // 5
      * ArrayExt.findFirstIndex(data, isEven, 6);    // -1
      * ArrayExt.findFirstIndex(data, isEven, 6, 5); // 1
      * ```
      */
    inline def findFirstIndex[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findFirstIndex[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findFirstIndex[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findFirstIndex[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Unit,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the first value which matches a predicate.
      *
      * @param array - The array-like object to search.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The first matching value, or `undefined` if no matching
      *   value is found.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [1, 2, 3, 4, 3, 2, 1];
      * ArrayExt.findFirstValue(data, isEven);       // 2
      * ArrayExt.findFirstValue(data, isEven, 2);    // 4
      * ArrayExt.findFirstValue(data, isEven, 6);    // undefined
      * ArrayExt.findFirstValue(data, isEven, 6, 5); // 2
      * ```
      */
    inline def findFirstValue[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstValue")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    inline def findFirstValue[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstValue")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    inline def findFirstValue[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstValue")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    inline def findFirstValue[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Unit,
      stop: Double
    ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstValue")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    
    /**
      * Find the index of the last value which matches a predicate.
      *
      * @param object - The array-like object to search.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the last matching value, or `-1` if no
      *   matching value is found.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the front of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [1, 2, 3, 4, 3, 2, 1];
      * ArrayExt.findLastIndex(data, isEven);        // 5
      * ArrayExt.findLastIndex(data, isEven, 4);     // 3
      * ArrayExt.findLastIndex(data, isEven, 0);     // -1
      * ArrayExt.findLastIndex(data, isEven, 0, 1);  // 5
      * ```
      */
    inline def findLastIndex[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findLastIndex[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findLastIndex[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def findLastIndex[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Unit,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastIndex")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the last value which matches a predicate.
      *
      * @param object - The array-like object to search.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The last matching value, or `undefined` if no matching
      *   value is found.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the front of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [1, 2, 3, 4, 3, 2, 1];
      * ArrayExt.findLastValue(data, isEven);        // 2
      * ArrayExt.findLastValue(data, isEven, 4);     // 4
      * ArrayExt.findLastValue(data, isEven, 0);     // undefined
      * ArrayExt.findLastValue(data, isEven, 0, 1);  // 2
      * ```
      */
    inline def findLastValue[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastValue")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    inline def findLastValue[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastValue")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    inline def findLastValue[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastValue")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    inline def findLastValue[T](
      array: ArrayLike[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Unit,
      stop: Double
    ): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findLastValue")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    
    /**
      * Find the index of the first occurrence of a value in an array.
      *
      * @param array - The array-like object to search.
      *
      * @param value - The value to locate in the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the first occurrence of the value, or `-1`
      *   if the value is not found.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = ['one', 'two', 'three', 'four', 'one'];
      * ArrayExt.firstIndexOf(data, 'red');        // -1
      * ArrayExt.firstIndexOf(data, 'one');        // 0
      * ArrayExt.firstIndexOf(data, 'one', 1);     // 4
      * ArrayExt.firstIndexOf(data, 'two', 2);     // -1
      * ArrayExt.firstIndexOf(data, 'two', 2, 1);  // 1
      * ```
      */
    inline def firstIndexOf[T](array: ArrayLike[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("firstIndexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def firstIndexOf[T](array: ArrayLike[T], value: T, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("firstIndexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def firstIndexOf[T](array: ArrayLike[T], value: T, start: Double, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("firstIndexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def firstIndexOf[T](array: ArrayLike[T], value: T, start: Unit, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("firstIndexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Insert a value into an array at a specific index.
      *
      * @param array - The array of interest.
      *
      * @param index - The index at which to insert the value. Negative
      *   values are taken as an offset from the end of the array.
      *
      * @param value - The value to set at the specified index.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = [0, 1, 2];
      * ArrayExt.insert(data, 0, -1);  // [-1, 0, 1, 2]
      * ArrayExt.insert(data, 2, 12);  // [-1, 0, 12, 1, 2]
      * ArrayExt.insert(data, -1, 7);  // [-1, 0, 12, 1, 7, 2]
      * ArrayExt.insert(data, 6, 19);  // [-1, 0, 12, 1, 7, 2, 19]
      * ```
      */
    inline def insert[T](array: js.Array[T], index: Double, value: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Find the index of the last occurrence of a value in an array.
      *
      * @param array - The array-like object to search.
      *
      * @param value - The value to locate in the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the last occurrence of the value, or `-1`
      *   if the value is not found.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the front of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or `stop` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = ['one', 'two', 'three', 'four', 'one'];
      * ArrayExt.lastIndexOf(data, 'red');        // -1
      * ArrayExt.lastIndexOf(data, 'one');        // 4
      * ArrayExt.lastIndexOf(data, 'one', 1);     // 0
      * ArrayExt.lastIndexOf(data, 'two', 0);     // -1
      * ArrayExt.lastIndexOf(data, 'two', 0, 1);  // 1
      * ```
      */
    inline def lastIndexOf[T](array: ArrayLike[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def lastIndexOf[T](array: ArrayLike[T], value: T, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def lastIndexOf[T](array: ArrayLike[T], value: T, start: Double, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def lastIndexOf[T](array: ArrayLike[T], value: T, start: Unit, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastIndexOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the index of the first element which compares `>=` to a value.
      *
      * @param array - The sorted array-like object to search.
      *
      * @param value - The value to locate in the array.
      *
      * @param fn - The 3-way comparison function to apply to the values.
      *   It should return `< 0` if an element is less than a value, `0` if
      *   an element is equal to a value, or `> 0` if an element is greater
      *   than a value.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the first element which compares `>=` to the
      *   value, or `length` if there is no such element. If the computed
      *   index for `stop` is less than `start`, then the computed index
      *   for `start` is returned.
      *
      * #### Notes
      * The array must already be sorted in ascending order according to
      * the comparison function.
      *
      * #### Complexity
      * Logarithmic.
      *
      * #### Undefined Behavior
      * Searching a range which is not sorted in ascending order.
      *
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function numberCmp(a: number, b: number): number {
      *   return a - b;
      * }
      *
      * let data = [0, 3, 4, 7, 7, 9];
      * ArrayExt.lowerBound(data, 0, numberCmp);   // 0
      * ArrayExt.lowerBound(data, 6, numberCmp);   // 3
      * ArrayExt.lowerBound(data, 7, numberCmp);   // 3
      * ArrayExt.lowerBound(data, -1, numberCmp);  // 0
      * ArrayExt.lowerBound(data, 10, numberCmp);  // 6
      * ```
      */
    inline def lowerBound[T, U](array: ArrayLike[T], value: U, fn: js.Function2[/* element */ T, /* value */ U, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def lowerBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def lowerBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Double,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def lowerBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Unit,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Move an element in an array from one index to another.
      *
      * @param array - The mutable array-like object of interest.
      *
      * @param fromIndex - The index of the element to move. Negative
      *   values are taken as an offset from the end of the array.
      *
      * @param toIndex - The target index of the element. Negative
      *   values are taken as an offset from the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `fromIndex` or `toIndex` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from from '@lumino/algorithm';
      *
      * let data = [0, 1, 2, 3, 4];
      * ArrayExt.move(data, 1, 2);  // [0, 2, 1, 3, 4]
      * ArrayExt.move(data, 4, 2);  // [0, 2, 4, 1, 3]
      * ```
      */
    inline def move[T](array: MutableArrayLike[T], fromIndex: Double, toIndex: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(array.asInstanceOf[js.Any], fromIndex.asInstanceOf[js.Any], toIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Remove all occurrences of a value from an array.
      *
      * @param array - The array of interest.
      *
      * @param value - The value to remove from the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The number of elements removed from the array.
      *
      * #### Notes
      * If `stop < start` the search will conceptually wrap at the end of
      * the array, however the array will be traversed front-to-back.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = [14, 12, 23, 39, 14, 12, 19, 14];
      * ArrayExt.removeAllOf(data, 12);        // 2
      * ArrayExt.removeAllOf(data, 17);        // 0
      * ArrayExt.removeAllOf(data, 14, 1, 4);  // 1
      * ```
      */
    inline def removeAllOf[T](array: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeAllOf[T](array: js.Array[T], value: T, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeAllOf[T](array: js.Array[T], value: T, start: Double, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeAllOf[T](array: js.Array[T], value: T, start: Unit, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Remove all occurrences of values which match a predicate.
      *
      * @param array - The array of interest.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The number of elements removed from the array.
      *
      * #### Notes
      * If `stop < start` the search will conceptually wrap at the end of
      * the array, however the array will be traversed front-to-back.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * function isNegative(value: number): boolean {
      *   return value < 0;
      * }
      *
      * let data = [0, 12, -13, -9, 23, 39, 14, -15, 12, 75];
      * ArrayExt.removeAllWhere(data, isEven);            // 4
      * ArrayExt.removeAllWhere(data, isNegative, 0, 3);  // 2
      * ```
      */
    inline def removeAllWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeAllWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeAllWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeAllWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Unit,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAllWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Remove and return a value at a specific index in an array.
      *
      * @param array - The array of interest.
      *
      * @param index - The index of the value to remove. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The value at the specified index, or `undefined` if the
      *   index is out of range.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * An `index` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeAt(data, 2);   // 23
      * ArrayExt.removeAt(data, -2);  // 12
      * ArrayExt.removeAt(data, 10);  // undefined;
      * ```
      */
    inline def removeAt[T](array: js.Array[T], index: Double): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
    
    /**
      * Remove the first occurrence of a value from an array.
      *
      * @param array - The array of interest.
      *
      * @param value - The value to remove from the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the removed value, or `-1` if the value
      *   is not contained in the array.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeFirstOf(data, 12);        // 1
      * ArrayExt.removeFirstOf(data, 17);        // -1
      * ArrayExt.removeFirstOf(data, 39, 3);     // -1
      * ArrayExt.removeFirstOf(data, 39, 3, 2);  // 2
      * ```
      */
    inline def removeFirstOf[T](array: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeFirstOf[T](array: js.Array[T], value: T, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeFirstOf[T](array: js.Array[T], value: T, start: Double, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeFirstOf[T](array: js.Array[T], value: T, start: Unit, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Remove the first occurrence of a value which matches a predicate.
      *
      * @param array - The array of interest.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The removed `{ index, value }`, which will be `-1` and
      *   `undefined` if the value is not contained in the array.
      *
      * #### Notes
      * If `stop < start` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeFirstWhere(data, isEven);     // { index: 0, value: 0 }
      * ArrayExt.removeFirstWhere(data, isEven, 2);  // { index: 3, value: 14 }
      * ArrayExt.removeFirstWhere(data, isEven, 4);  // { index: -1, value: undefined }
      * ```
      */
    inline def removeFirstWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Index[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Index[T]]
    inline def removeFirstWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Index[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Index[T]]
    inline def removeFirstWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): Index[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Index[T]]
    inline def removeFirstWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Unit,
      stop: Double
    ): Index[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFirstWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Index[T]]
    
    /**
      * Remove the last occurrence of a value from an array.
      *
      * @param array - The array of interest.
      *
      * @param value - The value to remove from the array. Values are
      *   compared using strict `===` equality.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the removed value, or `-1` if the value
      *   is not contained in the array.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeLastOf(data, 12);        // 5
      * ArrayExt.removeLastOf(data, 17);        // -1
      * ArrayExt.removeLastOf(data, 39, 2);     // -1
      * ArrayExt.removeLastOf(data, 39, 2, 3);  // 3
      * ```
      */
    inline def removeLastOf[T](array: js.Array[T], value: T): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeLastOf[T](array: js.Array[T], value: T, start: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeLastOf[T](array: js.Array[T], value: T, start: Double, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def removeLastOf[T](array: js.Array[T], value: T, start: Unit, stop: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastOf")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Remove the last occurrence of a value which matches a predicate.
      *
      * @param array - The array of interest.
      *
      * @param fn - The predicate function to apply to the values.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The removed `{ index, value }`, which will be `-1` and
      *   `undefined` if the value is not contained in the array.
      *
      * #### Notes
      * If `start < stop` the search will wrap at the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function isEven(value: number): boolean {
      *   return value % 2 === 0;
      * }
      *
      * let data = [0, 12, 23, 39, 14, 12, 75];
      * ArrayExt.removeLastWhere(data, isEven);        // { index: 5, value: 12 }
      * ArrayExt.removeLastWhere(data, isEven, 2);     // { index: 1, value: 12 }
      * ArrayExt.removeLastWhere(data, isEven, 2, 1);  // { index: -1, value: undefined }
      * ```
      */
    inline def removeLastWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Index[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Index[T]]
    inline def removeLastWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Index[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Index[T]]
    inline def removeLastWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Double,
      stop: Double
    ): Index[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Index[T]]
    inline def removeLastWhere[T](
      array: js.Array[T],
      fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
      start: Unit,
      stop: Double
    ): Index[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLastWhere")(array.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Index[T]]
    
    /**
      * Reverse an array in-place.
      *
      * @param array - The mutable array-like object of interest.
      *
      * @param start - The index of the first element in the range to be
      *   reversed, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   reversed, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start` or  `stop` index which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = [0, 1, 2, 3, 4];
      * ArrayExt.reverse(data, 1, 3);  // [0, 3, 2, 1, 4]
      * ArrayExt.reverse(data, 3);     // [0, 3, 2, 4, 1]
      * ArrayExt.reverse(data);        // [1, 4, 2, 3, 0]
      * ```
      */
    inline def reverse[T](array: MutableArrayLike[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def reverse[T](array: MutableArrayLike[T], start: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def reverse[T](array: MutableArrayLike[T], start: Double, stop: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def reverse[T](array: MutableArrayLike[T], start: Unit, stop: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Rotate the elements of an array in-place.
      *
      * @param array - The mutable array-like object of interest.
      *
      * @param delta - The amount of rotation to apply to the elements. A
      *   positive value will rotate the elements to the left. A negative
      *   value will rotate the elements to the right.
      *
      * @param start - The index of the first element in the range to be
      *   rotated, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   rotated, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `delta`, `start`, or `stop` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = [0, 1, 2, 3, 4];
      * ArrayExt.rotate(data, 2);        // [2, 3, 4, 0, 1]
      * ArrayExt.rotate(data, -2);       // [0, 1, 2, 3, 4]
      * ArrayExt.rotate(data, 10);       // [0, 1, 2, 3, 4]
      * ArrayExt.rotate(data, 9);        // [4, 0, 1, 2, 3]
      * ArrayExt.rotate(data, 2, 1, 3);  // [4, 2, 0, 1, 3]
      * ```
      */
    inline def rotate[T](array: MutableArrayLike[T], delta: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(array.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate[T](array: MutableArrayLike[T], delta: Double, start: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(array.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate[T](array: MutableArrayLike[T], delta: Double, start: Double, stop: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(array.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def rotate[T](array: MutableArrayLike[T], delta: Double, start: Unit, stop: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(array.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Test whether two arrays are shallowly equal.
      *
      * @param a - The first array-like object to compare.
      *
      * @param b - The second array-like object to compare.
      *
      * @param fn - The comparison function to apply to the elements. It
      *   should return `true` if the elements are "equal". The default
      *   compares elements using strict `===` equality.
      *
      * @returns Whether the two arrays are shallowly equal.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * Modifying the length of the arrays while comparing.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let d1 = [0, 3, 4, 7, 7, 9];
      * let d2 = [0, 3, 4, 7, 7, 9];
      * let d3 = [42];
      * ArrayExt.shallowEqual(d1, d2);  // true
      * ArrayExt.shallowEqual(d2, d3);  // false
      * ```
      */
    inline def shallowEqual[T](a: ArrayLike[T], b: ArrayLike[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def shallowEqual[T](a: ArrayLike[T], b: ArrayLike[T], fn: js.Function2[/* a */ T, /* b */ T, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Create a slice of an array subject to an optional step.
      *
      * @param array - The array-like object of interest.
      *
      * @param options - The options for configuring the slice.
      *
      * @returns A new array with the specified values.
      *
      * @throws An exception if the slice `step` is `0`.
      *
      * #### Complexity
      * Linear.
      *
      * #### Undefined Behavior
      * A `start`, `stop`, or `step` which is non-integral.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * let data = [0, 3, 4, 7, 7, 9];
      * ArrayExt.slice(data);                         // [0, 3, 4, 7, 7, 9]
      * ArrayExt.slice(data, { start: 2 });           // [4, 7, 7, 9]
      * ArrayExt.slice(data, { start: 0, stop: 4 });  // [0, 3, 4, 7]
      * ArrayExt.slice(data, { step: 2 });            // [0, 4, 7]
      * ArrayExt.slice(data, { step: -1 });           // [9, 7, 7, 4, 3, 0]
      * ```
      */
    /**
      * The namespace for the `slice` function statics.
      */
    inline def slice[T](array: ArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    /**
      * The namespace for the `slice` function statics.
      */
    inline def slice[T](array: ArrayLike[T], options: IOptions): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("slice")(array.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    
    /**
      * Find the index of the first element which compares `>` than a value.
      *
      * @param array - The sorted array-like object to search.
      *
      * @param value - The value to locate in the array.
      *
      * @param fn - The 3-way comparison function to apply to the values.
      *   It should return `< 0` if an element is less than a value, `0` if
      *   an element is equal to a value, or `> 0` if an element is greater
      *   than a value.
      *
      * @param start - The index of the first element in the range to be
      *   searched, inclusive. The default value is `0`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @param stop - The index of the last element in the range to be
      *   searched, inclusive. The default value is `-1`. Negative values
      *   are taken as an offset from the end of the array.
      *
      * @returns The index of the first element which compares `>` than the
      *   value, or `length` if there is no such element. If the computed
      *   index for `stop` is less than `start`, then the computed index
      *   for `start` is returned.
      *
      * #### Notes
      * The array must already be sorted in ascending order according to
      * the comparison function.
      *
      * #### Complexity
      * Logarithmic.
      *
      * #### Undefined Behavior
      * Searching a range which is not sorted in ascending order.
      *
      * A `start` or `stop` which is non-integral.
      *
      * Modifying the length of the array while searching.
      *
      * #### Example
      * ```typescript
      * import { ArrayExt } from '@lumino/algorithm';
      *
      * function numberCmp(a: number, b: number): number {
      *   return a - b;
      * }
      *
      * let data = [0, 3, 4, 7, 7, 9];
      * ArrayExt.upperBound(data, 0, numberCmp);   // 1
      * ArrayExt.upperBound(data, 6, numberCmp);   // 3
      * ArrayExt.upperBound(data, 7, numberCmp);   // 5
      * ArrayExt.upperBound(data, -1, numberCmp);  // 0
      * ArrayExt.upperBound(data, 10, numberCmp);  // 6
      * ```
      */
    inline def upperBound[T, U](array: ArrayLike[T], value: U, fn: js.Function2[/* element */ T, /* value */ U, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def upperBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def upperBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Double,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def upperBound[T, U](
      array: ArrayLike[T],
      value: U,
      fn: js.Function2[/* element */ T, /* value */ U, Double],
      start: Unit,
      stop: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("@lumino/algorithm", "ArrayIterator")
  @js.native
  open class ArrayIterator[T] protected ()
    extends typings.luminoAlgorithm.typesIterMod.ArrayIterator[T] {
    /**
      * Construct a new array iterator.
      *
      * @param source - The array-like object of interest.
      */
    def this(source: ArrayLike[T]) = this()
  }
  
  @JSImport("@lumino/algorithm", "ChainIterator")
  @js.native
  open class ChainIterator[T] protected ()
    extends typings.luminoAlgorithm.typesChainMod.ChainIterator[T] {
    /**
      * Construct a new chain iterator.
      *
      * @param source - The iterator of iterators of interest.
      */
    def this(source: IIterator[IIterator[T]]) = this()
  }
  
  @JSImport("@lumino/algorithm", "EmptyIterator")
  @js.native
  open class EmptyIterator[T] ()
    extends typings.luminoAlgorithm.typesEmptyMod.EmptyIterator[T]
  
  @JSImport("@lumino/algorithm", "EnumerateIterator")
  @js.native
  open class EnumerateIterator[T] protected ()
    extends typings.luminoAlgorithm.typesEnumerateMod.EnumerateIterator[T] {
    /**
      * Construct a new enumerate iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param start - The starting enum value.
      */
    def this(source: IIterator[T], start: Double) = this()
  }
  
  @JSImport("@lumino/algorithm", "FilterIterator")
  @js.native
  open class FilterIterator[T] protected ()
    extends typings.luminoAlgorithm.typesFilterMod.FilterIterator[T] {
    /**
      * Construct a new filter iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param fn - The predicate function to invoke for each value.
      */
    def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]) = this()
  }
  
  @JSImport("@lumino/algorithm", "FnIterator")
  @js.native
  open class FnIterator[T] protected ()
    extends typings.luminoAlgorithm.typesIterMod.FnIterator[T] {
    /**
      * Construct a new function iterator.
      *
      * @param fn - The iterator-like function of interest.
      */
    def this(fn: js.Function0[js.UndefOr[T]]) = this()
  }
  
  @JSImport("@lumino/algorithm", "ItemIterator")
  @js.native
  open class ItemIterator[T] protected ()
    extends typings.luminoAlgorithm.typesIterMod.ItemIterator[T] {
    /**
      * Construct a new item iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[T]) = this()
    def this(source: StringDictionary[T], keys: js.Array[String]) = this()
  }
  
  @JSImport("@lumino/algorithm", "KeyIterator")
  @js.native
  open class KeyIterator protected ()
    extends typings.luminoAlgorithm.typesIterMod.KeyIterator {
    /**
      * Construct a new key iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[Any]) = this()
    def this(source: StringDictionary[Any], keys: js.Array[String]) = this()
  }
  
  @JSImport("@lumino/algorithm", "MapIterator")
  @js.native
  open class MapIterator[T, U] protected ()
    extends typings.luminoAlgorithm.typesMapMod.MapIterator[T, U] {
    /**
      * Construct a new map iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param fn - The mapping function to invoke for each value.
      */
    def this(source: IIterator[T], fn: js.Function2[/* value */ T, /* index */ Double, U]) = this()
  }
  
  @JSImport("@lumino/algorithm", "RangeIterator")
  @js.native
  open class RangeIterator protected ()
    extends typings.luminoAlgorithm.typesRangeMod.RangeIterator {
    /**
      * Construct a new range iterator.
      *
      * @param start - The starting value for the range, inclusive.
      *
      * @param stop - The stopping value for the range, exclusive.
      *
      * @param step - The distance between each value.
      */
    def this(start: Double, stop: Double, step: Double) = this()
  }
  
  @JSImport("@lumino/algorithm", "RepeatIterator")
  @js.native
  open class RepeatIterator[T] protected ()
    extends typings.luminoAlgorithm.typesRepeatMod.RepeatIterator[T] {
    /**
      * Construct a new repeat iterator.
      *
      * @param value - The value to repeat.
      *
      * @param count - The number of times to repeat the value.
      */
    def this(value: T, count: Double) = this()
  }
  
  @JSImport("@lumino/algorithm", "RetroArrayIterator")
  @js.native
  open class RetroArrayIterator[T] protected ()
    extends typings.luminoAlgorithm.typesRetroMod.RetroArrayIterator[T] {
    /**
      * Construct a new retro iterator.
      *
      * @param source - The array-like object of interest.
      */
    def this(source: ArrayLike[T]) = this()
  }
  
  @JSImport("@lumino/algorithm", "StrideIterator")
  @js.native
  open class StrideIterator[T] protected ()
    extends typings.luminoAlgorithm.typesStrideMod.StrideIterator[T] {
    /**
      * Construct a new stride iterator.
      *
      * @param source - The iterator of values of interest.
      *
      * @param step - The distance to step on each iteration. A value
      *   of less than `1` will behave the same as a value of `1`.
      */
    def this(source: IIterator[T], step: Double) = this()
  }
  
  object StringExt {
    
    @JSImport("@lumino/algorithm", "StringExt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A 3-way string comparison function.
      *
      * @param a - The first string of interest.
      *
      * @param b - The second string of interest.
      *
      * @returns `-1` if `a < b`, else `1` if `a > b`, else `0`.
      */
    inline def cmp(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the indices of characters in a source text.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The matched indices, or `null` if there is no match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * In order for there to be a match, all of the characters in `query`
      * **must** appear in `source` in the order given by `query`.
      *
      * Characters are matched using strict `===` equality.
      */
    inline def findIndices(source: String, query: String): js.Array[Double] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndices")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | Null]
    inline def findIndices(source: String, query: String, start: Double): js.Array[Double] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndices")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | Null]
    
    /**
      * Highlight the matched characters of a source text.
      *
      * @param source - The text which should be highlighted.
      *
      * @param indices - The indices of the matched characters. They must
      *   appear in increasing order and must be in bounds of the source.
      *
      * @param fn - The function to apply to the matched chunks.
      *
      * @returns An array of unmatched and highlighted chunks.
      */
    inline def highlight[T](source: String, indices: js.Array[Double], fn: js.Function1[/* chunk */ String, T]): js.Array[String | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(source.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | T]]
    
    /**
      * A string matcher which uses a sum-of-deltas algorithm.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The match result, or `null` if there is no match.
      *   A lower `score` represents a stronger match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * This scoring algorithm uses a sum-of-deltas approach to determine
      * the score. In order for there to be a match, all of the characters
      * in `query` **must** appear in `source` in order. The delta between
      * the indices are summed to create the score. This means that groups
      * of matched characters are preferred, while fragmented matches are
      * penalized.
      */
    inline def matchSumOfDeltas(source: String, query: String): IMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSumOfDeltas")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[IMatchResult | Null]
    inline def matchSumOfDeltas(source: String, query: String, start: Double): IMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSumOfDeltas")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[IMatchResult | Null]
    
    /**
      * A string matcher which uses a sum-of-squares algorithm.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The match result, or `null` if there is no match.
      *   A lower `score` represents a stronger match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * This scoring algorithm uses a sum-of-squares approach to determine
      * the score. In order for there to be a match, all of the characters
      * in `query` **must** appear in `source` in order. The index of each
      * matching character is squared and added to the score. This means
      * that early and consecutive character matches are preferred, while
      * late matches are heavily penalized.
      */
    inline def matchSumOfSquares(source: String, query: String): IMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSumOfSquares")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[IMatchResult | Null]
    inline def matchSumOfSquares(source: String, query: String, start: Double): IMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSumOfSquares")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[IMatchResult | Null]
  }
  
  @JSImport("@lumino/algorithm", "TakeIterator")
  @js.native
  open class TakeIterator[T] protected ()
    extends typings.luminoAlgorithm.typesTakeMod.TakeIterator[T] {
    /**
      * Construct a new take iterator.
      *
      * @param source - The iterator of interest.
      *
      * @param count - The number of items to take from the source.
      */
    def this(source: IIterator[T], count: Double) = this()
  }
  
  @JSImport("@lumino/algorithm", "ValueIterator")
  @js.native
  open class ValueIterator[T] protected ()
    extends typings.luminoAlgorithm.typesIterMod.ValueIterator[T] {
    /**
      * Construct a new value iterator.
      *
      * @param source - The object of interest.
      *
      * @param keys - The keys to iterate, if known.
      */
    def this(source: StringDictionary[T]) = this()
    def this(source: StringDictionary[T], keys: js.Array[String]) = this()
  }
  
  @JSImport("@lumino/algorithm", "ZipIterator")
  @js.native
  open class ZipIterator[T] protected ()
    extends typings.luminoAlgorithm.typesZipMod.ZipIterator[T] {
    /**
      * Construct a new zip iterator.
      *
      * @param source - The iterators of interest.
      */
    def this(source: js.Array[IIterator[T]]) = this()
  }
  
  inline def chain[T](objects: IterableOrArrayLike[T]*): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IIterator[T]]
  
  inline def each[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean | Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def empty[T](): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[IIterator[T]]
  
  inline def enumerate[T](`object`: IterableOrArrayLike[T]): IIterator[js.Tuple2[Double, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[js.Tuple2[Double, T]]]
  inline def enumerate[T](`object`: IterableOrArrayLike[T], start: Double): IIterator[js.Tuple2[Double, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(`object`.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[IIterator[js.Tuple2[Double, T]]]
  
  inline def every[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def filter[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): IIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IIterator[T]]
  
  inline def find[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def findIndex[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def iter[T](`object`: IterableOrArrayLike[T]): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iter")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  inline def iterFn[T](fn: js.Function0[js.UndefOr[T]]): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterFn")(fn.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  inline def iterItems[T](`object`: StringDictionary[T]): IIterator[js.Tuple2[String, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterItems")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[js.Tuple2[String, T]]]
  
  inline def iterKeys[T](`object`: StringDictionary[T]): IIterator[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[String]]
  
  inline def iterValues[T](`object`: StringDictionary[T]): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  inline def map[T, U](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, U]): IIterator[U] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[IIterator[U]]
  
  inline def max[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def min[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def minmax[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* first */ T, /* second */ T, Double]): js.UndefOr[js.Tuple2[T, T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("minmax")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Tuple2[T, T]]]
  
  inline def once[T](value: T): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(value.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  inline def range(start: Double): IIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any]).asInstanceOf[IIterator[Double]]
  inline def range(start: Double, stop: Double): IIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[IIterator[Double]]
  inline def range(start: Double, stop: Double, step: Double): IIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IIterator[Double]]
  inline def range(start: Double, stop: Unit, step: Double): IIterator[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("range")(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IIterator[Double]]
  
  inline def reduce[T](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ T, /* value */ T, /* index */ Double, T]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def reduce[T, U](
    `object`: IterableOrArrayLike[T],
    fn: js.Function3[/* accumulator */ U, /* value */ T, /* index */ Double, U],
    initial: U
  ): U = (^.asInstanceOf[js.Dynamic].applyDynamic("reduce")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[U]
  
  inline def repeat[T](value: T, count: Double): IIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(value.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IIterator[T]]
  
  inline def retro[T](`object`: RetroableOrArrayLike[T]): IIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retro")(`object`.asInstanceOf[js.Any]).asInstanceOf[IIterator[T]]
  
  inline def some[T](`object`: IterableOrArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("some")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def stride[T](`object`: IterableOrArrayLike[T], step: Double): IIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("stride")(`object`.asInstanceOf[js.Any], step.asInstanceOf[js.Any])).asInstanceOf[IIterator[T]]
  
  inline def take[T](`object`: IterableOrArrayLike[T], count: Double): IIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("take")(`object`.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[IIterator[T]]
  
  inline def toArray[T](`object`: IterableOrArrayLike[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def toObject[T](`object`: IterableOrArrayLike[js.Tuple2[String, T]]): StringDictionary[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[T]]
  
  inline def topologicSort[T](edges: IterableOrArrayLike[js.Tuple2[T, T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("topologicSort")(edges.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def zip[T](objects: IterableOrArrayLike[T]*): IIterator[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zip")(objects.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IIterator[js.Array[T]]]
}
