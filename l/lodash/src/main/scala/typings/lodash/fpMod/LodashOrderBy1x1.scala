package typings.lodash.fpMod

import typings.lodash.lodashMod.List
import typings.lodash.lodashMod.Many
import typings.lodash.lodashMod.__
import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x1[T] extends js.Object {
  def apply(orders: Many[Boolean | asc | desc]): js.Array[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: js.Object): js.Array[T] = js.native
  def apply(orders: Many[Boolean | asc | desc], collection: List[T]): js.Array[T] = js.native
  def apply(orders: __): LodashOrderBy1x5[T] = js.native
  def apply(orders: __, collection: List[T]): LodashOrderBy1x5[T] = js.native
  def apply[T1 /* <: js.Object */](orders: __, collection: T1): LodashOrderBy3x5[T] = js.native
}

