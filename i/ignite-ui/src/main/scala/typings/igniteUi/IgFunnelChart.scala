package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
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
  implicit class IgFunnelChartMutableBuilder[Self <: IgFunnelChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSliceSelection(value: Boolean): Self = StObject.set(x, "allowSliceSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSliceSelectionUndefined: Self = StObject.set(x, "allowSliceSelection", js.undefined)
    
    @scala.inline
    def setBezierPoints(value: String): Self = StObject.set(x, "bezierPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBezierPointsUndefined: Self = StObject.set(x, "bezierPoints", js.undefined)
    
    @scala.inline
    def setBottomEdgeWidth(value: Double): Self = StObject.set(x, "bottomEdgeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomEdgeWidthUndefined: Self = StObject.set(x, "bottomEdgeWidth", js.undefined)
    
    @scala.inline
    def setBrushes(value: js.Any): Self = StObject.set(x, "brushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrushesUndefined: Self = StObject.set(x, "brushes", js.undefined)
    
    @scala.inline
    def setDataBinding(value: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit): Self = StObject.set(x, "dataBinding", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    @scala.inline
    def setDataBound(value: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit): Self = StObject.set(x, "dataBound", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    @scala.inline
    def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceType(value: String): Self = StObject.set(x, "dataSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceTypeUndefined: Self = StObject.set(x, "dataSourceType", js.undefined)
    
    @scala.inline
    def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    @scala.inline
    def setDataSourceUrl(value: String): Self = StObject.set(x, "dataSourceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceUrlUndefined: Self = StObject.set(x, "dataSourceUrl", js.undefined)
    
    @scala.inline
    def setFormatInnerLabel(value: js.Any): Self = StObject.set(x, "formatInnerLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatInnerLabelUndefined: Self = StObject.set(x, "formatInnerLabel", js.undefined)
    
    @scala.inline
    def setFormatOuterLabel(value: js.Any): Self = StObject.set(x, "formatOuterLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatOuterLabelUndefined: Self = StObject.set(x, "formatOuterLabel", js.undefined)
    
    @scala.inline
    def setFunnelSliceDisplay(value: String): Self = StObject.set(x, "funnelSliceDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunnelSliceDisplayUndefined: Self = StObject.set(x, "funnelSliceDisplay", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHideTooltip(value: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit): Self = StObject.set(x, "hideTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHideTooltipUndefined: Self = StObject.set(x, "hideTooltip", js.undefined)
    
    @scala.inline
    def setInnerLabelMemberPath(value: String): Self = StObject.set(x, "innerLabelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerLabelMemberPathUndefined: Self = StObject.set(x, "innerLabelMemberPath", js.undefined)
    
    @scala.inline
    def setInnerLabelVisibility(value: String): Self = StObject.set(x, "innerLabelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerLabelVisibilityUndefined: Self = StObject.set(x, "innerLabelVisibility", js.undefined)
    
    @scala.inline
    def setIsInverted(value: Boolean): Self = StObject.set(x, "isInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInvertedUndefined: Self = StObject.set(x, "isInverted", js.undefined)
    
    @scala.inline
    def setLegend(value: js.Any): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemBadgeTemplate(value: js.Any): Self = StObject.set(x, "legendItemBadgeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemBadgeTemplateUndefined: Self = StObject.set(x, "legendItemBadgeTemplate", js.undefined)
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setMaxRecCount(value: Double): Self = StObject.set(x, "maxRecCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecCountUndefined: Self = StObject.set(x, "maxRecCount", js.undefined)
    
    @scala.inline
    def setOuterLabelAlignment(value: String): Self = StObject.set(x, "outerLabelAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterLabelAlignmentUndefined: Self = StObject.set(x, "outerLabelAlignment", js.undefined)
    
    @scala.inline
    def setOuterLabelMemberPath(value: String): Self = StObject.set(x, "outerLabelMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterLabelMemberPathUndefined: Self = StObject.set(x, "outerLabelMemberPath", js.undefined)
    
    @scala.inline
    def setOuterLabelTextColor(value: String): Self = StObject.set(x, "outerLabelTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterLabelTextColorUndefined: Self = StObject.set(x, "outerLabelTextColor", js.undefined)
    
    @scala.inline
    def setOuterLabelTextStyle(value: String): Self = StObject.set(x, "outerLabelTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterLabelTextStyleUndefined: Self = StObject.set(x, "outerLabelTextStyle", js.undefined)
    
    @scala.inline
    def setOuterLabelVisibility(value: String): Self = StObject.set(x, "outerLabelVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterLabelVisibilityUndefined: Self = StObject.set(x, "outerLabelVisibility", js.undefined)
    
    @scala.inline
    def setOutlineThickness(value: Double): Self = StObject.set(x, "outlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineThicknessUndefined: Self = StObject.set(x, "outlineThickness", js.undefined)
    
    @scala.inline
    def setOutlines(value: js.Any): Self = StObject.set(x, "outlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlinesUndefined: Self = StObject.set(x, "outlines", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setResponseDataKey(value: String): Self = StObject.set(x, "responseDataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseDataKeyUndefined: Self = StObject.set(x, "responseDataKey", js.undefined)
    
    @scala.inline
    def setResponseTotalRecCountKey(value: String): Self = StObject.set(x, "responseTotalRecCountKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTotalRecCountKeyUndefined: Self = StObject.set(x, "responseTotalRecCountKey", js.undefined)
    
    @scala.inline
    def setSelectedSliceStyle(value: js.Any): Self = StObject.set(x, "selectedSliceStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedSliceStyleUndefined: Self = StObject.set(x, "selectedSliceStyle", js.undefined)
    
    @scala.inline
    def setSliceClicked(value: (/* event */ Event, /* ui */ SliceClickedEventUIParam) => Unit): Self = StObject.set(x, "sliceClicked", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSliceClickedUndefined: Self = StObject.set(x, "sliceClicked", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
    
    @scala.inline
    def setTextStyle(value: String): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    @scala.inline
    def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setUnselectedSliceStyle(value: js.Any): Self = StObject.set(x, "unselectedSliceStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectedSliceStyleUndefined: Self = StObject.set(x, "unselectedSliceStyle", js.undefined)
    
    @scala.inline
    def setUpdateTooltip(value: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit): Self = StObject.set(x, "updateTooltip", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateTooltipUndefined: Self = StObject.set(x, "updateTooltip", js.undefined)
    
    @scala.inline
    def setUseBezierCurve(value: Boolean): Self = StObject.set(x, "useBezierCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBezierCurveUndefined: Self = StObject.set(x, "useBezierCurve", js.undefined)
    
    @scala.inline
    def setUseOuterLabelsForLegend(value: Boolean): Self = StObject.set(x, "useOuterLabelsForLegend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOuterLabelsForLegendUndefined: Self = StObject.set(x, "useOuterLabelsForLegend", js.undefined)
    
    @scala.inline
    def setUseUnselectedStyle(value: Boolean): Self = StObject.set(x, "useUnselectedStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUnselectedStyleUndefined: Self = StObject.set(x, "useUnselectedStyle", js.undefined)
    
    @scala.inline
    def setValueMemberPath(value: String): Self = StObject.set(x, "valueMemberPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueMemberPathUndefined: Self = StObject.set(x, "valueMemberPath", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
