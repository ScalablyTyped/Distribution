package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeDefaultsEditable extends StObject {
  
  var connect: js.UndefOr[Boolean] = js.undefined
  
  var drag: js.UndefOr[Boolean] = js.undefined
  
  var remove: js.UndefOr[Boolean] = js.undefined
  
  var tools: js.UndefOr[js.Array[DiagramShapeDefaultsEditableTool]] = js.undefined
}
object DiagramShapeDefaultsEditable {
  
  inline def apply(): DiagramShapeDefaultsEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeDefaultsEditable]
  }
  
  extension [Self <: DiagramShapeDefaultsEditable](x: Self) {
    
    inline def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setTools(value: js.Array[DiagramShapeDefaultsEditableTool]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: DiagramShapeDefaultsEditableTool*): Self = StObject.set(x, "tools", js.Array(value :_*))
  }
}
