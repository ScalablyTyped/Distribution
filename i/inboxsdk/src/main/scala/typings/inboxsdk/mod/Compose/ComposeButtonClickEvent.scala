package typings.inboxsdk.mod.Compose

import typings.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposeButtonClickEvent extends js.Object {
  
  var composeView: ComposeView = js.native
  
  var dropdown: DropdownView = js.native
}
object ComposeButtonClickEvent {
  
  @scala.inline
  def apply(composeView: ComposeView, dropdown: DropdownView): ComposeButtonClickEvent = {
    val __obj = js.Dynamic.literal(composeView = composeView.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeButtonClickEvent]
  }
  
  @scala.inline
  implicit class ComposeButtonClickEventOps[Self <: ComposeButtonClickEvent] (val x: Self) extends AnyVal {
    
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
    def setComposeView(value: ComposeView): Self = this.set("composeView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropdown(value: DropdownView): Self = this.set("dropdown", value.asInstanceOf[js.Any])
  }
}
