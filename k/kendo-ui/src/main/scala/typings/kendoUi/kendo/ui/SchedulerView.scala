package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerView extends js.Object {
  var adaptiveSlotHeight: js.UndefOr[Boolean] = js.native
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.native
  var allDaySlot: js.UndefOr[Boolean] = js.native
  var allDaySlotTemplate: js.UndefOr[String | js.Function] = js.native
  var columnWidth: js.UndefOr[Double] = js.native
  var dateHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var dayTemplate: js.UndefOr[String | js.Function] = js.native
  var editable: js.UndefOr[Boolean | SchedulerViewEditable] = js.native
  var endTime: js.UndefOr[Date] = js.native
  var eventHeight: js.UndefOr[Double | String] = js.native
  var eventSpacing: js.UndefOr[Double] = js.native
  var eventTemplate: js.UndefOr[String | js.Function] = js.native
  var eventTimeTemplate: js.UndefOr[String | js.Function] = js.native
  var eventsPerDay: js.UndefOr[Double] = js.native
  var group: js.UndefOr[SchedulerViewGroup] = js.native
  var majorTick: js.UndefOr[Double] = js.native
  var majorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var minorTickCount: js.UndefOr[Double] = js.native
  var minorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.native
  var name: js.UndefOr[String] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var selectedDateFormat: js.UndefOr[String] = js.native
  var selectedShortDateFormat: js.UndefOr[String] = js.native
  var showWorkHours: js.UndefOr[Boolean] = js.native
  var slotTemplate: js.UndefOr[String | js.Function] = js.native
  var startTime: js.UndefOr[Date] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var workWeekEnd: js.UndefOr[Double] = js.native
  var workWeekStart: js.UndefOr[Double] = js.native
}

object SchedulerView {
  @scala.inline
  def apply(): SchedulerView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerView]
  }
  @scala.inline
  implicit class SchedulerViewOps[Self <: SchedulerView] (val x: Self) extends AnyVal {
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
    def setAdaptiveSlotHeight(value: Boolean): Self = this.set("adaptiveSlotHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptiveSlotHeight: Self = this.set("adaptiveSlotHeight", js.undefined)
    @scala.inline
    def setAllDayEventTemplate(value: String | js.Function): Self = this.set("allDayEventTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDayEventTemplate: Self = this.set("allDayEventTemplate", js.undefined)
    @scala.inline
    def setAllDaySlot(value: Boolean): Self = this.set("allDaySlot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDaySlot: Self = this.set("allDaySlot", js.undefined)
    @scala.inline
    def setAllDaySlotTemplate(value: String | js.Function): Self = this.set("allDaySlotTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllDaySlotTemplate: Self = this.set("allDaySlotTemplate", js.undefined)
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    @scala.inline
    def setDateHeaderTemplate(value: String | js.Function): Self = this.set("dateHeaderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateHeaderTemplate: Self = this.set("dateHeaderTemplate", js.undefined)
    @scala.inline
    def setDayTemplate(value: String | js.Function): Self = this.set("dayTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayTemplate: Self = this.set("dayTemplate", js.undefined)
    @scala.inline
    def setEditable(value: Boolean | SchedulerViewEditable): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEndTime(value: Date): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setEventHeight(value: Double | String): Self = this.set("eventHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventHeight: Self = this.set("eventHeight", js.undefined)
    @scala.inline
    def setEventSpacing(value: Double): Self = this.set("eventSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSpacing: Self = this.set("eventSpacing", js.undefined)
    @scala.inline
    def setEventTemplate(value: String | js.Function): Self = this.set("eventTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTemplate: Self = this.set("eventTemplate", js.undefined)
    @scala.inline
    def setEventTimeTemplate(value: String | js.Function): Self = this.set("eventTimeTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTimeTemplate: Self = this.set("eventTimeTemplate", js.undefined)
    @scala.inline
    def setEventsPerDay(value: Double): Self = this.set("eventsPerDay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventsPerDay: Self = this.set("eventsPerDay", js.undefined)
    @scala.inline
    def setGroup(value: SchedulerViewGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setMajorTick(value: Double): Self = this.set("majorTick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTick: Self = this.set("majorTick", js.undefined)
    @scala.inline
    def setMajorTimeHeaderTemplate(value: String | js.Function): Self = this.set("majorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTimeHeaderTemplate: Self = this.set("majorTimeHeaderTemplate", js.undefined)
    @scala.inline
    def setMinorTickCount(value: Double): Self = this.set("minorTickCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickCount: Self = this.set("minorTickCount", js.undefined)
    @scala.inline
    def setMinorTimeHeaderTemplate(value: String | js.Function): Self = this.set("minorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTimeHeaderTemplate: Self = this.set("minorTimeHeaderTemplate", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectedDateFormat(value: String): Self = this.set("selectedDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedDateFormat: Self = this.set("selectedDateFormat", js.undefined)
    @scala.inline
    def setSelectedShortDateFormat(value: String): Self = this.set("selectedShortDateFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedShortDateFormat: Self = this.set("selectedShortDateFormat", js.undefined)
    @scala.inline
    def setShowWorkHours(value: Boolean): Self = this.set("showWorkHours", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowWorkHours: Self = this.set("showWorkHours", js.undefined)
    @scala.inline
    def setSlotTemplate(value: String | js.Function): Self = this.set("slotTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlotTemplate: Self = this.set("slotTemplate", js.undefined)
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWorkWeekEnd(value: Double): Self = this.set("workWeekEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkWeekEnd: Self = this.set("workWeekEnd", js.undefined)
    @scala.inline
    def setWorkWeekStart(value: Double): Self = this.set("workWeekStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkWeekStart: Self = this.set("workWeekStart", js.undefined)
  }
  
}

