package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class DirectionsStepOps[Self <: DirectionsStep] (val x: Self) extends AnyVal {
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
    def setStepsVarargs(value: BaseDirectionsStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[BaseDirectionsStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
  
}

