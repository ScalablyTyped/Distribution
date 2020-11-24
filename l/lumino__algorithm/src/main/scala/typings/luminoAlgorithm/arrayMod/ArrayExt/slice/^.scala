package typings.luminoAlgorithm.arrayMod.ArrayExt.slice

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/algorithm/types/array", "ArrayExt.slice")
@js.native
object ^ extends js.Object {
  
  /**
    * Create a slice of an array subject to an optional step.
    *
    * @param array - The array-like object of interest.
    *
    * @param options - The options for configuring the slice.
    *
    * @returns A new array with the specified values.
    *
    * @throws An exception if the slice `step` is `0`.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start`, `stop`, or `step` which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@lumino/algorithm';
    *
    * let data = [0, 3, 4, 7, 7, 9];
    * ArrayExt.slice(data);                         // [0, 3, 4, 7, 7, 9]
    * ArrayExt.slice(data, { start: 2 });           // [4, 7, 7, 9]
    * ArrayExt.slice(data, { start: 0, stop: 4 });  // [0, 3, 4, 7]
    * ArrayExt.slice(data, { step: 2 });            // [0, 4, 7]
    * ArrayExt.slice(data, { step: -1 });           // [9, 7, 7, 4, 3, 0]
    * ```
    */
  def apply[T](array: ArrayLike[T]): js.Array[T] = js.native
  def apply[T](array: ArrayLike[T], options: IOptions): js.Array[T] = js.native
}
