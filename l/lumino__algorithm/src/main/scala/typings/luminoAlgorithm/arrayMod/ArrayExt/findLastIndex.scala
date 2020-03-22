package typings.luminoAlgorithm.arrayMod.ArrayExt

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/lib/array", "ArrayExt.findLastIndex")
@js.native
object findLastIndex extends js.Object {
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
  def apply[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean]): Double = js.native
  def apply[T](array: ArrayLike[T], fn: js.Function2[/* value */ T, /* index */ Double, Boolean], start: Double): Double = js.native
  def apply[T](
    array: ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ Double, Boolean],
    start: Double,
    stop: Double
  ): Double = js.native
}

