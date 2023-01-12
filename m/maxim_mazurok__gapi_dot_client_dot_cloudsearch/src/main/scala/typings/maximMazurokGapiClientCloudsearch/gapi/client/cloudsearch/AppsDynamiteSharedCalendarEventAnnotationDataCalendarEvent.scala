package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent extends StObject {
  
  /** The end time of the event. */
  var endTime: js.UndefOr[AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime] = js.undefined
  
  /** ID of the event. */
  var eventId: js.UndefOr[String] = js.undefined
  
  /** The start time of the event. */
  var startTime: js.UndefOr[AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime] = js.undefined
  
  /** Title of the event (at the time the message was generated). */
  var title: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent {
  
  inline def apply(): AppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setStartTime(value: AppsDynamiteSharedCalendarEventAnnotationDataCalendarEventTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
