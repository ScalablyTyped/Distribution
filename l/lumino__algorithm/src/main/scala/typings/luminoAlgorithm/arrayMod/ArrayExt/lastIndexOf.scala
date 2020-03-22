package typings.luminoAlgorithm.arrayMod.ArrayExt

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/lib/array", "ArrayExt.lastIndexOf")
@js.native
object lastIndexOf extends js.Object {
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
  def apply[T](array: ArrayLike[T], value: T): Double = js.native
  def apply[T](array: ArrayLike[T], value: T, start: Double): Double = js.native
  def apply[T](array: ArrayLike[T], value: T, start: Double, stop: Double): Double = js.native
}

