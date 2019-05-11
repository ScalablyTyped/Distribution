package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy2x1[T] extends js.Object {
  def apply(
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): js.Array[T] = js.native
  def apply(
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: js.Object
  ): js.Array[T] = js.native
  def apply(
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc],
    collection: lodashLib.lodashMod.List[T]
  ): js.Array[T] = js.native
  def apply(orders: lodashLib.lodashMod.__): LodashOrderBy2x5[T] = js.native
  def apply(orders: lodashLib.lodashMod.__, collection: lodashLib.lodashMod.List[T]): LodashOrderBy2x5[T] = js.native
  def apply[T1 /* <: js.Object */](orders: lodashLib.lodashMod.__, collection: T1): LodashOrderBy4x5[T] = js.native
}

