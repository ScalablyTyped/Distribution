package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsResponse extends js.Object {
  /**
    * String indicating the state of the response. This is a separate code than the HTTP status code.
    * On normal valid responses, the value will be Ok.
    */
  var code: String = js.native
  /**
    * Array of Route objects ordered by descending recommendation rank. May contain at most two routes.
    */
  var routes: js.Array[Route] = js.native
  var uuid: String = js.native
  /**
    * Array of Waypoint objects. Each waypoints is an input coordinate snapped to the road and path network.
    * The waypoints appear in the array in the order of the input coordinates.
    */
  var waypoints: js.Array[Waypoint] = js.native
}

object DirectionsResponse {
  @scala.inline
  def apply(code: String, routes: js.Array[Route], uuid: String, waypoints: js.Array[Waypoint]): DirectionsResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsResponse]
  }
  @scala.inline
  implicit class DirectionsResponseOps[Self <: DirectionsResponse] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: Route*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[Route]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaypointsVarargs(value: Waypoint*): Self = this.set("waypoints", js.Array(value :_*))
    @scala.inline
    def setWaypoints(value: js.Array[Waypoint]): Self = this.set("waypoints", value.asInstanceOf[js.Any])
  }
  
}

