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
    val __obj = js.Dynamic.literal(pins = pins, sensitivity = sensitivity)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroAnalogOption]
  }
}

