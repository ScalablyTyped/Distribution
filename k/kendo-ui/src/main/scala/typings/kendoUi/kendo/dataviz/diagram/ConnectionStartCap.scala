package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionStartCap extends StObject {
  
  var fill: js.UndefOr[String | ConnectionStartCapFill] = js.undefined
  
  var stroke: js.UndefOr[String | ConnectionStartCapStroke] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ConnectionStartCap {
  
  inline def apply(): ConnectionStartCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionStartCap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionStartCap] (val x: Self) extends AnyVal {
    
    inline def setFill(value: String | ConnectionStartCapFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setStroke(value: String | ConnectionStartCapStroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
