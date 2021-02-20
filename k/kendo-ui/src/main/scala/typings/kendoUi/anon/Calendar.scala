package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendar extends StObject {
  
  var calendar: _empty = js.native
  
  var calendars: Standard = js.native
  
  var name: String = js.native
  
  var numberFormat: Currency = js.native
}
object Calendar {
  
  @scala.inline
  def apply(calendar: _empty, calendars: Standard, name: String, numberFormat: Currency): Calendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], calendars = calendars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit class CalendarMutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(value: _empty): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendars(value: Standard): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: Currency): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
  }
}
