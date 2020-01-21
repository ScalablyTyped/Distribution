package typings.ionicCore.oldAnimationAnimationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectState extends js.Object {
  var effectUnit: String
  var num: Double
  var `val`: js.Any
}

object EffectState {
  @scala.inline
  def apply(effectUnit: String, num: Double, `val`: js.Any): EffectState = {
    val __obj = js.Dynamic.literal(effectUnit = effectUnit.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectState]
  }
}

