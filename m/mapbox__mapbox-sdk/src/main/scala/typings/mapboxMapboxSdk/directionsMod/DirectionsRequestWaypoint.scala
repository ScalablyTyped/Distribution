package typings.mapboxMapboxSdk.directionsMod

import typings.mapboxGl.mod.LngLatLike
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.unlimited
import typings.mapboxMapboxSdk.mapiRequestMod.DirectionsApproach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsRequestWaypoint extends js.Object {
  /**
    * Used to indicate how requested routes consider from which side of the road to approach a waypoint.
    * Accepts unrestricted (default) or  curb . If set to  unrestricted , the routes can approach waypoints from either side of the road.
    * If set to  curb , the route will be returned so that on arrival, the waypoint will be found on the side that corresponds with the
    * driving_side of the region in which the returned route is located. Note that the  approaches parameter influences how you arrive at a waypoint,
    * while  bearings influences how you start from a waypoint. If provided, the list of approaches must be the same length as the list of waypoints.
    * However, you can skip a coordinate and show its position in the list with the  ; separator.
    */
  var approach: js.UndefOr[DirectionsApproach] = js.native
  /**
    * Semicolon-separated list of  {longitude},{latitude} coordinate pairs to visit in order. There can be between 2 and 25 coordinates.
    */
  var coordinates: js.Array[Double] | LngLatLike = js.native
  /**
    * Maximum distance in meters that each coordinate is allowed to move when snapped to a nearby road segment.
    * There must be as many radiuses as there are coordinates in the request, each separated by ';'.
    * Values can be any number greater than 0 or the string 'unlimited'.
    * A  NoSegment error is returned if no routable road is found within the radius.
    */
  var radius: js.UndefOr[String | unlimited] = js.native
}

object DirectionsRequestWaypoint {
  @scala.inline
  def apply(coordinates: js.Array[Double] | LngLatLike): DirectionsRequestWaypoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsRequestWaypoint]
  }
  @scala.inline
  implicit class DirectionsRequestWaypointOps[Self <: DirectionsRequestWaypoint] (val x: Self) extends AnyVal {
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
    def setCoordinatesVarargs(value: Double*): Self = this.set("coordinates", js.Array(value :_*))
    @scala.inline
    def setCoordinates(value: js.Array[Double] | LngLatLike): Self = this.set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def setApproach(value: DirectionsApproach): Self = this.set("approach", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproach: Self = this.set("approach", js.undefined)
    @scala.inline
    def setRadius(value: String | unlimited): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
  }
  
}

