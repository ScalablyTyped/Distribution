package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionDefaultsHover extends StObject {
  
  var stroke: js.UndefOr[DiagramConnectionDefaultsHoverStroke] = js.undefined
}
object DiagramConnectionDefaultsHover {
  
  inline def apply(): DiagramConnectionDefaultsHover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaultsHover]
  }
  
  extension [Self <: DiagramConnectionDefaultsHover](x: Self) {
    
    inline def setStroke(value: DiagramConnectionDefaultsHoverStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
  }
}
