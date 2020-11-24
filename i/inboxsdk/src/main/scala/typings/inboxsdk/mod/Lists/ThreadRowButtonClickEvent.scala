package typings.inboxsdk.mod.Lists

import typings.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadRowButtonClickEvent extends js.Object {
  
  var dropdown: js.UndefOr[DropdownView] = js.native
  
  var threadRowView: ThreadRowView = js.native
}
object ThreadRowButtonClickEvent {
  
  @scala.inline
  def apply(threadRowView: ThreadRowView): ThreadRowButtonClickEvent = {
    val __obj = js.Dynamic.literal(threadRowView = threadRowView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonClickEvent]
  }
  
  @scala.inline
  implicit class ThreadRowButtonClickEventOps[Self <: ThreadRowButtonClickEvent] (val x: Self) extends AnyVal {
    
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
    def setThreadRowView(value: ThreadRowView): Self = this.set("threadRowView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: DropdownView): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
  }
}
