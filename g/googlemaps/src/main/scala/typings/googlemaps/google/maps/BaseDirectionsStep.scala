package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDirectionsStep extends js.Object {
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
}

