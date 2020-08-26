package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockChartNavigatorCategoryAxisAutoBaseUnitSteps extends js.Object {
  var days: js.UndefOr[js.Any] = js.native
  var hours: js.UndefOr[js.Any] = js.native
  var minutes: js.UndefOr[js.Any] = js.native
  var months: js.UndefOr[js.Any] = js.native
  var seconds: js.UndefOr[js.Any] = js.native
  var weeks: js.UndefOr[js.Any] = js.native
  var years: js.UndefOr[js.Any] = js.native
}

object StockChartNavigatorCategoryAxisAutoBaseUnitSteps {
  @scala.inline
  def apply(): StockChartNavigatorCategoryAxisAutoBaseUnitSteps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisAutoBaseUnitSteps]
  }
  @scala.inline
  implicit class StockChartNavigatorCategoryAxisAutoBaseUnitStepsOps[Self <: StockChartNavigatorCategoryAxisAutoBaseUnitSteps] (val x: Self) extends AnyVal {
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
    def setDays(value: js.Any): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    @scala.inline
    def setHours(value: js.Any): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    @scala.inline
    def setMinutes(value: js.Any): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    @scala.inline
    def setMonths(value: js.Any): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    @scala.inline
    def setSeconds(value: js.Any): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    @scala.inline
    def setWeeks(value: js.Any): Self = this.set("weeks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeeks: Self = this.set("weeks", js.undefined)
    @scala.inline
    def setYears(value: js.Any): Self = this.set("years", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYears: Self = this.set("years", js.undefined)
  }
  
}

