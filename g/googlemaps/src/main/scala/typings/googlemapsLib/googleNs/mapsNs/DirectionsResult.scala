package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsResult extends js.Object {
  var geocoded_waypoints: js.Array[DirectionsGeocodedWaypoint]
  var routes: js.Array[DirectionsRoute]
}

object DirectionsResult {
  @scala.inline
  def apply(geocoded_waypoints: js.Array[DirectionsGeocodedWaypoint], routes: js.Array[DirectionsRoute]): DirectionsResult = {
    val __obj = js.Dynamic.literal(geocoded_waypoints = geocoded_waypoints, routes = routes)
  
    __obj.asInstanceOf[DirectionsResult]
  }
}

