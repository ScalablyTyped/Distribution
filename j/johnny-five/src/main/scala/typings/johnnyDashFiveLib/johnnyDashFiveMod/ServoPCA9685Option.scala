package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServoPCA9685Option extends ServoGeneralOption {
  var address: js.UndefOr[scala.Double] = js.undefined
}

object ServoPCA9685Option {
  @scala.inline
  def apply(
    pin: scala.Double | java.lang.String,
    address: scala.Int | scala.Double = null,
    center: js.UndefOr[scala.Boolean] = js.undefined,
    controller: java.lang.String = null,
    isInverted: js.UndefOr[scala.Boolean] = js.undefined,
    range: js.Array[scala.Double] = null,
    startAt: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ServoPCA9685Option = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pin")(pin.asInstanceOf[js.Any])
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

