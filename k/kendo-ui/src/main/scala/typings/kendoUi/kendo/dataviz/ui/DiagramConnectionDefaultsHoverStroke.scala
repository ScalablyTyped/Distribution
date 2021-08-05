package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsHoverStroke extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object DiagramConnectionDefaultsHoverStroke {
  
  inline def apply(): DiagramConnectionDefaultsHoverStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsHoverStroke]
  }
  
  extension [Self <: DiagramConnectionDefaultsHoverStroke](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
