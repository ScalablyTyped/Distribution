package typings.leafletRoutingMachine.leafletMod.Routing_

import typings.leaflet.mod.LatLng_
import typings.leafletRoutingMachine.anon.InputWaypoints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Routing.OSRMv1")
@js.native
open class OSRMv1_ ()
  extends StObject
     with IRouter {
  def this(options: OSRMOptions) = this()
  
  def buildRouteUrl(waypoints: js.Array[Waypoint_], options: RoutingOptions): String = js.native
  
  def requiresMoreDetail(route: InputWaypoints, zoom: Any, bounds: js.Array[LatLng_]): Boolean = js.native
  
  def route(waypoints: js.Array[Waypoint_], callback: js.Function1[/* args */ js.UndefOr[Any], Unit]): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function1[/* args */ js.UndefOr[Any], Unit],
    context: js.Object
  ): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function1[/* args */ js.UndefOr[Any], Unit],
    context: js.Object,
    options: RoutingOptions
  ): Unit = js.native
  def route(
    waypoints: js.Array[Waypoint_],
    callback: js.Function1[/* args */ js.UndefOr[Any], Unit],
    context: Unit,
    options: RoutingOptions
  ): Unit = js.native
}
