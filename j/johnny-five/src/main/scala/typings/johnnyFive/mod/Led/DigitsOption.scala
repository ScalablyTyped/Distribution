package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigitsOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
  var devices: js.UndefOr[Double] = js.undefined
  var pins: js.Any
}

object DigitsOption {
  @scala.inline
  def apply(pins: js.Any, controller: String = null, devices: js.UndefOr[Double] = js.undefined): DigitsOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(devices)) __obj.updateDynamic("devices")(devices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigitsOption]
  }
}

