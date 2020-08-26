package typings.johnnyFive.mod.Led

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatrixOption extends js.Object {
  var devices: js.UndefOr[Double] = js.native
  var pins: js.Any = js.native
}

object MatrixOption {
  @scala.inline
  def apply(pins: js.Any): MatrixOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatrixOption]
  }
  @scala.inline
  implicit class MatrixOptionOps[Self <: MatrixOption] (val x: Self) extends AnyVal {
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
    def setDevices(value: Double): Self = this.set("devices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDevices: Self = this.set("devices", js.undefined)
  }
  
}

