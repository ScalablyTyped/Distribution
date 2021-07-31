package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarMonth extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var empty: js.UndefOr[String] = js.undefined
  
  var weekNumber: js.UndefOr[String] = js.undefined
}
object CalendarMonth {
  
  @scala.inline
  def apply(): CalendarMonth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarMonth]
  }
  
  @scala.inline
  implicit class CalendarMonthMutableBuilder[Self <: CalendarMonth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setEmpty(value: String): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: String): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
  }
}
