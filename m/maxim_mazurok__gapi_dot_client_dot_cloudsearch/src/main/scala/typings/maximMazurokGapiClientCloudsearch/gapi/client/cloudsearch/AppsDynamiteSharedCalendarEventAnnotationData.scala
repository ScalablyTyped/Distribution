package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCalendarEventAnnotationData extends StObject {
  
  var calendarEvent: js.UndefOr[AppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent] = js.undefined
  
  /** Notification about the creation of an event. */
  var eventCreation: js.UndefOr[Any] = js.undefined
}
object AppsDynamiteSharedCalendarEventAnnotationData {
  
  inline def apply(): AppsDynamiteSharedCalendarEventAnnotationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCalendarEventAnnotationData]
  }
  
  extension [Self <: AppsDynamiteSharedCalendarEventAnnotationData](x: Self) {
    
    inline def setCalendarEvent(value: AppsDynamiteSharedCalendarEventAnnotationDataCalendarEvent): Self = StObject.set(x, "calendarEvent", value.asInstanceOf[js.Any])
    
    inline def setCalendarEventUndefined: Self = StObject.set(x, "calendarEvent", js.undefined)
    
    inline def setEventCreation(value: Any): Self = StObject.set(x, "eventCreation", value.asInstanceOf[js.Any])
    
    inline def setEventCreationUndefined: Self = StObject.set(x, "eventCreation", js.undefined)
  }
}
