package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDoughnutChartSeries
  extends /**
	 * Option for IgDoughnutChartSeries
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Gets or sets the palette of brushes to use for coloring the slices.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var brushes: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
  	 */
  var formatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart's legend.
  	 */
  var formatLegendLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets whether all surface interactions with the plot area should be disabled.
  	 */
  var isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the data source for the chart.
  	 */
  var itemsSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the pixel amount by which the labels are offset from the edge of the slices.
  	 */
  var labelExtent: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the property name that contains the labels.
  	 */
  var labelMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the position of chart labels.
  	 *
  	 * Valid values:
  	 * "none" No labels will be displayed.
  	 * "center" Labels will be displayed in the center.
  	 * "insideEnd" Labels will be displayed inside and by the edge of the container.
  	 * "outsideEnd" Labels will be displayed outside the container.
  	 * "bestFit" Labels will automatically decide their location.
  	 */
  var labelsPosition: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the margin between a label and its leader line. The default is 6 pixels.
  	 */
  var leaderLineMargin: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the style for the leader lines.
  	 */
  var leaderLineStyle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets what type of leader lines will be used for the outside end labels.
  	 *
  	 * Valid values:
  	 * "straight" A straight line is drawn between the slice and its label.
  	 * "arc" A curved line is drawn between the slice and its label. The line follows makes a natural turn from the slice to the label.
  	 * "spline" A curved line is drawn between the slice and its label. The line starts radially from the slice and then turns to the label.
  	 */
  var leaderLineType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets whether the leader lines are visible.
  	 *
  	 * Valid values:
  	 * "visible" Display the element.
  	 * "collapsed" Do not display the element.
  	 */
  var leaderLineVisibility: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the legend used for the current chart.
  	 */
  var legend: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the property name that contains the legend labels.
  	 */
  var legendLabelMemberPath: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the label of the Others slice.
  	 */
  var othersCategoryText: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the threshold value that determines if slices are grouped into the Others slice.
  	 */
  var othersCategoryThreshold: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets whether to use numeric or percent-based threshold value.
  	 *
  	 * Valid values:
  	 * "number" Data value is compared directly to the value of OthersCategoryThreshold.
  	 * "percent" Data value is compared to OthersCategoryThreshold as a percentage of the total.
  	 */
  var othersCategoryType: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the palette of brushes to use for outlines on the slices.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var outlines: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the scaling factor of the chart's radius. Value between 0 and 1.
  	 */
  var radiusFactor: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets or sets the style used when a slice is selected.
  	 */
  var selectedStyle: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Whether the series should render a tooltip.
  	 */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets or sets the starting angle of the chart.
  	 * The default zero value is equivalent to 3 o'clock.
  	 */
  var startAngle: js.UndefOr[Double] = js.undefined
  /**
  	 * The name of template or the template itself that chart tooltip will use to render.
  	 */
  var tooltipTemplate: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or sets the current series type.
  	 *
  	 * Valid values:
  	 * "flat" Series has flat 1-dimensional data.
  	 */
  var `type`: js.UndefOr[String] = js.undefined
  /**
  	 * Gets or Sets the property name that contains the values.
  	 */
  var valueMemberPath: js.UndefOr[String] = js.undefined
}

object IgDoughnutChartSeries {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgDoughnutChartSeries
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    brushes: js.Any = null,
    formatLabel: js.Any = null,
    formatLegendLabel: js.Any = null,
    isSurfaceInteractionDisabled: js.UndefOr[Boolean] = js.undefined,
    itemsSource: js.Any = null,
    labelExtent: Int | Double = null,
    labelMemberPath: String = null,
    labelsPosition: String = null,
    leaderLineMargin: Int | Double = null,
    leaderLineStyle: js.Any = null,
    leaderLineType: String = null,
    leaderLineVisibility: String = null,
    legend: js.Any = null,
    legendLabelMemberPath: String = null,
    othersCategoryText: String = null,
    othersCategoryThreshold: Int | Double = null,
    othersCategoryType: String = null,
    outlines: js.Any = null,
    radiusFactor: Int | Double = null,
    selectedStyle: js.Any = null,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    tooltipTemplate: String = null,
    `type`: String = null,
    valueMemberPath: String = null
  ): IgDoughnutChartSeries = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (brushes != null) __obj.updateDynamic("brushes")(brushes)
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel)
    if (formatLegendLabel != null) __obj.updateDynamic("formatLegendLabel")(formatLegendLabel)
    if (!js.isUndefined(isSurfaceInteractionDisabled)) __obj.updateDynamic("isSurfaceInteractionDisabled")(isSurfaceInteractionDisabled)
    if (itemsSource != null) __obj.updateDynamic("itemsSource")(itemsSource)
    if (labelExtent != null) __obj.updateDynamic("labelExtent")(labelExtent.asInstanceOf[js.Any])
    if (labelMemberPath != null) __obj.updateDynamic("labelMemberPath")(labelMemberPath)
    if (labelsPosition != null) __obj.updateDynamic("labelsPosition")(labelsPosition)
    if (leaderLineMargin != null) __obj.updateDynamic("leaderLineMargin")(leaderLineMargin.asInstanceOf[js.Any])
    if (leaderLineStyle != null) __obj.updateDynamic("leaderLineStyle")(leaderLineStyle)
    if (leaderLineType != null) __obj.updateDynamic("leaderLineType")(leaderLineType)
    if (leaderLineVisibility != null) __obj.updateDynamic("leaderLineVisibility")(leaderLineVisibility)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (legendLabelMemberPath != null) __obj.updateDynamic("legendLabelMemberPath")(legendLabelMemberPath)
    if (othersCategoryText != null) __obj.updateDynamic("othersCategoryText")(othersCategoryText)
    if (othersCategoryThreshold != null) __obj.updateDynamic("othersCategoryThreshold")(othersCategoryThreshold.asInstanceOf[js.Any])
    if (othersCategoryType != null) __obj.updateDynamic("othersCategoryType")(othersCategoryType)
    if (outlines != null) __obj.updateDynamic("outlines")(outlines)
    if (radiusFactor != null) __obj.updateDynamic("radiusFactor")(radiusFactor.asInstanceOf[js.Any])
    if (selectedStyle != null) __obj.updateDynamic("selectedStyle")(selectedStyle)
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (valueMemberPath != null) __obj.updateDynamic("valueMemberPath")(valueMemberPath)
    __obj.asInstanceOf[IgDoughnutChartSeries]
  }
}

