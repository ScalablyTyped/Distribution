package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendars extends StObject {
  
  var calendar: js.UndefOr[_empty] = js.native
  
  var calendars: js.UndefOr[`0`] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var numberFormat: js.UndefOr[Currency] = js.native
}
object Calendars {
  
  @scala.inline
  def apply(): Calendars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendars]
  }
  
  @scala.inline
  implicit class CalendarsMutableBuilder[Self <: Calendars] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(value: _empty): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    @scala.inline
    def setCalendars(value: `0`): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: Currency): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
