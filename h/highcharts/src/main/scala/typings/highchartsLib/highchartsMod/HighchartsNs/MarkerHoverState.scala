package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerHoverState extends MarkerState {
  /**
    * The additional line width for a hovered point.
    * @default 1
    * @since 4.0.3
    */
  var lineWidthPlus: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of pixels to increase the radius of the hovered point.
    * @default 2
    * @since 4.0.3
    */
  var radiusPlus: js.UndefOr[scala.Double] = js.undefined
}

object MarkerHoverState {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    lineColor: java.lang.String | Gradient = null,
    lineWidth: scala.Int | scala.Double = null,
    lineWidthPlus: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    radiusPlus: scala.Int | scala.Double = null
  ): MarkerHoverState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lineWidthPlus != null) __obj.updateDynamic("lineWidthPlus")(lineWidthPlus.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (radiusPlus != null) __obj.updateDynamic("radiusPlus")(radiusPlus.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerHoverState]
  }
}

