package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeBusyGroup extends StObject {
  
  /** List of calendars' identifiers within a group. */
  var calendars: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional error(s) (if computation for the group failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}
object FreeBusyGroup {
  
  inline def apply(): FreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyGroup]
  }
  
  extension [Self <: FreeBusyGroup](x: Self) {
    
    inline def setCalendars(value: js.Array[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    inline def setCalendarsVarargs(value: String*): Self = StObject.set(x, "calendars", js.Array(value*))
    
    inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
