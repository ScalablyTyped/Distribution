package typings.leafletDashRoutingDashMachine.leafletMod.Routing

import typings.leaflet.leafletMod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  var addWaypoints: js.UndefOr[Boolean] = js.undefined
  var missingRouteStyles: js.UndefOr[js.Array[PathOptions]] = js.undefined
  var styles: js.UndefOr[js.Array[PathOptions]] = js.undefined
}

object LineOptions {
  @scala.inline
  def apply(
    addWaypoints: js.UndefOr[Boolean] = js.undefined,
    missingRouteStyles: js.Array[PathOptions] = null,
    styles: js.Array[PathOptions] = null
  ): LineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addWaypoints)) __obj.updateDynamic("addWaypoints")(addWaypoints.asInstanceOf[js.Any])
    if (missingRouteStyles != null) __obj.updateDynamic("missingRouteStyles")(missingRouteStyles.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
}

