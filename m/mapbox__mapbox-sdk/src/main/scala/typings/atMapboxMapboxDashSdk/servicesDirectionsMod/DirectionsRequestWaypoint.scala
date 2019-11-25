package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import typings.atMapboxMapboxDashSdk.atMapboxMapboxDashSdkStrings.unlimited
import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.DirectionsApproach
import typings.mapboxDashGl.mapboxDashGlMod.LngLatLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsRequestWaypoint extends js.Object {
  /**
    * Used to indicate how requested routes consider from which side of the road to approach a waypoint.
    * Accepts unrestricted (default) or  curb . If set to  unrestricted , the routes can approach waypoints from either side of the road.
    * If set to  curb , the route will be returned so that on arrival, the waypoint will be found on the side that corresponds with the
    * driving_side of the region in which the returned route is located. Note that the  approaches parameter influences how you arrive at a waypoint,
    * while  bearings influences how you start from a waypoint. If provided, the list of approaches must be the same length as the list of waypoints.
    * However, you can skip a coordinate and show its position in the list with the  ; separator.
    */
  var approach: js.UndefOr[DirectionsApproach] = js.undefined
  /**
    * Semicolon-separated list of  {longitude},{latitude} coordinate pairs to visit in order. There can be between 2 and 25 coordinates.
    */
  var coordinates: js.Array[Double] | LngLatLike
  /**
    * Maximum distance in meters that each coordinate is allowed to move when snapped to a nearby road segment.
    * There must be as many radiuses as there are coordinates in the request, each separated by ';'.
    * Values can be any number greater than 0 or the string 'unlimited'.
    * A  NoSegment error is returned if no routable road is found within the radius.
    */
  var radius: js.UndefOr[String | unlimited] = js.undefined
}

object DirectionsRequestWaypoint {
  @scala.inline
  def apply(
    coordinates: js.Array[Double] | LngLatLike,
    approach: DirectionsApproach = null,
    radius: String | unlimited = null
  ): DirectionsRequestWaypoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    if (approach != null) __obj.updateDynamic("approach")(approach.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequestWaypoint]
  }
}

