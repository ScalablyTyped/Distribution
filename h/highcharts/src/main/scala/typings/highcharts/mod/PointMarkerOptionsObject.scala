package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointMarkerOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps) Animation for the marker as it moves
    * between values. Set to `false` to disable animation. Defaults to `{
    * duration: 50 }`.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps) The color of the marker.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) Enable or disable the point marker. If
    * `undefined`, the markers are hidden when the data is dense, and shown for
    * more widespread data points.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock) The threshold for how dense the point markers
    * should be before they are hidden, given that `enabled` is not defined.
    * The number indicates the horizontal distance between the two closest
    * points in the series, as multiples of the `marker.radius`. In other
    * words, the default value of 2 means points are hidden if overlapping
    * horizontally.
    */
  var enabledThreshold: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The fill color of the point marker. When
    * `undefined`, the series' or point's color is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The fill opacity of the bubble markers.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) Image markers only. Set the image width
    * explicitly. When using this option, a `width` must also be set.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The color of the point marker's outline. When
    * `undefined`, the series' or point's color is used.
    */
  var lineColor: js.UndefOr[String | ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts, Highstock) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) The radius of the point marker.
    */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock) States for a single point marker.
    */
  var states: js.UndefOr[PointStatesOptionsObject] = js.undefined
  /**
    * (Highcharts, Highstock) A predefined shape or symbol for the marker. When
    * undefined, the symbol is pulled from options.symbols. Other possible
    * values are `'circle'`, `'square'`,`'diamond'`, `'triangle'` and
    * `'triangle-down'`.
    *
    * Additionally, the URL to a graphic can be given on this form:
    * `'url(graphic.png)'`. Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbol: js.UndefOr[String | SymbolKeyValue] = js.undefined
  /**
    * (Highcharts, Highstock) Image markers only. Set the image width
    * explicitly. When using this option, a `height` must also be set.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object PointMarkerOptionsObject {
  @scala.inline
  def apply(
    animation: Boolean | AnimationOptionsObject = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    enabledThreshold: js.UndefOr[Double] = js.undefined,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    lineColor: String | ColorString | GradientColorObject | PatternObject = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    radius: js.UndefOr[Double] = js.undefined,
    states: PointStatesOptionsObject = null,
    symbol: String | SymbolKeyValue = null,
    width: js.UndefOr[Double] = js.undefined
  ): PointMarkerOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabledThreshold)) __obj.updateDynamic("enabledThreshold")(enabledThreshold.get.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointMarkerOptionsObject]
  }
}

