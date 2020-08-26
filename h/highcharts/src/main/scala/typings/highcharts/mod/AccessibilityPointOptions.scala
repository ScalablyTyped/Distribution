package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityPointOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Date format to use for points on
    * datetime axes when describing them to screen reader users.
    *
    * Defaults to the same format as in tooltip.
    *
    * For an overview of the replacement codes, see dateFormat.
    */
  var dateFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Formatter function to determine
    * the date/time format used with points on datetime axes when describing
    * them to screen reader users. Receives one argument, `point`, referring to
    * the point to describe. Should return a date format string compatible with
    * dateFormat.
    */
  var dateFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.native
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
  var descriptionFormatter: js.UndefOr[ScreenReaderFormatterCallbackFunction[Point]] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decimals to use for the values
    * in the point descriptions. Uses tooltip.valueDecimals if not defined.
    */
  var valueDecimals: js.UndefOr[Double] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format to use for describing the
    * values of data points to assistive technology - including screen readers.
    * The point context is available as `{point}`.
    *
    * Additionally, the series name, annotation info, and description added in
    * `point.accessibility.description` is added by default if relevant. To
    * override this, use the accessibility.point.descriptionFormatter option.
    */
  var valueDescriptionFormat: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Prefix to add to the values in
    * the point descriptions. Uses tooltip.valuePrefix if not defined.
    */
  var valuePrefix: js.UndefOr[String] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Suffix to add to the values in
    * the point descriptions. Uses tooltip.valueSuffix if not defined.
    */
  var valueSuffix: js.UndefOr[String] = js.native
}

object AccessibilityPointOptions {
  @scala.inline
  def apply(): AccessibilityPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityPointOptions]
  }
  @scala.inline
  implicit class AccessibilityPointOptionsOps[Self <: AccessibilityPointOptions] (val x: Self) extends AnyVal {
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
    def setDateFormat(value: String): Self = this.set("dateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateFormat: Self = this.set("dateFormat", js.undefined)
    @scala.inline
    def setDateFormatter(value: Point => String): Self = this.set("dateFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDateFormatter: Self = this.set("dateFormatter", js.undefined)
    @scala.inline
    def setDescriptionFormatter(value: Point => String): Self = this.set("descriptionFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDescriptionFormatter: Self = this.set("descriptionFormatter", js.undefined)
    @scala.inline
    def setValueDecimals(value: Double): Self = this.set("valueDecimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDecimals: Self = this.set("valueDecimals", js.undefined)
    @scala.inline
    def setValueDescriptionFormat(value: String): Self = this.set("valueDescriptionFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueDescriptionFormat: Self = this.set("valueDescriptionFormat", js.undefined)
    @scala.inline
    def setValuePrefix(value: String): Self = this.set("valuePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValuePrefix: Self = this.set("valuePrefix", js.undefined)
    @scala.inline
    def setValueSuffix(value: String): Self = this.set("valueSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueSuffix: Self = this.set("valueSuffix", js.undefined)
  }
  
}

