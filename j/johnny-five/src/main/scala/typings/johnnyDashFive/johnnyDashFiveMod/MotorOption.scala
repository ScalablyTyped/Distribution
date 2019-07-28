package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotorOption extends js.Object {
  var address: js.UndefOr[Double] = js.undefined
  var bits: js.UndefOr[js.Any] = js.undefined
  var controller: js.UndefOr[String] = js.undefined
  var current: js.UndefOr[SensorOption] = js.undefined
  var invertPWM: js.UndefOr[Boolean] = js.undefined
  var pins: MotorPins
  var register: js.UndefOr[js.Any] = js.undefined
}

object MotorOption {
  @scala.inline
  def apply(
    pins: MotorPins,
    address: Int | Double = null,
    bits: js.Any = null,
    controller: String = null,
    current: SensorOption = null,
    invertPWM: js.UndefOr[Boolean] = js.undefined,
    register: js.Any = null
  ): MotorOption = {
    val __obj = js.Dynamic.literal(pins = pins)
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (bits != null) __obj.updateDynamic("bits")(bits)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (current != null) __obj.updateDynamic("current")(current)
    if (!js.isUndefined(invertPWM)) __obj.updateDynamic("invertPWM")(invertPWM)
    if (register != null) __obj.updateDynamic("register")(register)
    __obj.asInstanceOf[MotorOption]
  }
}

