package typings.johnnyFive.mod

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
  def apply(
    dir: Double,
    pwm: Double,
    brake: js.UndefOr[Double] = js.undefined,
    cdir: js.UndefOr[Double] = js.undefined
  ): MotorPins = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], pwm = pwm.asInstanceOf[js.Any])
    if (!js.isUndefined(brake)) __obj.updateDynamic("brake")(brake.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cdir)) __obj.updateDynamic("cdir")(cdir.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorPins]
  }
}

