package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSparkline
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets or sets the sparkline brush.
    */
  var brush: js.UndefOr[String] = js.undefined
  
  /**
    * Event which is raised before data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to igSparkline.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  
  /**
    * Event which is raised after data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to igSparkline.
    * Use ui.data to obtain reference to array actual data which is displayed by chart.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  
  /**
    * Gets sets a valid data source.
    * That can be instance of array or primitives, array of objects, instance of $.ig.DataSource, or any other data accepted by $.ig.DataSource.
    * Note: if it is set to string and "dataSourceType" option is not set, then $.ig.JSONPDataSource is used.
    */
  var dataSource: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets sets data source type (such as "json", "xml", etc). Please refer to the documentation of $.ig.DataSource and its type property
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets sets url which is used for sending JSON on request for remote data.
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the position of the normal range on the sparkline.
    */
  var displayNormalRangeInFront: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets or sets the display type of the sparkline.
    *
    * Valid values:
    * "line" Display the sparkline as a line.
    * "area" Display the sparkline as a filled polygon.
    * "column" Display the sparkline as a set of columns.
    * "winLoss" Display the sparkline as a set of columns on a boolean scale.
    */
  var displayType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the first marker brush of the sparkline.
    */
  var firstMarkerBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the first marker size of the sparkline.
    */
  var firstMarkerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the first marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var firstMarkerVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
    */
  var formatLabel: js.UndefOr[Any] = js.undefined
  
  /**
    * The height of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Event which is raised before tooltip is hidden.
    * Return false in order to cancel hiding and keep tooltip visible.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.item to obtain reference to item.
    * Use ui.element to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
    */
  var hideTooltip: js.UndefOr[HideTooltipEvent] = js.undefined
  
  /**
    * Gets or sets the high marker brush of the sparkline.
    */
  var highMarkerBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the high marker size of the sparkline.
    */
  var highMarkerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the high marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var highMarkerVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the horizontal axis line brush of the sparkline.
    */
  var horizontalAxisBrush: js.UndefOr[String] = js.undefined
  
  /**
    * The value or content to display on the horizontal axis.
    * This can be set to a formatted string, such as "{0}", or it can be set to a DataTemplate.
    */
  var horizontalAxisLabel: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets the display state of the horizontal axis.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var horizontalAxisVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * String identifier of a column or property name to get labels from on each item in the data source.  These labels will be retrieved from the first and last item, and displayed by the horizontal axis.
    */
  var labelMemberPath: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the last marker brush of the sparkline.
    */
  var lastMarkerBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the last marker size of the sparkline.
    */
  var lastMarkerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the last marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var lastMarkerVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the line thickness of the sparkline.
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the low marker brush of the sparkline.
    */
  var lowMarkerBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the low marker size of the sparkline.
    */
  var lowMarkerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the low marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var lowMarkerVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the marker brush of the sparkline.
    */
  var markerBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the marker size of the sparkline.
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var markerVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Gets sets maximum number of displayed records in chart.
    */
  var maxRecCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the negative brush of the sparkline.
    */
  var negativeBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the negative marker brush of the sparkline.
    */
  var negativeMarkerBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the negative marker size of the sparkline.
    */
  var negativeMarkerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the negative marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var negativeMarkerVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the normal range brush of the sparkline.
    */
  var normalRangeFill: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the maximum value of the normal range.
    */
  var normalRangeMaximum: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the minimum value of the normal range.
    */
  var normalRangeMinimum: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the normal range visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var normalRangeVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  
  /**
    * See $.ig.DataSource. property in the response specifying the total number of records on the server.
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.undefined
  
  /**
    * Gets sets template for tooltip associated with chart item.
    * Example: "Value: $(ValueMemberPathInDataSource)"
    */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the trendline brush of the sparkline.
    */
  var trendLineBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the trendline period used by the sparkline.
    */
  var trendLinePeriod: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the thickness of the sparkline's trendline.
    */
  var trendLineThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the type of trendline used by the sparkline.
    *
    * Valid values:
    * "none" No trend line will be displayed.
    * "linearFit" Linear fit.
    * "quadraticFit" Quadratic polynomial fit.
    * "cubicFit" Cubic polynomial fit.
    * "quarticFit" Quartic polynomial fit.
    * "quinticFit" Quintic polynomial fit.
    * "logarithmicFit" Logarithmic fit.
    * "exponentialFit" Exponential fit.
    * "powerLawFit" Powerlaw fit.
    * "simpleAverage" Simple moving average.
    * "exponentialAverage" Exponential moving average.
    * "modifiedAverage" Modified moving average.
    * "cumulativeAverage" Cumulative moving average.
    * "weightedAverage" Weighted moving average.
    */
  var trendLineType: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the way null values are interpreted.
    *
    * Valid values:
    * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
    * "dontPlot" Do not plot the unknown value on the chart.
    */
  var unknownValuePlotting: js.UndefOr[String] = js.undefined
  
  /**
    * Event which is raised before tooltip is updated.
    * Return false in order to cancel updating and hide tooltip.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.text to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
    * Use ui.item to obtain reference to item. Value of that member can be modified or replaced by custom item.
    * Use ui.x to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
    * Use ui.y to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
    * Use ui.element to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
    */
  var updateTooltip: js.UndefOr[UpdateTooltipEvent] = js.undefined
  
  /**
    * Gets or sets the string path to the value column.
    */
  var valueMemberPath: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the vertical axis line brush of the sparkline.
    */
  var verticalAxisBrush: js.UndefOr[String] = js.undefined
  
  /**
    * The value or content to display on the vertical axis.
    * This can be set to a formatted string, such as "{0:n}", or it can be set to a DataTemplate.
    */
  var verticalAxisLabel: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets the display state of the vertical axis.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var verticalAxisVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.undefined
}
object IgSparkline {
  
  inline def apply(): IgSparkline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSparkline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgSparkline] (val x: Self) extends AnyVal {
    
    inline def setBrush(value: String): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
    
    inline def setBrushUndefined: Self = StObject.set(x, "brush", js.undefined)
    
    inline def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction2(value))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction2(value))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    inline def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    inline def setDisplayNormalRangeInFront(value: Boolean): Self = StObject.set(x, "displayNormalRangeInFront", value.asInstanceOf[js.Any])
    
    inline def setDisplayNormalRangeInFrontUndefined: Self = StObject.set(x, "displayNormalRangeInFront", js.undefined)
    
    inline def setDisplayType(value: String): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
    
    inline def setDisplayTypeUndefined: Self = StObject.set(x, "displayType", js.undefined)
    
    inline def setFirstMarkerBrush(value: String): Self = StObject.set(x, "firstMarkerBrush", value.asInstanceOf[js.Any])
    
    inline def setFirstMarkerBrushUndefined: Self = StObject.set(x, "firstMarkerBrush", js.undefined)
    
    inline def setFirstMarkerSize(value: Double): Self = StObject.set(x, "firstMarkerSize", value.asInstanceOf[js.Any])
    
    inline def setFirstMarkerSizeUndefined: Self = StObject.set(x, "firstMarkerSize", js.undefined)
    
    inline def setFirstMarkerVisibility(value: String): Self = StObject.set(x, "firstMarkerVisibility", value.asInstanceOf[js.Any])
    
    inline def setFirstMarkerVisibilityUndefined: Self = StObject.set(x, "firstMarkerVisibility", js.undefined)
    
    inline def setFormatLabel(value: Any): Self = StObject.set(x, "formatLabel", value.asInstanceOf[js.Any])
    
    inline def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHideTooltip(value: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit): Self = StObject.set(x, "hideTooltip", js.Any.fromFunction2(value))
    
    inline def setHideTooltipUndefined: Self = StObject.set(x, "hideTooltip", js.undefined)
    
    inline def setHighMarkerBrush(value: String): Self = StObject.set(x, "highMarkerBrush", value.asInstanceOf[js.Any])
    
    inline def setHighMarkerBrushUndefined: Self = StObject.set(x, "highMarkerBrush", js.undefined)
    
    inline def setHighMarkerSize(value: Double): Self = StObject.set(x, "highMarkerSize", value.asInstanceOf[js.Any])
    
    inline def setHighMarkerSizeUndefined: Self = StObject.set(x, "highMarkerSize", js.undefined)
    
    inline def setHighMarkerVisibility(value: String): Self = StObject.set(x, "highMarkerVisibility", value.asInstanceOf[js.Any])
    
    inline def setHighMarkerVisibilityUndefined: Self = StObject.set(x, "highMarkerVisibility", js.undefined)
    
    inline def setHorizontalAxisBrush(value: String): Self = StObject.set(x, "horizontalAxisBrush", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAxisBrushUndefined: Self = StObject.set(x, "horizontalAxisBrush", js.undefined)
    
    inline def setHorizontalAxisLabel(value: Any): Self = StObject.set(x, "horizontalAxisLabel", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAxisLabelUndefined: Self = StObject.set(x, "horizontalAxisLabel", js.undefined)
    
    inline def setHorizontalAxisVisibility(value: String): Self = StObject.set(x, "horizontalAxisVisibility", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAxisVisibilityUndefined: Self = StObject.set(x, "horizontalAxisVisibility", js.undefined)
    
    inline def setLabelMemberPath(value: String): Self = StObject.set(x, "labelMemberPath", value.asInstanceOf[js.Any])
    
    inline def setLabelMemberPathUndefined: Self = StObject.set(x, "labelMemberPath", js.undefined)
    
    inline def setLastMarkerBrush(value: String): Self = StObject.set(x, "lastMarkerBrush", value.asInstanceOf[js.Any])
    
    inline def setLastMarkerBrushUndefined: Self = StObject.set(x, "lastMarkerBrush", js.undefined)
    
    inline def setLastMarkerSize(value: Double): Self = StObject.set(x, "lastMarkerSize", value.asInstanceOf[js.Any])
    
    inline def setLastMarkerSizeUndefined: Self = StObject.set(x, "lastMarkerSize", js.undefined)
    
    inline def setLastMarkerVisibility(value: String): Self = StObject.set(x, "lastMarkerVisibility", value.asInstanceOf[js.Any])
    
    inline def setLastMarkerVisibilityUndefined: Self = StObject.set(x, "lastMarkerVisibility", js.undefined)
    
    inline def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    inline def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
    
    inline def setLowMarkerBrush(value: String): Self = StObject.set(x, "lowMarkerBrush", value.asInstanceOf[js.Any])
    
    inline def setLowMarkerBrushUndefined: Self = StObject.set(x, "lowMarkerBrush", js.undefined)
    
    inline def setLowMarkerSize(value: Double): Self = StObject.set(x, "lowMarkerSize", value.asInstanceOf[js.Any])
    
    inline def setLowMarkerSizeUndefined: Self = StObject.set(x, "lowMarkerSize", js.undefined)
    
    inline def setLowMarkerVisibility(value: String): Self = StObject.set(x, "lowMarkerVisibility", value.asInstanceOf[js.Any])
    
    inline def setLowMarkerVisibilityUndefined: Self = StObject.set(x, "lowMarkerVisibility", js.undefined)
    
    inline def setMarkerBrush(value: String): Self = StObject.set(x, "markerBrush", value.asInstanceOf[js.Any])
    
    inline def setMarkerBrushUndefined: Self = StObject.set(x, "markerBrush", js.undefined)
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    inline def setMarkerVisibility(value: String): Self = StObject.set(x, "markerVisibility", value.asInstanceOf[js.Any])
    
    inline def setMarkerVisibilityUndefined: Self = StObject.set(x, "markerVisibility", js.undefined)
    
    inline def setMaxRecCount(value: Double): Self = StObject.set(x, "maxRecCount", value.asInstanceOf[js.Any])
    
    inline def setMaxRecCountUndefined: Self = StObject.set(x, "maxRecCount", js.undefined)
    
    inline def setNegativeBrush(value: String): Self = StObject.set(x, "negativeBrush", value.asInstanceOf[js.Any])
    
    inline def setNegativeBrushUndefined: Self = StObject.set(x, "negativeBrush", js.undefined)
    
    inline def setNegativeMarkerBrush(value: String): Self = StObject.set(x, "negativeMarkerBrush", value.asInstanceOf[js.Any])
    
    inline def setNegativeMarkerBrushUndefined: Self = StObject.set(x, "negativeMarkerBrush", js.undefined)
    
    inline def setNegativeMarkerSize(value: Double): Self = StObject.set(x, "negativeMarkerSize", value.asInstanceOf[js.Any])
    
    inline def setNegativeMarkerSizeUndefined: Self = StObject.set(x, "negativeMarkerSize", js.undefined)
    
    inline def setNegativeMarkerVisibility(value: String): Self = StObject.set(x, "negativeMarkerVisibility", value.asInstanceOf[js.Any])
    
    inline def setNegativeMarkerVisibilityUndefined: Self = StObject.set(x, "negativeMarkerVisibility", js.undefined)
    
    inline def setNormalRangeFill(value: String): Self = StObject.set(x, "normalRangeFill", value.asInstanceOf[js.Any])
    
    inline def setNormalRangeFillUndefined: Self = StObject.set(x, "normalRangeFill", js.undefined)
    
    inline def setNormalRangeMaximum(value: Double): Self = StObject.set(x, "normalRangeMaximum", value.asInstanceOf[js.Any])
    
    inline def setNormalRangeMaximumUndefined: Self = StObject.set(x, "normalRangeMaximum", js.undefined)
    
    inline def setNormalRangeMinimum(value: Double): Self = StObject.set(x, "normalRangeMinimum", value.asInstanceOf[js.Any])
    
    inline def setNormalRangeMinimumUndefined: Self = StObject.set(x, "normalRangeMinimum", js.undefined)
    
    inline def setNormalRangeVisibility(value: String): Self = StObject.set(x, "normalRangeVisibility", value.asInstanceOf[js.Any])
    
    inline def setNormalRangeVisibilityUndefined: Self = StObject.set(x, "normalRangeVisibility", js.undefined)
    
    inline def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    inline def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    inline def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    inline def setResponseTotalRecCountKey(value: String): Self = StObject.set(x, "responseTotalRecCountKey", value.asInstanceOf[js.Any])
    
    inline def setResponseTotalRecCountKeyUndefined: Self = StObject.set(x, "responseTotalRecCountKey", js.undefined)
    
    inline def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    inline def setTrendLineBrush(value: String): Self = StObject.set(x, "trendLineBrush", value.asInstanceOf[js.Any])
    
    inline def setTrendLineBrushUndefined: Self = StObject.set(x, "trendLineBrush", js.undefined)
    
    inline def setTrendLinePeriod(value: Double): Self = StObject.set(x, "trendLinePeriod", value.asInstanceOf[js.Any])
    
    inline def setTrendLinePeriodUndefined: Self = StObject.set(x, "trendLinePeriod", js.undefined)
    
    inline def setTrendLineThickness(value: Double): Self = StObject.set(x, "trendLineThickness", value.asInstanceOf[js.Any])
    
    inline def setTrendLineThicknessUndefined: Self = StObject.set(x, "trendLineThickness", js.undefined)
    
    inline def setTrendLineType(value: String): Self = StObject.set(x, "trendLineType", value.asInstanceOf[js.Any])
    
    inline def setTrendLineTypeUndefined: Self = StObject.set(x, "trendLineType", js.undefined)
    
    inline def setUnknownValuePlotting(value: String): Self = StObject.set(x, "unknownValuePlotting", value.asInstanceOf[js.Any])
    
    inline def setUnknownValuePlottingUndefined: Self = StObject.set(x, "unknownValuePlotting", js.undefined)
    
    inline def setUpdateTooltip(value: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = StObject.set(x, "updateTooltip", js.Any.fromFunction2(value))
    
    inline def setUpdateTooltipUndefined: Self = StObject.set(x, "updateTooltip", js.undefined)
    
    inline def setValueMemberPath(value: String): Self = StObject.set(x, "valueMemberPath", value.asInstanceOf[js.Any])
    
    inline def setValueMemberPathUndefined: Self = StObject.set(x, "valueMemberPath", js.undefined)
    
    inline def setVerticalAxisBrush(value: String): Self = StObject.set(x, "verticalAxisBrush", value.asInstanceOf[js.Any])
    
    inline def setVerticalAxisBrushUndefined: Self = StObject.set(x, "verticalAxisBrush", js.undefined)
    
    inline def setVerticalAxisLabel(value: Any): Self = StObject.set(x, "verticalAxisLabel", value.asInstanceOf[js.Any])
    
    inline def setVerticalAxisLabelUndefined: Self = StObject.set(x, "verticalAxisLabel", js.undefined)
    
    inline def setVerticalAxisVisibility(value: String): Self = StObject.set(x, "verticalAxisVisibility", value.asInstanceOf[js.Any])
    
    inline def setVerticalAxisVisibilityUndefined: Self = StObject.set(x, "verticalAxisVisibility", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
