package typings.luminoAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lumino/algorithm/types/array", "ArrayExt.insert")
@js.native
object insert extends js.Object {
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
  def apply[T](array: js.Array[T], index: Double, value: T): Unit = js.native
}

