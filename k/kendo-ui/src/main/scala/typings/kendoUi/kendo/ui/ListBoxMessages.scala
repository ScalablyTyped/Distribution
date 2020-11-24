package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxMessages extends js.Object {
  
  var tools: js.UndefOr[ListBoxMessagesTools] = js.native
}
object ListBoxMessages {
  
  @scala.inline
  def apply(): ListBoxMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxMessages]
  }
  
  @scala.inline
  implicit class ListBoxMessagesOps[Self <: ListBoxMessages] (val x: Self) extends AnyVal {
    
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
    def setTools(value: ListBoxMessagesTools): Self = this.set("tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
}
