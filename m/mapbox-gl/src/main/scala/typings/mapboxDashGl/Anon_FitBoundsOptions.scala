package typings.mapboxDashGl

import typings.mapboxDashGl.mapboxDashGlMod.FitBoundsOptions
import typings.mapboxDashGl.mapboxDashGlMod.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FitBoundsOptions extends js.Object {
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  var positionOptions: js.UndefOr[PositionOptions] = js.undefined
  var showUserLocation: js.UndefOr[Boolean] = js.undefined
  var trackUserLocation: js.UndefOr[Boolean] = js.undefined
}

object Anon_FitBoundsOptions {
  @scala.inline
  def apply(
    fitBoundsOptions: FitBoundsOptions = null,
    positionOptions: PositionOptions = null,
    showUserLocation: js.UndefOr[Boolean] = js.undefined,
    trackUserLocation: js.UndefOr[Boolean] = js.undefined
  ): Anon_FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (fitBoundsOptions != null) __obj.updateDynamic("fitBoundsOptions")(fitBoundsOptions)
    if (positionOptions != null) __obj.updateDynamic("positionOptions")(positionOptions)
    if (!js.isUndefined(showUserLocation)) __obj.updateDynamic("showUserLocation")(showUserLocation)
    if (!js.isUndefined(trackUserLocation)) __obj.updateDynamic("trackUserLocation")(trackUserLocation)
    __obj.asInstanceOf[Anon_FitBoundsOptions]
  }
}

