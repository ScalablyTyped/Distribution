package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartCategoryAxisItemAutoBaseUnitSteps extends js.Object {
  var days: js.UndefOr[js.Any] = js.undefined
  var hours: js.UndefOr[js.Any] = js.undefined
  var minutes: js.UndefOr[js.Any] = js.undefined
  var months: js.UndefOr[js.Any] = js.undefined
  var weeks: js.UndefOr[js.Any] = js.undefined
  var years: js.UndefOr[js.Any] = js.undefined
}

object StockChartCategoryAxisItemAutoBaseUnitSteps {
  @scala.inline
  def apply(
    days: js.Any = null,
    hours: js.Any = null,
    minutes: js.Any = null,
    months: js.Any = null,
    weeks: js.Any = null,
    years: js.Any = null
  ): StockChartCategoryAxisItemAutoBaseUnitSteps = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days)
    if (hours != null) __obj.updateDynamic("hours")(hours)
    if (minutes != null) __obj.updateDynamic("minutes")(minutes)
    if (months != null) __obj.updateDynamic("months")(months)
    if (weeks != null) __obj.updateDynamic("weeks")(weeks)
    if (years != null) __obj.updateDynamic("years")(years)
    __obj.asInstanceOf[StockChartCategoryAxisItemAutoBaseUnitSteps]
  }
}

