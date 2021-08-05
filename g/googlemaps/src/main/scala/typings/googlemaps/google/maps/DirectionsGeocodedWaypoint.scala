package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single geocoded waypoint.
  */
trait DirectionsGeocodedWaypoint extends StObject {
  
  var partial_match: Boolean
  
  var place_id: String
  
  var types: js.Array[String]
}
object DirectionsGeocodedWaypoint {
  
  inline def apply(partial_match: Boolean, place_id: String, types: js.Array[String]): DirectionsGeocodedWaypoint = {
    val __obj = js.Dynamic.literal(partial_match = partial_match.asInstanceOf[js.Any], place_id = place_id.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsGeocodedWaypoint]
  }
  
  extension [Self <: DirectionsGeocodedWaypoint](x: Self) {
    
    inline def setPartial_match(value: Boolean): Self = StObject.set(x, "partial_match", value.asInstanceOf[js.Any])
    
    inline def setPlace_id(value: String): Self = StObject.set(x, "place_id", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
