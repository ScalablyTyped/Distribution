package typings.mapboxGl

import typings.mapboxGl.mod.FitBoundsOptions
import typings.mapboxGl.mod.PositionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFitBoundsOptions extends js.Object {
  var fitBoundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
  var positionOptions: js.UndefOr[PositionOptions] = js.undefined
  var showAccuracyCircle: js.UndefOr[Boolean] = js.undefined
  var showUserLocation: js.UndefOr[Boolean] = js.undefined
  var trackUserLocation: js.UndefOr[Boolean] = js.undefined
}

object AnonFitBoundsOptions {
  @scala.inline
  def apply(
    fitBoundsOptions: FitBoundsOptions = null,
    positionOptions: PositionOptions = null,
    showAccuracyCircle: js.UndefOr[Boolean] = js.undefined,
    showUserLocation: js.UndefOr[Boolean] = js.undefined,
    trackUserLocation: js.UndefOr[Boolean] = js.undefined
  ): AnonFitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (fitBoundsOptions != null) __obj.updateDynamic("fitBoundsOptions")(fitBoundsOptions.asInstanceOf[js.Any])
    if (positionOptions != null) __obj.updateDynamic("positionOptions")(positionOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showAccuracyCircle)) __obj.updateDynamic("showAccuracyCircle")(showAccuracyCircle.asInstanceOf[js.Any])
    if (!js.isUndefined(showUserLocation)) __obj.updateDynamic("showUserLocation")(showUserLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(trackUserLocation)) __obj.updateDynamic("trackUserLocation")(trackUserLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFitBoundsOptions]
  }
}

