package typings.luminoAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/array", "ArrayExt.move")
@js.native
object move extends js.Object {
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
  def apply[T](array: MutableArrayLike[T], fromIndex: Double, toIndex: Double): Unit = js.native
}

