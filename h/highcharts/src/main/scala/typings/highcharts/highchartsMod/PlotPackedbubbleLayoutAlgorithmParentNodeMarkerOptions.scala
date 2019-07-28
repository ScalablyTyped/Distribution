package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotPackedbubbleLayoutAlgorithmParentNodeMarkerOptions extends js.Object {
  /**
    * (Highcharts) Enable or disable the point marker. If `undefined`, the
    * markers are hidden when the data is dense, and shown for more widespread
    * data points.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The threshold for how dense the point markers should be
    * before they are hidden, given that `enabled` is not defined. The number
    * indicates the horizontal distance between the two closest points in the
    * series, as multiples of the `marker.radius`. In other words, the default
    * value of 2 means points are hidden if overlapping horizontally.
    */
  var enabledThreshold: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The fill color of the point marker. When `undefined`, the
    * series' or point's color is used.
    */
  var fillColor: js.UndefOr[js.Any] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) Image markers only. Set the image width explicitly. When
    * using this option, a `width` must also be set.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The color of the point marker's outline. When `undefined`,
    * the series' or point's color is used.
    */
  var lineColor: js.UndefOr[js.Any] = js.undefined
  /**
    * (Highcharts) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) The radius of the point marker.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) A predefined shape or symbol for the marker. When undefined,
    * the symbol is pulled from options.symbols. Other possible values are
    * "circle", "square", "diamond", "triangle" and "triangle-down".
    *
    * Additionally, the URL to a graphic can be given on this form:
    * "url(graphic.png)". Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts) Image markers only. Set the image width explicitly. When
    * using this option, a `height` must also be set.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PlotPackedbubbleLayoutAlgorithmParentNodeMarkerOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    enabledThreshold: Int | Double = null,
    fillColor: js.Any = null,
    fillOpacity: Int | Double = null,
    height: Int | Double = null,
    lineColor: js.Any = null,
    lineWidth: Int | Double = null,
    radius: Int | Double = null,
    symbol: String = null,
    width: Int | Double = null
  ): PlotPackedbubbleLayoutAlgorithmParentNodeMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (enabledThreshold != null) __obj.updateDynamic("enabledThreshold")(enabledThreshold.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor)
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotPackedbubbleLayoutAlgorithmParentNodeMarkerOptions]
  }
}

