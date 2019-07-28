package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoystickOption extends js.Object {
  var invert: js.UndefOr[Boolean] = js.undefined
  var invertX: js.UndefOr[Boolean] = js.undefined
  var invertY: js.UndefOr[Boolean] = js.undefined
  var pins: js.Array[String]
}

object JoystickOption {
  @scala.inline
  def apply(
    pins: js.Array[String],
    invert: js.UndefOr[Boolean] = js.undefined,
    invertX: js.UndefOr[Boolean] = js.undefined,
    invertY: js.UndefOr[Boolean] = js.undefined
  ): JoystickOption = {
    val __obj = js.Dynamic.literal(pins = pins)
    if (!js.isUndefined(invert)) __obj.updateDynamic("invert")(invert)
    if (!js.isUndefined(invertX)) __obj.updateDynamic("invertX")(invertX)
    if (!js.isUndefined(invertY)) __obj.updateDynamic("invertY")(invertY)
    __obj.asInstanceOf[JoystickOption]
  }
}

