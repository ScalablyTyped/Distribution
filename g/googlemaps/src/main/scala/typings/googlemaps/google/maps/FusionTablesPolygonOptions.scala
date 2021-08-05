package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait FusionTablesPolygonOptions extends StObject {
  
  var fillColor: js.UndefOr[String] = js.undefined
  
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeWeight: js.UndefOr[Double] = js.undefined
}
object FusionTablesPolygonOptions {
  
  inline def apply(): FusionTablesPolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesPolygonOptions]
  }
  
  extension [Self <: FusionTablesPolygonOptions](x: Self) {
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
