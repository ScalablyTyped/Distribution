package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendars extends StObject {
  
  var calendar: js.UndefOr[_empty] = js.undefined
  
  var calendars: js.UndefOr[`0`] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var numberFormat: js.UndefOr[Currency] = js.undefined
}
object Calendars {
  
  inline def apply(): Calendars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendars]
  }
  
  extension [Self <: Calendars](x: Self) {
    
    inline def setCalendar(value: _empty): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setCalendars(value: `0`): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNumberFormat(value: Currency): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
    
    inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
  }
}
