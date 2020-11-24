package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBoxToolbar extends js.Object {
  
  var position: js.UndefOr[String] = js.native
  
  var tools: js.UndefOr[js.Any] = js.native
}
object ListBoxToolbar {
  
  @scala.inline
  def apply(): ListBoxToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBoxToolbar]
  }
  
  @scala.inline
  implicit class ListBoxToolbarOps[Self <: ListBoxToolbar] (val x: Self) extends AnyVal {
    
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
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTools(value: js.Any): Self = this.set("tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
}
