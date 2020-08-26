package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgSparkline
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets or sets the sparkline brush.
    */
  var brush: js.UndefOr[String] = js.native
  /**
    * Event which is raised before data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to igSparkline.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  /**
    * Event which is raised after data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to igSparkline.
    * Use ui.data to obtain reference to array actual data which is displayed by chart.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBound: js.UndefOr[DataBoundEvent] = js.native
  /**
    * Gets sets a valid data source.
    * That can be instance of array or primitives, array of objects, instance of $.ig.DataSource, or any other data accepted by $.ig.DataSource.
    * Note: if it is set to string and "dataSourceType" option is not set, then $.ig.JSONPDataSource is used.
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /**
    * Gets sets data source type (such as "json", "xml", etc). Please refer to the documentation of $.ig.DataSource and its type property
    */
  var dataSourceType: js.UndefOr[String] = js.native
  /**
    * Gets sets url which is used for sending JSON on request for remote data.
    */
  var dataSourceUrl: js.UndefOr[String] = js.native
  /**
    * Gets or sets the position of the normal range on the sparkline.
    */
  var displayNormalRangeInFront: js.UndefOr[Boolean] = js.native
  /**
    * Gets or sets the display type of the sparkline.
    *
    * Valid values:
    * "line" Display the sparkline as a line.
    * "area" Display the sparkline as a filled polygon.
    * "column" Display the sparkline as a set of columns.
    * "winLoss" Display the sparkline as a set of columns on a boolean scale.
    */
  var displayType: js.UndefOr[String] = js.native
  /**
    * Gets or sets the first marker brush of the sparkline.
    */
  var firstMarkerBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the first marker size of the sparkline.
    */
  var firstMarkerSize: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the first marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var firstMarkerVisibility: js.UndefOr[String] = js.native
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
    */
  var formatLabel: js.UndefOr[js.Any] = js.native
  /**
    * The height of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.native
  /**
    * Event which is raised before tooltip is hidden.
    * Return false in order to cancel hiding and keep tooltip visible.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.item to obtain reference to item.
    * Use ui.element to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
    */
  var hideTooltip: js.UndefOr[HideTooltipEvent] = js.native
  /**
    * Gets or sets the high marker brush of the sparkline.
    */
  var highMarkerBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the high marker size of the sparkline.
    */
  var highMarkerSize: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the high marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var highMarkerVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the horizontal axis line brush of the sparkline.
    */
  var horizontalAxisBrush: js.UndefOr[String] = js.native
  /**
    * The value or content to display on the horizontal axis.
    * This can be set to a formatted string, such as "{0}", or it can be set to a DataTemplate.
    */
  var horizontalAxisLabel: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the display state of the horizontal axis.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var horizontalAxisVisibility: js.UndefOr[String] = js.native
  /**
    * String identifier of a column or property name to get labels from on each item in the data source.  These labels will be retrieved from the first and last item, and displayed by the horizontal axis.
    */
  var labelMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the last marker brush of the sparkline.
    */
  var lastMarkerBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the last marker size of the sparkline.
    */
  var lastMarkerSize: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the last marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var lastMarkerVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the line thickness of the sparkline.
    */
  var lineThickness: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the low marker brush of the sparkline.
    */
  var lowMarkerBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the low marker size of the sparkline.
    */
  var lowMarkerSize: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the low marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var lowMarkerVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the marker brush of the sparkline.
    */
  var markerBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the marker size of the sparkline.
    */
  var markerSize: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var markerVisibility: js.UndefOr[String] = js.native
  /**
    * Gets sets maximum number of displayed records in chart.
    */
  var maxRecCount: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the negative brush of the sparkline.
    */
  var negativeBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the negative marker brush of the sparkline.
    */
  var negativeMarkerBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the negative marker size of the sparkline.
    */
  var negativeMarkerSize: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the negative marker visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var negativeMarkerVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the normal range brush of the sparkline.
    */
  var normalRangeFill: js.UndefOr[String] = js.native
  /**
    * Gets or sets the maximum value of the normal range.
    */
  var normalRangeMaximum: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the minimum value of the normal range.
    */
  var normalRangeMinimum: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the normal range visibility of the sparkline.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var normalRangeVisibility: js.UndefOr[String] = js.native
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
    * See $.ig.DataSource. This is basically the property in the responses where data records are held, if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.native
  /**
    * See $.ig.DataSource. property in the response specifying the total number of records on the server.
    */
  var responseTotalRecCountKey: js.UndefOr[String] = js.native
  /**
    * Gets sets template for tooltip associated with chart item.
    * Example: "Value: $(ValueMemberPathInDataSource)"
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  /**
    * Gets or sets the trendline brush of the sparkline.
    */
  var trendLineBrush: js.UndefOr[String] = js.native
  /**
    * Gets or sets the trendline period used by the sparkline.
    */
  var trendLinePeriod: js.UndefOr[Double] = js.native
  /**
    * Gets or sets the thickness of the sparkline's trendline.
    */
  var trendLineThickness: js.UndefOr[Double] = js.native
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
  var trendLineType: js.UndefOr[String] = js.native
  /**
    * Gets or sets the way null values are interpreted.
    *
    * Valid values:
    * "linearInterpolate" Plot the unknown value as the midpoint between surrounding known values using linear interpolation.
    * "dontPlot" Do not plot the unknown value on the chart.
    */
  var unknownValuePlotting: js.UndefOr[String] = js.native
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
  var updateTooltip: js.UndefOr[UpdateTooltipEvent] = js.native
  /**
    * Gets or sets the string path to the value column.
    */
  var valueMemberPath: js.UndefOr[String] = js.native
  /**
    * Gets or sets the vertical axis line brush of the sparkline.
    */
  var verticalAxisBrush: js.UndefOr[String] = js.native
  /**
    * The value or content to display on the vertical axis.
    * This can be set to a formatted string, such as "{0:n}", or it can be set to a DataTemplate.
    */
  var verticalAxisLabel: js.UndefOr[js.Any] = js.native
  /**
    * Gets or sets the display state of the vertical axis.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var verticalAxisVisibility: js.UndefOr[String] = js.native
  /**
    * The width of the sparkline. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.native
}

object IgSparkline {
  @scala.inline
  def apply(): IgSparkline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSparkline]
  }
  @scala.inline
  implicit class IgSparklineOps[Self <: IgSparkline] (val x: Self) extends AnyVal {
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
    def setBrush(value: String): Self = this.set("brush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrush: Self = this.set("brush", js.undefined)
    @scala.inline
    def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = this.set("dataBinding", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBinding: Self = this.set("dataBinding", js.undefined)
    @scala.inline
    def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = this.set("dataBound", js.Any.fromFunction2(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDataSourceType(value: String): Self = this.set("dataSourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceType: Self = this.set("dataSourceType", js.undefined)
    @scala.inline
    def setDataSourceUrl(value: String): Self = this.set("dataSourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSourceUrl: Self = this.set("dataSourceUrl", js.undefined)
    @scala.inline
    def setDisplayNormalRangeInFront(value: Boolean): Self = this.set("displayNormalRangeInFront", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayNormalRangeInFront: Self = this.set("displayNormalRangeInFront", js.undefined)
    @scala.inline
    def setDisplayType(value: String): Self = this.set("displayType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayType: Self = this.set("displayType", js.undefined)
    @scala.inline
    def setFirstMarkerBrush(value: String): Self = this.set("firstMarkerBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstMarkerBrush: Self = this.set("firstMarkerBrush", js.undefined)
    @scala.inline
    def setFirstMarkerSize(value: Double): Self = this.set("firstMarkerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstMarkerSize: Self = this.set("firstMarkerSize", js.undefined)
    @scala.inline
    def setFirstMarkerVisibility(value: String): Self = this.set("firstMarkerVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstMarkerVisibility: Self = this.set("firstMarkerVisibility", js.undefined)
    @scala.inline
    def setFormatLabel(value: js.Any): Self = this.set("formatLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatLabel: Self = this.set("formatLabel", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHideTooltip(value: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit): Self = this.set("hideTooltip", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHideTooltip: Self = this.set("hideTooltip", js.undefined)
    @scala.inline
    def setHighMarkerBrush(value: String): Self = this.set("highMarkerBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighMarkerBrush: Self = this.set("highMarkerBrush", js.undefined)
    @scala.inline
    def setHighMarkerSize(value: Double): Self = this.set("highMarkerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighMarkerSize: Self = this.set("highMarkerSize", js.undefined)
    @scala.inline
    def setHighMarkerVisibility(value: String): Self = this.set("highMarkerVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighMarkerVisibility: Self = this.set("highMarkerVisibility", js.undefined)
    @scala.inline
    def setHorizontalAxisBrush(value: String): Self = this.set("horizontalAxisBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAxisBrush: Self = this.set("horizontalAxisBrush", js.undefined)
    @scala.inline
    def setHorizontalAxisLabel(value: js.Any): Self = this.set("horizontalAxisLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAxisLabel: Self = this.set("horizontalAxisLabel", js.undefined)
    @scala.inline
    def setHorizontalAxisVisibility(value: String): Self = this.set("horizontalAxisVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAxisVisibility: Self = this.set("horizontalAxisVisibility", js.undefined)
    @scala.inline
    def setLabelMemberPath(value: String): Self = this.set("labelMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelMemberPath: Self = this.set("labelMemberPath", js.undefined)
    @scala.inline
    def setLastMarkerBrush(value: String): Self = this.set("lastMarkerBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastMarkerBrush: Self = this.set("lastMarkerBrush", js.undefined)
    @scala.inline
    def setLastMarkerSize(value: Double): Self = this.set("lastMarkerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastMarkerSize: Self = this.set("lastMarkerSize", js.undefined)
    @scala.inline
    def setLastMarkerVisibility(value: String): Self = this.set("lastMarkerVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastMarkerVisibility: Self = this.set("lastMarkerVisibility", js.undefined)
    @scala.inline
    def setLineThickness(value: Double): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineThickness: Self = this.set("lineThickness", js.undefined)
    @scala.inline
    def setLowMarkerBrush(value: String): Self = this.set("lowMarkerBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowMarkerBrush: Self = this.set("lowMarkerBrush", js.undefined)
    @scala.inline
    def setLowMarkerSize(value: Double): Self = this.set("lowMarkerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowMarkerSize: Self = this.set("lowMarkerSize", js.undefined)
    @scala.inline
    def setLowMarkerVisibility(value: String): Self = this.set("lowMarkerVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowMarkerVisibility: Self = this.set("lowMarkerVisibility", js.undefined)
    @scala.inline
    def setMarkerBrush(value: String): Self = this.set("markerBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerBrush: Self = this.set("markerBrush", js.undefined)
    @scala.inline
    def setMarkerSize(value: Double): Self = this.set("markerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerSize: Self = this.set("markerSize", js.undefined)
    @scala.inline
    def setMarkerVisibility(value: String): Self = this.set("markerVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerVisibility: Self = this.set("markerVisibility", js.undefined)
    @scala.inline
    def setMaxRecCount(value: Double): Self = this.set("maxRecCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecCount: Self = this.set("maxRecCount", js.undefined)
    @scala.inline
    def setNegativeBrush(value: String): Self = this.set("negativeBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeBrush: Self = this.set("negativeBrush", js.undefined)
    @scala.inline
    def setNegativeMarkerBrush(value: String): Self = this.set("negativeMarkerBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeMarkerBrush: Self = this.set("negativeMarkerBrush", js.undefined)
    @scala.inline
    def setNegativeMarkerSize(value: Double): Self = this.set("negativeMarkerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeMarkerSize: Self = this.set("negativeMarkerSize", js.undefined)
    @scala.inline
    def setNegativeMarkerVisibility(value: String): Self = this.set("negativeMarkerVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeMarkerVisibility: Self = this.set("negativeMarkerVisibility", js.undefined)
    @scala.inline
    def setNormalRangeFill(value: String): Self = this.set("normalRangeFill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalRangeFill: Self = this.set("normalRangeFill", js.undefined)
    @scala.inline
    def setNormalRangeMaximum(value: Double): Self = this.set("normalRangeMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalRangeMaximum: Self = this.set("normalRangeMaximum", js.undefined)
    @scala.inline
    def setNormalRangeMinimum(value: Double): Self = this.set("normalRangeMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalRangeMinimum: Self = this.set("normalRangeMinimum", js.undefined)
    @scala.inline
    def setNormalRangeVisibility(value: String): Self = this.set("normalRangeVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalRangeVisibility: Self = this.set("normalRangeVisibility", js.undefined)
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = this.set("pixelScalingRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelScalingRatio: Self = this.set("pixelScalingRatio", js.undefined)
    @scala.inline
    def setResponseDataKey(value: String): Self = this.set("responseDataKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDataKey: Self = this.set("responseDataKey", js.undefined)
    @scala.inline
    def setResponseTotalRecCountKey(value: String): Self = this.set("responseTotalRecCountKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTotalRecCountKey: Self = this.set("responseTotalRecCountKey", js.undefined)
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    @scala.inline
    def setTrendLineBrush(value: String): Self = this.set("trendLineBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLineBrush: Self = this.set("trendLineBrush", js.undefined)
    @scala.inline
    def setTrendLinePeriod(value: Double): Self = this.set("trendLinePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLinePeriod: Self = this.set("trendLinePeriod", js.undefined)
    @scala.inline
    def setTrendLineThickness(value: Double): Self = this.set("trendLineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLineThickness: Self = this.set("trendLineThickness", js.undefined)
    @scala.inline
    def setTrendLineType(value: String): Self = this.set("trendLineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrendLineType: Self = this.set("trendLineType", js.undefined)
    @scala.inline
    def setUnknownValuePlotting(value: String): Self = this.set("unknownValuePlotting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnknownValuePlotting: Self = this.set("unknownValuePlotting", js.undefined)
    @scala.inline
    def setUpdateTooltip(value: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = this.set("updateTooltip", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUpdateTooltip: Self = this.set("updateTooltip", js.undefined)
    @scala.inline
    def setValueMemberPath(value: String): Self = this.set("valueMemberPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueMemberPath: Self = this.set("valueMemberPath", js.undefined)
    @scala.inline
    def setVerticalAxisBrush(value: String): Self = this.set("verticalAxisBrush", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAxisBrush: Self = this.set("verticalAxisBrush", js.undefined)
    @scala.inline
    def setVerticalAxisLabel(value: js.Any): Self = this.set("verticalAxisLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAxisLabel: Self = this.set("verticalAxisLabel", js.undefined)
    @scala.inline
    def setVerticalAxisVisibility(value: String): Self = this.set("verticalAxisVisibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAxisVisibility: Self = this.set("verticalAxisVisibility", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

