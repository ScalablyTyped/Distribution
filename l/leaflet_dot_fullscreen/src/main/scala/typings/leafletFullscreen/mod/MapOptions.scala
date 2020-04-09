package typings.leafletFullscreen.mod

import typings.leafletFullscreen.mod.Control_.FullscreenOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var fullscreenControl: js.UndefOr[Boolean] = js.undefined
  var fullscreenControlOptions: js.UndefOr[FullscreenOptions] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(
    fullscreenControl: js.UndefOr[Boolean] = js.undefined,
    fullscreenControlOptions: FullscreenOptions = null
  ): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fullscreenControl)) __obj.updateDynamic("fullscreenControl")(fullscreenControl.asInstanceOf[js.Any])
    if (fullscreenControlOptions != null) __obj.updateDynamic("fullscreenControlOptions")(fullscreenControlOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

