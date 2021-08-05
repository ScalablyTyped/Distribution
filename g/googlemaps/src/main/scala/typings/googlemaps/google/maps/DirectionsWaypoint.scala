package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DirectionsWaypoint represents a location between origin and destination
  * through which the trip should be routed.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint Maps JavaScript API}
  */
trait DirectionsWaypoint extends StObject {
  
  /**
    * Waypoint location. Can be an address string, a {@link LatLng}, or a
    * {@link Place}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint.location Maps JavaScript API}
    */
  var location: js.UndefOr[String | LatLng | Place] = js.undefined
  
  /**
    * If `true`, indicates that this waypoint is a stop between the origin and
    * destination. This has the effect of splitting the route into two legs. If
    * `false`, indicates that the route should be biased to go through this
    * waypoint, but not split into two legs. This is useful if you want to
    * create a route in response to the user dragging waypoints on a map.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint.stopover Maps JavaScript API}
    */
  var stopover: js.UndefOr[Boolean] = js.undefined
}
object DirectionsWaypoint {
  
  inline def apply(): DirectionsWaypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsWaypoint]
  }
  
  extension [Self <: DirectionsWaypoint](x: Self) {
    
    inline def setLocation(value: String | LatLng | Place): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setStopover(value: Boolean): Self = StObject.set(x, "stopover", value.asInstanceOf[js.Any])
    
    inline def setStopoverUndefined: Self = StObject.set(x, "stopover", js.undefined)
  }
}
