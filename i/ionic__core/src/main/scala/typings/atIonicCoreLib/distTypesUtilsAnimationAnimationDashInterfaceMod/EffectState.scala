package typings
package atIonicCoreLib.distTypesUtilsAnimationAnimationDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectState extends js.Object {
  var effectUnit: java.lang.String
  var num: scala.Double
  var `val`: js.Any
}

object EffectState {
  @scala.inline
  def apply(effectUnit: java.lang.String, num: scala.Double, `val`: js.Any): EffectState = {
    val __obj = js.Dynamic.literal(effectUnit = effectUnit, num = num)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[EffectState]
  }
}

