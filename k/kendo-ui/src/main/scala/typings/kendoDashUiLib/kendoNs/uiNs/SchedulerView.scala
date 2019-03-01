package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerView extends js.Object {
  var allDayEventTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var allDaySlot: js.UndefOr[scala.Boolean] = js.undefined
  var allDaySlotTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  var dateHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var dayTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var editable: js.UndefOr[scala.Boolean | SchedulerViewEditable] = js.undefined
  var endTime: js.UndefOr[stdLib.Date] = js.undefined
  var eventHeight: js.UndefOr[scala.Double] = js.undefined
  var eventTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var eventTimeTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var group: js.UndefOr[SchedulerViewGroup] = js.undefined
  var majorTick: js.UndefOr[scala.Double] = js.undefined
  var majorTimeHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var minorTickCount: js.UndefOr[scala.Double] = js.undefined
  var minorTimeHeaderTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  var selectedDateFormat: js.UndefOr[java.lang.String] = js.undefined
  var selectedShortDateFormat: js.UndefOr[java.lang.String] = js.undefined
  var showWorkHours: js.UndefOr[scala.Boolean] = js.undefined
  var slotTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var startTime: js.UndefOr[stdLib.Date] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var workWeekEnd: js.UndefOr[scala.Double] = js.undefined
  var workWeekStart: js.UndefOr[scala.Double] = js.undefined
}

object SchedulerView {
  @scala.inline
  def apply(
    allDayEventTemplate: java.lang.String | js.Function = null,
    allDaySlot: js.UndefOr[scala.Boolean] = js.undefined,
    allDaySlotTemplate: java.lang.String | js.Function = null,
    columnWidth: scala.Int | scala.Double = null,
    dateHeaderTemplate: java.lang.String | js.Function = null,
    dayTemplate: java.lang.String | js.Function = null,
    editable: scala.Boolean | SchedulerViewEditable = null,
    endTime: stdLib.Date = null,
    eventHeight: scala.Int | scala.Double = null,
    eventTemplate: java.lang.String | js.Function = null,
    eventTimeTemplate: java.lang.String | js.Function = null,
    group: SchedulerViewGroup = null,
    majorTick: scala.Int | scala.Double = null,
    majorTimeHeaderTemplate: java.lang.String | js.Function = null,
    minorTickCount: scala.Int | scala.Double = null,
    minorTimeHeaderTemplate: java.lang.String | js.Function = null,
    name: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    selectedDateFormat: java.lang.String = null,
    selectedShortDateFormat: java.lang.String = null,
    showWorkHours: js.UndefOr[scala.Boolean] = js.undefined,
    slotTemplate: java.lang.String | js.Function = null,
    startTime: stdLib.Date = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    workWeekEnd: scala.Int | scala.Double = null,
    workWeekStart: scala.Int | scala.Double = null
  ): SchedulerView = {
    val __obj = js.Dynamic.literal()
    if (allDayEventTemplate != null) __obj.updateDynamic("allDayEventTemplate")(allDayEventTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(allDaySlot)) __obj.updateDynamic("allDaySlot")(allDaySlot)
    if (allDaySlotTemplate != null) __obj.updateDynamic("allDaySlotTemplate")(allDaySlotTemplate.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (dateHeaderTemplate != null) __obj.updateDynamic("dateHeaderTemplate")(dateHeaderTemplate.asInstanceOf[js.Any])
    if (dayTemplate != null) __obj.updateDynamic("dayTemplate")(dayTemplate.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (eventHeight != null) __obj.updateDynamic("eventHeight")(eventHeight.asInstanceOf[js.Any])
    if (eventTemplate != null) __obj.updateDynamic("eventTemplate")(eventTemplate.asInstanceOf[js.Any])
    if (eventTimeTemplate != null) __obj.updateDynamic("eventTimeTemplate")(eventTimeTemplate.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (majorTick != null) __obj.updateDynamic("majorTick")(majorTick.asInstanceOf[js.Any])
    if (majorTimeHeaderTemplate != null) __obj.updateDynamic("majorTimeHeaderTemplate")(majorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTimeHeaderTemplate != null) __obj.updateDynamic("minorTimeHeaderTemplate")(minorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (selectedDateFormat != null) __obj.updateDynamic("selectedDateFormat")(selectedDateFormat)
    if (selectedShortDateFormat != null) __obj.updateDynamic("selectedShortDateFormat")(selectedShortDateFormat)
    if (!js.isUndefined(showWorkHours)) __obj.updateDynamic("showWorkHours")(showWorkHours)
    if (slotTemplate != null) __obj.updateDynamic("slotTemplate")(slotTemplate.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (workWeekEnd != null) __obj.updateDynamic("workWeekEnd")(workWeekEnd.asInstanceOf[js.Any])
    if (workWeekStart != null) __obj.updateDynamic("workWeekStart")(workWeekStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerView]
  }
}

