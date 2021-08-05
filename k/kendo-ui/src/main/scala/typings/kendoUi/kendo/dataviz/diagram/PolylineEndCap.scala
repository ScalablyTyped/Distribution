package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineEndCap extends StObject {
  
  var fill: js.UndefOr[String | PolylineEndCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | PolylineEndCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object PolylineEndCap {
  
  inline def apply(): PolylineEndCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineEndCap]
  }
  
  extension [Self <: PolylineEndCap](x: Self) {
    
    inline def setFill(value: String | PolylineEndCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String | PolylineEndCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
