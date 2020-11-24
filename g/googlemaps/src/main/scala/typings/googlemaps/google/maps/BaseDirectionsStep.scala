package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO find source documentation
@js.native
trait BaseDirectionsStep extends js.Object {
  
  var distance: Distance = js.native
  
  var duration: Duration = js.native
  
  var end_location: LatLng = js.native
  
  var instructions: String = js.native
  
  var path: js.Array[LatLng] = js.native
  
  var start_location: LatLng = js.native
  
  var transit: TransitDetails = js.native
  
  var travel_mode: TravelMode = js.native
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
  implicit class BaseDirectionsStepOps[Self <: BaseDirectionsStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDistance(value: Distance): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Duration): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_location(value: LatLng): Self = this.set("end_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructions(value: String): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: LatLng*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[LatLng]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_location(value: LatLng): Self = this.set("start_location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransit(value: TransitDetails): Self = this.set("transit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTravel_mode(value: TravelMode): Self = this.set("travel_mode", value.asInstanceOf[js.Any])
  }
}
