package typings.leafletRoutingMachine.leafletMod.Routing_

import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Layer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.Plan")
@js.native
open class Plan_ protected () extends Layer {
  def this(waypoints: js.Array[LatLng_ | Waypoint_]) = this()
  def this(waypoints: js.Array[LatLng_ | Waypoint_], options: PlanOptions) = this()
  
  def createGeocoders(): Any = js.native
  
  def getWaypoints(): js.Array[Waypoint_] = js.native
  
  def isReady(): Boolean = js.native
  
  def setWaypoints(waypoints: js.Array[LatLng_ | Waypoint_]): Any = js.native
  
  def spliceWaypoints(index: Double, waypointsToRemove: Double, wayPoints: Waypoint_ *): js.Array[Waypoint_] = js.native
}
