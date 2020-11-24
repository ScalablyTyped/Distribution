package typings.inboxsdk.mod.Toolbars

import typings.inboxsdk.mod.Common.DropdownView
import typings.inboxsdk.mod.Conversations.ThreadView
import typings.inboxsdk.mod.Lists.ThreadRowView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolbarButtonEvent extends js.Object {
  
  var dropdown: js.UndefOr[DropdownView] = js.native
  
  var position: ToolbarButtonPosition = js.native
  
  var selectedThreadRowViews: js.Array[ThreadRowView] = js.native
  
  var selectedThreadViews: js.Array[ThreadView] = js.native
}
object ToolbarButtonEvent {
  
  @scala.inline
  def apply(
    position: ToolbarButtonPosition,
    selectedThreadRowViews: js.Array[ThreadRowView],
    selectedThreadViews: js.Array[ThreadView]
  ): ToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], selectedThreadViews = selectedThreadViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButtonEvent]
  }
  
  @scala.inline
  implicit class ToolbarButtonEventOps[Self <: ToolbarButtonEvent] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: ToolbarButtonPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedThreadRowViewsVarargs(value: ThreadRowView*): Self = this.set("selectedThreadRowViews", js.Array(value :_*))
    
    @scala.inline
    def setSelectedThreadRowViews(value: js.Array[ThreadRowView]): Self = this.set("selectedThreadRowViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedThreadViewsVarargs(value: ThreadView*): Self = this.set("selectedThreadViews", js.Array(value :_*))
    
    @scala.inline
    def setSelectedThreadViews(value: js.Array[ThreadView]): Self = this.set("selectedThreadViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: DropdownView): Self = this.set("dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdown: Self = this.set("dropdown", js.undefined)
  }
}
