package typings.johnnyDashFive.johnnyDashFiveMod

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
    if (!js.isUndefined(center)) __obj.updateDynamic("center")(center)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted)
    if (range != null) __obj.updateDynamic("range")(range)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServoPCA9685Option]
  }
}

