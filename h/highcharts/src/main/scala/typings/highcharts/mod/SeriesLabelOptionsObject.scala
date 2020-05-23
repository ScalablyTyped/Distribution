package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesLabelOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
    * the labels. Each item has a `left`, `right`, `top` and `bottom` property.
    */
  var boxesToAvoid: js.UndefOr[js.Array[LabelIntersectBoxObject]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
    * graph if necessary, and draw a connector line to the graph. Setting this
    * option to true may decrease the performance significantly, since the
    * algorithm with systematically search for open spaces in the whole plot
    * area. Visually, it may also result in a more cluttered chart, though more
    * of the series will be labeled.
    */
  var connectorAllowed: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) If the label is closer than this to a
    * neighbour graph, draw a connector.
    */
  var connectorNeighbourDistance: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Enable the series label per series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) A format string for the label, with
    * support for a subset of HTML. Variables are enclosed by curly brackets.
    * Available variables are `name`, `options.xxx`, `color` and other members
    * from the `series` object. Use this option also to set a static text for
    * the label.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Callback function to format each of the
    * series' labels. The `this` keyword refers to the series object. By
    * default the `formatter` is undefined and the `series.name` is rendered.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[Series]] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[Double | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
    * series. By default it is drawn on the area. Set it to `false` to draw it
    * next to the graph instead.
    */
  var onArea: js.UndefOr[Boolean | Null] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Styles for the series label. The color
    * defaults to the series color, or a contrast color if `onArea`.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object SeriesLabelOptionsObject {
  @scala.inline
  def apply(
    boxesToAvoid: js.Array[LabelIntersectBoxObject] = null,
    connectorAllowed: js.UndefOr[Boolean] = js.undefined,
    connectorNeighbourDistance: js.UndefOr[Double] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formatter: FormatterCallbackFunction[Series] = null,
    maxFontSize: js.UndefOr[Null | Double] = js.undefined,
    minFontSize: js.UndefOr[Null | Double] = js.undefined,
    onArea: js.UndefOr[Null | Boolean] = js.undefined,
    style: CSSObject = null
  ): SeriesLabelOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (boxesToAvoid != null) __obj.updateDynamic("boxesToAvoid")(boxesToAvoid.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorAllowed)) __obj.updateDynamic("connectorAllowed")(connectorAllowed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorNeighbourDistance)) __obj.updateDynamic("connectorNeighbourDistance")(connectorNeighbourDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFontSize)) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(minFontSize)) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(onArea)) __obj.updateDynamic("onArea")(onArea.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesLabelOptionsObject]
  }
}

