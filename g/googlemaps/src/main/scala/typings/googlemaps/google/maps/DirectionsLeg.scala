package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsLeg extends StObject {
  
  var arrival_time: Time = js.native
  
  var departure_time: Time = js.native
  
  var distance: Distance = js.native
  
  var duration: Duration = js.native
  
  var duration_in_traffic: Duration = js.native
  
  var end_address: String = js.native
  
  var end_location: LatLng = js.native
  
  var start_address: String = js.native
  
  var start_location: LatLng = js.native
  
  var steps: js.Array[DirectionsStep] = js.native
  
  var via_waypoints: js.Array[LatLng] = js.native
}
object DirectionsLeg {
  
  @scala.inline
  def apply(
    arrival_time: Time,
    departure_time: Time,
    distance: Distance,
    duration: Duration,
    duration_in_traffic: Duration,
    end_address: String,
    end_location: LatLng,
    start_address: String,
    start_location: LatLng,
    steps: js.Array[DirectionsStep],
    via_waypoints: js.Array[LatLng]
  ): DirectionsLeg = {
    val __obj = js.Dynamic.literal(arrival_time = arrival_time.asInstanceOf[js.Any], departure_time = departure_time.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], duration_in_traffic = duration_in_traffic.asInstanceOf[js.Any], end_address = end_address.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], start_address = start_address.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], via_waypoints = via_waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsLeg]
  }
  
  @scala.inline
  implicit class DirectionsLegMutableBuilder[Self <: DirectionsLeg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArrival_time(value: Time): Self = StObject.set(x, "arrival_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeparture_time(value: Time): Self = StObject.set(x, "departure_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration_in_traffic(value: Duration): Self = StObject.set(x, "duration_in_traffic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_address(value: String): Self = StObject.set(x, "end_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_location(value: LatLng): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_address(value: String): Self = StObject.set(x, "start_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_location(value: LatLng): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: js.Array[DirectionsStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: DirectionsStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setVia_waypoints(value: js.Array[LatLng]): Self = StObject.set(x, "via_waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVia_waypointsVarargs(value: LatLng*): Self = StObject.set(x, "via_waypoints", js.Array(value :_*))
  }
}
