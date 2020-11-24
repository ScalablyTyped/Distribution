package typings.inboxsdk.mod.Toolbars

import typings.inboxsdk.mod.Common.DropdownView
import typings.inboxsdk.mod.Conversations.ThreadView
import typings.inboxsdk.mod.Lists.ThreadRowView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacyToolbarButtonEvent extends js.Object {
  
  var dropdown: js.UndefOr[DropdownView] = js.native
  
  var selectedThreadRowViews: js.Array[ThreadRowView] = js.native
  
  var threadRowViews: js.Array[ThreadRowView] = js.native
  
  var threadView: ThreadView = js.native
}
object LegacyToolbarButtonEvent {
  
  @scala.inline
  def apply(
    selectedThreadRowViews: js.Array[ThreadRowView],
    threadRowViews: js.Array[ThreadRowView],
    threadView: ThreadView
  ): LegacyToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], threadRowViews = threadRowViews.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyToolbarButtonEvent]
  }
  
  @scala.inline
  implicit class LegacyToolbarButtonEventOps[Self <: LegacyToolbarButtonEvent] (val x: Self) extends AnyVal {
    
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
    def setSelectedThreadRowViewsVarargs(value: ThreadRowView*): Self = this.set("selectedThreadRowViews", js.Array(value :_*))
    
    @scala.inline
    def setSelectedThreadRowViews(value: js.Array[ThreadRowView]): Self = this.set("selectedThreadRowViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadRowViewsVarargs(value: ThreadRowView*): Self = this.set("threadRowViews", js.Array(value :_*))
    
    @scala.inline
    def setThreadRowViews(value: js.Array[ThreadRowView]): Self = this.set("threadRowViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadView(value: ThreadView): Self = this.set("threadView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: DropdownView): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
  }
}
