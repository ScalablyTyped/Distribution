package typings.luminoAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/array", "ArrayExt.rotate")
@js.native
object rotate extends js.Object {
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
  def apply[T](array: MutableArrayLike[T], delta: Double): Unit = js.native
  def apply[T](array: MutableArrayLike[T], delta: Double, start: js.UndefOr[scala.Nothing], stop: Double): Unit = js.native
  def apply[T](array: MutableArrayLike[T], delta: Double, start: Double): Unit = js.native
  def apply[T](array: MutableArrayLike[T], delta: Double, start: Double, stop: Double): Unit = js.native
}

