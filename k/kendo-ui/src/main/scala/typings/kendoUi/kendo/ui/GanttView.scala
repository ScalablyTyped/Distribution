package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GanttView extends StObject {
  
  var date: js.UndefOr[js.Date] = js.undefined
  
  var dayHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var monthHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var range: js.UndefOr[GanttViewRange] = js.undefined
  
  var resizeTooltipFormat: js.UndefOr[String] = js.undefined
  
  var selected: js.UndefOr[Boolean] = js.undefined
  
  var slotSize: js.UndefOr[Double | String] = js.undefined
  
  var timeHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var weekHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var yearHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
}
object GanttView {
  
  inline def apply(): GanttView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GanttView] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDayHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "dayHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setDayHeaderTemplateUndefined: Self = StObject.set(x, "dayHeaderTemplate", js.undefined)
    
    inline def setMonthHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "monthHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setMonthHeaderTemplateUndefined: Self = StObject.set(x, "monthHeaderTemplate", js.undefined)
    
    inline def setRange(value: GanttViewRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setResizeTooltipFormat(value: String): Self = StObject.set(x, "resizeTooltipFormat", value.asInstanceOf[js.Any])
    
    inline def setResizeTooltipFormatUndefined: Self = StObject.set(x, "resizeTooltipFormat", js.undefined)
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setSlotSize(value: Double | String): Self = StObject.set(x, "slotSize", value.asInstanceOf[js.Any])
    
    inline def setSlotSizeUndefined: Self = StObject.set(x, "slotSize", js.undefined)
    
    inline def setTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "timeHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setTimeHeaderTemplateUndefined: Self = StObject.set(x, "timeHeaderTemplate", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWeekHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "weekHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setWeekHeaderTemplateUndefined: Self = StObject.set(x, "weekHeaderTemplate", js.undefined)
    
    inline def setYearHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "yearHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setYearHeaderTemplateUndefined: Self = StObject.set(x, "yearHeaderTemplate", js.undefined)
  }
}
