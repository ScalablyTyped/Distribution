package typings.kendoUi.kendo.ui

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttView extends StObject {
  
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
  implicit class GanttViewMutableBuilder[Self <: GanttView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDayHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "dayHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayHeaderTemplateUndefined: Self = StObject.set(x, "dayHeaderTemplate", js.undefined)
    
    @scala.inline
    def setMonthHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "monthHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthHeaderTemplateUndefined: Self = StObject.set(x, "monthHeaderTemplate", js.undefined)
    
    @scala.inline
    def setRange(value: GanttViewRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setResizeTooltipFormat(value: String): Self = StObject.set(x, "resizeTooltipFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeTooltipFormatUndefined: Self = StObject.set(x, "resizeTooltipFormat", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSlotSize(value: Double | String): Self = StObject.set(x, "slotSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotSizeUndefined: Self = StObject.set(x, "slotSize", js.undefined)
    
    @scala.inline
    def setTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "timeHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeHeaderTemplateUndefined: Self = StObject.set(x, "timeHeaderTemplate", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWeekHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "weekHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekHeaderTemplateUndefined: Self = StObject.set(x, "weekHeaderTemplate", js.undefined)
    
    @scala.inline
    def setYearHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "yearHeaderTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearHeaderTemplateUndefined: Self = StObject.set(x, "yearHeaderTemplate", js.undefined)
  }
}
