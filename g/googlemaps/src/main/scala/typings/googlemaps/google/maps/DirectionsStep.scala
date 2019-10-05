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
    val __obj = js.Dynamic.literal(distance = distance, duration = duration, end_location = end_location, instructions = instructions, path = path, start_location = start_location, steps = steps, transit = transit, travel_mode = travel_mode)
  
    __obj.asInstanceOf[DirectionsStep]
  }
}

