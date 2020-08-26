package typings.inboxsdk.mod.Router

import typings.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionDropdownClickEvent extends js.Object {
  var dropdown: DropdownView = js.native
}

object SectionDropdownClickEvent {
  @scala.inline
  def apply(dropdown: DropdownView): SectionDropdownClickEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionDropdownClickEvent]
  }
  @scala.inline
  implicit class SectionDropdownClickEventOps[Self <: SectionDropdownClickEvent] (val x: Self) extends AnyVal {
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
    def setDropdown(value: DropdownView): Self = this.set("dropdown", value.asInstanceOf[js.Any])
  }
  
}

