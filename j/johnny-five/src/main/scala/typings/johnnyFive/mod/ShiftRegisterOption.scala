package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShiftRegisterOption extends js.Object {
  var isAnode: js.UndefOr[Boolean] = js.native
  var pins: js.Any = js.native
}

object ShiftRegisterOption {
  @scala.inline
  def apply(pins: js.Any): ShiftRegisterOption = {
    val __obj = js.Dynamic.literal(pins = pins.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShiftRegisterOption]
  }
  @scala.inline
  implicit class ShiftRegisterOptionOps[Self <: ShiftRegisterOption] (val x: Self) extends AnyVal {
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
    def setIsAnode(value: Boolean): Self = this.set("isAnode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsAnode: Self = this.set("isAnode", js.undefined)
  }
  
}

