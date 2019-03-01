package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for configuring accessibility for the chart. Requires the accessibility module to be loaded.
  * For a description of the module and information on its features, see Highcharts Accessibility.
  */
trait AccessibilityOptions extends js.Object {
  /**
    * Whether or not to add series descriptions to charts with a single series. Defaults to false.
    * @since 5.0.0
    */
  var describeSingleSeries: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enable accessibility features for the chart.
    * @since 5.0.0
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Options for keyboard navigation.
    * @since 5.0.0
    */
  var keyboardNavigation: js.UndefOr[KeyboardNavigationOptions] = js.undefined
  /**
    * Function to run upon clicking the "View as Data Table" link in the screen reader region.
    * By default Highcharts will insert and set focus to a data table representation of the chart.
    * @since 5.0.0
    */
  var onTableAnchorClick: js.UndefOr[js.Function] = js.undefined
  /**
    * Date format to use for points on datetime axes when describing them to screen reader users.
    * Defaults to the same format as in tooltip.
    * For an overview of the replacement codes, see dateFormat.
    * @since 5.0.0
    */
  var pointDateFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Formatter function to determine the date/time format used with points on datetime axes when describing them
    * to screen reader users. Receives one argument, point, referring to the point to describe.
    * Should return a date format string compatible with dateFormat.
    * @since 5.0.0
    */
  var pointDateFormatter: js.UndefOr[js.Function] = js.undefined
  /**
    * Formatter function to use instead of the default for point descriptions. Receives one argument, point, referring to the point to describe.
    * Should return a String with the description of the point for a screen reader user.
    * @since 5.0.0
    */
  var pointDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
  /**
    * When a series contains more points than this, we no longer expose information about individual points to screen readers.
    * Set to false to disable.
    * @since 5.0.0
    * @default 30
    */
  var pointDescriptionThreshold: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * A formatter function to create the HTML contents of the hidden screen reader information region. Receives one argument, chart, referring to the chart object.
    * Should return a String with the HTML content of the region.
    * @since 5.0.0
    * @default undefined
    */
  var screenReaderSectionFormatter: js.UndefOr[js.Function] = js.undefined
  /**
    * Formatter function to use instead of the default for series descriptions. Receives one argument, series, referring to the series to describe.
    * Should return a String with the description of the series for a screen reader user.
    * @since 5.0.0
    */
  var seriesDescriptionFormatter: js.UndefOr[js.Function] = js.undefined
}

object AccessibilityOptions {
  @scala.inline
  def apply(
    describeSingleSeries: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    keyboardNavigation: KeyboardNavigationOptions = null,
    onTableAnchorClick: js.Function = null,
    pointDateFormat: java.lang.String = null,
    pointDateFormatter: js.Function = null,
    pointDescriptionFormatter: js.Function = null,
    pointDescriptionThreshold: scala.Double | scala.Boolean = null,
    screenReaderSectionFormatter: js.Function = null,
    seriesDescriptionFormatter: js.Function = null
  ): AccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(describeSingleSeries)) __obj.updateDynamic("describeSingleSeries")(describeSingleSeries)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation)
    if (onTableAnchorClick != null) __obj.updateDynamic("onTableAnchorClick")(onTableAnchorClick)
    if (pointDateFormat != null) __obj.updateDynamic("pointDateFormat")(pointDateFormat)
    if (pointDateFormatter != null) __obj.updateDynamic("pointDateFormatter")(pointDateFormatter)
    if (pointDescriptionFormatter != null) __obj.updateDynamic("pointDescriptionFormatter")(pointDescriptionFormatter)
    if (pointDescriptionThreshold != null) __obj.updateDynamic("pointDescriptionThreshold")(pointDescriptionThreshold.asInstanceOf[js.Any])
    if (screenReaderSectionFormatter != null) __obj.updateDynamic("screenReaderSectionFormatter")(screenReaderSectionFormatter)
    if (seriesDescriptionFormatter != null) __obj.updateDynamic("seriesDescriptionFormatter")(seriesDescriptionFormatter)
    __obj.asInstanceOf[AccessibilityOptions]
  }
}

