package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixOption extends js.Object {
  var devices: js.UndefOr[Double] = js.undefined
  var pins: js.Any
}

object MatrixOption {
  @scala.inline
  def apply(pins: js.Any, devices: js.UndefOr[Double] = js.undefined): MatrixOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (!js.isUndefined(devices)) __obj.updateDynamic("devices")(devices.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixOption]
  }
}

