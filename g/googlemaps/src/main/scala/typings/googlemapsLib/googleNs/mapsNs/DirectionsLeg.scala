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

