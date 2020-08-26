package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LCDI2COption extends LCDGeneralOption {
  var backlight: js.UndefOr[Double] = js.native
  var controller: String = js.native
}

object LCDI2COption {
  @scala.inline
  def apply(controller: String): LCDI2COption = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCDI2COption]
  }
  @scala.inline
  implicit class LCDI2COptionOps[Self <: LCDI2COption] (val x: Self) extends AnyVal {
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
    def setController(value: String): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def setBacklight(value: Double): Self = this.set("backlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBacklight: Self = this.set("backlight", js.undefined)
  }
  
}

