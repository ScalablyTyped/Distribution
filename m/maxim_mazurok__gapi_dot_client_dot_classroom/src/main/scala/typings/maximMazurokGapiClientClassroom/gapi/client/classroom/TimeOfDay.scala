package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOfDay extends StObject {
  
  /** Hours of day in 24 hour format. Should be from 0 to 23. An API may choose to allow the value "24:00:00" for scenarios like business closing time. */
  var hours: js.UndefOr[Double] = js.undefined
  
  /** Minutes of hour of day. Must be from 0 to 59. */
  var minutes: js.UndefOr[Double] = js.undefined
  
  /** Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999. */
  var nanos: js.UndefOr[Double] = js.undefined
  
  /** Seconds of minutes of the time. Must normally be from 0 to 59. An API may allow the value 60 if it allows leap-seconds. */
  var seconds: js.UndefOr[Double] = js.undefined
}
object TimeOfDay {
  
  inline def apply(): TimeOfDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOfDay]
  }
  
  extension [Self <: TimeOfDay](x: Self) {
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
