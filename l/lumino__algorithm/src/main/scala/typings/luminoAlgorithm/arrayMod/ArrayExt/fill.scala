package typings.luminoAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/array", "ArrayExt.fill")
@js.native
object fill extends js.Object {
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
  def apply[T](array: MutableArrayLike[T], value: T): Unit = js.native
  def apply[T](array: MutableArrayLike[T], value: T, start: js.UndefOr[scala.Nothing], stop: Double): Unit = js.native
  def apply[T](array: MutableArrayLike[T], value: T, start: Double): Unit = js.native
  def apply[T](array: MutableArrayLike[T], value: T, start: Double, stop: Double): Unit = js.native
}

