package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.leaflet.leafletMod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waypoint extends js.Object {
  var latLng: LatLng
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[WaypointOptions] = js.undefined
}

object Waypoint {
  @scala.inline
  def apply(latLng: LatLng, name: String = null, options: WaypointOptions = null): Waypoint = {
    val __obj = js.Dynamic.literal(latLng = latLng)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Waypoint]
  }
}

@JSImport("leaflet", "Routing.waypoint")
@js.native
object waypoint extends js.Object {
  def apply(latLng: LatLng): Waypoint = js.native
  def apply(latLng: LatLng, name: String): Waypoint = js.native
  def apply(latLng: LatLng, name: String, options: WaypointOptions): Waypoint = js.native
}

