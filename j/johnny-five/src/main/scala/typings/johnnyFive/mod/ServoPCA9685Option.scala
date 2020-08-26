package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServoPCA9685Option extends ServoGeneralOption {
  var address: js.UndefOr[Double] = js.native
}

object ServoPCA9685Option {
  @scala.inline
  def apply(pin: Double | String): ServoPCA9685Option = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServoPCA9685Option]
  }
  @scala.inline
  implicit class ServoPCA9685OptionOps[Self <: ServoPCA9685Option] (val x: Self) extends AnyVal {
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
    def setAddress(value: Double): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
  }
  
}

