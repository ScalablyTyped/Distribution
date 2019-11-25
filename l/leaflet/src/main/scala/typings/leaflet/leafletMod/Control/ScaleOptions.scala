package typings.leaflet.leafletMod.Control

import typings.leaflet.leafletMod.ControlOptions
import typings.leaflet.leafletMod.ControlPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleOptions extends ControlOptions {
  var imperial: js.UndefOr[Boolean] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var metric: js.UndefOr[Boolean] = js.undefined
  var updateWhenIdle: js.UndefOr[Boolean] = js.undefined
}

object ScaleOptions {
  @scala.inline
  def apply(
    imperial: js.UndefOr[Boolean] = js.undefined,
    maxWidth: Int | Double = null,
    metric: js.UndefOr[Boolean] = js.undefined,
    position: ControlPosition = null,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  ): ScaleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imperial)) __obj.updateDynamic("imperial")(imperial.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleOptions]
  }
}

