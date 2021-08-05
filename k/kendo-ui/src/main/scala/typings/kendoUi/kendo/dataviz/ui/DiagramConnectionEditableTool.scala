package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionEditableTool extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object DiagramConnectionEditableTool {
  
  inline def apply(): DiagramConnectionEditableTool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionEditableTool]
  }
  
  extension [Self <: DiagramConnectionEditableTool](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
