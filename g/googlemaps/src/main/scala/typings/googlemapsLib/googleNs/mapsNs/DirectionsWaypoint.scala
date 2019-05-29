package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DirectionsWaypoint represents a location between origin and destination
  * through which the trip should be routed.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint Maps JavaScript API}
  */
trait DirectionsWaypoint extends js.Object {
  /**
    * Waypoint location. Can be an address string, a {@link LatLng}, or a
    * {@link Place}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint.location Maps JavaScript API}
    */
  var location: js.UndefOr[java.lang.String | LatLng | Place] = js.undefined
  /**
    * If `true`, indicates that this waypoint is a stop between the origin and
    * destination. This has the effect of splitting the route into two legs. If
    * `false`, indicates that the route should be biased to go through this
    * waypoint, but not split into two legs. This is useful if you want to
    * create a route in response to the user dragging waypoints on a map.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint.stopover Maps JavaScript API}
    */
  var stopover: js.UndefOr[scala.Boolean] = js.undefined
}

object DirectionsWaypoint {
  @scala.inline
  def apply(
    location: java.lang.String | LatLng | Place = null,
    stopover: js.UndefOr[scala.Boolean] = js.undefined
  ): DirectionsWaypoint = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(stopover)) __obj.updateDynamic("stopover")(stopover)
    __obj.asInstanceOf[DirectionsWaypoint]
  }
}

