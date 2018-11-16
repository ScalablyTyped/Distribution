package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Routing.Plan")
@js.native
class Plan protected ()
  extends leafletLib.leafletMod.Layer {
  def this(waypoints: js.Array[Waypoint | leafletLib.leafletMod.LatLng]) = this()
  def this(waypoints: js.Array[Waypoint | leafletLib.leafletMod.LatLng], options: PlanOptions) = this()
  def createGeocoders(): js.Any = js.native
  def getWaypoints(): js.Array[Waypoint] = js.native
  def isReady(): scala.Boolean = js.native
  def setWaypoints(waypoints: js.Array[Waypoint | leafletLib.leafletMod.LatLng]): js.Any = js.native
  def spliceWaypoints(index: scala.Double, waypointsToRemove: scala.Double, wayPoints: Waypoint*): js.Array[Waypoint] = js.native
}

