package typings.kendoUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerView extends js.Object {
  var adaptiveSlotHeight: js.UndefOr[Boolean] = js.undefined
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.undefined
  var allDaySlot: js.UndefOr[Boolean] = js.undefined
  var allDaySlotTemplate: js.UndefOr[String | js.Function] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var dateHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var dayTemplate: js.UndefOr[String | js.Function] = js.undefined
  var editable: js.UndefOr[Boolean | SchedulerViewEditable] = js.undefined
  var endTime: js.UndefOr[Date] = js.undefined
  var eventHeight: js.UndefOr[Double | String] = js.undefined
  var eventSpacing: js.UndefOr[Double] = js.undefined
  var eventTemplate: js.UndefOr[String | js.Function] = js.undefined
  var eventTimeTemplate: js.UndefOr[String | js.Function] = js.undefined
  var eventsPerDay: js.UndefOr[Double] = js.undefined
  var group: js.UndefOr[SchedulerViewGroup] = js.undefined
  var majorTick: js.UndefOr[Double] = js.undefined
  var majorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var minorTickCount: js.UndefOr[Double] = js.undefined
  var minorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedDateFormat: js.UndefOr[String] = js.undefined
  var selectedShortDateFormat: js.UndefOr[String] = js.undefined
  var showWorkHours: js.UndefOr[Boolean] = js.undefined
  var slotTemplate: js.UndefOr[String | js.Function] = js.undefined
  var startTime: js.UndefOr[Date] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var workWeekEnd: js.UndefOr[Double] = js.undefined
  var workWeekStart: js.UndefOr[Double] = js.undefined
}

object SchedulerView {
  @scala.inline
  def apply(
    adaptiveSlotHeight: js.UndefOr[Boolean] = js.undefined,
    allDayEventTemplate: String | js.Function = null,
    allDaySlot: js.UndefOr[Boolean] = js.undefined,
    allDaySlotTemplate: String | js.Function = null,
    columnWidth: js.UndefOr[Double] = js.undefined,
    dateHeaderTemplate: String | js.Function = null,
    dayTemplate: String | js.Function = null,
    editable: Boolean | SchedulerViewEditable = null,
    endTime: Date = null,
    eventHeight: Double | String = null,
    eventSpacing: js.UndefOr[Double] = js.undefined,
    eventTemplate: String | js.Function = null,
    eventTimeTemplate: String | js.Function = null,
    eventsPerDay: js.UndefOr[Double] = js.undefined,
    group: SchedulerViewGroup = null,
    majorTick: js.UndefOr[Double] = js.undefined,
    majorTimeHeaderTemplate: String | js.Function = null,
    minorTickCount: js.UndefOr[Double] = js.undefined,
    minorTimeHeaderTemplate: String | js.Function = null,
    name: String = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedDateFormat: String = null,
    selectedShortDateFormat: String = null,
    showWorkHours: js.UndefOr[Boolean] = js.undefined,
    slotTemplate: String | js.Function = null,
    startTime: Date = null,
    title: String = null,
    `type`: String = null,
    workWeekEnd: js.UndefOr[Double] = js.undefined,
    workWeekStart: js.UndefOr[Double] = js.undefined
  ): SchedulerView = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adaptiveSlotHeight)) __obj.updateDynamic("adaptiveSlotHeight")(adaptiveSlotHeight.get.asInstanceOf[js.Any])
    if (allDayEventTemplate != null) __obj.updateDynamic("allDayEventTemplate")(allDayEventTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(allDaySlot)) __obj.updateDynamic("allDaySlot")(allDaySlot.get.asInstanceOf[js.Any])
    if (allDaySlotTemplate != null) __obj.updateDynamic("allDaySlotTemplate")(allDaySlotTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (dateHeaderTemplate != null) __obj.updateDynamic("dateHeaderTemplate")(dateHeaderTemplate.asInstanceOf[js.Any])
    if (dayTemplate != null) __obj.updateDynamic("dayTemplate")(dayTemplate.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (eventHeight != null) __obj.updateDynamic("eventHeight")(eventHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(eventSpacing)) __obj.updateDynamic("eventSpacing")(eventSpacing.get.asInstanceOf[js.Any])
    if (eventTemplate != null) __obj.updateDynamic("eventTemplate")(eventTemplate.asInstanceOf[js.Any])
    if (eventTimeTemplate != null) __obj.updateDynamic("eventTimeTemplate")(eventTimeTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(eventsPerDay)) __obj.updateDynamic("eventsPerDay")(eventsPerDay.get.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTick)) __obj.updateDynamic("majorTick")(majorTick.get.asInstanceOf[js.Any])
    if (majorTimeHeaderTemplate != null) __obj.updateDynamic("majorTimeHeaderTemplate")(majorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickCount)) __obj.updateDynamic("minorTickCount")(minorTickCount.get.asInstanceOf[js.Any])
    if (minorTimeHeaderTemplate != null) __obj.updateDynamic("minorTimeHeaderTemplate")(minorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (selectedDateFormat != null) __obj.updateDynamic("selectedDateFormat")(selectedDateFormat.asInstanceOf[js.Any])
    if (selectedShortDateFormat != null) __obj.updateDynamic("selectedShortDateFormat")(selectedShortDateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(showWorkHours)) __obj.updateDynamic("showWorkHours")(showWorkHours.get.asInstanceOf[js.Any])
    if (slotTemplate != null) __obj.updateDynamic("slotTemplate")(slotTemplate.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(workWeekEnd)) __obj.updateDynamic("workWeekEnd")(workWeekEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(workWeekStart)) __obj.updateDynamic("workWeekStart")(workWeekStart.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerView]
  }
}

