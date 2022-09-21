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
  
  inline def apply(): DiagramConnectionDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsEditable]
  }
  
  extension [Self <: DiagramConnectionDefaultsEditable](x: Self) {
    
    inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setTools(value: js.Array[DiagramConnectionDefaultsEditableTool]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: DiagramConnectionDefaultsEditableTool*): Self = StObject.set(x, "tools", js.Array(value*))
  }
}
