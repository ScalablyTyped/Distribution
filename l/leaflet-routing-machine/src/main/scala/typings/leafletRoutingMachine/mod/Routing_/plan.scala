package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Routing.plan")
@js.native
object plan extends js.Object {
  def apply(waypoints: js.Array[LatLng_ | Waypoint_]): Plan_ = js.native
  def apply(waypoints: js.Array[LatLng_ | Waypoint_], options: PlanOptions): Plan_ = js.native
}

