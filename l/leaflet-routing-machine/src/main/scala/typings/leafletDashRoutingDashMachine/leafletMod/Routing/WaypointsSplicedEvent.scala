package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointsSplicedEvent extends js.Object {
  var added: js.Array[Waypoint]
  var index: Double
  var nRemoved: Double
}

object WaypointsSplicedEvent {
  @scala.inline
  def apply(added: js.Array[Waypoint], index: Double, nRemoved: Double): WaypointsSplicedEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nRemoved = nRemoved.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WaypointsSplicedEvent]
  }
}

