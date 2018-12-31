package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsWaypoint extends js.Object {
  /**
    * Waypoint location. Can be an address string, a LatLng, or a Place.
    * Optional.
    */
  var location: LatLng | LatLngLiteral | java.lang.String
  /**
    * If true, indicates that this waypoint is a stop between the origin and
    * destination. This has the effect of splitting the route into two legs. If
    * false, indicates that the route should be biased to go through this
    * waypoint, but not split into two legs. This is useful if you want to
    * create a route in response to the user dragging waypoints on a map. This
    * value is true by default. Optional.
    */
  var stopover: scala.Boolean
}

