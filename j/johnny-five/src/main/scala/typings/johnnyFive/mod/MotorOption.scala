package typings.johnnyFive.mod

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
    address: js.UndefOr[Double] = js.undefined,
    bits: js.Any = null,
    controller: String = null,
    current: SensorOption = null,
    invertPWM: js.UndefOr[Boolean] = js.undefined,
    register: js.Any = null
  ): MotorOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.get.asInstanceOf[js.Any])
    if (bits != null) __obj.updateDynamic("bits")(bits.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (!js.isUndefined(invertPWM)) __obj.updateDynamic("invertPWM")(invertPWM.get.asInstanceOf[js.Any])
    if (register != null) __obj.updateDynamic("register")(register.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorOption]
  }
}

