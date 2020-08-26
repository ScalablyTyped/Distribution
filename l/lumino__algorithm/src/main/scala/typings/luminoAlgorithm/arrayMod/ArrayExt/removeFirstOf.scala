package typings.luminoAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/array", "ArrayExt.removeFirstOf")
@js.native
object removeFirstOf extends js.Object {
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
  def apply[T](array: js.Array[T], value: T): Double = js.native
  def apply[T](array: js.Array[T], value: T, start: js.UndefOr[scala.Nothing], stop: Double): Double = js.native
  def apply[T](array: js.Array[T], value: T, start: Double): Double = js.native
  def apply[T](array: js.Array[T], value: T, start: Double, stop: Double): Double = js.native
}

