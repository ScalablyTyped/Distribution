package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisLabelsDateFormats extends js.Object {
  var days: js.UndefOr[java.lang.String] = js.undefined
  var hours: js.UndefOr[java.lang.String] = js.undefined
  var months: js.UndefOr[java.lang.String] = js.undefined
  var weeks: js.UndefOr[java.lang.String] = js.undefined
  var years: js.UndefOr[java.lang.String] = js.undefined
}

object StockChartNavigatorCategoryAxisLabelsDateFormats {
  @scala.inline
  def apply(
    days: java.lang.String = null,
    hours: java.lang.String = null,
    months: java.lang.String = null,
    weeks: java.lang.String = null,
    years: java.lang.String = null
  ): StockChartNavigatorCategoryAxisLabelsDateFormats = {
    val __obj = js.Dynamic.literal()
    if (days != null) __obj.updateDynamic("days")(days)
    if (hours != null) __obj.updateDynamic("hours")(hours)
    if (months != null) __obj.updateDynamic("months")(months)
    if (weeks != null) __obj.updateDynamic("weeks")(weeks)
    if (years != null) __obj.updateDynamic("years")(years)
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisLabelsDateFormats]
  }
}

