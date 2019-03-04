package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GyroAnalogOption extends GyroGeneralOption {
  var pins: js.Array[java.lang.String]
  var resolution: js.UndefOr[scala.Double] = js.undefined
  var sensitivity: scala.Double
}

object GyroAnalogOption {
  @scala.inline
  def apply(
    pins: js.Array[java.lang.String],
    sensitivity: scala.Double,
    controller: java.lang.String = null,
    resolution: scala.Int | scala.Double = null
  ): GyroAnalogOption = {
    val __obj = js.Dynamic.literal(pins = pins, sensitivity = sensitivity)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroAnalogOption]
  }
}

