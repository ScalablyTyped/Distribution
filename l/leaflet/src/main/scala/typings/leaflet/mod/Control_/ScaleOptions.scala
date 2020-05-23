package typings.leaflet.mod.Control_

import typings.leaflet.mod.ControlOptions
import typings.leaflet.mod.ControlPosition
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
    maxWidth: js.UndefOr[Double] = js.undefined,
    metric: js.UndefOr[Boolean] = js.undefined,
    position: ControlPosition = null,
    updateWhenIdle: js.UndefOr[Boolean] = js.undefined
  ): ScaleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imperial)) __obj.updateDynamic("imperial")(imperial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(updateWhenIdle)) __obj.updateDynamic("updateWhenIdle")(updateWhenIdle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleOptions]
  }
}

