package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MotorOption extends js.Object {
  var address: js.UndefOr[Double] = js.native
  var bits: js.UndefOr[js.Any] = js.native
  var controller: js.UndefOr[String] = js.native
  var current: js.UndefOr[SensorOption] = js.native
  var invertPWM: js.UndefOr[Boolean] = js.native
  var pins: MotorPins = js.native
  var register: js.UndefOr[js.Any] = js.native
}

object MotorOption {
  @scala.inline
  def apply(pins: MotorPins): MotorOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotorOption]
  }
  @scala.inline
  implicit class MotorOptionOps[Self <: MotorOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPins(value: MotorPins): Self = this.set("pins", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: Double): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setBits(value: js.Any): Self = this.set("bits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBits: Self = this.set("bits", js.undefined)
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setCurrent(value: SensorOption): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
    @scala.inline
    def setInvertPWM(value: Boolean): Self = this.set("invertPWM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertPWM: Self = this.set("invertPWM", js.undefined)
    @scala.inline
    def setRegister(value: js.Any): Self = this.set("register", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
  }
  
}

