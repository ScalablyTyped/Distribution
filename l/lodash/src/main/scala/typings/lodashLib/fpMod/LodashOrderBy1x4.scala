package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x4[T] extends js.Object {
  def apply(iteratees: lodashLib.lodashMod.Many[lodashLib.lodashMod.ValueIteratee[T]]): LodashOrderBy2x5[T] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.Many[
      (js.Function1[/* value */ T, lodashLib.lodashMod.NotVoid]) | lodashLib.lodashMod.ValueIteratee[T]
    ],
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): js.Array[T] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.__,
    orders: lodashLib.lodashMod.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LodashOrderBy1x6[T] = js.native
}

