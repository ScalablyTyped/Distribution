package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime extends StObject {
  
  /** All day event. */
  var allDay: js.UndefOr[Date] = js.undefined
  
  /** Non all day event. */
  var timed: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime {
  
  inline def apply(): AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime]
  }
  
  extension [Self <: AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime](x: Self) {
    
    inline def setAllDay(value: Date): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllDayUndefined: Self = StObject.set(x, "allDay", js.undefined)
    
    inline def setTimed(value: String): Self = StObject.set(x, "timed", value.asInstanceOf[js.Any])
    
    inline def setTimedUndefined: Self = StObject.set(x, "timed", js.undefined)
  }
}
