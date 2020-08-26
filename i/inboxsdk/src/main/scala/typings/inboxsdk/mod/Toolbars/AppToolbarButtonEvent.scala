package typings.inboxsdk.mod.Toolbars

import typings.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppToolbarButtonEvent extends js.Object {
  var dropdown: DropdownView = js.native
}

object AppToolbarButtonEvent {
  @scala.inline
  def apply(dropdown: DropdownView): AppToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppToolbarButtonEvent]
  }
  @scala.inline
  implicit class AppToolbarButtonEventOps[Self <: AppToolbarButtonEvent] (val x: Self) extends AnyVal {
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

