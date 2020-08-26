package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SensorOption extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var freq: js.UndefOr[Boolean] = js.native
  var pin: Double | String = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object SensorOption {
  @scala.inline
  def apply(pin: Double | String): SensorOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorOption]
  }
  @scala.inline
  implicit class SensorOptionOps[Self <: SensorOption] (val x: Self) extends AnyVal {
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
    def setPin(value: Double | String): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFreq(value: Boolean): Self = this.set("freq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

