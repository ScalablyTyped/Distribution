package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoystickOption extends js.Object {
  var invert: js.UndefOr[Boolean] = js.native
  var invertX: js.UndefOr[Boolean] = js.native
  var invertY: js.UndefOr[Boolean] = js.native
  var pins: js.Array[String] = js.native
}

object JoystickOption {
  @scala.inline
  def apply(pins: js.Array[String]): JoystickOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoystickOption]
  }
  @scala.inline
  implicit class JoystickOptionOps[Self <: JoystickOption] (val x: Self) extends AnyVal {
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
    def setPinsVarargs(value: String*): Self = this.set("pins", js.Array(value :_*))
    @scala.inline
    def setPins(value: js.Array[String]): Self = this.set("pins", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    @scala.inline
    def setInvertX(value: Boolean): Self = this.set("invertX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertX: Self = this.set("invertX", js.undefined)
    @scala.inline
    def setInvertY(value: Boolean): Self = this.set("invertY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvertY: Self = this.set("invertY", js.undefined)
  }
  
}

