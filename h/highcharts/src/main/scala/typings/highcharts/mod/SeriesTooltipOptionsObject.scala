package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesTooltipOptionsObject extends StObject {
  
  /**
    * (Highstock) How many decimals to show for the `point.change` or the
    * `point.cumulativeSum` value when the `series.compare` or the
    * `series.cumulative` option is set. This is overridable in each series'
    * tooltip options object.
    */
  var changeDecimals: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) The HTML of the cluster point's in the tooltip. Works only
    * with marker-clusters module and analogously to pointFormat.
    *
    * The cluster tooltip can be also formatted using `tooltip.formatter`
    * callback function and `point.isCluster` flag.
    */
  var clusterFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) For series on datetime axes, the date
    * format in the tooltip's header will by default be guessed based on the
    * closest data points. This member gives the default string representations
    * used for each unit. For an overview of the replacement codes, see
    * dateFormat.
    */
  var dateTimeLabelFormats: js.UndefOr[Dictionary[String]] = js.undefined
  
  /**
    * (Highstock) Distance from point to tooltip in pixels.
    */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) Whether the tooltip should follow the mouse as it moves
    * across columns, pie slices and other point types with an extent. By
    * default it behaves this way for pie, polygon, map, sankey and wordcloud
    * series by override in the `plotOptions` for those series types.
    *
    * Does not apply if split is `true`.
    *
    * For touch moves to behave the same way, followTouchMove must be `true`
    * also.
    */
  var followPointer: js.UndefOr[Boolean] = js.undefined
  
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
  var followTouchMove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highstock) A string to append to the tooltip format.
    */
  var footerFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) The HTML of the tooltip header line. Variables are enclosed
    * by curly brackets. Available variables are `point.key`, `series.name`,
    * `series.color` and other members from the `point` and `series` objects.
    * The `point.key` variable contains the category name, x value or datetime
    * string depending on the type of axis. For datetime axes, the `point.key`
    * date format can be set using `tooltip.xDateFormat`.
    */
  var headerFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The HTML of the point's line in the tooltip. Variables are
    * enclosed by curly brackets. Available variables are `point.id`,
    * `point.fromNode.id`, `point.toNode.id`, `series.name`, `series.color` and
    * other properties on the same form. Furthermore, This can also be
    * overridden for each series, which makes it a good hook for displaying
    * units. In styled mode, the dot is colored by a class name rather than the
    * point color.
    */
  var linkFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) The format string specifying what to show for _nodes_ in
    * tooltip of a diagram series, as opposed to links.
    */
  var nodeFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) A callback for defining the format for _nodes_ in the
    * chart's tooltip, as opposed to links.
    */
  var nodeFormatter: js.UndefOr[FormatterCallbackFunction[SankeyNodeObject]] = js.undefined
  
  /**
    * (Highstock) The HTML of the null point's line in the tooltip. Works
    * analogously to pointFormat.
    */
  var nullFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) Callback function to format the text of the tooltip for
    * visible null points. Works analogously to formatter.
    */
  var nullFormatter: js.UndefOr[TooltipFormatterCallbackFunction] = js.undefined
  
  /**
    * (Highstock) The HTML of the point's line in the tooltip. Variables are
    * enclosed by curly brackets. Available variables are `point.x`, `point.y`,
    * `series.name` and `series.color` and other properties on the same form.
    * Furthermore, `point.y` can be extended by the `tooltip.valuePrefix` and
    * `tooltip.valueSuffix` variables. This can also be overridden for each
    * series, which makes it a good hook for displaying units.
    *
    * In styled mode, the dot is colored by a class name rather than the point
    * color.
    */
  var pointFormat: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) A callback function for formatting the HTML output for a
    * single point in the tooltip. Like the `pointFormat` string, but with more
    * flexibility.
    */
  var pointFormatter: js.UndefOr[FormatterCallbackFunction[Point]] = js.undefined
  
  /**
    * (Highstock) Number of decimals in indicator series.
    */
  var valueDecimals: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highstock) A string to prepend to each series' y value. Overridable in
    * each series' tooltip options object.
    */
  var valuePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * (Highstock) A string to append to each series' y value. Overridable in
    * each series' tooltip options object.
    */
  var valueSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) The format for the date in the tooltip
    * header if the X axis is a datetime axis. The default is a best guess
    * based on the smallest distance between points in the chart.
    */
  var xDateFormat: js.UndefOr[String] = js.undefined
}
object SeriesTooltipOptionsObject {
  
  inline def apply(): SeriesTooltipOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesTooltipOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesTooltipOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setChangeDecimals(value: Double): Self = StObject.set(x, "changeDecimals", value.asInstanceOf[js.Any])
    
    inline def setChangeDecimalsUndefined: Self = StObject.set(x, "changeDecimals", js.undefined)
    
    inline def setClusterFormat(value: String): Self = StObject.set(x, "clusterFormat", value.asInstanceOf[js.Any])
    
    inline def setClusterFormatUndefined: Self = StObject.set(x, "clusterFormat", js.undefined)
    
    inline def setDateTimeLabelFormats(value: Dictionary[String]): Self = StObject.set(x, "dateTimeLabelFormats", value.asInstanceOf[js.Any])
    
    inline def setDateTimeLabelFormatsUndefined: Self = StObject.set(x, "dateTimeLabelFormats", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setFollowPointer(value: Boolean): Self = StObject.set(x, "followPointer", value.asInstanceOf[js.Any])
    
    inline def setFollowPointerUndefined: Self = StObject.set(x, "followPointer", js.undefined)
    
    inline def setFollowTouchMove(value: Boolean): Self = StObject.set(x, "followTouchMove", value.asInstanceOf[js.Any])
    
    inline def setFollowTouchMoveUndefined: Self = StObject.set(x, "followTouchMove", js.undefined)
    
    inline def setFooterFormat(value: String): Self = StObject.set(x, "footerFormat", value.asInstanceOf[js.Any])
    
    inline def setFooterFormatUndefined: Self = StObject.set(x, "footerFormat", js.undefined)
    
    inline def setHeaderFormat(value: String): Self = StObject.set(x, "headerFormat", value.asInstanceOf[js.Any])
    
    inline def setHeaderFormatUndefined: Self = StObject.set(x, "headerFormat", js.undefined)
    
    inline def setLinkFormat(value: String): Self = StObject.set(x, "linkFormat", value.asInstanceOf[js.Any])
    
    inline def setLinkFormatUndefined: Self = StObject.set(x, "linkFormat", js.undefined)
    
    inline def setNodeFormat(value: String): Self = StObject.set(x, "nodeFormat", value.asInstanceOf[js.Any])
    
    inline def setNodeFormatUndefined: Self = StObject.set(x, "nodeFormat", js.undefined)
    
    inline def setNodeFormatter(value: FormatterCallbackFunction[SankeyNodeObject]): Self = StObject.set(x, "nodeFormatter", value.asInstanceOf[js.Any])
    
    inline def setNodeFormatterUndefined: Self = StObject.set(x, "nodeFormatter", js.undefined)
    
    inline def setNullFormat(value: String): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    
    inline def setNullFormatUndefined: Self = StObject.set(x, "nullFormat", js.undefined)
    
    inline def setNullFormatter(value: TooltipFormatterCallbackFunction): Self = StObject.set(x, "nullFormatter", value.asInstanceOf[js.Any])
    
    inline def setNullFormatterUndefined: Self = StObject.set(x, "nullFormatter", js.undefined)
    
    inline def setPointFormat(value: String): Self = StObject.set(x, "pointFormat", value.asInstanceOf[js.Any])
    
    inline def setPointFormatUndefined: Self = StObject.set(x, "pointFormat", js.undefined)
    
    inline def setPointFormatter(value: FormatterCallbackFunction[Point]): Self = StObject.set(x, "pointFormatter", value.asInstanceOf[js.Any])
    
    inline def setPointFormatterUndefined: Self = StObject.set(x, "pointFormatter", js.undefined)
    
    inline def setValueDecimals(value: Double): Self = StObject.set(x, "valueDecimals", value.asInstanceOf[js.Any])
    
    inline def setValueDecimalsUndefined: Self = StObject.set(x, "valueDecimals", js.undefined)
    
    inline def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
    
    inline def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
    
    inline def setValueSuffix(value: String): Self = StObject.set(x, "valueSuffix", value.asInstanceOf[js.Any])
    
    inline def setValueSuffixUndefined: Self = StObject.set(x, "valueSuffix", js.undefined)
    
    inline def setXDateFormat(value: String): Self = StObject.set(x, "xDateFormat", value.asInstanceOf[js.Any])
    
    inline def setXDateFormatUndefined: Self = StObject.set(x, "xDateFormat", js.undefined)
  }
}
