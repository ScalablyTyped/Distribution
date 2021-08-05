package typings.kendoUi.kendo.dataviz.diagram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeFillGradient extends StObject {
  
  var center: js.UndefOr[js.Any] = js.undefined
  
  var end: js.UndefOr[js.Any] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[js.Any] = js.undefined
  
  var stops: js.UndefOr[js.Array[ShapeFillGradientStop]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ShapeFillGradient {
  
  inline def apply(): ShapeFillGradient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeFillGradient]
  }
  
  extension [Self <: ShapeFillGradient](x: Self) {
    
    inline def setCenter(value: js.Any): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setEnd(value: js.Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setStart(value: js.Any): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStops(value: js.Array[ShapeFillGradientStop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    inline def setStopsVarargs(value: ShapeFillGradientStop*): Self = StObject.set(x, "stops", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
