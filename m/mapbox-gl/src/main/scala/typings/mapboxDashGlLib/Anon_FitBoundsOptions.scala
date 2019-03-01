package typings
package mapboxDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FitBoundsOptions extends js.Object {
  var fitBoundsOptions: js.UndefOr[mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.FitBoundsOptions] = js.undefined
  var positionOptions: js.UndefOr[mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.PositionOptions] = js.undefined
  var showUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  var trackUserLocation: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FitBoundsOptions {
  @scala.inline
  def apply(
    fitBoundsOptions: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.FitBoundsOptions = null,
    positionOptions: mapboxDashGlLib.mapboxDashGlMod.mapboxglNs.PositionOptions = null,
    showUserLocation: js.UndefOr[scala.Boolean] = js.undefined,
    trackUserLocation: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (fitBoundsOptions != null) __obj.updateDynamic("fitBoundsOptions")(fitBoundsOptions)
    if (positionOptions != null) __obj.updateDynamic("positionOptions")(positionOptions)
    if (!js.isUndefined(showUserLocation)) __obj.updateDynamic("showUserLocation")(showUserLocation)
    if (!js.isUndefined(trackUserLocation)) __obj.updateDynamic("trackUserLocation")(trackUserLocation)
    __obj.asInstanceOf[Anon_FitBoundsOptions]
  }
}

