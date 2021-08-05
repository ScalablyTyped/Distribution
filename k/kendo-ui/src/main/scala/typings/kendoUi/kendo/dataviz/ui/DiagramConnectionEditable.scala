package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionEditable extends StObject {
  
  var tools: js.UndefOr[js.Array[DiagramConnectionEditableTool]] = js.undefined
}
object DiagramConnectionEditable {
  
  inline def apply(): DiagramConnectionEditable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionEditable]
  }
  
  extension [Self <: DiagramConnectionEditable](x: Self) {
    
    inline def setTools(value: js.Array[DiagramConnectionEditableTool]): Self = StObject.set(x, "tools", value.asInstanceOf[js.Any])
    
    inline def setToolsUndefined: Self = StObject.set(x, "tools", js.undefined)
    
    inline def setToolsVarargs(value: DiagramConnectionEditableTool*): Self = StObject.set(x, "tools", js.Array(value :_*))
  }
}
