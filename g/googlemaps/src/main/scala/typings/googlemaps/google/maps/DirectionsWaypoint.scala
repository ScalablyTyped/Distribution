package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DirectionsWaypoint represents a location between origin and destination
  * through which the trip should be routed.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint Maps JavaScript API}
  */
@js.native
trait DirectionsWaypoint extends js.Object {
  /**
    * Waypoint location. Can be an address string, a {@link LatLng}, or a
    * {@link Place}.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint.location Maps JavaScript API}
    */
  var location: js.UndefOr[String | LatLng | Place] = js.native
  /**
    * If `true`, indicates that this waypoint is a stop between the origin and
    * destination. This has the effect of splitting the route into two legs. If
    * `false`, indicates that the route should be biased to go through this
    * waypoint, but not split into two legs. This is useful if you want to
    * create a route in response to the user dragging waypoints on a map.
    * @default true
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/directions#DirectionsWaypoint.stopover Maps JavaScript API}
    */
  var stopover: js.UndefOr[Boolean] = js.native
}

object DirectionsWaypoint {
  @scala.inline
  def apply(): DirectionsWaypoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsWaypoint]
  }
  @scala.inline
  implicit class DirectionsWaypointOps[Self <: DirectionsWaypoint] (val x: Self) extends AnyVal {
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
    def setLocation(value: String | LatLng | Place): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setStopover(value: Boolean): Self = this.set("stopover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopover: Self = this.set("stopover", js.undefined)
  }
  
}

