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
    if (days != null) __obj.updateDynamic("days")(days)
    if (hours != null) __obj.updateDynamic("hours")(hours)
    if (months != null) __obj.updateDynamic("months")(months)
    if (weeks != null) __obj.updateDynamic("weeks")(weeks)
    if (years != null) __obj.updateDynamic("years")(years)
    __obj.asInstanceOf[ChartYAxisItemLabelsDateFormats]
  }
}

