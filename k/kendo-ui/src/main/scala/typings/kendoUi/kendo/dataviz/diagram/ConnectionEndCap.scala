package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionEndCap extends StObject {
  
  var fill: js.UndefOr[String | ConnectionEndCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | ConnectionEndCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ConnectionEndCap {
  
  inline def apply(): ConnectionEndCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionEndCap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionEndCap] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String | ConnectionEndCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String | ConnectionEndCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
