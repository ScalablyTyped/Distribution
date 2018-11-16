package typings
package lodashLib.fpMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashRangeStep extends js.Object {
  def apply(
    start: lodashLib.lodashMod.underscoreNs.`__`,
    end: lodashLib.lodashMod.underscoreNs.`__`,
    step: scala.Double
  ): LodashRangeStep1x4 = js.native
  def apply(start: lodashLib.lodashMod.underscoreNs.`__`, end: scala.Double): LodashRangeStep1x2 = js.native
  def apply(start: lodashLib.lodashMod.underscoreNs.`__`, end: scala.Double, step: scala.Double): LodashRangeStep1x6 = js.native
  def apply(start: scala.Double): LodashRangeStep1x1 = js.native
  def apply(start: scala.Double, end: lodashLib.lodashMod.underscoreNs.`__`, step: scala.Double): LodashRangeStep1x5 = js.native
  def apply(start: scala.Double, end: scala.Double): LodashRangeStep1x3 = js.native
  def apply(start: scala.Double, end: scala.Double, step: scala.Double): js.Array[scala.Double] = js.native
}

