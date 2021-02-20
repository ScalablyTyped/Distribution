package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeBusyCalendar extends StObject {
  
  /** List of time ranges during which this calendar should be regarded as busy. */
  var busy: js.UndefOr[js.Array[TimePeriod]] = js.native
  
  /** Optional error(s) (if computation for the calendar failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
object FreeBusyCalendar {
  
  @scala.inline
  def apply(): FreeBusyCalendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyCalendar]
  }
  
  @scala.inline
  implicit class FreeBusyCalendarMutableBuilder[Self <: FreeBusyCalendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusy(value: js.Array[TimePeriod]): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
    
    @scala.inline
    def setBusyVarargs(value: TimePeriod*): Self = StObject.set(x, "busy", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
