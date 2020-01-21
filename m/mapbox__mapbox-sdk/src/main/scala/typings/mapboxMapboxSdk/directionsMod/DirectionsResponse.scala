package typings.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsResponse extends js.Object {
  /**
    * String indicating the state of the response. This is a separate code than the HTTP status code.
    * On normal valid responses, the value will be Ok.
    */
  var code: String
  /**
    * Array of Route objects ordered by descending recommendation rank. May contain at most two routes.
    */
  var routes: js.Array[Route]
  var uuid: String
  /**
    * Array of Waypoint objects. Each waypoints is an input coordinate snapped to the road and path network.
    * The waypoints appear in the array in the order of the input coordinates.
    */
  var waypoints: js.Array[Waypoint]
}

object DirectionsResponse {
  @scala.inline
  def apply(code: String, routes: js.Array[Route], uuid: String, waypoints: js.Array[Waypoint]): DirectionsResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DirectionsResponse]
  }
}

