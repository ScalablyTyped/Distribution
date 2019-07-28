package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add a shortcut
    * button in the screen reader information region to show the data table.
    */
  var addTableShortcut: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for announcing new data
    * to screen reader users. Useful for dynamic data applications and
    * drilldown.
    *
    * Keep in mind that frequent announcements will not be useful to users, as
    * they won't have time to explore the new data. For these applications,
    * consider making snapshots of the data accessible, and do the
    * announcements in batches.
    */
  var announceNewData: js.UndefOr[AccessibilityAnnounceNewDataOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use to describe
    * range of datetime axes.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var axisRangeDateFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A hook for adding custom
    * components to the accessibility module. Should be an object mapping
    * component names to instances of classes inheriting from the
    * Highcharts.AccessibilityComponent base class. Remember to add the
    * component to the keyboardNavigation.order for the keyboard navigation to
    * be usable.
    */
  var customComponents: js.UndefOr[js.Object] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether or not to add series
    * descriptions to charts with a single series.
    */
  var describeSingleSeries: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart.
    *
    * If the Accessibility module is loaded, this is included by default as a
    * long description of the chart in the hidden screen reader information
    * region.
    *
    * Note: It is considered a best practice to make the description of the
    * chart visible to all users, so consider if this can be placed in text
    * around the chart instead.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility
    * functionality for the chart.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for keyboard navigation.
    */
  var keyboardNavigation: js.UndefOr[AccessibilityKeyboardNavigationOptions] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Amount of landmarks/regions to
    * create for screen reader users. More landmarks can make navigation with
    * screen readers easier, but can be distracting if there are lots of charts
    * on the page. Three modes are available:
    *
    * - `all`: Adds regions for all series, legend, menu, information region.
    *
    * - `one`: Adds a single landmark per chart.
    *
    * - `disabled`: No landmarks are added.
    */
  var landmarkVerbosity: js.UndefOr[OptionsLandmarkVerbosityValue] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Function to run upon clicking
    * the "View as Data Table" link in the screen reader region.
    *
    * By default Highcharts will insert and set focus to a data table
    * representation of the chart.
    */
  var onTableAnchorClick: js.UndefOr[ScreenReaderClickCallbackFunction] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
    * datetime axes when describing them to screen reader users.
    *
    * Defaults to the same format as in tooltip.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var pointDateFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
    * the date/time format used with points on datetime axes when describing
    * them to screen reader users. Receives one argument, `point`, referring to
    * the point to describe. Should return a date format string compatible with
    * dateFormat.
    */
  var pointDateFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for point descriptions. Receives one argument,
    * `point`, referring to the point to describe. Should return a string with
    * the description of the point for a screen reader user. If `false` is
    * returned, the default formatter will be used for that point.
    */
  var pointDescriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When a series contains more
    * points than this, we no longer expose information about individual points
    * to screen readers.
    *
    * Set to `false` to disable.
    */
  var pointDescriptionThreshold: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
    * in the point descriptions. Uses tooltip.valueDecimals if not defined.
    */
  var pointValueDecimals: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
    * the point descriptions. Uses tooltip.valuePrefix if not defined.
    */
  var pointValuePrefix: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
    * the point descriptions. Uses tooltip.valueSuffix if not defined.
    */
  var pointValueSuffix: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A formatter function to create
    * the HTML contents of the hidden screen reader information region.
    * Receives one argument, `chart`, referring to the chart object. Should
    * return a string with the HTML content of the region. By default this
    * returns an automatic description of the chart.
    *
    * The button to view the chart as a data table will be added automatically
    * after the custom HTML content if enabled.
    */
  var screenReaderSectionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Chart]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for series descriptions. Receives one argument,
    * `series`, referring to the series to describe. Should return a string
    * with the description of the series for a screen reader user. If `false`
    * is returned, the default formatter will be used for that series.
    */
  var seriesDescriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Series]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A text description of the chart
    * type.
    *
    * If the Accessibility module is loaded, this will be included in the
    * description of the chart in the screen reader information region.
    *
    * Highcharts will by default attempt to guess the chart type, but for more
    * complex charts it is recommended to specify this property for clarity.
    */
  var typeDescription: js.UndefOr[String] = js.undefined
}

object AccessibilityOptions {
  @scala.inline
  def apply(
    addTableShortcut: js.UndefOr[Boolean] = js.undefined,
    announceNewData: AccessibilityAnnounceNewDataOptions = null,
    axisRangeDateFormat: String = null,
    customComponents: js.Object = null,
    describeSingleSeries: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    keyboardNavigation: AccessibilityKeyboardNavigationOptions = null,
    landmarkVerbosity: OptionsLandmarkVerbosityValue = null,
    onTableAnchorClick: ScreenReaderClickCallbackFunction = null,
    pointDateFormat: String = null,
    pointDateFormatter: ScreenReaderFormatterCallbackFunction[Point] = null,
    pointDescriptionFormatter: ScreenReaderFormatterCallbackFunction[Point] = null,
    pointDescriptionThreshold: Boolean | Double = null,
    pointValueDecimals: String = null,
    pointValuePrefix: String = null,
    pointValueSuffix: String = null,
    screenReaderSectionFormatter: ScreenReaderFormatterCallbackFunction[Chart] = null,
    seriesDescriptionFormatter: ScreenReaderFormatterCallbackFunction[Series] = null,
    typeDescription: String = null
  ): AccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addTableShortcut)) __obj.updateDynamic("addTableShortcut")(addTableShortcut)
    if (announceNewData != null) __obj.updateDynamic("announceNewData")(announceNewData)
    if (axisRangeDateFormat != null) __obj.updateDynamic("axisRangeDateFormat")(axisRangeDateFormat)
    if (customComponents != null) __obj.updateDynamic("customComponents")(customComponents)
    if (!js.isUndefined(describeSingleSeries)) __obj.updateDynamic("describeSingleSeries")(describeSingleSeries)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation)
    if (landmarkVerbosity != null) __obj.updateDynamic("landmarkVerbosity")(landmarkVerbosity)
    if (onTableAnchorClick != null) __obj.updateDynamic("onTableAnchorClick")(onTableAnchorClick)
    if (pointDateFormat != null) __obj.updateDynamic("pointDateFormat")(pointDateFormat)
    if (pointDateFormatter != null) __obj.updateDynamic("pointDateFormatter")(pointDateFormatter)
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter)
    if (pointDescriptionThreshold != null) __obj.updateDynamic("pointDescriptionThreshold")(pointDescriptionThreshold.asInstanceOf[js.Any])
    if (pointValueDecimals != null) __obj.updateDynamic("pointValueDecimals")(pointValueDecimals)
    if (pointValuePrefix != null) __obj.updateDynamic("pointValuePrefix")(pointValuePrefix)
    if (pointValueSuffix != null) __obj.updateDynamic("pointValueSuffix")(pointValueSuffix)
    if (screenReaderSectionFormatter != null) __obj.updateDynamic("screenReaderSectionFormatter")(screenReaderSectionFormatter)
    if (seriesDescriptionFormatter != null) __obj.updateDynamic("seriesDescriptionFormatter")(seriesDescriptionFormatter)
    if (typeDescription != null) __obj.updateDynamic("typeDescription")(typeDescription)
    __obj.asInstanceOf[AccessibilityOptions]
  }
}

