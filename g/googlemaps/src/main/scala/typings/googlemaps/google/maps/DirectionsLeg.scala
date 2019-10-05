package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsLeg extends js.Object {
  var arrival_time: Time
  var departure_time: Time
  var distance: Distance
  var duration: Duration
  var duration_in_traffic: Duration
  var end_address: String
  var end_location: LatLng
  var start_address: String
  var start_location: LatLng
  var steps: js.Array[DirectionsStep]
  var via_waypoints: js.Array[LatLng]
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
    val __obj = js.Dynamic.literal(arrival_time = arrival_time, departure_time = departure_time, distance = distance, duration = duration, duration_in_traffic = duration_in_traffic, end_address = end_address, end_location = end_location, start_address = start_address, start_location = start_location, steps = steps, via_waypoints = via_waypoints)
  
    __obj.asInstanceOf[DirectionsLeg]
  }
}

