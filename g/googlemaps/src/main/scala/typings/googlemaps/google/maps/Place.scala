package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Place extends StObject {
  
  var location: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  
  var placeId: js.UndefOr[String] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
}
object Place {
  
  inline def apply(): Place = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Place]
  }
  
  extension [Self <: Place](x: Self) {
    
    inline def setLocation(value: LatLng | LatLngLiteral): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPlaceId(value: String): Self = StObject.set(x, "placeId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "placeId", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
