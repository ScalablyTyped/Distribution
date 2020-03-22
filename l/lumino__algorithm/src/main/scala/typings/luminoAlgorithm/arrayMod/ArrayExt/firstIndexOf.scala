package typings.luminoAlgorithm.arrayMod.ArrayExt

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/lib/array", "ArrayExt.firstIndexOf")
@js.native
object firstIndexOf extends js.Object {
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
  def apply[T](array: ArrayLike[T], value: T): Double = js.native
  def apply[T](array: ArrayLike[T], value: T, start: Double): Double = js.native
  def apply[T](array: ArrayLike[T], value: T, start: Double, stop: Double): Double = js.native
}

