package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServoPCA9685Option extends ServoGeneralOption {
  var address: js.UndefOr[Double] = js.undefined
}

object ServoPCA9685Option {
  @scala.inline
  def apply(
    pin: Double | String,
    address: Int | Double = null,
    center: js.UndefOr[Boolean] = js.undefined,
    controller: String = null,
    isInverted: js.UndefOr[Boolean] = js.undefined,
    range: js.Array[Double] = null,
    startAt: Int | Double = null,
    `type`: String = null
  ): ServoPCA9685Option = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoPCA9685Option]
  }
}

