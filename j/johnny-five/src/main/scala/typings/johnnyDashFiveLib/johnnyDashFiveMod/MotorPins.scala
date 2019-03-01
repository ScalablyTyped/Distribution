package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotorPins extends js.Object {
  var brake: js.UndefOr[scala.Double] = js.undefined
  var cdir: js.UndefOr[scala.Double] = js.undefined
  var dir: scala.Double
  var pwm: scala.Double
}

object MotorPins {
  @scala.inline
  def apply(
    dir: scala.Double,
    pwm: scala.Double,
    brake: scala.Int | scala.Double = null,
    cdir: scala.Int | scala.Double = null
  ): MotorPins = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dir")(dir)
    __obj.updateDynamic("pwm")(pwm)
    if (brake != null) __obj.updateDynamic("brake")(brake.asInstanceOf[js.Any])
    if (cdir != null) __obj.updateDynamic("cdir")(cdir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorPins]
  }
}

