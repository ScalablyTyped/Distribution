package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerView extends StObject {
  
  var adaptiveSlotHeight: js.UndefOr[Boolean] = js.undefined
  
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var allDaySlot: js.UndefOr[Boolean] = js.undefined
  
  var allDaySlotTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var columnWidth: js.UndefOr[Double] = js.undefined
  
  var content: js.UndefOr[JQuery] = js.undefined
  
  var dateHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var dayTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var editable: js.UndefOr[Boolean | SchedulerViewEditable] = js.undefined
  
  var endDate: js.UndefOr[js.Function0[js.Date]] = js.undefined
  
  var endTime: js.UndefOr[js.Date] = js.undefined
  
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
  
  var months: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var selectedDateFormat: js.UndefOr[String] = js.undefined
  
  var selectedShortDateFormat: js.UndefOr[String] = js.undefined
  
  var showWorkHours: js.UndefOr[Boolean] = js.undefined
  
  var slotTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var startDate: js.UndefOr[js.Function0[js.Date]] = js.undefined
  
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var tooltipTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var workWeekEnd: js.UndefOr[Double] = js.undefined
  
  var workWeekStart: js.UndefOr[Double] = js.undefined
}
object SchedulerView {
  
  inline def apply(): SchedulerView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedulerView] (val x: Self) extends AnyVal {
    
    inline def setAdaptiveSlotHeight(value: Boolean): Self = StObject.set(x, "adaptiveSlotHeight", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveSlotHeightUndefined: Self = StObject.set(x, "adaptiveSlotHeight", js.undefined)
    
    inline def setAllDayEventTemplate(value: String | js.Function): Self = StObject.set(x, "allDayEventTemplate", value.asInstanceOf[js.Any])
    
    inline def setAllDayEventTemplateUndefined: Self = StObject.set(x, "allDayEventTemplate", js.undefined)
    
    inline def setAllDaySlot(value: Boolean): Self = StObject.set(x, "allDaySlot", value.asInstanceOf[js.Any])
    
    inline def setAllDaySlotTemplate(value: String | js.Function): Self = StObject.set(x, "allDaySlotTemplate", value.asInstanceOf[js.Any])
    
    inline def setAllDaySlotTemplateUndefined: Self = StObject.set(x, "allDaySlotTemplate", js.undefined)
    
    inline def setAllDaySlotUndefined: Self = StObject.set(x, "allDaySlot", js.undefined)
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setContent(value: JQuery): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDateHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "dateHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setDateHeaderTemplateUndefined: Self = StObject.set(x, "dateHeaderTemplate", js.undefined)
    
    inline def setDayTemplate(value: String | js.Function): Self = StObject.set(x, "dayTemplate", value.asInstanceOf[js.Any])
    
    inline def setDayTemplateUndefined: Self = StObject.set(x, "dayTemplate", js.undefined)
    
    inline def setEditable(value: Boolean | SchedulerViewEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEndDate(value: () => js.Date): Self = StObject.set(x, "endDate", js.Any.fromFunction0(value))
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEventHeight(value: Double | String): Self = StObject.set(x, "eventHeight", value.asInstanceOf[js.Any])
    
    inline def setEventHeightUndefined: Self = StObject.set(x, "eventHeight", js.undefined)
    
    inline def setEventSpacing(value: Double): Self = StObject.set(x, "eventSpacing", value.asInstanceOf[js.Any])
    
    inline def setEventSpacingUndefined: Self = StObject.set(x, "eventSpacing", js.undefined)
    
    inline def setEventTemplate(value: String | js.Function): Self = StObject.set(x, "eventTemplate", value.asInstanceOf[js.Any])
    
    inline def setEventTemplateUndefined: Self = StObject.set(x, "eventTemplate", js.undefined)
    
    inline def setEventTimeTemplate(value: String | js.Function): Self = StObject.set(x, "eventTimeTemplate", value.asInstanceOf[js.Any])
    
    inline def setEventTimeTemplateUndefined: Self = StObject.set(x, "eventTimeTemplate", js.undefined)
    
    inline def setEventsPerDay(value: Double): Self = StObject.set(x, "eventsPerDay", value.asInstanceOf[js.Any])
    
    inline def setEventsPerDayUndefined: Self = StObject.set(x, "eventsPerDay", js.undefined)
    
    inline def setGroup(value: SchedulerViewGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setMajorTick(value: Double): Self = StObject.set(x, "majorTick", value.asInstanceOf[js.Any])
    
    inline def setMajorTickUndefined: Self = StObject.set(x, "majorTick", js.undefined)
    
    inline def setMajorTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "majorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setMajorTimeHeaderTemplateUndefined: Self = StObject.set(x, "majorTimeHeaderTemplate", js.undefined)
    
    inline def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    inline def setMinorTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "minorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setMinorTimeHeaderTemplateUndefined: Self = StObject.set(x, "minorTimeHeaderTemplate", js.undefined)
    
    inline def setMonths(value: Double): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedDateFormat(value: String): Self = StObject.set(x, "selectedDateFormat", value.asInstanceOf[js.Any])
    
    inline def setSelectedDateFormatUndefined: Self = StObject.set(x, "selectedDateFormat", js.undefined)
    
    inline def setSelectedShortDateFormat(value: String): Self = StObject.set(x, "selectedShortDateFormat", value.asInstanceOf[js.Any])
    
    inline def setSelectedShortDateFormatUndefined: Self = StObject.set(x, "selectedShortDateFormat", js.undefined)
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setShowWorkHours(value: Boolean): Self = StObject.set(x, "showWorkHours", value.asInstanceOf[js.Any])
    
    inline def setShowWorkHoursUndefined: Self = StObject.set(x, "showWorkHours", js.undefined)
    
    inline def setSlotTemplate(value: String | js.Function): Self = StObject.set(x, "slotTemplate", value.asInstanceOf[js.Any])
    
    inline def setSlotTemplateUndefined: Self = StObject.set(x, "slotTemplate", js.undefined)
    
    inline def setStartDate(value: () => js.Date): Self = StObject.set(x, "startDate", js.Any.fromFunction0(value))
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltipTemplate(value: String | js.Function): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
    
    inline def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWorkWeekEnd(value: Double): Self = StObject.set(x, "workWeekEnd", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekEndUndefined: Self = StObject.set(x, "workWeekEnd", js.undefined)
    
    inline def setWorkWeekStart(value: Double): Self = StObject.set(x, "workWeekStart", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekStartUndefined: Self = StObject.set(x, "workWeekStart", js.undefined)
  }
}
