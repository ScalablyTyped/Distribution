package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsSelectionHandlesFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionDefaultsSelectionHandlesFill {
  
  inline def apply(): DiagramConnectionDefaultsSelectionHandlesFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsSelectionHandlesFill]
  }
  
  extension [Self <: DiagramConnectionDefaultsSelectionHandlesFill](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
