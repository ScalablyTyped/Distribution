package typings.maximMazurokGapiClientCalendar.gapi.client.calendar

import typings.maximMazurokGapiClientCalendar.anon.Notifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListEntry extends js.Object {
  
  /**
    * The effective access role that the authenticated user has on the calendar. Read-only. Possible values are:
    * - "freeBusyReader" - Provides read access to free/busy information.
    * - "reader" - Provides read access to the calendar. Private events will appear to users with reader access, but event details will be hidden.
    * - "writer" - Provides read and write access to the calendar. Private events will appear to users with writer access, and event details will be visible.
    * - "owner" - Provides ownership of the calendar. This role has all of the permissions of the writer role with the additional ability to see and manipulate ACLs.
    */
  var accessRole: js.UndefOr[String] = js.native
  
  /**
    * The main color of the calendar in the hexadecimal format "#0088aa". This property supersedes the index-based colorId property. To set or change this property, you need to specify
    * colorRgbFormat=true in the parameters of the insert, update and patch methods. Optional.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * The color of the calendar. This is an ID referring to an entry in the calendar section of the colors definition (see the colors endpoint). This property is superseded by the
    * backgroundColor and foregroundColor properties and can be ignored when using these properties. Optional.
    */
  var colorId: js.UndefOr[String] = js.native
  
  /** Conferencing properties for this calendar, for example what types of conferences are allowed. */
  var conferenceProperties: js.UndefOr[ConferenceProperties] = js.native
  
  /** The default reminders that the authenticated user has for this calendar. */
  var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.native
  
  /** Whether this calendar list entry has been deleted from the calendar list. Read-only. Optional. The default is False. */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /** Description of the calendar. Optional. Read-only. */
  var description: js.UndefOr[String] = js.native
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The foreground color of the calendar in the hexadecimal format "#ffffff". This property supersedes the index-based colorId property. To set or change this property, you need to
    * specify colorRgbFormat=true in the parameters of the insert, update and patch methods. Optional.
    */
  var foregroundColor: js.UndefOr[String] = js.native
  
  /** Whether the calendar has been hidden from the list. Optional. The attribute is only returned when the calendar is hidden, in which case the value is true. */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** Identifier of the calendar. */
  var id: js.UndefOr[String] = js.native
  
  /** Type of the resource ("calendar#calendarListEntry"). */
  var kind: js.UndefOr[String] = js.native
  
  /** Geographic location of the calendar as free-form text. Optional. Read-only. */
  var location: js.UndefOr[String] = js.native
  
  /** The notifications that the authenticated user is receiving for this calendar. */
  var notificationSettings: js.UndefOr[Notifications] = js.native
  
  /** Whether the calendar is the primary calendar of the authenticated user. Read-only. Optional. The default is False. */
  var primary: js.UndefOr[Boolean] = js.native
  
  /** Whether the calendar content shows up in the calendar UI. Optional. The default is False. */
  var selected: js.UndefOr[Boolean] = js.native
  
  /** Title of the calendar. Read-only. */
  var summary: js.UndefOr[String] = js.native
  
  /** The summary that the authenticated user has set for this calendar. Optional. */
  var summaryOverride: js.UndefOr[String] = js.native
  
  /** The time zone of the calendar. Optional. Read-only. */
  var timeZone: js.UndefOr[String] = js.native
}
object CalendarListEntry {
  
  @scala.inline
  def apply(): CalendarListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarListEntry]
  }
  
  @scala.inline
  implicit class CalendarListEntryOps[Self <: CalendarListEntry] (val x: Self) extends AnyVal {
    
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
    def setAccessRole(value: String): Self = this.set("accessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessRole: Self = this.set("accessRole", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setColorId(value: String): Self = this.set("colorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorId: Self = this.set("colorId", js.undefined)
    
    @scala.inline
    def setConferenceProperties(value: ConferenceProperties): Self = this.set("conferenceProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceProperties: Self = this.set("conferenceProperties", js.undefined)
    
    @scala.inline
    def setDefaultRemindersVarargs(value: EventReminder*): Self = this.set("defaultReminders", js.Array(value :_*))
    
    @scala.inline
    def setDefaultReminders(value: js.Array[EventReminder]): Self = this.set("defaultReminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultReminders: Self = this.set("defaultReminders", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
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
    def setNotificationSettings(value: Notifications): Self = this.set("notificationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationSettings: Self = this.set("notificationSettings", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setSummaryOverride(value: String): Self = this.set("summaryOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryOverride: Self = this.set("summaryOverride", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
