package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotTilemapStatesHoverHaloOptions extends js.Object {
  /**
    * (Highcharts, Highstock) A collection of SVG attributes to override the
    * appearance of the halo, for example `fill`, `stroke` and `stroke-width`.
    */
  var attributes: js.UndefOr[PlotTilemapStatesHoverHaloAttributesOptions] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) Opacity for the halo unless a specific fill is
    * overridden using the `attributes` setting. Note that Highcharts is only
    * able to apply opacity to colors of hex or rgb(a) formats.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The pixel size of the halo. For point markers
    * this is the radius of the halo. For pie slices it is the width of the
    * halo outside the slice. For bubbles it defaults to 5 and is the width of
    * the halo outside the bubble.
    */
  var size: js.UndefOr[Double] = js.undefined
}

object PlotTilemapStatesHoverHaloOptions {
  @scala.inline
  def apply(
    attributes: PlotTilemapStatesHoverHaloAttributesOptions = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    opacity: Int | Double = null,
    size: Int | Double = null
  ): PlotTilemapStatesHoverHaloOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotTilemapStatesHoverHaloOptions]
  }
}

