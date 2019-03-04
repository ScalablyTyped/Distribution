package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Event Objects
trait RoutingEvent extends js.Object {
  var waypoints: js.Array[Waypoint]
}

object RoutingEvent {
  @scala.inline
  def apply(waypoints: js.Array[Waypoint]): RoutingEvent = {
    val __obj = js.Dynamic.literal(waypoints = waypoints)
  
    __obj.asInstanceOf[RoutingEvent]
  }
}

