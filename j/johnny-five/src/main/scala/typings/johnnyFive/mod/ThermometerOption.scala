package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThermometerOption extends js.Object {
  var controller: js.UndefOr[String] = js.native
  var freq: js.UndefOr[Double] = js.native
  var pin: String | Double = js.native
  var toCelsius: js.UndefOr[js.Function1[/* val */ Double, Double]] = js.native
}

object ThermometerOption {
  @scala.inline
  def apply(pin: String | Double): ThermometerOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThermometerOption]
  }
  @scala.inline
  implicit class ThermometerOptionOps[Self <: ThermometerOption] (val x: Self) extends AnyVal {
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
    def setPin(value: String | Double): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setFreq(value: Double): Self = this.set("freq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
    @scala.inline
    def setToCelsius(value: /* val */ Double => Double): Self = this.set("toCelsius", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToCelsius: Self = this.set("toCelsius", js.undefined)
  }
  
}

