package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartition1x2[T] extends js.Object {
  def apply(callback: lodashLib.lodashMod.ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[U /* <: T */](callback: lodashLib.lodashMod.ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[stdLib.Exclude[T, U]]] = js.native
}

