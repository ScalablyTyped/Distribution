package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeriesTooltipOptionsObject extends js.Object {
  /**
    * (Highstock) How many decimals to show for the `point.change` value when
    * the `series.compare` option is set. This is overridable in each series'
    * tooltip options object. The default is to preserve all decimals.
    */
  var changeDecimals: js.UndefOr[Double] = js.native
  /**
    * (Highstock) The HTML of the cluster point's in the tooltip. Works only
    * with marker-clusters module and analogously to pointFormat.
    *
    * The cluster tooltip can be also formatted using `tooltip.formatter`
    * callback function and `point.isCluster` flag.
    */
  var clusterFormat: js.UndefOr[js.Object] = js.native
  /**
    * (Highcharts, Highstock, Gantt) For series on a datetime axes, the date
    * format in the tooltip's header will by default be guessed based on the
    * closest data points. This member gives the default string representations
    * used for each unit. For an overview of the replacement codes, see
    * dateFormat.
    */
  var dateTimeLabelFormats: js.UndefOr[Dictionary[String]] = js.native
  /**
    * (Highstock) Distance from point to tooltip in pixels.
    */
  var distance: js.UndefOr[Double] = js.native
  /**
    * (Highstock) Whether the tooltip should follow the mouse as it moves
    * across columns, pie slices and other point types with an extent. By
    * default it behaves this way for pie, polygon, map, sankey and wordcloud
    * series by override in the `plotOptions` for those series types.
    *
    * For touch moves to behave the same way, followTouchMove must be `true`
    * also.
    */
  var followPointer: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Whether the tooltip should update as the finger moves on a
    * touch device. If this is `true` and chart.panning is
    * set,`followTouchMove` will take over one-finger touches, so the user
    * needs to use two fingers for zooming and panning.
    *
    * Note the difference to followPointer that only defines the _position_ of
    * the tooltip. If `followPointer` is false in for example a column series,
    * the tooltip will show above or below the column, but as `followTouchMove`
    * is true, the tooltip will jump from column to column as the user swipes
    * across the plot area.
    */
  var followTouchMove: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) A string to append to the tooltip format.
    */
  var footerFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock) The HTML of the tooltip header line. Variables are enclosed
    * by curly brackets. Available variables are `point.key`, `series.name`,
    * `series.color` and other members from the `point` and `series` objects.
    * The `point.key` variable contains the category name, x value or datetime
    * string depending on the type of axis. For datetime axes, the `point.key`
    * date format can be set using `tooltip.xDateFormat`.
    */
  var headerFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts) The format string specifying what to show for _nodes_ in
    * tooltip of a diagram series, as opposed to links.
    */
  var nodeFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts) A callback for defining the format for _nodes_ in the
    * chart's tooltip, as opposed to links.
    */
  var nodeFormatter: js.UndefOr[FormatterCallbackFunction[SankeyNodeObject]] = js.native
  /**
    * (Highstock) The HTML of the null point's line in the tooltip. Works
    * analogously to pointFormat.
    */
  var nullFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock) Callback function to format the text of the tooltip for
    * visible null points. Works analogously to formatter.
    */
  var nullFormatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.native
  /**
    * (Highstock) The HTML of the point's line in the tooltip. Variables are
    * enclosed by curly brackets. Available variables are point.x, point.y,
    * series. name and series.color and other properties on the same form.
    * Furthermore, `point.y` can be extended by the `tooltip.valuePrefix` and
    * `tooltip.valueSuffix` variables. This can also be overridden for each
    * series, which makes it a good hook for displaying units.
    *
    * In styled mode, the dot is colored by a class name rather than the point
    * color.
    */
  var pointFormat: js.UndefOr[String] = js.native
  /**
    * (Highstock) A callback function for formatting the HTML output for a
    * single point in the tooltip. Like the `pointFormat` string, but with more
    * flexibility.
    */
  var pointFormatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.native
  /**
    * (Highstock) Prevents the tooltip from switching or closing, when touched
    * or pointed.
    */
  var stickOnContact: js.UndefOr[Boolean] = js.native
  /**
    * (Highstock) Number of decimals in indicator series.
    */
  var valueDecimals: js.UndefOr[Double] = js.native
  /**
    * (Highstock) A string to prepend to each series' y value. Overridable in
    * each series' tooltip options object.
    */
  var valuePrefix: js.UndefOr[String] = js.native
  /**
    * (Highstock) A string to append to each series' y value. Overridable in
    * each series' tooltip options object.
    */
  var valueSuffix: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
    * header if the X axis is a datetime axis. The default is a best guess
    * based on the smallest distance between points in the chart.
    */
  var xDateFormat: js.UndefOr[String] = js.native
}

object SeriesTooltipOptionsObject {
  @scala.inline
  def apply(): SeriesTooltipOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTooltipOptionsObject]
  }
  @scala.inline
  implicit class SeriesTooltipOptionsObjectOps[Self <: SeriesTooltipOptionsObject] (val x: Self) extends AnyVal {
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
    def setChangeDecimals(value: Double): Self = this.set("changeDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeDecimals: Self = this.set("changeDecimals", js.undefined)
    @scala.inline
    def setClusterFormat(value: js.Object): Self = this.set("clusterFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterFormat: Self = this.set("clusterFormat", js.undefined)
    @scala.inline
    def setDateTimeLabelFormats(value: Dictionary[String]): Self = this.set("dateTimeLabelFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateTimeLabelFormats: Self = this.set("dateTimeLabelFormats", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setFollowPointer(value: Boolean): Self = this.set("followPointer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowPointer: Self = this.set("followPointer", js.undefined)
    @scala.inline
    def setFollowTouchMove(value: Boolean): Self = this.set("followTouchMove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollowTouchMove: Self = this.set("followTouchMove", js.undefined)
    @scala.inline
    def setFooterFormat(value: String): Self = this.set("footerFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooterFormat: Self = this.set("footerFormat", js.undefined)
    @scala.inline
    def setHeaderFormat(value: String): Self = this.set("headerFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderFormat: Self = this.set("headerFormat", js.undefined)
    @scala.inline
    def setNodeFormat(value: String): Self = this.set("nodeFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeFormat: Self = this.set("nodeFormat", js.undefined)
    @scala.inline
    def setNodeFormatter(value: FormatterCallbackFunction[SankeyNodeObject]): Self = this.set("nodeFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeFormatter: Self = this.set("nodeFormatter", js.undefined)
    @scala.inline
    def setNullFormat(value: String): Self = this.set("nullFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullFormat: Self = this.set("nullFormat", js.undefined)
    @scala.inline
    def setNullFormatter(value: TooltipFormatterCallbackFunction): Self = this.set("nullFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullFormatter: Self = this.set("nullFormatter", js.undefined)
    @scala.inline
    def setPointFormat(value: String): Self = this.set("pointFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointFormat: Self = this.set("pointFormat", js.undefined)
    @scala.inline
    def setPointFormatter(value: FormatterCallbackFunction[Point]): Self = this.set("pointFormatter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePointFormatter: Self = this.set("pointFormatter", js.undefined)
    @scala.inline
    def setStickOnContact(value: Boolean): Self = this.set("stickOnContact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickOnContact: Self = this.set("stickOnContact", js.undefined)
    @scala.inline
    def setValueDecimals(value: Double): Self = this.set("valueDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDecimals: Self = this.set("valueDecimals", js.undefined)
    @scala.inline
    def setValuePrefix(value: String): Self = this.set("valuePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePrefix: Self = this.set("valuePrefix", js.undefined)
    @scala.inline
    def setValueSuffix(value: String): Self = this.set("valueSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSuffix: Self = this.set("valueSuffix", js.undefined)
    @scala.inline
    def setXDateFormat(value: String): Self = this.set("xDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXDateFormat: Self = this.set("xDateFormat", js.undefined)
  }
  
}

