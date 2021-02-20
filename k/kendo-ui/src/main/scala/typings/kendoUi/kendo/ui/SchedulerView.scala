package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerView extends StObject {
  
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
  implicit class SchedulerViewMutableBuilder[Self <: SchedulerView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdaptiveSlotHeight(value: Boolean): Self = StObject.set(x, "adaptiveSlotHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveSlotHeightUndefined: Self = StObject.set(x, "adaptiveSlotHeight", js.undefined)
    
    @scala.inline
    def setAllDayEventTemplate(value: String | js.Function): Self = StObject.set(x, "allDayEventTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDayEventTemplateUndefined: Self = StObject.set(x, "allDayEventTemplate", js.undefined)
    
    @scala.inline
    def setAllDaySlot(value: Boolean): Self = StObject.set(x, "allDaySlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDaySlotTemplate(value: String | js.Function): Self = StObject.set(x, "allDaySlotTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDaySlotTemplateUndefined: Self = StObject.set(x, "allDaySlotTemplate", js.undefined)
    
    @scala.inline
    def setAllDaySlotUndefined: Self = StObject.set(x, "allDaySlot", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    @scala.inline
    def setDateHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "dateHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateHeaderTemplateUndefined: Self = StObject.set(x, "dateHeaderTemplate", js.undefined)
    
    @scala.inline
    def setDayTemplate(value: String | js.Function): Self = StObject.set(x, "dayTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayTemplateUndefined: Self = StObject.set(x, "dayTemplate", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean | SchedulerViewEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEventHeight(value: Double | String): Self = StObject.set(x, "eventHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventHeightUndefined: Self = StObject.set(x, "eventHeight", js.undefined)
    
    @scala.inline
    def setEventSpacing(value: Double): Self = StObject.set(x, "eventSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSpacingUndefined: Self = StObject.set(x, "eventSpacing", js.undefined)
    
    @scala.inline
    def setEventTemplate(value: String | js.Function): Self = StObject.set(x, "eventTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTemplateUndefined: Self = StObject.set(x, "eventTemplate", js.undefined)
    
    @scala.inline
    def setEventTimeTemplate(value: String | js.Function): Self = StObject.set(x, "eventTimeTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimeTemplateUndefined: Self = StObject.set(x, "eventTimeTemplate", js.undefined)
    
    @scala.inline
    def setEventsPerDay(value: Double): Self = StObject.set(x, "eventsPerDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsPerDayUndefined: Self = StObject.set(x, "eventsPerDay", js.undefined)
    
    @scala.inline
    def setGroup(value: SchedulerViewGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setMajorTick(value: Double): Self = StObject.set(x, "majorTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTickUndefined: Self = StObject.set(x, "majorTick", js.undefined)
    
    @scala.inline
    def setMajorTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "majorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajorTimeHeaderTemplateUndefined: Self = StObject.set(x, "majorTimeHeaderTemplate", js.undefined)
    
    @scala.inline
    def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    @scala.inline
    def setMinorTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "minorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTimeHeaderTemplateUndefined: Self = StObject.set(x, "minorTimeHeaderTemplate", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDateFormat(value: String): Self = StObject.set(x, "selectedDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDateFormatUndefined: Self = StObject.set(x, "selectedDateFormat", js.undefined)
    
    @scala.inline
    def setSelectedShortDateFormat(value: String): Self = StObject.set(x, "selectedShortDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedShortDateFormatUndefined: Self = StObject.set(x, "selectedShortDateFormat", js.undefined)
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setShowWorkHours(value: Boolean): Self = StObject.set(x, "showWorkHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowWorkHoursUndefined: Self = StObject.set(x, "showWorkHours", js.undefined)
    
    @scala.inline
    def setSlotTemplate(value: String | js.Function): Self = StObject.set(x, "slotTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotTemplateUndefined: Self = StObject.set(x, "slotTemplate", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWorkWeekEnd(value: Double): Self = StObject.set(x, "workWeekEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkWeekEndUndefined: Self = StObject.set(x, "workWeekEnd", js.undefined)
    
    @scala.inline
    def setWorkWeekStart(value: Double): Self = StObject.set(x, "workWeekStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkWeekStartUndefined: Self = StObject.set(x, "workWeekStart", js.undefined)
  }
}
