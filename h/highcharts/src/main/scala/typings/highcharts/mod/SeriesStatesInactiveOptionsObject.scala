package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesStatesInactiveOptionsObject extends js.Object {
  /**
    * (Highstock) The animation for entering the inactive state.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highstock) Enable or disable the inactive state for a series
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) Opacity for the links between nodes in the sankey diagram in
    * inactive mode.
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highstock) Opacity of series elements (dataLabels, line, area).
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object SeriesStatesInactiveOptionsObject {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    linkOpacity: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined
  ): SeriesStatesInactiveOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linkOpacity)) __obj.updateDynamic("linkOpacity")(linkOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesStatesInactiveOptionsObject]
  }
}

