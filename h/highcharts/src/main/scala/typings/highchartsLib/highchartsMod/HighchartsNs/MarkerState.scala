package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerState extends js.Object {
  /**
    * Enable or disable the point marker. If null, the markers are hidden when the data is dense, and shown for more
    * widespread data points.
    * @default null, true for hover and select
    */
  var enabled: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /**
    * The fill color of the point marker. When null, the series' or point's color is used.
    */
  var fillColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * The color of the point marker's outline. When null, the series' or point's color is used.
    * @default '#FFFFFF', '#000000' for select state
    */
  var lineColor: js.UndefOr[java.lang.String | Gradient | scala.Null] = js.undefined
  /**
    * The width of the point marker's outline.
    * @default 0
    */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The radius of the point marker.
    * @default 4, undefined for hover and select
    */
  var radius: js.UndefOr[scala.Double] = js.undefined
}

object MarkerState {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    lineColor: java.lang.String | Gradient = null,
    lineWidth: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null
  ): MarkerState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerState]
  }
}

