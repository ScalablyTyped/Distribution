package typings.johnnyDashFive.johnnyDashFiveMod

import typings.johnnyDashFive.johnnyDashFiveStrings.DEFAULT
import typings.johnnyDashFive.johnnyDashFiveStrings.FORWARD
import typings.johnnyDashFive.johnnyDashFiveStrings.FORWARD_REVERSE
import typings.johnnyDashFive.johnnyDashFiveStrings.FORWARD_REVERSE_BRAKE
import typings.johnnyDashFive.johnnyDashFiveStrings.PCA9685
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ESCOption extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var controller: js.UndefOr[PCA9685 | DEFAULT] = js.undefined
  var device: js.UndefOr[FORWARD | FORWARD_REVERSE | FORWARD_REVERSE_BRAKE] = js.undefined
  var neutral: js.UndefOr[Double] = js.undefined
  var pin: Double | String
  var pwmRange: js.UndefOr[js.Array[Double]] = js.undefined
}

object ESCOption {
  @scala.inline
  def apply(
    pin: Double | String,
    address: String = null,
    controller: PCA9685 | DEFAULT = null,
    device: FORWARD | FORWARD_REVERSE | FORWARD_REVERSE_BRAKE = null,
    neutral: Int | Double = null,
    pwmRange: js.Array[Double] = null
  ): ESCOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (neutral != null) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (pwmRange != null) __obj.updateDynamic("pwmRange")(pwmRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESCOption]
  }
}

