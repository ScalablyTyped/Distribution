package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsEditable extends StObject {
  
  var drag: js.UndefOr[Boolean] = js.undefined
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var tools: js.UndefOr[js.Array[DiagramConnectionDefaultsEditableTool]] = js.undefined
}
object DiagramConnectionDefaultsEditable {
  
  @scala.inline
  def apply(): DiagramConnectionDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsEditable]
  }
  
  @scala.inline
  implicit class DiagramConnectionDefaultsEditableMutableBuilder[Self <: DiagramConnectionDefaultsEditable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setTools(value: js.Array[DiagramConnectionDefaultsEditableTool]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    @scala.inline
    def setToolsVarargs(value: DiagramConnectionDefaultsEditableTool*): Self = StObject.set(x, "tools", js.Array(value :_*))
  }
}
