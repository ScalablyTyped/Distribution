package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsStep extends BaseDirectionsStep {
  /**
    * This field will only be available if travel_mode is set to TRANSIT.
    */
  var steps: js.Array[BaseDirectionsStep]
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
}

