package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionEndCapFill extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionEndCapFill {
  
  inline def apply(): DiagramConnectionEndCapFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionEndCapFill]
  }
  
  extension [Self <: DiagramConnectionEndCapFill](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
