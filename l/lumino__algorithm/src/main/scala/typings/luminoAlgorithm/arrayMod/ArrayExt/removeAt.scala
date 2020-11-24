package typings.luminoAlgorithm.arrayMod.ArrayExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/array", "ArrayExt.removeAt")
@js.native
object removeAt extends js.Object {
  
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
  def apply[T](array: js.Array[T], index: Double): js.UndefOr[T] = js.native
}
