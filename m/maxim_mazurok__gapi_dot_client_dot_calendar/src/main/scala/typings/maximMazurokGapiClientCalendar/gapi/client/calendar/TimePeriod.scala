package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePeriod extends StObject {
  
  /** The (exclusive) end of the time period. */
  var end: js.UndefOr[String] = js.native
  
  /** The (inclusive) start of the time period. */
  var start: js.UndefOr[String] = js.native
}
object TimePeriod {
  
  @scala.inline
  def apply(): TimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePeriod]
  }
  
  @scala.inline
  implicit class TimePeriodMutableBuilder[Self <: TimePeriod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
