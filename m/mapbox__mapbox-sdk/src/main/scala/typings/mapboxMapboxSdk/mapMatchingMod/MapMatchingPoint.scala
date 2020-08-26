package typings.mapboxMapboxSdk.mapMatchingMod

import typings.mapboxGl.mod.LngLatLike
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapMatchingPoint extends Point {
  /**
    * Whether this coordinate is waypoint or not. The first and last coordinates will always be waypoints.
    */
  var isWaypoint: js.UndefOr[Boolean] = js.native
  /**
    * A number in meters indicating the assumed precision of the used tracking device.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * Datetime corresponding to the coordinate.
    */
  var timestamp: js.UndefOr[String | Double | Date] = js.native
  /**
    * Custom name for the waypoint used for the arrival instruction in banners and voice instructions.
    * Will be ignored unless isWaypoint is true.
    */
  var waypointName: js.UndefOr[Boolean] = js.native
}

object MapMatchingPoint {
  @scala.inline
  def apply(coordinates: LngLatLike): MapMatchingPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMatchingPoint]
  }
  @scala.inline
  implicit class MapMatchingPointOps[Self <: MapMatchingPoint] (val x: Self) extends AnyVal {
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
    def setIsWaypoint(value: Boolean): Self = this.set("isWaypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsWaypoint: Self = this.set("isWaypoint", js.undefined)
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRadius: Self = this.set("radius", js.undefined)
    @scala.inline
    def setTimestamp(value: String | Double | Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    @scala.inline
    def setWaypointName(value: Boolean): Self = this.set("waypointName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaypointName: Self = this.set("waypointName", js.undefined)
  }
  
}

