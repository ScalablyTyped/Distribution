package typings.kendoUi.kendo.dataviz.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagramConnectionEndCap extends StObject {
  
  var fill: js.UndefOr[String | DiagramConnectionEndCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | DiagramConnectionEndCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object DiagramConnectionEndCap {
  
  inline def apply(): DiagramConnectionEndCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionEndCap]
  }
  
  extension [Self <: DiagramConnectionEndCap](x: Self) {
    
    inline def setFill(value: String | DiagramConnectionEndCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String | DiagramConnectionEndCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
