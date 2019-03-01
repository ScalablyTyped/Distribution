package typings
package leafletDashRoutingDashMachineLib.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  var addWaypoints: js.UndefOr[scala.Boolean] = js.undefined
  var missingRouteStyles: js.UndefOr[js.Array[leafletLib.leafletMod.PathOptions]] = js.undefined
  var styles: js.UndefOr[js.Array[leafletLib.leafletMod.PathOptions]] = js.undefined
}

object LineOptions {
  @scala.inline
  def apply(
    addWaypoints: js.UndefOr[scala.Boolean] = js.undefined,
    missingRouteStyles: js.Array[leafletLib.leafletMod.PathOptions] = null,
    styles: js.Array[leafletLib.leafletMod.PathOptions] = null
  ): LineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addWaypoints)) __obj.updateDynamic("addWaypoints")(addWaypoints)
    if (missingRouteStyles != null) __obj.updateDynamic("missingRouteStyles")(missingRouteStyles)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[LineOptions]
  }
}

