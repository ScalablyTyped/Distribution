package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgDataChartAxes
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Gets or sets the coercion methods to use when loading data from data sources.
    * Should be specified before setting any member paths, if being used. Setting it later
    * will not cause data to be reimported into the chart.
    */
  var coercionMethods: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the CrossingAxis property.
    */
  var crossingAxis: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the CrossingValue property.
    */
  var crossingValue: js.UndefOr[js.Any] = js.undefined
  /**
    * Can be any valid data source accepted by $.ig.DataSource, or an instance of an $.ig.DataSource itself
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
    * Explicitly set data source type (such as "json"). Please refer to the documentation of $.ig.DataSource and its type property.
    */
  var dataSourceType: js.UndefOr[String] = js.undefined
  /**
    * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
    */
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the DateTime mapping property for the CategoryDateTimeXAxis.
    */
  var dateTimeMemberPath: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the axis display type. Continuous display type divides the axis into even intervals, where labels will not necessarily be aligned with data points. Discrete display type will not use a constant interval, but will align each label with its data point.
    *
    * Valid values:
    * "continuous" Points occur at even intervals, even where data is not present at a given point.
    * "discrete" Points occur when data is present, possibly at uneven intervals.
    */
  var displayType: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the mininum desired characters to be displayed for horizontal axes when using advanced label heuristics. -1 will attempt to adjust the interval to precisely fit the horizontal labels.
    */
  var enhancedIntervalMinimumCharacters: js.UndefOr[Double] = js.undefined
  /**
    * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
    */
  var formatLabel: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets or sets the amount of space between adjacent categories for the current axis object.
    * The gap is silently clamped to the range [0, 1] when used.
    */
  var gap: js.UndefOr[Double] = js.undefined
  /**
    * Defines the percentage of the maximum radius extent to leave blank at the center of the chart. Should be
    * a value between 0.0 and 1.0.
    */
  var innerRadiusExtentScale: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the frequency of displayed labels.
    * The set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets whether the data assigned to the date time axis should be considered pre-sorted by date/time.
    */
  var isDataPreSorted: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the IsInverted property.
    */
  var isInverted: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the IsLogarithmic property.
    */
  var isLogarithmic: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets the label mapping property to use for axis labels.
    */
  var label: js.UndefOr[js.Any] = js.undefined
  /**
    * Specifies the angle that labels on the axis should be rotated
    */
  var labelAngle: js.UndefOr[Double] = js.undefined
  /**
    * The bottom margin to use for the labels.
    */
  var labelBottomMargin: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the extent of the area dedicated to the labels for this axis. If unspecified, this value is auto-calculated.
    */
  var labelExtent: js.UndefOr[Double] = js.undefined
  /**
    * the horizontal alignment to use for the labels. Only applicable to vertical axes.
    *
    * Valid values:
    * "left" left aligns the labels.
    * "center" center aligns the labels.
    * "right" right aligns the labels.
    */
  var labelHorizontalAlignment: js.UndefOr[String] = js.undefined
  /**
    * The left margin to use for the labels.
    */
  var labelLeftMargin: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the location to display the axis labels for this axis.
    *
    * Valid values:
    * "outsideTop" The labels should have an outside top position.
    * "outsideBottom" The labels should have an outside bottom position.
    * "outsideLeft" The labels should have an outside left position.
    * "outsideRight" The labels should have an outside right position.
    * "insideTop" The labels should have an inside top position.
    * "insideBottom" The labels should have an inside bottom position.
    * "insideLeft" The labels should have an inside left position.
    * "insideRight" The labels should have an inside right position.
    */
  var labelLocation: js.UndefOr[String] = js.undefined
  /**
    * The margin to use for the labels.
    */
  var labelMargin: js.UndefOr[Double] = js.undefined
  /**
    * The right margin to use for the labels.
    */
  var labelRightMargin: js.UndefOr[Double] = js.undefined
  /**
    * Overrides the color of the text used for the axis labels.
    */
  var labelTextColor: js.UndefOr[String] = js.undefined
  /**
    * Overrides the style of the text used for the axis labels.
    */
  var labelTextStyle: js.UndefOr[String] = js.undefined
  /**
    * The top margin to use for the labels.
    */
  var labelTopMargin: js.UndefOr[Double] = js.undefined
  /**
    * the vertical alignment to use for the labels. Only applicable to horizontal axes.
    *
    * Valid values:
    * "top" top aligns the labels.
    * "center" center aligns the labels.
    * "bottom" bottom aligns the labels.
    */
  var labelVerticalAlignment: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether the labels are visible.
    *
    * Valid values:
    * "visible" The labels should be visisble for this axis.
    * "collapsed" The labels should not be visible for this axis.
    */
  var labelVisibility: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the LogarithmBase property.
    */
  var logarithmBase: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the MajorStroke property.
    */
  var majorStroke: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the MajorStrokeThickness property.
    */
  var majorStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the axis MaximumValue.
    *
    *
    * Valid values:
    * "number" The maximum value can be set to be a number when the axis is of numeric type
    * "date" The maximum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
    */
  var maximumValue: js.UndefOr[Double | Date] = js.undefined
  /**
    * Gets or sets the axis MinimumValue.
    *
    *
    * Valid values:
    * "number" The minimum value can be set to be a number when the axis is of numeric type
    * "date" The minimum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
    */
  var minimumValue: js.UndefOr[Double | Date] = js.undefined
  /**
    * Gets or sets the MinorStroke property.
    */
  var minorStroke: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the MinorStrokeThickness property.
    */
  var minorStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * The unique identifier of the axis.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the amount of overlap between adjacent categories for the current axis object.
    * The overlap is silently clamped to the range [-1, 1] when used.
    */
  var overlap: js.UndefOr[Double] = js.undefined
  /**
    * Defines the percentage of the maximum radius extent to use as the maximum radius. Should be
    * a value between 0.0 and 1.0.
    */
  var radiusExtentScale: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the ReferenceValue property.
    */
  var referenceValue: js.UndefOr[Double] = js.undefined
  /**
    * Set to true in order to have an existing axis removed from the chart, by name
    */
  var remove: js.UndefOr[Boolean] = js.undefined
  /**
    * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
    */
  var responseDataKey: js.UndefOr[String] = js.undefined
  /**
    * Sets whether or not to show the first label on the axis.
    */
  var showFirstLabel: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates the angle in degress that the chart's 0th angle should be offset.
    */
  var startAngleOffset: js.UndefOr[Double] = js.undefined
  /**
    * Gets or sets the Strip property.
    */
  var strip: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the Stroke property.
    */
  var stroke: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets the StrokeThickness property.
    */
  var strokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * The length of the tickmarks to display for this axis.
    */
  var tickLength: js.UndefOr[Double] = js.undefined
  /**
    * The color to use for the tickmarks.
    */
  var tickStroke: js.UndefOr[js.Any] = js.undefined
  /**
    * The stroke thickness to use for the tickmarks.
    */
  var tickStrokeThickness: js.UndefOr[Double] = js.undefined
  /**
    * The title to display for the component.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The angle to use for the axis title.
    */
  var titleAngle: js.UndefOr[Double] = js.undefined
  /**
    * The bottom margin to use for the title.
    */
  var titleBottomMargin: js.UndefOr[Double] = js.undefined
  /**
    * the horizontal alignment to use for the title.
    *
    * Valid values:
    * "left" left aligns the title.
    * "center" center aligns the title.
    * "right" right aligns the title.
    */
  var titleHorizontalAlignment: js.UndefOr[String] = js.undefined
  /**
    * The left margin to use for the title.
    */
  var titleLeftMargin: js.UndefOr[Double] = js.undefined
  /**
    * The margin to display around the title of the axis.
    */
  var titleMargin: js.UndefOr[Double] = js.undefined
  /**
    * the position to use for the title.
    *
    * Valid values:
    * "auto" the title is positioned automatically.
    * "left" the title is positioned on the left of the labels, if applicable.
    * "right" the title is positioned on the right of the labels, if applicable.
    * "top" the title is positioned on the top of the labels, if applicable.
    * "bottom" the title is positioned on the bottom of the labels, if applicable.
    */
  var titlePosition: js.UndefOr[String] = js.undefined
  /**
    * The right margin to use for the title.
    */
  var titleRightMargin: js.UndefOr[Double] = js.undefined
  /**
    * The css font property to use for the title.
    */
  var titleTextStyle: js.UndefOr[String] = js.undefined
  /**
    * The top margin to use for the title.
    */
  var titleTopMargin: js.UndefOr[Double] = js.undefined
  /**
    * the vertical alignment to use for the title.
    *
    * Valid values:
    * "center" center aligns the title.
    */
  var titleVerticalAlignment: js.UndefOr[String] = js.undefined
  /**
    * Type of the axis.
    *
    * Valid values:
    * "numericX" Specify the axis as numeric X axis. Useful for displaying scatter, category and financial price series.
    * "numericY" Specify the axis as numeric Y axis.Useful for displaying scatter, category and financial price series.
    * "categoryX" Specify the axis as category X axis. Useful for displaying scatter, category and financial price series.
    * "categoryDateTimeX" Specify the axis as category datetime X axis. Useful for displaying category and financial price series with date based data.
    * "categoryY" Specify the axis as category Y axis. Useful for displaying scatter, category and financial price series.
    * "categoryAngle" Specify the axis as category angle axis. Useful for displaying polar and radial categories.
    * "numericAngle" Specify the axis as numeric angle axis. Useful for displaying polar and radial series.
    * "numericRadius" Specify the axis as numeric radius axis. Useful for displaying polar and radial series.
    * "time" Specify the axis as time X axis. Useful for displaying date based data with time breaks.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Gets or sets whether the cateogory axis should use clustering display mode even if no series are present that would force clustering mode.
    */
  var useClusteringMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets or sets whether to use more advanced heuristics when determining the initial number of labels to render, before resolving collisions, etc.
    */
  var useEnhancedIntervalManagement: js.UndefOr[Boolean] = js.undefined
}

object IgDataChartAxes {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    coercionMethods: js.Any = null,
    crossingAxis: String = null,
    crossingValue: js.Any = null,
    dataSource: js.Any = null,
    dataSourceType: String = null,
    dataSourceUrl: String = null,
    dateTimeMemberPath: String = null,
    displayType: String = null,
    enhancedIntervalMinimumCharacters: js.UndefOr[Double] = js.undefined,
    formatLabel: js.Any = null,
    gap: js.UndefOr[Double] = js.undefined,
    innerRadiusExtentScale: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    isDataPreSorted: js.UndefOr[Boolean] = js.undefined,
    isInverted: js.UndefOr[Boolean] = js.undefined,
    isLogarithmic: js.UndefOr[Boolean] = js.undefined,
    label: js.Any = null,
    labelAngle: js.UndefOr[Double] = js.undefined,
    labelBottomMargin: js.UndefOr[Double] = js.undefined,
    labelExtent: js.UndefOr[Double] = js.undefined,
    labelHorizontalAlignment: String = null,
    labelLeftMargin: js.UndefOr[Double] = js.undefined,
    labelLocation: String = null,
    labelMargin: js.UndefOr[Double] = js.undefined,
    labelRightMargin: js.UndefOr[Double] = js.undefined,
    labelTextColor: String = null,
    labelTextStyle: String = null,
    labelTopMargin: js.UndefOr[Double] = js.undefined,
    labelVerticalAlignment: String = null,
    labelVisibility: String = null,
    logarithmBase: js.UndefOr[Double] = js.undefined,
    majorStroke: String = null,
    majorStrokeThickness: js.UndefOr[Double] = js.undefined,
    maximumValue: Double | Date = null,
    minimumValue: Double | Date = null,
    minorStroke: String = null,
    minorStrokeThickness: js.UndefOr[Double] = js.undefined,
    name: String = null,
    overlap: js.UndefOr[Double] = js.undefined,
    radiusExtentScale: js.UndefOr[Double] = js.undefined,
    referenceValue: js.UndefOr[Double] = js.undefined,
    remove: js.UndefOr[Boolean] = js.undefined,
    responseDataKey: String = null,
    showFirstLabel: js.UndefOr[Boolean] = js.undefined,
    startAngleOffset: js.UndefOr[Double] = js.undefined,
    strip: String = null,
    stroke: String = null,
    strokeThickness: js.UndefOr[Double] = js.undefined,
    tickLength: js.UndefOr[Double] = js.undefined,
    tickStroke: js.Any = null,
    tickStrokeThickness: js.UndefOr[Double] = js.undefined,
    title: String = null,
    titleAngle: js.UndefOr[Double] = js.undefined,
    titleBottomMargin: js.UndefOr[Double] = js.undefined,
    titleHorizontalAlignment: String = null,
    titleLeftMargin: js.UndefOr[Double] = js.undefined,
    titleMargin: js.UndefOr[Double] = js.undefined,
    titlePosition: String = null,
    titleRightMargin: js.UndefOr[Double] = js.undefined,
    titleTextStyle: String = null,
    titleTopMargin: js.UndefOr[Double] = js.undefined,
    titleVerticalAlignment: String = null,
    `type`: String = null,
    useClusteringMode: js.UndefOr[Boolean] = js.undefined,
    useEnhancedIntervalManagement: js.UndefOr[Boolean] = js.undefined
  ): IgDataChartAxes = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (coercionMethods != null) __obj.updateDynamic("coercionMethods")(coercionMethods.asInstanceOf[js.Any])
    if (crossingAxis != null) __obj.updateDynamic("crossingAxis")(crossingAxis.asInstanceOf[js.Any])
    if (crossingValue != null) __obj.updateDynamic("crossingValue")(crossingValue.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataSourceType != null) __obj.updateDynamic("dataSourceType")(dataSourceType.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (dateTimeMemberPath != null) __obj.updateDynamic("dateTimeMemberPath")(dateTimeMemberPath.asInstanceOf[js.Any])
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    if (!js.isUndefined(enhancedIntervalMinimumCharacters)) __obj.updateDynamic("enhancedIntervalMinimumCharacters")(enhancedIntervalMinimumCharacters.get.asInstanceOf[js.Any])
    if (formatLabel != null) __obj.updateDynamic("formatLabel")(formatLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(gap)) __obj.updateDynamic("gap")(gap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRadiusExtentScale)) __obj.updateDynamic("innerRadiusExtentScale")(innerRadiusExtentScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDataPreSorted)) __obj.updateDynamic("isDataPreSorted")(isDataPreSorted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isLogarithmic)) __obj.updateDynamic("isLogarithmic")(isLogarithmic.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelAngle)) __obj.updateDynamic("labelAngle")(labelAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelBottomMargin)) __obj.updateDynamic("labelBottomMargin")(labelBottomMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelExtent)) __obj.updateDynamic("labelExtent")(labelExtent.get.asInstanceOf[js.Any])
    if (labelHorizontalAlignment != null) __obj.updateDynamic("labelHorizontalAlignment")(labelHorizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(labelLeftMargin)) __obj.updateDynamic("labelLeftMargin")(labelLeftMargin.get.asInstanceOf[js.Any])
    if (labelLocation != null) __obj.updateDynamic("labelLocation")(labelLocation.asInstanceOf[js.Any])
    if (!js.isUndefined(labelMargin)) __obj.updateDynamic("labelMargin")(labelMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(labelRightMargin)) __obj.updateDynamic("labelRightMargin")(labelRightMargin.get.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (labelTextStyle != null) __obj.updateDynamic("labelTextStyle")(labelTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(labelTopMargin)) __obj.updateDynamic("labelTopMargin")(labelTopMargin.get.asInstanceOf[js.Any])
    if (labelVerticalAlignment != null) __obj.updateDynamic("labelVerticalAlignment")(labelVerticalAlignment.asInstanceOf[js.Any])
    if (labelVisibility != null) __obj.updateDynamic("labelVisibility")(labelVisibility.asInstanceOf[js.Any])
    if (!js.isUndefined(logarithmBase)) __obj.updateDynamic("logarithmBase")(logarithmBase.get.asInstanceOf[js.Any])
    if (majorStroke != null) __obj.updateDynamic("majorStroke")(majorStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(majorStrokeThickness)) __obj.updateDynamic("majorStrokeThickness")(majorStrokeThickness.get.asInstanceOf[js.Any])
    if (maximumValue != null) __obj.updateDynamic("maximumValue")(maximumValue.asInstanceOf[js.Any])
    if (minimumValue != null) __obj.updateDynamic("minimumValue")(minimumValue.asInstanceOf[js.Any])
    if (minorStroke != null) __obj.updateDynamic("minorStroke")(minorStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(minorStrokeThickness)) __obj.updateDynamic("minorStrokeThickness")(minorStrokeThickness.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(overlap)) __obj.updateDynamic("overlap")(overlap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(radiusExtentScale)) __obj.updateDynamic("radiusExtentScale")(radiusExtentScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(referenceValue)) __obj.updateDynamic("referenceValue")(referenceValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove.get.asInstanceOf[js.Any])
    if (responseDataKey != null) __obj.updateDynamic("responseDataKey")(responseDataKey.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLabel)) __obj.updateDynamic("showFirstLabel")(showFirstLabel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngleOffset)) __obj.updateDynamic("startAngleOffset")(startAngleOffset.get.asInstanceOf[js.Any])
    if (strip != null) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeThickness)) __obj.updateDynamic("strokeThickness")(strokeThickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tickLength)) __obj.updateDynamic("tickLength")(tickLength.get.asInstanceOf[js.Any])
    if (tickStroke != null) __obj.updateDynamic("tickStroke")(tickStroke.asInstanceOf[js.Any])
    if (!js.isUndefined(tickStrokeThickness)) __obj.updateDynamic("tickStrokeThickness")(tickStrokeThickness.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleAngle)) __obj.updateDynamic("titleAngle")(titleAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleBottomMargin)) __obj.updateDynamic("titleBottomMargin")(titleBottomMargin.get.asInstanceOf[js.Any])
    if (titleHorizontalAlignment != null) __obj.updateDynamic("titleHorizontalAlignment")(titleHorizontalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(titleLeftMargin)) __obj.updateDynamic("titleLeftMargin")(titleLeftMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(titleMargin)) __obj.updateDynamic("titleMargin")(titleMargin.get.asInstanceOf[js.Any])
    if (titlePosition != null) __obj.updateDynamic("titlePosition")(titlePosition.asInstanceOf[js.Any])
    if (!js.isUndefined(titleRightMargin)) __obj.updateDynamic("titleRightMargin")(titleRightMargin.get.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(titleTopMargin)) __obj.updateDynamic("titleTopMargin")(titleTopMargin.get.asInstanceOf[js.Any])
    if (titleVerticalAlignment != null) __obj.updateDynamic("titleVerticalAlignment")(titleVerticalAlignment.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useClusteringMode)) __obj.updateDynamic("useClusteringMode")(useClusteringMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useEnhancedIntervalManagement)) __obj.updateDynamic("useEnhancedIntervalManagement")(useEnhancedIntervalManagement.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgDataChartAxes]
  }
}

