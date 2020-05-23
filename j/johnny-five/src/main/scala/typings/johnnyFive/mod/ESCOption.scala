package typings.johnnyFive.mod

import typings.johnnyFive.johnnyFiveStrings.DEFAULT
import typings.johnnyFive.johnnyFiveStrings.FORWARD
import typings.johnnyFive.johnnyFiveStrings.FORWARD_REVERSE
import typings.johnnyFive.johnnyFiveStrings.FORWARD_REVERSE_BRAKE
import typings.johnnyFive.johnnyFiveStrings.PCA9685
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
    neutral: js.UndefOr[Double] = js.undefined,
    pwmRange: js.Array[Double] = null
  ): ESCOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(neutral)) __obj.updateDynamic("neutral")(neutral.get.asInstanceOf[js.Any])
    if (pwmRange != null) __obj.updateDynamic("pwmRange")(pwmRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ESCOption]
  }
}

