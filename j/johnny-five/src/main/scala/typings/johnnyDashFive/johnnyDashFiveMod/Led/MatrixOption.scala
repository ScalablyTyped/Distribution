package typings.johnnyDashFive.johnnyDashFiveMod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixOption extends js.Object {
  var devices: js.UndefOr[Double] = js.undefined
  var pins: js.Any
}

object MatrixOption {
  @scala.inline
  def apply(pins: js.Any, devices: Int | Double = null): MatrixOption = {
    val __obj = js.Dynamic.literal(pins = pins)
    if (devices != null) __obj.updateDynamic("devices")(devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixOption]
  }
}

