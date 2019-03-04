package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waypoint extends js.Object {
  var latLng: leafletLib.leafletMod.LatLng
  var name: js.UndefOr[java.lang.String] = js.undefined
  var options: js.UndefOr[WaypointOptions] = js.undefined
}

object Waypoint {
  @scala.inline
  def apply(
    latLng: leafletLib.leafletMod.LatLng,
    name: java.lang.String = null,
    options: WaypointOptions = null
  ): Waypoint = {
    val __obj = js.Dynamic.literal(latLng = latLng)
    if (name != null) __obj.updateDynamic("name")(name)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Waypoint]
  }
}

