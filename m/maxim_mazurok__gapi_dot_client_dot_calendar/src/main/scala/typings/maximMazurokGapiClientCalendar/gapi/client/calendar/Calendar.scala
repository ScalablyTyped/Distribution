package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendar extends StObject {
  
  /** Conferencing properties for this calendar, for example what types of conferences are allowed. */
  var conferenceProperties: js.UndefOr[ConferenceProperties] = js.undefined
  
  /** Description of the calendar. Optional. */
  var description: js.UndefOr[String] = js.undefined
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  
  /** Identifier of the calendar. To retrieve IDs call the calendarList.list() method. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Type of the resource ("calendar#calendar"). */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Geographic location of the calendar as free-form text. Optional. */
  var location: js.UndefOr[String] = js.undefined
  
  /** Title of the calendar. */
  var summary: js.UndefOr[String] = js.undefined
  
  /** The time zone of the calendar. (Formatted as an IANA Time Zone Database name, e.g. "Europe/Zurich".) Optional. */
  var timeZone: js.UndefOr[String] = js.undefined
}
object Calendar {
  
  @scala.inline
  def apply(): Calendar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Calendar]
  }
  
  @scala.inline
  implicit class CalendarMutableBuilder[Self <: Calendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceProperties(value: ConferenceProperties): Self = StObject.set(x, "conferenceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferencePropertiesUndefined: Self = StObject.set(x, "conferenceProperties", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
