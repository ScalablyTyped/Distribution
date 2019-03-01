package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointOptions extends js.Object {
  var allowUTurn: js.UndefOr[scala.Boolean] = js.undefined
}

object WaypointOptions {
  @scala.inline
  def apply(allowUTurn: js.UndefOr[scala.Boolean] = js.undefined): WaypointOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUTurn)) __obj.updateDynamic("allowUTurn")(allowUTurn)
    __obj.asInstanceOf[WaypointOptions]
  }
}

