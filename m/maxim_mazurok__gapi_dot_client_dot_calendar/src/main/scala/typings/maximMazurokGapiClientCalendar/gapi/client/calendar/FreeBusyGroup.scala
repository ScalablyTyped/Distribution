package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeBusyGroup extends StObject {
  
  /** List of calendars' identifiers within a group. */
  var calendars: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional error(s) (if computation for the group failed). */
  var errors: js.UndefOr[js.Array[Error]] = js.native
}
object FreeBusyGroup {
  
  @scala.inline
  def apply(): FreeBusyGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreeBusyGroup]
  }
  
  @scala.inline
  implicit class FreeBusyGroupMutableBuilder[Self <: FreeBusyGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendars(value: js.Array[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
    
    @scala.inline
    def setCalendarsVarargs(value: String*): Self = StObject.set(x, "calendars", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
