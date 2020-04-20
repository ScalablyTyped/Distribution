package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Waypoint_ extends js.Object {
  var latLng: LatLng_
  var name: js.UndefOr[String] = js.undefined
  var options: js.UndefOr[WaypointOptions] = js.undefined
}

object Waypoint_ {
  @scala.inline
  def apply(latLng: LatLng_, name: String = null, options: WaypointOptions = null): Waypoint_ = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint_]
  }
}

