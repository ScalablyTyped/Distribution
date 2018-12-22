package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOrderBy1x4[T] extends js.Object {
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.Many[lodashLib.lodashMod.underscoreNs.ValueIteratee[T]]
  ): LodashOrderBy2x5[T] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.Many[
      (js.Function1[/* value */ T, lodashLib.lodashMod.underscoreNs.NotVoid]) | lodashLib.lodashMod.underscoreNs.ValueIteratee[T]
    ],
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): js.Array[T] = js.native
  def apply(
    iteratees: lodashLib.lodashMod.underscoreNs.`__`,
    orders: lodashLib.lodashMod.underscoreNs.Many[scala.Boolean | lodashLib.lodashLibStrings.asc | lodashLib.lodashLibStrings.desc]
  ): LodashOrderBy1x6[T] = js.native
}

