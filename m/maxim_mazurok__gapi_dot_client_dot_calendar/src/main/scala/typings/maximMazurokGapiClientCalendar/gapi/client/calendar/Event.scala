package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import typings.maximMazurokGapiClientCalendar.anon.Display
import typings.maximMazurokGapiClientCalendar.anon.DisplayName
import typings.maximMazurokGapiClientCalendar.anon.Overrides
import typings.maximMazurokGapiClientCalendar.anon.Private
import typings.maximMazurokGapiClientCalendar.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event extends js.Object {
  
  /** Whether anyone can invite themselves to the event (currently works for Google+ events only). Optional. The default is False. */
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  
  /**
    * File attachments for the event. Currently only Google Drive attachments are supported.
    * In order to modify attachments the supportsAttachments request parameter should be set to true.
    * There can be at most 25 attachments per event,
    */
  var attachments: js.UndefOr[js.Array[EventAttachment]] = js.native
  
  /**
    * The attendees of the event. See the Events with attendees guide for more information on scheduling events with other calendar users. Service accounts need to use domain-wide
    * delegation of authority to populate the attendee list.
    */
  var attendees: js.UndefOr[js.Array[EventAttendee]] = js.native
  
  /**
    * Whether attendees may have been omitted from the event's representation. When retrieving an event, this may be due to a restriction specified by the maxAttendee query parameter.
    * When updating an event, this can be used to only update the participant's response. Optional. The default is False.
    */
  var attendeesOmitted: js.UndefOr[Boolean] = js.native
  
  /** The color of the event. This is an ID referring to an entry in the event section of the colors definition (see the  colors endpoint). Optional. */
  var colorId: js.UndefOr[String] = js.native
  
  /**
    * The conference-related information, such as details of a Google Meet conference. To create new conference details use the createRequest field. To persist your changes, remember to
    * set the conferenceDataVersion request parameter to 1 for all event modification requests.
    */
  var conferenceData: js.UndefOr[ConferenceData] = js.native
  
  /** Creation time of the event (as a RFC3339 timestamp). Read-only. */
  var created: js.UndefOr[String] = js.native
  
  /** The creator of the event. Read-only. */
  var creator: js.UndefOr[DisplayName] = js.native
  
  /** Description of the event. Can contain HTML. Optional. */
  var description: js.UndefOr[String] = js.native
  
  /** The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance. */
  var end: js.UndefOr[EventDateTime] = js.native
  
  /** Whether the end time is actually unspecified. An end time is still provided for compatibility reasons, even if this attribute is set to True. The default is False. */
  var endTimeUnspecified: js.UndefOr[Boolean] = js.native
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** Extended properties of the event. */
  var extendedProperties: js.UndefOr[Private] = js.native
  
  /** A gadget that extends this event. Gadgets are deprecated; this structure is instead only used for returning birthday calendar metadata. */
  var gadget: js.UndefOr[Display] = js.native
  
  /** Whether attendees other than the organizer can invite others to the event. Optional. The default is True. */
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  
  /** Whether attendees other than the organizer can modify the event. Optional. The default is False. */
  var guestsCanModify: js.UndefOr[Boolean] = js.native
  
  /** Whether attendees other than the organizer can see who the event's attendees are. Optional. The default is True. */
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  
  /** An absolute link to the Google+ hangout associated with this event. Read-only. */
  var hangoutLink: js.UndefOr[String] = js.native
  
  /** An absolute link to this event in the Google Calendar Web UI. Read-only. */
  var htmlLink: js.UndefOr[String] = js.native
  
  /**
    * Event unique identifier as defined in RFC5545. It is used to uniquely identify events accross calendaring systems and must be supplied when importing events via the import method.
    * Note that the icalUID and the id are not identical and only one of them should be supplied at event creation time. One difference in their semantics is that in recurring events, all
    * occurrences of one event have different ids while they all share the same icalUIDs.
    */
  var iCalUID: js.UndefOr[String] = js.native
  
  /**
    * Opaque identifier of the event. When creating new single or recurring events, you can specify their IDs. Provided IDs must follow these rules:
    * - characters allowed in the ID are those used in base32hex encoding, i.e. lowercase letters a-v and digits 0-9, see section 3.1.2 in RFC2938
    * - the length of the ID must be between 5 and 1024 characters
    * - the ID must be unique per calendar  Due to the globally distributed nature of the system, we cannot guarantee that ID collisions will be detected at event creation time. To
    * minimize the risk of collisions we recommend using an established UUID algorithm such as one described in RFC4122.
    * If you do not specify an ID, it will be automatically generated by the server.
    * Note that the icalUID and the id are not identical and only one of them should be supplied at event creation time. One difference in their semantics is that in recurring events, all
    * occurrences of one event have different ids while they all share the same icalUIDs.
    */
  var id: js.UndefOr[String] = js.native
  
  /** Type of the resource ("calendar#event"). */
  var kind: js.UndefOr[String] = js.native
  
  /** Geographic location of the event as free-form text. Optional. */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Whether this is a locked event copy where no changes can be made to the main event fields "summary", "description", "location", "start", "end" or "recurrence". The default is False.
    * Read-Only.
    */
  var locked: js.UndefOr[Boolean] = js.native
  
  /**
    * The organizer of the event. If the organizer is also an attendee, this is indicated with a separate entry in attendees with the organizer field set to True. To change the organizer,
    * use the move operation. Read-only, except when importing an event.
    */
  var organizer: js.UndefOr[DisplayName] = js.native
  
  /**
    * For an instance of a recurring event, this is the time at which this event would start according to the recurrence data in the recurring event identified by recurringEventId. It
    * uniquely identifies the instance within the recurring event series even if the instance was moved to a different time. Immutable.
    */
  var originalStartTime: js.UndefOr[EventDateTime] = js.native
  
  /** If set to True, Event propagation is disabled. Note that it is not the same thing as Private event properties. Optional. Immutable. The default is False. */
  var privateCopy: js.UndefOr[Boolean] = js.native
  
  /**
    * List of RRULE, EXRULE, RDATE and EXDATE lines for a recurring event, as specified in RFC5545. Note that DTSTART and DTEND lines are not allowed in this field; event start and end
    * times are specified in the start and end fields. This field is omitted for single events or instances of recurring events.
    */
  var recurrence: js.UndefOr[js.Array[String]] = js.native
  
  /** For an instance of a recurring event, this is the id of the recurring event to which this instance belongs. Immutable. */
  var recurringEventId: js.UndefOr[String] = js.native
  
  /** Information about the event's reminders for the authenticated user. */
  var reminders: js.UndefOr[Overrides] = js.native
  
  /** Sequence number as per iCalendar. */
  var sequence: js.UndefOr[Double] = js.native
  
  /**
    * Source from which the event was created. For example, a web page, an email message or any document identifiable by an URL with HTTP or HTTPS scheme. Can only be seen or modified by
    * the creator of the event.
    */
  var source: js.UndefOr[Title] = js.native
  
  /** The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance. */
  var start: js.UndefOr[EventDateTime] = js.native
  
  /**
    * Status of the event. Optional. Possible values are:
    * - "confirmed" - The event is confirmed. This is the default status.
    * - "tentative" - The event is tentatively confirmed.
    * - "cancelled" - The event is cancelled (deleted). The list method returns cancelled events only on incremental sync (when syncToken or updatedMin are specified) or if the
    * showDeleted flag is set to true. The get method always returns them.
    * A cancelled status represents two different states depending on the event type:
    * - Cancelled exceptions of an uncancelled recurring event indicate that this instance should no longer be presented to the user. Clients should store these events for the lifetime of
    * the parent recurring event.
    * Cancelled exceptions are only guaranteed to have values for the id, recurringEventId and originalStartTime fields populated. The other fields might be empty.
    * - All other cancelled events represent deleted events. Clients should remove their locally synced copies. Such cancelled events will eventually disappear, so do not rely on them
    * being available indefinitely.
    * Deleted events are only guaranteed to have the id field populated.   On the organizer's calendar, cancelled events continue to expose event details (summary, location, etc.) so that
    * they can be restored (undeleted). Similarly, the events to which the user was invited and that they manually removed continue to provide details. However, incremental sync requests
    * with showDeleted set to false will not return these details.
    * If an event changes its organizer (for example via the move operation) and the original organizer is not on the attendee list, it will leave behind a cancelled event where only the
    * id field is guaranteed to be populated.
    */
  var status: js.UndefOr[String] = js.native
  
  /** Title of the event. */
  var summary: js.UndefOr[String] = js.native
  
  /**
    * Whether the event blocks time on the calendar. Optional. Possible values are:
    * - "opaque" - Default value. The event does block time on the calendar. This is equivalent to setting Show me as to Busy in the Calendar UI.
    * - "transparent" - The event does not block time on the calendar. This is equivalent to setting Show me as to Available in the Calendar UI.
    */
  var transparency: js.UndefOr[String] = js.native
  
  /** Last modification time of the event (as a RFC3339 timestamp). Read-only. */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Visibility of the event. Optional. Possible values are:
    * - "default" - Uses the default visibility for events on the calendar. This is the default value.
    * - "public" - The event is public and event details are visible to all readers of the calendar.
    * - "private" - The event is private and only event attendees may view event details.
    * - "confidential" - The event is private. This value is provided for compatibility reasons.
    */
  var visibility: js.UndefOr[String] = js.native
}
object Event {
  
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnyoneCanAddSelf(value: Boolean): Self = this.set("anyoneCanAddSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnyoneCanAddSelf: Self = this.set("anyoneCanAddSelf", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: EventAttachment*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[EventAttachment]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setAttendeesVarargs(value: EventAttendee*): Self = this.set("attendees", js.Array(value :_*))
    
    @scala.inline
    def setAttendees(value: js.Array[EventAttendee]): Self = this.set("attendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttendees: Self = this.set("attendees", js.undefined)
    
    @scala.inline
    def setAttendeesOmitted(value: Boolean): Self = this.set("attendeesOmitted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttendeesOmitted: Self = this.set("attendeesOmitted", js.undefined)
    
    @scala.inline
    def setColorId(value: String): Self = this.set("colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorId: Self = this.set("colorId", js.undefined)
    
    @scala.inline
    def setConferenceData(value: ConferenceData): Self = this.set("conferenceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceData: Self = this.set("conferenceData", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setCreator(value: DisplayName): Self = this.set("creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEnd(value: EventDateTime): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setEndTimeUnspecified(value: Boolean): Self = this.set("endTimeUnspecified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeUnspecified: Self = this.set("endTimeUnspecified", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExtendedProperties(value: Private): Self = this.set("extendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedProperties: Self = this.set("extendedProperties", js.undefined)
    
    @scala.inline
    def setGadget(value: Display): Self = this.set("gadget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGadget: Self = this.set("gadget", js.undefined)
    
    @scala.inline
    def setGuestsCanInviteOthers(value: Boolean): Self = this.set("guestsCanInviteOthers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestsCanInviteOthers: Self = this.set("guestsCanInviteOthers", js.undefined)
    
    @scala.inline
    def setGuestsCanModify(value: Boolean): Self = this.set("guestsCanModify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestsCanModify: Self = this.set("guestsCanModify", js.undefined)
    
    @scala.inline
    def setGuestsCanSeeOtherGuests(value: Boolean): Self = this.set("guestsCanSeeOtherGuests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuestsCanSeeOtherGuests: Self = this.set("guestsCanSeeOtherGuests", js.undefined)
    
    @scala.inline
    def setHangoutLink(value: String): Self = this.set("hangoutLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHangoutLink: Self = this.set("hangoutLink", js.undefined)
    
    @scala.inline
    def setHtmlLink(value: String): Self = this.set("htmlLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlLink: Self = this.set("htmlLink", js.undefined)
    
    @scala.inline
    def setICalUID(value: String): Self = this.set("iCalUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteICalUID: Self = this.set("iCalUID", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocked: Self = this.set("locked", js.undefined)
    
    @scala.inline
    def setOrganizer(value: DisplayName): Self = this.set("organizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizer: Self = this.set("organizer", js.undefined)
    
    @scala.inline
    def setOriginalStartTime(value: EventDateTime): Self = this.set("originalStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalStartTime: Self = this.set("originalStartTime", js.undefined)
    
    @scala.inline
    def setPrivateCopy(value: Boolean): Self = this.set("privateCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateCopy: Self = this.set("privateCopy", js.undefined)
    
    @scala.inline
    def setRecurrenceVarargs(value: String*): Self = this.set("recurrence", js.Array(value :_*))
    
    @scala.inline
    def setRecurrence(value: js.Array[String]): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    
    @scala.inline
    def setRecurringEventId(value: String): Self = this.set("recurringEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringEventId: Self = this.set("recurringEventId", js.undefined)
    
    @scala.inline
    def setReminders(value: Overrides): Self = this.set("reminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminders: Self = this.set("reminders", js.undefined)
    
    @scala.inline
    def setSequence(value: Double): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
    
    @scala.inline
    def setSource(value: Title): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStart(value: EventDateTime): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setTransparency(value: String): Self = this.set("transparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
}
