package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SonarOption extends js.Object {
  var device: String = js.native
  var freq: js.UndefOr[Double] = js.native
  var pin: Double | String = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object SonarOption {
  @scala.inline
  def apply(device: String, pin: Double | String): SonarOption = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any])
    __obj.asInstanceOf[SonarOption]
  }
  @scala.inline
  implicit class SonarOptionOps[Self <: SonarOption] (val x: Self) extends AnyVal {
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
    def setDevice(value: String): Self = this.set("device", value.asInstanceOf[js.Any])
    @scala.inline
    def setPin(value: Double | String): Self = this.set("pin", value.asInstanceOf[js.Any])
    @scala.inline
    def setFreq(value: Double): Self = this.set("freq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreq: Self = this.set("freq", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

