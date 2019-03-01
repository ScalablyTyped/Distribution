package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsLeg extends js.Object {
  var arrival_time: Time
  var departure_time: Time
  var distance: Distance
  var duration: Duration
  var duration_in_traffic: Duration
  var end_address: java.lang.String
  var end_location: LatLng
  var start_address: java.lang.String
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
    end_address: java.lang.String,
    end_location: LatLng,
    start_address: java.lang.String,
    start_location: LatLng,
    steps: js.Array[DirectionsStep],
    via_waypoints: js.Array[LatLng]
  ): DirectionsLeg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrival_time")(arrival_time)
    __obj.updateDynamic("departure_time")(departure_time)
    __obj.updateDynamic("distance")(distance)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("duration_in_traffic")(duration_in_traffic)
    __obj.updateDynamic("end_address")(end_address)
    __obj.updateDynamic("end_location")(end_location)
    __obj.updateDynamic("start_address")(start_address)
    __obj.updateDynamic("start_location")(start_location)
    __obj.updateDynamic("steps")(steps)
    __obj.updateDynamic("via_waypoints")(via_waypoints)
    __obj.asInstanceOf[DirectionsLeg]
  }
}

