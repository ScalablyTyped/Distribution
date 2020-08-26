package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesLabelOptionsObject extends js.Object {
  /**
    * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
    * the labels. Each item has a `left`, `right`, `top` and `bottom` property.
    */
  var boxesToAvoid: js.UndefOr[js.Array[LabelIntersectBoxObject]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
    * graph if necessary, and draw a connector line to the graph. Setting this
    * option to true may decrease the performance significantly, since the
    * algorithm with systematically search for open spaces in the whole plot
    * area. Visually, it may also result in a more cluttered chart, though more
    * of the series will be labeled.
    */
  var connectorAllowed: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) If the label is closer than this to a
    * neighbour graph, draw a connector.
    */
  var connectorNeighbourDistance: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Enable the series label per series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Gantt) A format string for the label, with
    * support for a subset of HTML. Variables are enclosed by curly brackets.
    * Available variables are `name`, `options.xxx`, `color` and other members
    * from the `series` object. Use this option also to set a static text for
    * the label.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Callback function to format each of the
    * series' labels. The `this` keyword refers to the series object. By
    * default the `formatter` is undefined and the `series.name` is rendered.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[Series]] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[Double | Null] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[Double | Null] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
    * series. By default it is drawn on the area. Set it to `false` to draw it
    * next to the graph instead.
    */
  var onArea: js.UndefOr[Boolean | Null] = js.native
  /**
    * (Highcharts, Highstock, Gantt) Styles for the series label. The color
    * defaults to the series color, or a contrast color if `onArea`.
    */
  var style: js.UndefOr[CSSObject] = js.native
}

object SeriesLabelOptionsObject {
  @scala.inline
  def apply(): SeriesLabelOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLabelOptionsObject]
  }
  @scala.inline
  implicit class SeriesLabelOptionsObjectOps[Self <: SeriesLabelOptionsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBoxesToAvoidVarargs(value: LabelIntersectBoxObject*): Self = this.set("boxesToAvoid", js.Array(value :_*))
    @scala.inline
    def setBoxesToAvoid(value: js.Array[LabelIntersectBoxObject]): Self = this.set("boxesToAvoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoxesToAvoid: Self = this.set("boxesToAvoid", js.undefined)
    @scala.inline
    def setConnectorAllowed(value: Boolean): Self = this.set("connectorAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorAllowed: Self = this.set("connectorAllowed", js.undefined)
    @scala.inline
    def setConnectorNeighbourDistance(value: Double): Self = this.set("connectorNeighbourDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorNeighbourDistance: Self = this.set("connectorNeighbourDistance", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFormatter(value: FormatterCallbackFunction[Series]): Self = this.set("formatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setMaxFontSize(value: Double): Self = this.set("maxFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFontSize: Self = this.set("maxFontSize", js.undefined)
    @scala.inline
    def setMaxFontSizeNull: Self = this.set("maxFontSize", null)
    @scala.inline
    def setMinFontSize(value: Double): Self = this.set("minFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinFontSize: Self = this.set("minFontSize", js.undefined)
    @scala.inline
    def setMinFontSizeNull: Self = this.set("minFontSize", null)
    @scala.inline
    def setOnArea(value: Boolean): Self = this.set("onArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnArea: Self = this.set("onArea", js.undefined)
    @scala.inline
    def setOnAreaNull: Self = this.set("onArea", null)
    @scala.inline
    def setStyle(value: CSSObject): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

