package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgFunnelChart
  extends /**
	 * Option for igFunnelChart
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets whether to allow slices to be selected.
  	 */
  var allowSliceSelection: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets values for upper and lower bezier points. That option has effect only when useBezierCurve is enabled.
  	 * Value should provide 4 numeric values in range from 0 to 1 separated by space character.
  	 * The first number defines upper-x position, second: upper-y, third: lower-x, fourth: lower-y.
  	 * The null or invalid value will reset internal default, which is "0.5 0 0.5 1".
  	 * Example:
  	 * bezierPoints: "0.4 0.1 0.6 1"
  	 */
  var bezierPoints: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the percentage (from near 0 to 1) of space the bottom edge of the funnel should take.
  	 */
  var bottomEdgeWidth: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the palette of brushes to use for coloring the slices.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event which is raised before data binding.
  	 * Return false in order to cancel data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBinding: js.UndefOr[DataBindingEvent] = js.undefined
  /**
  	 * Event which is raised after data binding.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to chart widget.
  	 * Use ui.data to obtain reference to array actual data which is displayed by chart.
  	 * Use ui.dataSource to obtain reference to instance of $.ig.DataSource.
  	 */
  var dataBound: js.UndefOr[DataBoundEvent] = js.undefined
  /**
  	 * Gets sets a valid data source.
  	 * That can be instance of array or primitives, array of objects, instance of $.ig.DataSource, or any other data accepted by $.ig.DataSource.
  	 * Note: if it is set to string and "dataSourceType" option is not set, then $.ig.JSONPDataSource is used.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets sets data source type (such as "json", "xml", etc). Please refer to the documentation of $.ig.DataSource and its type property
  	 */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets sets url which is used for sending JSON on request for remote data.
  	 */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the formatter function for inner labels. Function should return string and it takes 3 parameters: 1st-value of item to format, 2nd-index of item within data, 3rd-reference to the funnel chart.
  	 */
  var formatInnerLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the formatter function for outer labels. Function should return string and it takes 3 parameters: 1st-value of item to format, 2nd-index of item within data, 3rd-reference to the funnel chart.
  	 */
  var formatOuterLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets how the heights of the funnel slices should be configured.
  	 *
  	 * Valid values:
  	 * "uniform" The slice heights should be uniform.
  	 * "weighted" The slice heights should be weighted by value.
  	 */
  var funnelSliceDisplay: js.UndefOr[String] = js.undefined
  /**
  	 * The height of the chart.
  	 */
  var height: js.UndefOr[Double] = js.undefined
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
  	 * Gets or sets the InnerLabel mapping property for the current series object.
  	 */
  var innerLabelMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets whether the inner labels are visible.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var innerLabelVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets if the funnel should be rendered inverted.
  	 */
  var isInverted: js.UndefOr[Boolean] = js.undefined
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
  var legend: js.UndefOr[js.Any] = js.undefined
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
  var legendItemBadgeTemplate: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets sets maximum number of displayed records in chart.
  	 */
  var maxRecCount: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets which side of the chart the outer labels should appear.
  	 *
  	 * Valid values:
  	 * "left" The labels will be displayed to the left of the chart.
  	 * "right" The labels will be displayed to the right of the chart.
  	 */
  var outerLabelAlignment: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the OuterLabel mapping property for the current series object.
  	 */
  var outerLabelMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the brush used for the outer labels.
  	 */
  var outerLabelTextColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the text style for outer labels
  	 */
  var outerLabelTextStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets whether the outer labels are visible.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var outerLabelVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the thickness of outline around slices.
  	 */
  var outlineThickness: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the palette of brushes to use for outlines on the slices.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.undefined
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
  	 * Gets or sets the style to use for selected slices.
  	 * That can be used to set stroke (outline color), fill (background color) and opacity.
  	 */
  var selectedSliceStyle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Event which is raised when a slice is clicked.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to igFunnelChart.
  	 * Use ui.index to obtain index of clicked slice.
  	 * Use ui.item to obtain reference to clicked slice item.
  	 * Use ui.selected to check if slice became selected.
  	 */
  var sliceClicked: js.UndefOr[SliceClickedEvent] = js.undefined
  /**
  	 * Gets or sets the brush used for the inner labels.
  	 */
  var textColor: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the text style for inner labels
  	 */
  var textStyle: js.UndefOr[String] = js.undefined
  /**
  	 * Gets sets template for tooltip associated with chart item.
  	 * Example: "Value: $(ValueMemberPathInDataSource)"
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets how long the animations should take to run.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the style to use for unselected slices.
  	 * That can be used to set stroke (outline color), fill (background color) and opacity.
  	 */
  var unselectedSliceStyle: js.UndefOr[js.Any] = js.undefined
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
  	 * Gets or sets whether to use a Bezier curve to define the funnel.
  	 */
  var useBezierCurve: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether to use the outer labels to identify the legend items.
  	 */
  var useOuterLabelsForLegend: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets whether to use the unselected style on unselected slices.
  	 */
  var useUnselectedStyle: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the value member path for the funnel chart.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * The width of the chart.
  	 */
  var width: js.UndefOr[Double] = js.undefined
}

object IgFunnelChart {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igFunnelChart
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowSliceSelection: js.UndefOr[Boolean] = js.undefined,
    bezierPoints: String = null,
    bottomEdgeWidth: Int | Double = null,
    brushes: js.Any = null,
    dataBinding: (/* event */ Event, /* ui */ DataBindingEventUIParam) => Unit = null,
    dataBound: (/* event */ Event, /* ui */ DataBoundEventUIParam) => Unit = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    formatInnerLabel: js.Any = null,
    formatOuterLabel: js.Any = null,
    funnelSliceDisplay: String = null,
    height: Int | Double = null,
    hideTooltip: (/* event */ Event, /* ui */ HideTooltipEventUIParam) => Unit = null,
    innerLabelMemberPath: String = null,
    innerLabelVisibility: String = null,
    isInverted: js.UndefOr[Boolean] = js.undefined,
    legend: js.Any = null,
    legendItemBadgeTemplate: js.Any = null,
    maxRecCount: Int | Double = null,
    outerLabelAlignment: String = null,
    outerLabelMemberPath: String = null,
    outerLabelTextColor: String = null,
    outerLabelTextStyle: String = null,
    outerLabelVisibility: String = null,
    outlineThickness: Int | Double = null,
    outlines: js.Any = null,
    pixelScalingRatio: Int | Double = null,
    responseDataKey: String = null,
    responseTotalRecCountKey: String = null,
    selectedSliceStyle: js.Any = null,
    sliceClicked: (/* event */ Event, /* ui */ SliceClickedEventUIParam) => Unit = null,
    textColor: String = null,
    textStyle: String = null,
    tooltipTemplate: String = null,
    transitionDuration: Int | Double = null,
    unselectedSliceStyle: js.Any = null,
    updateTooltip: (/* event */ Event, /* ui */ UpdateTooltipEventUIParam) => Unit = null,
    useBezierCurve: js.UndefOr[Boolean] = js.undefined,
    useOuterLabelsForLegend: js.UndefOr[Boolean] = js.undefined,
    useUnselectedStyle: js.UndefOr[Boolean] = js.undefined,
    valueMemberPath: String = null,
    width: Int | Double = null
  ): IgFunnelChart = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowSliceSelection)) __obj.updateDynamic("allowSliceSelection")(allowSliceSelection)
    if (bezierPoints != null) __obj.updateDynamic("bezierPoints")(bezierPoints)
    if (bottomEdgeWidth != null) __obj.updateDynamic("bottomEdgeWidth")(bottomEdgeWidth.asInstanceOf[js.Any])
    if (brushes != null) __obj.updateDynamic("brushes")(brushes)
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction2(dataBinding))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction2(dataBound))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (formatInnerLabel != null) __obj.updateDynamic("formatInnerLabel")(formatInnerLabel)
    if (formatOuterLabel != null) __obj.updateDynamic("formatOuterLabel")(formatOuterLabel)
    if (funnelSliceDisplay != null) __obj.updateDynamic("funnelSliceDisplay")(funnelSliceDisplay)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hideTooltip != null) __obj.updateDynamic("hideTooltip")(js.Any.fromFunction2(hideTooltip))
    if (innerLabelMemberPath != null) __obj.updateDynamic("innerLabelMemberPath")(innerLabelMemberPath)
    if (innerLabelVisibility != null) __obj.updateDynamic("innerLabelVisibility")(innerLabelVisibility)
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendItemBadgeTemplate != null) __obj.updateDynamic("legendItemBadgeTemplate")(legendItemBadgeTemplate)
    if (maxRecCount != null) __obj.updateDynamic("maxRecCount")(maxRecCount.asInstanceOf[js.Any])
    if (outerLabelAlignment != null) __obj.updateDynamic("outerLabelAlignment")(outerLabelAlignment)
    if (outerLabelMemberPath != null) __obj.updateDynamic("outerLabelMemberPath")(outerLabelMemberPath)
    if (outerLabelTextColor != null) __obj.updateDynamic("outerLabelTextColor")(outerLabelTextColor)
    if (outerLabelTextStyle != null) __obj.updateDynamic("outerLabelTextStyle")(outerLabelTextStyle)
    if (outerLabelVisibility != null) __obj.updateDynamic("outerLabelVisibility")(outerLabelVisibility)
    if (outlineThickness != null) __obj.updateDynamic("outlineThickness")(outlineThickness.asInstanceOf[js.Any])
    if (outlines != null) __obj.updateDynamic("outlines")(outlines)
    if (pixelScalingRatio != null) __obj.updateDynamic("pixelScalingRatio")(pixelScalingRatio.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey)
    if (responseTotalRecCountKey != null) __obj.updateDynamic("responseTotalRecCountKey")(responseTotalRecCountKey)
    if (selectedSliceStyle != null) __obj.updateDynamic("selectedSliceStyle")(selectedSliceStyle)
    if (sliceClicked != null) __obj.updateDynamic("sliceClicked")(js.Any.fromFunction2(sliceClicked))
    if (textColor != null) __obj.updateDynamic("textColor")(textColor)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (unselectedSliceStyle != null) __obj.updateDynamic("unselectedSliceStyle")(unselectedSliceStyle)
    if (updateTooltip != null) __obj.updateDynamic("updateTooltip")(js.Any.fromFunction2(updateTooltip))
    if (!js.isUndefined(useBezierCurve)) __obj.updateDynamic("useBezierCurve")(useBezierCurve)
    if (!js.isUndefined(useOuterLabelsForLegend)) __obj.updateDynamic("useOuterLabelsForLegend")(useOuterLabelsForLegend)
    if (!js.isUndefined(useUnselectedStyle)) __obj.updateDynamic("useUnselectedStyle")(useUnselectedStyle)
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgFunnelChart]
  }
}

