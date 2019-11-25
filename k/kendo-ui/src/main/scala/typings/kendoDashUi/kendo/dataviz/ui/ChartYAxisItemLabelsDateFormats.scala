package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartYAxisItemLabelsDateFormats extends js.Object {
  var days: js.UndefOr[String] = js.undefined
  var hours: js.UndefOr[String] = js.undefined
  var months: js.UndefOr[String] = js.undefined
  var weeks: js.UndefOr[String] = js.undefined
  var years: js.UndefOr[String] = js.undefined
}

object ChartYAxisItemLabelsDateFormats {
  @scala.inline
  def apply(
    days: String = null,
    hours: String = null,
    months: String = null,
    weeks: String = null,
    years: String = null
  ): ChartYAxisItemLabelsDateFormats = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (weeks != null) __obj.updateDynamic("weeks")(weeks.asInstanceOf[js.Any])
    if (years != null) __obj.updateDynamic("years")(years.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartYAxisItemLabelsDateFormats]
  }
}

