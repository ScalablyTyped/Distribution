package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsStep extends BaseDirectionsStep {
  
  /**
    * This field will only be available if travel_mode is set to TRANSIT.
    */
  var steps: js.Array[BaseDirectionsStep] = js.native
}
object DirectionsStep {
  
  @scala.inline
  def apply(
    distance: Distance,
    duration: Duration,
    end_location: LatLng,
    instructions: String,
    path: js.Array[LatLng],
    start_location: LatLng,
    steps: js.Array[BaseDirectionsStep],
    transit: TransitDetails,
    travel_mode: TravelMode
  ): DirectionsStep = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], end_location = end_location.asInstanceOf[js.Any], instructions = instructions.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_location = start_location.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], transit = transit.asInstanceOf[js.Any], travel_mode = travel_mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsStep]
  }
  
  @scala.inline
  implicit class DirectionsStepMutableBuilder[Self <: DirectionsStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSteps(value: js.Array[BaseDirectionsStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: BaseDirectionsStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
