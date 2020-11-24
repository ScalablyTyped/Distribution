package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiagramShapeEditable extends js.Object {
  
  var connect: js.UndefOr[Boolean] = js.native
  
  var tools: js.UndefOr[js.Array[DiagramShapeEditableTool]] = js.native
}
object DiagramShapeEditable {
  
  @scala.inline
  def apply(): DiagramShapeEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeEditable]
  }
  
  @scala.inline
  implicit class DiagramShapeEditableOps[Self <: DiagramShapeEditable] (val x: Self) extends AnyVal {
    
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
    def setConnect(value: Boolean): Self = this.set("connect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    
    @scala.inline
    def setToolsVarargs(value: DiagramShapeEditableTool*): Self = this.set("tools", js.Array(value :_*))
    
    @scala.inline
    def setTools(value: js.Array[DiagramShapeEditableTool]): Self = this.set("tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTools: Self = this.set("tools", js.undefined)
  }
}
