package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocoderGeometry extends StObject {
  
  var bounds: LatLngBounds
  
  var location: LatLng
  
  var location_type: GeocoderLocationType
  
  var viewport: LatLngBounds
}
object GeocoderGeometry {
  
  inline def apply(
    bounds: LatLngBounds,
    location: LatLng,
    location_type: GeocoderLocationType,
    viewport: LatLngBounds
  ): GeocoderGeometry = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], location_type = location_type.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocoderGeometry]
  }
  
  extension [Self <: GeocoderGeometry](x: Self) {
    
    inline def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocation_type(value: GeocoderLocationType): Self = StObject.set(x, "location_type", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: LatLngBounds): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
