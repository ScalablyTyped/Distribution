package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramShapeEditable extends StObject {
  
  var connect: js.UndefOr[Boolean] = js.undefined
  
  var tools: js.UndefOr[js.Array[DiagramShapeEditableTool]] = js.undefined
}
object DiagramShapeEditable {
  
  inline def apply(): DiagramShapeEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramShapeEditable]
  }
  
  extension [Self <: DiagramShapeEditable](x: Self) {
    
    inline def setConnect(value: Boolean): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setTools(value: js.Array[DiagramShapeEditableTool]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: DiagramShapeEditableTool*): Self = StObject.set(x, "tools", js.Array(value*))
  }
}
