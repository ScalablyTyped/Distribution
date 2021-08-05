package typings.googlemaps.google.maps.places

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO add BusinessStatus https://developers.google.com/maps/documentation/javascript/reference/places-service#BusinessStatus
trait PlaceGeometry extends StObject {
  
  var location: LatLng
  
  var viewport: LatLngBounds
}
object PlaceGeometry {
  
  inline def apply(location: LatLng, viewport: LatLngBounds): PlaceGeometry = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceGeometry]
  }
  
  extension [Self <: PlaceGeometry](x: Self) {
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: LatLngBounds): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
