package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotMapbubbleMarkerOptions extends js.Object {
  /**
    * (Highmaps) The fill color of the point marker. When `undefined`, the
    * series' or point's color is used.
    */
  var fillColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * (Highmaps) The fill opacity of the bubble markers.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The color of the point marker's outline. When `undefined`, the
    * series' or point's color is used.
    */
  var lineColor: js.UndefOr[js.Any] = js.undefined
  /**
    * (Highmaps) The width of the point marker's outline.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) States for a single point marker.
    */
  var states: js.UndefOr[PlotMapbubbleMarkerStatesOptions] = js.undefined
  /**
    * (Highmaps) A predefined shape or symbol for the marker. Possible values
    * are "circle", "square", "diamond", "triangle" and "triangle-down".
    *
    * Additionally, the URL to a graphic can be given on the form
    * `url(graphic.png)`. Note that for the image to be applied to exported
    * charts, its URL needs to be accessible by the export server.
    *
    * Custom callbacks for symbol path generation can also be added to
    * `Highcharts.SVGRenderer.prototype.symbols`. The callback is then used by
    * its method name, as shown in the demo.
    */
  var symbol: js.UndefOr[String | SymbolKeyValue] = js.undefined
}

object PlotMapbubbleMarkerOptions {
  @scala.inline
  def apply(
    fillColor: ColorString | GradientColorObject | PatternObject = null,
    fillOpacity: Int | Double = null,
    lineColor: js.Any = null,
    lineWidth: Int | Double = null,
    states: PlotMapbubbleMarkerStatesOptions = null,
    symbol: String | SymbolKeyValue = null
  ): PlotMapbubbleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (lineColor != null) __obj.updateDynamic("lineColor")(lineColor.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotMapbubbleMarkerOptions]
  }
}

