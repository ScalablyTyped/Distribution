package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsResult extends StObject {
  
  var geocoded_waypoints: js.Array[DirectionsGeocodedWaypoint] = js.native
  
  var routes: js.Array[DirectionsRoute] = js.native
}
object DirectionsResult {
  
  @scala.inline
  def apply(geocoded_waypoints: js.Array[DirectionsGeocodedWaypoint], routes: js.Array[DirectionsRoute]): DirectionsResult = {
    val __obj = js.Dynamic.literal(geocoded_waypoints = geocoded_waypoints.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResult]
  }
  
  @scala.inline
  implicit class DirectionsResultMutableBuilder[Self <: DirectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeocoded_waypoints(value: js.Array[DirectionsGeocodedWaypoint]): Self = StObject.set(x, "geocoded_waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeocoded_waypointsVarargs(value: DirectionsGeocodedWaypoint*): Self = StObject.set(x, "geocoded_waypoints", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[DirectionsRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesVarargs(value: DirectionsRoute*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
