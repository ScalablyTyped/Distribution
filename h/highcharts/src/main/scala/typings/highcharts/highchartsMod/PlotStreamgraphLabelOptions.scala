package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotStreamgraphLabelOptions extends js.Object {
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

object PlotStreamgraphLabelOptions {
  @scala.inline
  def apply(
    boxesToAvoid: js.Array[LabelIntersectBoxObject] = null,
    connectorAllowed: js.UndefOr[Boolean] = js.undefined,
    connectorNeighbourDistance: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxFontSize: Int | Double = null,
    minFontSize: Int | Double = null,
    onArea: js.UndefOr[Boolean] = js.undefined,
    style: CSSObject = null
  ): PlotStreamgraphLabelOptions = {
    val __obj = js.Dynamic.literal()
    if (boxesToAvoid != null) __obj.updateDynamic("boxesToAvoid")(boxesToAvoid.asInstanceOf[js.Any])
    if (!js.isUndefined(connectorAllowed)) __obj.updateDynamic("connectorAllowed")(connectorAllowed.asInstanceOf[js.Any])
    if (connectorNeighbourDistance != null) __obj.updateDynamic("connectorNeighbourDistance")(connectorNeighbourDistance.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (maxFontSize != null) __obj.updateDynamic("maxFontSize")(maxFontSize.asInstanceOf[js.Any])
    if (minFontSize != null) __obj.updateDynamic("minFontSize")(minFontSize.asInstanceOf[js.Any])
    if (!js.isUndefined(onArea)) __obj.updateDynamic("onArea")(onArea.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotStreamgraphLabelOptions]
  }
}

