package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
trait BaseDirectionsStep extends StObject {
  
  var distance: Distance
  
  var duration: Duration
  
  var end_location: LatLng
  
  var instructions: String
  
  var path: js.Array[LatLng]
  
  var start_location: LatLng
  
  var transit: TransitDetails
  
  var travel_mode: TravelMode
}
object BaseDirectionsStep {
  
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    end_location: LatLng,
    instructions: String,
    path: js.Array[LatLng],
    start_location: LatLng,
    transit: TransitDetails,
    travel_mode: TravelMode
  ): BaseDirectionsStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], travel_mode = travel_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseDirectionsStep]
  }
  
  @scala.inline
  implicit class BaseDirectionsStepMutableBuilder[Self <: BaseDirectionsStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistance(value: Distance): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_location(value: LatLng): Self = StObject.set(x, "end_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructions(value: String): Self = StObject.set(x, "instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: js.Array[LatLng]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: LatLng*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setStart_location(value: LatLng): Self = StObject.set(x, "start_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransit(value: TransitDetails): Self = StObject.set(x, "transit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravel_mode(value: TravelMode): Self = StObject.set(x, "travel_mode", value.asInstanceOf[js.Any])
  }
}
