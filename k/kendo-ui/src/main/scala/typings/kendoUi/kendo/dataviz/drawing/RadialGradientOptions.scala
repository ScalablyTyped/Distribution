package typings.kendoUi.kendo.dataviz.drawing

import typings.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadialGradientOptions extends StObject {
  
  var center: js.UndefOr[js.Any | Point] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var stops: js.UndefOr[js.Any] = js.undefined
}
object RadialGradientOptions {
  
  inline def apply(): RadialGradientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGradientOptions]
  }
  
  extension [Self <: RadialGradientOptions](x: Self) {
    
    inline def setCenter(value: js.Any | Point): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setStops(value: js.Any): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
  }
}
