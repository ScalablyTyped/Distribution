package typings.lodash.fpMod

import typings.lodash.mod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForEachRight1x1[T] extends js.Object {
  def apply(collection: js.Array[T]): js.Array[T] = js.native
  def apply(collection: List[T]): List[T] = js.native
  def apply[T1 /* <: js.Object */](): js.UndefOr[T1 | Null] = js.native
  def apply[TList /* <: js.UndefOr[List[T] | Null] */](collection: TList with (js.UndefOr[List[T] | Null])): TList = js.native
}

