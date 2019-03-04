package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointsSplicedEvent extends js.Object {
  var added: js.Array[Waypoint]
  var index: scala.Double
  var nRemoved: scala.Double
}

object WaypointsSplicedEvent {
  @scala.inline
  def apply(added: js.Array[Waypoint], index: scala.Double, nRemoved: scala.Double): WaypointsSplicedEvent = {
    val __obj = js.Dynamic.literal(added = added, index = index, nRemoved = nRemoved)
  
    __obj.asInstanceOf[WaypointsSplicedEvent]
  }
}

