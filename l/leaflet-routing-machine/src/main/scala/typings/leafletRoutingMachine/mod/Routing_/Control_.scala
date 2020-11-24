package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.Control")
@js.native
class Control_ () extends Itinerary_ {
  def this(options: RoutingControlOptions) = this()
  
  def getPlan(): Plan_ = js.native
  
  def getRouter(): IRouter = js.native
  
  def getWaypoints(): js.Array[Waypoint_] = js.native
  
  def on(`type`: String, fn: js.Function1[/* event */ js.Any, Unit]): this.type = js.native
  def on(`type`: String, fn: js.Function1[/* event */ js.Any, Unit], context: js.Any): this.type = js.native
  
  def route(): Unit = js.native
  
  def setWaypoints(waypoints: js.Array[LatLng_ | Waypoint_]): this.type = js.native
  
  def spliceWaypoints(index: Double, waypointsToRemove: Double, wayPoints: Waypoint_ *): js.Array[Waypoint_] = js.native
}
