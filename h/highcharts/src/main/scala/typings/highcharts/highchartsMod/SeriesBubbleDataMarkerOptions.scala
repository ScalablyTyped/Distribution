package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesBubbleDataMarkerOptions extends js.Object {
  /**
    * (Highcharts) Enable or disable the point marker. If `undefined`, the
    * markers are hidden when the data is dense, and shown for more widespread
    * data points.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts) The fill color of the point marker. When `undefined`, the
    * series' or point's color is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The color of the point marker's outline. When `undefined`,
    * the series' or point's color is used.
    */
  var lineColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highcharts) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts) States for a single point marker.
    */
  var states: js.UndefOr[SeriesBubbleDataMarkerStatesOptions] = js.undefined
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
}

object SeriesBubbleDataMarkerOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    lineColor: ColorString | GradientColorObject | PatternObject = null,
    lineWidth: Int | Double = null,
    states: SeriesBubbleDataMarkerStatesOptions = null,
    symbol: String = null
  ): SeriesBubbleDataMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesBubbleDataMarkerOptions]
  }
}

