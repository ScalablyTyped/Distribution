package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgDataChartAxes
  extends /**
	 * Option for IgDataChartAxes
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Gets or sets the coercion methods to use when loading data from data sources.
  	 * Should be specified before setting any member paths, if being used. Setting it later
  	 * will not cause data to be reimported into the chart.
  	 */
  var coercionMethods: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the CrossingAxis property.
  	 */
  var crossingAxis: js.UndefOr[java.lang.String] = js.undefined
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
  var dataSourceType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies a remote URL accepted by $.ig.DataSource in order to request data from it
  	 */
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the DateTime mapping property for the CategoryDateTimeXAxis.
  	 */
  var dateTimeMemberPath: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the axis display type. Continuous display type divides the axis into even intervals, where labels will not necessarily be aligned with data points. Discrete display type will not use a constant interval, but will align each label with its data point.
  	 *
  	 * Valid values:
  	 * "continuous" Points occur at even intervals, even where data is not present at a given point.
  	 * "discrete" Points occur when data is present, possibly at uneven intervals.
  	 */
  var displayType: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the mininum desired characters to be displayed for horizontal axes when using advanced label heuristics. -1 will attempt to adjust the interval to precisely fit the horizontal labels.
  	 */
  var enhancedIntervalMinimumCharacters: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Sets or gets a function which takes an object that produces a formatted label for displaying in the chart.
  	 */
  var formatLabel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets or sets the amount of space between adjacent categories for the current axis object.
  	 * The gap is silently clamped to the range [0, 1] when used.
  	 */
  var gap: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Defines the percentage of the maximum radius extent to leave blank at the center of the chart. Should be
  	 * a value between 0.0 and 1.0.
  	 */
  var innerRadiusExtentScale: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the frequency of displayed labels.
  	 * The set value is a factor that determines which labels will be hidden. For example, an interval of 2 will display every other label.
  	 */
  var interval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets whether the data assigned to the date time axis should be considered pre-sorted by date/time.
  	 */
  var isDataPreSorted: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the IsInverted property.
  	 */
  var isInverted: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the IsLogarithmic property.
  	 */
  var isLogarithmic: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets the label mapping property to use for axis labels.
  	 */
  var label: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Specifies the angle that labels on the axis should be rotated
  	 */
  var labelAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The bottom margin to use for the labels.
  	 */
  var labelBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Specifies the extent of the area dedicated to the labels for this axis. If unspecified, this value is auto-calculated.
  	 */
  var labelExtent: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * the horizontal alignment to use for the labels. Only applicable to vertical axes.
  	 *
  	 * Valid values:
  	 * "left" left aligns the labels.
  	 * "center" center aligns the labels.
  	 * "right" right aligns the labels.
  	 */
  var labelHorizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The left margin to use for the labels.
  	 */
  var labelLeftMargin: js.UndefOr[scala.Double] = js.undefined
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
  var labelLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The margin to use for the labels.
  	 */
  var labelMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The right margin to use for the labels.
  	 */
  var labelRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Overrides the color of the text used for the axis labels.
  	 */
  var labelTextColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Overrides the style of the text used for the axis labels.
  	 */
  var labelTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The top margin to use for the labels.
  	 */
  var labelTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * the vertical alignment to use for the labels. Only applicable to horizontal axes.
  	 *
  	 * Valid values:
  	 * "top" top aligns the labels.
  	 * "center" center aligns the labels.
  	 * "bottom" bottom aligns the labels.
  	 */
  var labelVerticalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies whether the labels are visible.
  	 *
  	 * Valid values:
  	 * "visible" The labels should be visisble for this axis.
  	 * "collapsed" The labels should not be visible for this axis.
  	 */
  var labelVisibility: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the LogarithmBase property.
  	 */
  var logarithmBase: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the MajorStroke property.
  	 */
  var majorStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the MajorStrokeThickness property.
  	 */
  var majorStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the axis MaximumValue.
  	 *
  	 *
  	 * Valid values:
  	 * "number" The maximum value can be set to be a number when the axis is of numeric type
  	 * "date" The maximum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
  	 */
  var maximumValue: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  /**
  	 * Gets or sets the axis MinimumValue.
  	 *
  	 *
  	 * Valid values:
  	 * "number" The minimum value can be set to be a number when the axis is of numeric type
  	 * "date" The minimum value can be set to be a date object when [type](ui.igDataChart#options:axes.type) option is set to "categoryDateTimeX"
  	 */
  var minimumValue: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  /**
  	 * Gets or sets the MinorStroke property.
  	 */
  var minorStroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the MinorStrokeThickness property.
  	 */
  var minorStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The unique identifier of the axis.
  	 */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the amount of overlap between adjacent categories for the current axis object.
  	 * The overlap is silently clamped to the range [-1, 1] when used.
  	 */
  var overlap: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Defines the percentage of the maximum radius extent to use as the maximum radius. Should be
  	 * a value between 0.0 and 1.0.
  	 */
  var radiusExtentScale: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the ReferenceValue property.
  	 */
  var referenceValue: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Set to true in order to have an existing axis removed from the chart, by name
  	 */
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * See $.ig.DataSource. Specifies the name of the property in which data records are held if the response is wrapped.
  	 */
  var responseDataKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets whether or not to show the first label on the axis.
  	 */
  var showFirstLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Indicates the angle in degress that the chart's 0th angle should be offset.
  	 */
  var startAngleOffset: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets or sets the Strip property.
  	 */
  var strip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the Stroke property.
  	 */
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets the StrokeThickness property.
  	 */
  var strokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The length of the tickmarks to display for this axis.
  	 */
  var tickLength: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The color to use for the tickmarks.
  	 */
  var tickStroke: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The stroke thickness to use for the tickmarks.
  	 */
  var tickStrokeThickness: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The title to display for the component.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The angle to use for the axis title.
  	 */
  var titleAngle: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The bottom margin to use for the title.
  	 */
  var titleBottomMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * the horizontal alignment to use for the title.
  	 *
  	 * Valid values:
  	 * "left" left aligns the title.
  	 * "center" center aligns the title.
  	 * "right" right aligns the title.
  	 */
  var titleHorizontalAlignment: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The left margin to use for the title.
  	 */
  var titleLeftMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The margin to display around the title of the axis.
  	 */
  var titleMargin: js.UndefOr[scala.Double] = js.undefined
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
  var titlePosition: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The right margin to use for the title.
  	 */
  var titleRightMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The css font property to use for the title.
  	 */
  var titleTextStyle: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The top margin to use for the title.
  	 */
  var titleTopMargin: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * the vertical alignment to use for the title.
  	 *
  	 * Valid values:
  	 * "center" center aligns the title.
  	 */
  var titleVerticalAlignment: js.UndefOr[java.lang.String] = js.undefined
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
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets or sets whether the cateogory axis should use clustering display mode even if no series are present that would force clustering mode.
  	 */
  var useClusteringMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets or sets whether to use more advanced heuristics when determining the initial number of labels to render, before resolving collisions, etc.
  	 */
  var useEnhancedIntervalManagement: js.UndefOr[scala.Boolean] = js.undefined
}

