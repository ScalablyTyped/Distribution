package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.leaflet.leafletMod.LatLng
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
trait IRoute extends js.Object {
  var coordinates: js.UndefOr[js.Array[LatLng]] = js.undefined
  var instructions: js.UndefOr[js.Array[IInstruction]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var summary: js.UndefOr[IRouteSummary] = js.undefined
  var waypoints: js.UndefOr[js.Array[LatLng]] = js.undefined
}

object IRoute {
  @scala.inline
  def apply(
    coordinates: js.Array[LatLng] = null,
    instructions: js.Array[IInstruction] = null,
    name: String = null,
    summary: IRouteSummary = null,
    waypoints: js.Array[LatLng] = null
  ): IRoute = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (instructions != null) __obj.updateDynamic("instructions")(instructions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (waypoints != null) __obj.updateDynamic("waypoints")(waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoute]
  }
}

