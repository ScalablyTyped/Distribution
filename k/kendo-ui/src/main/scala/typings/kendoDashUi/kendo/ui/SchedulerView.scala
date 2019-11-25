package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerView extends js.Object {
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.undefined
  var allDaySlot: js.UndefOr[Boolean] = js.undefined
  var allDaySlotTemplate: js.UndefOr[String | js.Function] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var dateHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var dayTemplate: js.UndefOr[String | js.Function] = js.undefined
  var editable: js.UndefOr[Boolean | SchedulerViewEditable] = js.undefined
  var endTime: js.UndefOr[Date] = js.undefined
  var eventHeight: js.UndefOr[Double] = js.undefined
  var eventTemplate: js.UndefOr[String | js.Function] = js.undefined
  var eventTimeTemplate: js.UndefOr[String | js.Function] = js.undefined
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
    allDayEventTemplate: String | js.Function = null,
    allDaySlot: js.UndefOr[Boolean] = js.undefined,
    allDaySlotTemplate: String | js.Function = null,
    columnWidth: Int | Double = null,
    dateHeaderTemplate: String | js.Function = null,
    dayTemplate: String | js.Function = null,
    editable: Boolean | SchedulerViewEditable = null,
    endTime: Date = null,
    eventHeight: Int | Double = null,
    eventTemplate: String | js.Function = null,
    eventTimeTemplate: String | js.Function = null,
    group: SchedulerViewGroup = null,
    majorTick: Int | Double = null,
    majorTimeHeaderTemplate: String | js.Function = null,
    minorTickCount: Int | Double = null,
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
    workWeekEnd: Int | Double = null,
    workWeekStart: Int | Double = null
  ): SchedulerView = {
    val __obj = js.Dynamic.literal()
    if (allDayEventTemplate != null) __obj.updateDynamic("allDayEventTemplate")(allDayEventTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(allDaySlot)) __obj.updateDynamic("allDaySlot")(allDaySlot.asInstanceOf[js.Any])
    if (allDaySlotTemplate != null) __obj.updateDynamic("allDaySlotTemplate")(allDaySlotTemplate.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (dateHeaderTemplate != null) __obj.updateDynamic("dateHeaderTemplate")(dateHeaderTemplate.asInstanceOf[js.Any])
    if (dayTemplate != null) __obj.updateDynamic("dayTemplate")(dayTemplate.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (eventHeight != null) __obj.updateDynamic("eventHeight")(eventHeight.asInstanceOf[js.Any])
    if (eventTemplate != null) __obj.updateDynamic("eventTemplate")(eventTemplate.asInstanceOf[js.Any])
    if (eventTimeTemplate != null) __obj.updateDynamic("eventTimeTemplate")(eventTimeTemplate.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (majorTick != null) __obj.updateDynamic("majorTick")(majorTick.asInstanceOf[js.Any])
    if (majorTimeHeaderTemplate != null) __obj.updateDynamic("majorTimeHeaderTemplate")(majorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTimeHeaderTemplate != null) __obj.updateDynamic("minorTimeHeaderTemplate")(minorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedDateFormat != null) __obj.updateDynamic("selectedDateFormat")(selectedDateFormat.asInstanceOf[js.Any])
    if (selectedShortDateFormat != null) __obj.updateDynamic("selectedShortDateFormat")(selectedShortDateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(showWorkHours)) __obj.updateDynamic("showWorkHours")(showWorkHours.asInstanceOf[js.Any])
    if (slotTemplate != null) __obj.updateDynamic("slotTemplate")(slotTemplate.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (workWeekEnd != null) __obj.updateDynamic("workWeekEnd")(workWeekEnd.asInstanceOf[js.Any])
    if (workWeekStart != null) __obj.updateDynamic("workWeekStart")(workWeekStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerView]
  }
}

