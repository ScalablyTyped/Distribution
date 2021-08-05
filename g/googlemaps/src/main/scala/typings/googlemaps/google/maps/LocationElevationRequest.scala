package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationElevationRequest extends StObject {
  
  var locations: js.Array[LatLngLiteral | LatLng]
}
object LocationElevationRequest {
  
  inline def apply(locations: js.Array[LatLngLiteral | LatLng]): LocationElevationRequest = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationElevationRequest]
  }
  
  extension [Self <: LocationElevationRequest](x: Self) {
    
    inline def setLocations(value: js.Array[LatLngLiteral | LatLng]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: (LatLngLiteral | LatLng)*): Self = StObject.set(x, "locations", js.Array(value :_*))
  }
}
