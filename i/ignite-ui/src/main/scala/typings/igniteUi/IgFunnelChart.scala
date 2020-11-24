package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgFunnelChart
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets or sets whether to allow slices to be selected.
    */
  var allowSliceSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets values for upper and lower bezier points. That option has effect only when useBezierCurve is enabled.
    * Value should provide 4 numeric values in range from 0 to 1 separated by space character.
    * The first number defines upper-x position, second: upper-y, third: lower-x, fourth: lower-y.
    * The null or invalid value will reset internal default, which is "0.5 0 0.5 1".
    * Example:
    * bezierPoints: "0.4 0.1 0.6 1"
    */
  var bezierPoints: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the percentage (from near 0 to 1) of space the bottom edge of the funnel should take.
    */
  var bottomEdgeWidth: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the palette of brushes to use for coloring the slices.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var brushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Event which is raised before data binding.
    * Return false in order to cancel data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
    * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
    */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.native
  
  /**
    * Event which is raised after data binding.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to chart widget.
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
    * Gets or sets the formatter function for inner labels. Function should return string and it takes 3 parameters: 1st-value of item to format, 2nd-index of item within data, 3rd-reference to the funnel chart.
    */
  var formatInnerLabel: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the formatter function for outer labels. Function should return string and it takes 3 parameters: 1st-value of item to format, 2nd-index of item within data, 3rd-reference to the funnel chart.
    */
  var formatOuterLabel: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets how the heights of the funnel slices should be configured.
    *
    * Valid values:
    * "uniform" The slice heights should be uniform.
    * "weighted" The slice heights should be weighted by value.
    */
  var funnelSliceDisplay: js.UndefOr[String] = js.native
  
  /**
    * The height of the chart.
    */
  var height: js.UndefOr[Double] = js.native
  
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
    * Gets or sets the InnerLabel mapping property for the current series object.
    */
  var innerLabelMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets whether the inner labels are visible.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var innerLabelVisibility: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets if the funnel should be rendered inverted.
    */
  var isInverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the Legend for the chart.
    * The value of that option can be a string with the id of existing html element. That element should be empty and it will be used to create igChartLegend widget.
    * If element was not found, then new DIV element is created and inserted into parent after chart element.
    * Value of that option can be an object with member "element", which contains the id of legend-element.
    * In this case, that object also may contain options supported by the igChartLegend widget, such as "width", "height" and events, such as "legendItemMouseLeftButtonDown", "legendItemMouseEnter", etc.
    * Examples:
    * legend: {}
    * legend: "idOfDiv"
    * legend: { element: "idOfDiv", width: 300 }
    * legend: { legendItemMouseLeftButtonDown: function (evt, ui) { ui.chart.toggleSelection(ui.item); } }
    */
  var legend: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the LegendItemBadgeTemplate to use for the legend items.
    * The provided object should have properties called render and optionally measure.
    * These are functions which will be called that will be called to handle the user specified custom rendering.
    * measure will be passed an object that looks like this:
    * {
    *     context: [either a DOM element or a CanvasContext2D depending on the particular template scenario],
    *     width: [if value is present, specifies the available width, user may set to desired width for content],
    *     height: [if value is present, specifies the available height, user may set to desired height for content],
    *     isConstant: [user should set to true if desired with and height will always be the same for this template],
    *     data: [if present, represents the contextual data for this template]
    * }
    * render will be passed an object that looks like this:
    * {
    *     context: [either a DOM element or a CanvasContext2D depending on the particular template scenario],
    *     xPosition: [if present, specifies the x position at which to render the content],
    *     yPosition: [if present, specifies the y position at which to render the content],
    *     availableWidth: [if present, specifies the available width in which to render the content],
    *     availableHeight: [if present, specifies the available height in which to render the content],
    *     data: [if present, specifies the data that is in context for this content],
    *     isHitTestRender: [if true, indicates that this is a special render pass for hit testing, in which case the brushes from the data should be used]
    * }
    */
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets sets maximum number of displayed records in chart.
    */
  var maxRecCount: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets which side of the chart the outer labels should appear.
    *
    * Valid values:
    * "left" The labels will be displayed to the left of the chart.
    * "right" The labels will be displayed to the right of the chart.
    */
  var outerLabelAlignment: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the OuterLabel mapping property for the current series object.
    */
  var outerLabelMemberPath: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the brush used for the outer labels.
    */
  var outerLabelTextColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the text style for outer labels
    */
  var outerLabelTextStyle: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets whether the outer labels are visible.
    *
    * Valid values:
    * "visible" Display the element.
    * "collapsed" Do not display the element.
    */
  var outerLabelVisibility: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the thickness of outline around slices.
    */
  var outlineThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the palette of brushes to use for outlines on the slices.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var outlines: js.UndefOr[js.Any] = js.native
  
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
    * Gets or sets the style to use for selected slices.
    * That can be used to set stroke (outline color), fill (background color) and opacity.
    */
  var selectedSliceStyle: js.UndefOr[js.Any] = js.native
  
  /**
    * Event which is raised when a slice is clicked.
    * Function takes first argument null and second argument ui.
    * Use ui.owner to obtain reference to igFunnelChart.
    * Use ui.index to obtain index of clicked slice.
    * Use ui.item to obtain reference to clicked slice item.
    * Use ui.selected to check if slice became selected.
    */
  var sliceClicked: js.UndefOr[SliceClickedEvent] = js.native
  
  /**
    * Gets or sets the brush used for the inner labels.
    */
  var textColor: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the text style for inner labels
    */
  var textStyle: js.UndefOr[String] = js.native
  
  /**
    * Gets sets template for tooltip associated with chart item.
    * Example: "Value: $(ValueMemberPathInDataSource)"
    */
  var tooltipTemplate: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets how long the animations should take to run.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the style to use for unselected slices.
    * That can be used to set stroke (outline color), fill (background color) and opacity.
    */
  var unselectedSliceStyle: js.UndefOr[js.Any] = js.native
  
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
    * Gets or sets whether to use a Bezier curve to define the funnel.
    */
  var useBezierCurve: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether to use the outer labels to identify the legend items.
    */
  var useOuterLabelsForLegend: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets whether to use the unselected style on unselected slices.
    */
  var useUnselectedStyle: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the value member path for the funnel chart.
    */
  var valueMemberPath: js.UndefOr[String] = js.native
  
  /**
    * The width of the chart.
    */
  var width: js.UndefOr[Double] = js.native
}
object IgFunnelChart {
  
  @scala.inline
  def apply(): IgFunnelChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgFunnelChart]
  }
  
  @scala.inline
  implicit class IgFunnelChartOps[Self <: IgFunnelChart] (val x: Self) extends AnyVal {
    
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
    def setAllowSliceSelection(value: Boolean): Self = this.set("allowSliceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSliceSelection: Self = this.set("allowSliceSelection", js.undefined)
    
    @scala.inline
    def setBezierPoints(value: String): Self = this.set("bezierPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBezierPoints: Self = this.set("bezierPoints", js.undefined)
    
    @scala.inline
    def setBottomEdgeWidth(value: Double): Self = this.set("bottomEdgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomEdgeWidth: Self = this.set("bottomEdgeWidth", js.undefined)
    
    @scala.inline
    def setBrushes(value: js.Any): Self = this.set("brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrushes: Self = this.set("brushes", js.undefined)
    
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
    def setFormatInnerLabel(value: js.Any): Self = this.set("formatInnerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatInnerLabel: Self = this.set("formatInnerLabel", js.undefined)
    
    @scala.inline
    def setFormatOuterLabel(value: js.Any): Self = this.set("formatOuterLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatOuterLabel: Self = this.set("formatOuterLabel", js.undefined)
    
    @scala.inline
    def setFunnelSliceDisplay(value: String): Self = this.set("funnelSliceDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunnelSliceDisplay: Self = this.set("funnelSliceDisplay", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHideTooltip(value: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit): Self = this.set("hideTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHideTooltip: Self = this.set("hideTooltip", js.undefined)
    
    @scala.inline
    def setInnerLabelMemberPath(value: String): Self = this.set("innerLabelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerLabelMemberPath: Self = this.set("innerLabelMemberPath", js.undefined)
    
    @scala.inline
    def setInnerLabelVisibility(value: String): Self = this.set("innerLabelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInnerLabelVisibility: Self = this.set("innerLabelVisibility", js.undefined)
    
    @scala.inline
    def setIsInverted(value: Boolean): Self = this.set("isInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInverted: Self = this.set("isInverted", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = this.set("legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    
    @scala.inline
    def setLegendItemBadgeTemplate(value: js.Any): Self = this.set("legendItemBadgeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendItemBadgeTemplate: Self = this.set("legendItemBadgeTemplate", js.undefined)
    
    @scala.inline
    def setMaxRecCount(value: Double): Self = this.set("maxRecCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRecCount: Self = this.set("maxRecCount", js.undefined)
    
    @scala.inline
    def setOuterLabelAlignment(value: String): Self = this.set("outerLabelAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterLabelAlignment: Self = this.set("outerLabelAlignment", js.undefined)
    
    @scala.inline
    def setOuterLabelMemberPath(value: String): Self = this.set("outerLabelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterLabelMemberPath: Self = this.set("outerLabelMemberPath", js.undefined)
    
    @scala.inline
    def setOuterLabelTextColor(value: String): Self = this.set("outerLabelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterLabelTextColor: Self = this.set("outerLabelTextColor", js.undefined)
    
    @scala.inline
    def setOuterLabelTextStyle(value: String): Self = this.set("outerLabelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterLabelTextStyle: Self = this.set("outerLabelTextStyle", js.undefined)
    
    @scala.inline
    def setOuterLabelVisibility(value: String): Self = this.set("outerLabelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterLabelVisibility: Self = this.set("outerLabelVisibility", js.undefined)
    
    @scala.inline
    def setOutlineThickness(value: Double): Self = this.set("outlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlineThickness: Self = this.set("outlineThickness", js.undefined)
    
    @scala.inline
    def setOutlines(value: js.Any): Self = this.set("outlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutlines: Self = this.set("outlines", js.undefined)
    
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
    def setSelectedSliceStyle(value: js.Any): Self = this.set("selectedSliceStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedSliceStyle: Self = this.set("selectedSliceStyle", js.undefined)
    
    @scala.inline
    def setSliceClicked(value: (/* event */ Event, /* ui */ SliceClickedEventUIParam) => Unit): Self = this.set("sliceClicked", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSliceClicked: Self = this.set("sliceClicked", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTextStyle(value: String): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTooltipTemplate(value: String): Self = this.set("tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplate: Self = this.set("tooltipTemplate", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = this.set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitionDuration: Self = this.set("transitionDuration", js.undefined)
    
    @scala.inline
    def setUnselectedSliceStyle(value: js.Any): Self = this.set("unselectedSliceStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselectedSliceStyle: Self = this.set("unselectedSliceStyle", js.undefined)
    
    @scala.inline
    def setUpdateTooltip(value: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = this.set("updateTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdateTooltip: Self = this.set("updateTooltip", js.undefined)
    
    @scala.inline
    def setUseBezierCurve(value: Boolean): Self = this.set("useBezierCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBezierCurve: Self = this.set("useBezierCurve", js.undefined)
    
    @scala.inline
    def setUseOuterLabelsForLegend(value: Boolean): Self = this.set("useOuterLabelsForLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseOuterLabelsForLegend: Self = this.set("useOuterLabelsForLegend", js.undefined)
    
    @scala.inline
    def setUseUnselectedStyle(value: Boolean): Self = this.set("useUnselectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseUnselectedStyle: Self = this.set("useUnselectedStyle", js.undefined)
    
    @scala.inline
    def setValueMemberPath(value: String): Self = this.set("valueMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueMemberPath: Self = this.set("valueMemberPath", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
