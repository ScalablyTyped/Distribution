package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAttendee extends StObject {
  
  /** Number of additional guests. Optional. The default is 0. */
  var additionalGuests: js.UndefOr[Double] = js.undefined
  
  /** The attendee's response comment. Optional. */
  var comment: js.UndefOr[String] = js.undefined
  
  /** The attendee's name, if available. Optional. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The attendee's email address, if available. This field must be present when adding an attendee. It must be a valid email address as per RFC5322.
    * Required when adding an attendee.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /** The attendee's Profile ID, if available. It corresponds to the id field in the People collection of the Google+ API */
  var id: js.UndefOr[String] = js.undefined
  
  /** Whether this is an optional attendee. Optional. The default is False. */
  var optional: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the attendee is the organizer of the event. Read-only. The default is False. */
  var organizer: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the attendee is a resource. Can only be set when the attendee is added to the event for the first time. Subsequent modifications are ignored. Optional. The default is False. */
  var resource: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The attendee's response status. Possible values are:
    * - "needsAction" - The attendee has not responded to the invitation.
    * - "declined" - The attendee has declined the invitation.
    * - "tentative" - The attendee has tentatively accepted the invitation.
    * - "accepted" - The attendee has accepted the invitation.
    */
  var responseStatus: js.UndefOr[String] = js.undefined
  
  /** Whether this entry represents the calendar on which this copy of the event appears. Read-only. The default is False. */
  var self: js.UndefOr[Boolean] = js.undefined
}
object EventAttendee {
  
  inline def apply(): EventAttendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAttendee]
  }
  
  extension [Self <: EventAttendee](x: Self) {
    
    inline def setAdditionalGuests(value: Double): Self = StObject.set(x, "additionalGuests", value.asInstanceOf[js.Any])
    
    inline def setAdditionalGuestsUndefined: Self = StObject.set(x, "additionalGuests", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setOrganizer(value: Boolean): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
    
    inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
    
    inline def setResource(value: Boolean): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResponseStatus(value: String): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
    
    inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
    
    inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
  }
}
