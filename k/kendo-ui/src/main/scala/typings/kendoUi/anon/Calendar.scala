package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendar extends StObject {
  
  var calendar: _empty
  
  var calendars: Standard
  
  var name: String
  
  var numberFormat: Currency
}
object Calendar {
  
  inline def apply(calendar: _empty, calendars: Standard, name: String, numberFormat: Currency): Calendar = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], calendars = calendars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
    
    inline def setCalendar(value: _empty): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendars(value: Standard): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumberFormat(value: Currency): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
  }
}
