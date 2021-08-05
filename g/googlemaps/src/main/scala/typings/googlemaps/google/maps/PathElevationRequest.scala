package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathElevationRequest extends StObject {
  
  var path: js.UndefOr[js.Array[LatLngLiteral | LatLng]] = js.undefined
  
  var samples: js.UndefOr[Double] = js.undefined
}
object PathElevationRequest {
  
  inline def apply(): PathElevationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathElevationRequest]
  }
  
  extension [Self <: PathElevationRequest](x: Self) {
    
    inline def setPath(value: js.Array[LatLngLiteral | LatLng]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: (LatLngLiteral | LatLng)*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setSamples(value: Double): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
  }
}
