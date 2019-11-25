package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GyroAnalogOption extends GyroGeneralOption {
  var pins: js.Array[String]
  var resolution: js.UndefOr[Double] = js.undefined
  var sensitivity: Double
}

object GyroAnalogOption {
  @scala.inline
  def apply(
    pins: js.Array[String],
    sensitivity: Double,
    controller: String = null,
    resolution: Int | Double = null
  ): GyroAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any], sensitivity = sensitivity.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroAnalogOption]
  }
}

