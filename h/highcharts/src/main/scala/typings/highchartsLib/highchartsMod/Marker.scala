package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Marker extends MarkerState {
  /**
    * Image markers only. Set the image width explicitly. When using this option, a width must also be set.
    * @default null
    * @since 4.0.4
    */
  var height: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var states: js.UndefOr[highchartsLib.Anon_HoverSelect] = js.undefined
  /**
    * A predefined shape or symbol for the marker. When null, the symbol is pulled from options.symbols. Other possible
    * values are 'circle', 'square', 'diamond', 'triangle' and 'triangle-down'.
    *
    * Additionally, the URL to a graphic can be given on this form: 'url(graphic.png)'. Note that for the image to be
    * applied to exported charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to Highcharts.SVGRenderer.prototype.symbols. The
    * callback is then used by its method name.
    */
  var symbol: js.UndefOr[java.lang.String | scala.Null] = js.undefined
   // null, 'circle', 'square', 'diamond', 'triangle' 'triangle-down' or 'url(graphic.png)'
  /**
    * Image markers only. Set the image width explicitly. When using this option, a height must also be set.
    * @default null.
    * @since 4.0.4
    */
  var width: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object Marker {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    fillColor: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    lineColor: java.lang.String | Gradient = null,
    lineWidth: scala.Int | scala.Double = null,
    radius: scala.Int | scala.Double = null,
    states: highchartsLib.Anon_HoverSelect = null,
    symbol: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Marker = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Marker]
  }
}

