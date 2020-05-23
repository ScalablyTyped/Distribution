package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
    * datetime axes when describing them to screen reader users.
    *
    * Defaults to the same format as in tooltip.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
    * the date/time format used with points on datetime axes when describing
    * them to screen reader users. Receives one argument, `point`, referring to
    * the point to describe. Should return a date format string compatible with
    * dateFormat.
    */
  var dateFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to use
    * instead of the default for point descriptions.
    *
    * Receives one argument, `point`, referring to the point to describe.
    * Should return a string with the description of the point for a screen
    * reader user. If `false` is returned, the default formatter will be used
    * for that point.
    *
    * Note: Prefer using accessibility.point.valueDescriptionFormat instead if
    * possible, as default functionality such as describing annotations will be
    * preserved.
    */
  var descriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
    * in the point descriptions. Uses tooltip.valueDecimals if not defined.
    */
  var valueDecimals: js.UndefOr[Double] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
    * values of data points to assistive technology - including screen readers.
    * The point context is available as `{point}`.
    *
    * Additionally, the series name, annotation info, and description added in
    * `point.accessibility.description` is added by default if relevant. To
    * override this, use the accessibility.point.descriptionFormatter option.
    */
  var valueDescriptionFormat: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
    * the point descriptions. Uses tooltip.valuePrefix if not defined.
    */
  var valuePrefix: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
    * the point descriptions. Uses tooltip.valueSuffix if not defined.
    */
  var valueSuffix: js.UndefOr[String] = js.undefined
}

object AccessibilityPointOptions {
  @scala.inline
  def apply(
    dateFormat: String = null,
    dateFormatter: Point => String = null,
    descriptionFormatter: Point => String = null,
    valueDecimals: js.UndefOr[Double] = js.undefined,
    valueDescriptionFormat: String = null,
    valuePrefix: String = null,
    valueSuffix: String = null
  ): AccessibilityPointOptions = {
    val __obj = js.Dynamic.literal()
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateFormatter != null) __obj.updateDynamic("dateFormatter")(js.Any.fromFunction1(dateFormatter))
    if (descriptionFormatter != null) __obj.updateDynamic("descriptionFormatter")(js.Any.fromFunction1(descriptionFormatter))
    if (!js.isUndefined(valueDecimals)) __obj.updateDynamic("valueDecimals")(valueDecimals.get.asInstanceOf[js.Any])
    if (valueDescriptionFormat != null) __obj.updateDynamic("valueDescriptionFormat")(valueDescriptionFormat.asInstanceOf[js.Any])
    if (valuePrefix != null) __obj.updateDynamic("valuePrefix")(valuePrefix.asInstanceOf[js.Any])
    if (valueSuffix != null) __obj.updateDynamic("valueSuffix")(valueSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityPointOptions]
  }
}

