package typings
package isDashArrayDashSortedLib.isDashArrayDashSortedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("is-array-sorted", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  Check if an array is sorted.
  @example
  ```
  import isArraySorted = require('is-array-sorted');
  isArraySorted([1, 2, 3]);
  //=> true
  isArraySorted([1, 3, 2]);
  //=> false
  isArraySorted(['a', 'b', 'c']);
  //=> true
  ```
  */
  def apply[T](array: js.Array[T]): scala.Boolean = js.native
  def apply[T](array: js.Array[T], options: Options[T]): scala.Boolean = js.native
}

