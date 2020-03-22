package typings.luminoAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/lib/array", "ArrayExt.removeAllOf")
@js.native
object removeAllOf extends js.Object {
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
  def apply[T](array: js.Array[T], value: T): Double = js.native
  def apply[T](array: js.Array[T], value: T, start: Double): Double = js.native
  def apply[T](array: js.Array[T], value: T, start: Double, stop: Double): Double = js.native
}

