package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FreeBusyCalendar extends StObject {
  
  /** List of time ranges during which this calendar should be regarded as busy. */
  var busy: js.UndefOr[js.Array[TimePeriod]] = js.undefined
  
  /** Optional error(s) (if computation for the calendar failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.undefined
}
object FreeBusyCalendar {
  
  inline def apply(): FreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyCalendar]
  }
  
  extension [Self <: FreeBusyCalendar](x: Self) {
    
    inline def setBusy(value: js.Array[TimePeriod]): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
    
    inline def setBusyVarargs(value: TimePeriod*): Self = StObject.set(x, "busy", js.Array(value*))
    
    inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
