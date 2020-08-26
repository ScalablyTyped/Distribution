package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DigitsOption extends js.Object {
  var controller: js.UndefOr[String] = js.native
  var devices: js.UndefOr[Double] = js.native
  var pins: js.Any = js.native
}

object DigitsOption {
  @scala.inline
  def apply(pins: js.Any): DigitsOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigitsOption]
  }
  @scala.inline
  implicit class DigitsOptionOps[Self <: DigitsOption] (val x: Self) extends AnyVal {
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
    def setPins(value: js.Any): Self = this.set("pins", value.asInstanceOf[js.Any])
    @scala.inline
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setDevices(value: Double): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
  }
  
}

