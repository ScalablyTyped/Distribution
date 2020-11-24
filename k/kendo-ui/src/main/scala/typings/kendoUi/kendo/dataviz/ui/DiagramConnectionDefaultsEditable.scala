package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramConnectionDefaultsEditable extends js.Object {
  
  var drag: js.UndefOr[Boolean] = js.native
  
  var remove: js.UndefOr[Boolean] = js.native
  
  var tools: js.UndefOr[js.Array[DiagramConnectionDefaultsEditableTool]] = js.native
}
object DiagramConnectionDefaultsEditable {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsEditable]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsEditableOps[Self <: DiagramConnectionDefaultsEditable] (val x: Self) extends AnyVal {
    
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
    def setDrag(value: Boolean): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setToolsVarargs(value: DiagramConnectionDefaultsEditableTool*): Self = this.set("tools", js.Array(value :_*))
    
    @scala.inline
    def setTools(value: js.Array[DiagramConnectionDefaultsEditableTool]): Self = this.set("tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
}
