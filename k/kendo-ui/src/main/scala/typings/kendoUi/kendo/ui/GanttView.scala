package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttView extends js.Object {
  var date: js.UndefOr[Date] = js.native
  var dayHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var monthHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var range: js.UndefOr[GanttViewRange] = js.native
  var resizeTooltipFormat: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var slotSize: js.UndefOr[Double | String] = js.native
  var timeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var `type`: js.UndefOr[String] = js.native
  var weekHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var yearHeaderTemplate: js.UndefOr[String | js.Function] = js.native
}

object GanttView {
  @scala.inline
  def apply(): GanttView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttView]
  }
  @scala.inline
  implicit class GanttViewOps[Self <: GanttView] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDayHeaderTemplate(value: String | js.Function): Self = this.set("dayHeaderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayHeaderTemplate: Self = this.set("dayHeaderTemplate", js.undefined)
    @scala.inline
    def setMonthHeaderTemplate(value: String | js.Function): Self = this.set("monthHeaderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonthHeaderTemplate: Self = this.set("monthHeaderTemplate", js.undefined)
    @scala.inline
    def setRange(value: GanttViewRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setResizeTooltipFormat(value: String): Self = this.set("resizeTooltipFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeTooltipFormat: Self = this.set("resizeTooltipFormat", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSlotSize(value: Double | String): Self = this.set("slotSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotSize: Self = this.set("slotSize", js.undefined)
    @scala.inline
    def setTimeHeaderTemplate(value: String | js.Function): Self = this.set("timeHeaderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeHeaderTemplate: Self = this.set("timeHeaderTemplate", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWeekHeaderTemplate(value: String | js.Function): Self = this.set("weekHeaderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekHeaderTemplate: Self = this.set("weekHeaderTemplate", js.undefined)
    @scala.inline
    def setYearHeaderTemplate(value: String | js.Function): Self = this.set("yearHeaderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearHeaderTemplate: Self = this.set("yearHeaderTemplate", js.undefined)
  }
  
}

