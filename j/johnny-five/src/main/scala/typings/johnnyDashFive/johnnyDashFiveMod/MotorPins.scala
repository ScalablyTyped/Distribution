package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotorPins extends js.Object {
  var brake: js.UndefOr[Double] = js.undefined
  var cdir: js.UndefOr[Double] = js.undefined
  var dir: Double
  var pwm: Double
}

object MotorPins {
  @scala.inline
  def apply(dir: Double, pwm: Double, brake: Int | Double = null, cdir: Int | Double = null): MotorPins = {
    val __obj = js.Dynamic.literal(dir = dir, pwm = pwm)
    if (brake != null) __obj.updateDynamic("brake")(brake.asInstanceOf[js.Any])
    if (cdir != null) __obj.updateDynamic("cdir")(cdir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorPins]
  }
}

