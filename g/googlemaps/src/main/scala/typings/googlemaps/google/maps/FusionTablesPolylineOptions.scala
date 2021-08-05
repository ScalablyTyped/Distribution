package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait FusionTablesPolylineOptions extends StObject {
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  
  var strokeWeight: js.UndefOr[Double] = js.undefined
}
object FusionTablesPolylineOptions {
  
  inline def apply(): FusionTablesPolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FusionTablesPolylineOptions]
  }
  
  extension [Self <: FusionTablesPolylineOptions](x: Self) {
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeWeight(value: Double): Self = StObject.set(x, "strokeWeight", value.asInstanceOf[js.Any])
    
    inline def setStrokeWeightUndefined: Self = StObject.set(x, "strokeWeight", js.undefined)
  }
}
