package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineStartCapStroke extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var dashType: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PolylineStartCapStroke {
  
  inline def apply(): PolylineStartCapStroke = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolylineStartCapStroke]
  }
  
  extension [Self <: PolylineStartCapStroke](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashType(value: String): Self = StObject.set(x, "dashType", value.asInstanceOf[js.Any])
    
    inline def setDashTypeUndefined: Self = StObject.set(x, "dashType", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
