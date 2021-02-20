package typings.maximMazurokGapiClientCalendar.anon

import typings.maximMazurokGapiClientCalendar.gapi.client.calendar.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderBy extends StObject {
  
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  
  /**
    * Deprecated and ignored. A value will always be returned in the email field for the organizer, creator and attendees, even if no real email address is available (i.e. a
    * generated, non-working value will be provided).
    */
  var alwaysIncludeEmail: js.UndefOr[Boolean] = js.native
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary"
    * keyword.
    */
  var calendarId: String = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /** Specifies event ID in the iCalendar format to be included in the response. Optional. */
  var iCalUID: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /** The maximum number of attendees to include in the response. If there are more than the specified number of attendees, only the participant is returned. Optional. */
  var maxAttendees: js.UndefOr[Double] = js.native
  
  /**
    * Maximum number of events returned on one result page. The number of events in the resulting page may be less than this value, or none at all, even if there are more events
    * matching the query. Incomplete pages can be detected by a non-empty nextPageToken field in the response. By default the value is 250 events. The page size can never be larger
    * than 2500 events. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /** The order of the events returned in the result. Optional. The default is an unspecified, stable order. */
  var orderBy: js.UndefOr[String] = js.native
  
  /** Token specifying which result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /**
    * Extended properties constraint specified as propertyName=value. Matches only private properties. This parameter might be repeated multiple times to return events that match all
    * given constraints.
    */
  var privateExtendedProperty: js.UndefOr[String | js.Array[String]] = js.native
  
  /** Free text search terms to find events that match these terms in any field, except for extended properties. Optional. */
  var q: js.UndefOr[String] = js.native
  
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Request body */
  var resource: Channel = js.native
  
  /**
    * Extended properties constraint specified as propertyName=value. Matches only shared properties. This parameter might be repeated multiple times to return events that match all
    * given constraints.
    */
  var sharedExtendedProperty: js.UndefOr[String | js.Array[String]] = js.native
  
  /**
    * Whether to include deleted events (with status equals "cancelled") in the result. Cancelled instances of recurring events (but not the underlying recurring event) will still be
    * included if showDeleted and singleEvents are both False. If showDeleted and singleEvents are both True, only single instances of deleted events (but not the underlying recurring
    * events) are returned. Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  
  /** Whether to include hidden invitations in the result. Optional. The default is False. */
  var showHiddenInvitations: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to expand recurring events into instances and only return single one-off events and instances of recurring events, but not the underlying recurring events themselves.
    * Optional. The default is False.
    */
  var singleEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * Token obtained from the nextSyncToken field returned on the last page of results from the previous list request. It makes the result of this list request contain only entries
    * that have changed since then. All events deleted since the previous list request will always be in the result set and it is not allowed to set showDeleted to False.
    * There are several query parameters that cannot be specified together with nextSyncToken to ensure consistency of the client state.
    *
    * These are:
    * - iCalUID
    * - orderBy
    * - privateExtendedProperty
    * - q
    * - sharedExtendedProperty
    * - timeMin
    * - timeMax
    * - updatedMin If the syncToken expires, the server will respond with a 410 GONE response code and the client should clear its storage and perform a full synchronization without
    * any syncToken.
    * Learn more about incremental synchronization.
    * Optional. The default is to return all entries.
    */
  var syncToken: js.UndefOr[String] = js.native
  
  /**
    * Upper bound (exclusive) for an event's start time to filter by. Optional. The default is not to filter by start time. Must be an RFC3339 timestamp with mandatory time zone
    * offset, for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMin is set, timeMax must be greater than timeMin.
    */
  var timeMax: js.UndefOr[String] = js.native
  
  /**
    * Lower bound (exclusive) for an event's end time to filter by. Optional. The default is not to filter by end time. Must be an RFC3339 timestamp with mandatory time zone offset,
    * for example, 2011-06-03T10:00:00-07:00, 2011-06-03T10:00:00Z. Milliseconds may be provided but are ignored. If timeMax is set, timeMin must be smaller than timeMax.
    */
  var timeMin: js.UndefOr[String] = js.native
  
  /** Time zone used in the response. Optional. The default is the time zone of the calendar. */
  var timeZone: js.UndefOr[String] = js.native
  
  /**
    * Lower bound for an event's last modification time (as a RFC3339 timestamp) to filter by. When specified, entries deleted since this time will always be included regardless of
    * showDeleted. Optional. The default is not to filter by last modification time.
    */
  var updatedMin: js.UndefOr[String] = js.native
  
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}
object OrderBy {
  
  @scala.inline
  def apply(calendarId: String, resource: Channel): OrderBy = {
    val __obj = js.Dynamic.literal(calendarId = calendarId.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderBy]
  }
  
  @scala.inline
  implicit class OrderByMutableBuilder[Self <: OrderBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    @scala.inline
    def setAlwaysIncludeEmail(value: Boolean): Self = StObject.set(x, "alwaysIncludeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysIncludeEmailUndefined: Self = StObject.set(x, "alwaysIncludeEmail", js.undefined)
    
    @scala.inline
    def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setICalUID(value: String): Self = StObject.set(x, "iCalUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setICalUIDUndefined: Self = StObject.set(x, "iCalUID", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setMaxAttendees(value: Double): Self = StObject.set(x, "maxAttendees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAttendeesUndefined: Self = StObject.set(x, "maxAttendees", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
    
    @scala.inline
    def setPrivateExtendedProperty(value: String | js.Array[String]): Self = StObject.set(x, "privateExtendedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateExtendedPropertyUndefined: Self = StObject.set(x, "privateExtendedProperty", js.undefined)
    
    @scala.inline
    def setPrivateExtendedPropertyVarargs(value: String*): Self = StObject.set(x, "privateExtendedProperty", js.Array(value :_*))
    
    @scala.inline
    def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
    
    @scala.inline
    def setResource(value: Channel): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedExtendedProperty(value: String | js.Array[String]): Self = StObject.set(x, "sharedExtendedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedExtendedPropertyUndefined: Self = StObject.set(x, "sharedExtendedProperty", js.undefined)
    
    @scala.inline
    def setSharedExtendedPropertyVarargs(value: String*): Self = StObject.set(x, "sharedExtendedProperty", js.Array(value :_*))
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    @scala.inline
    def setShowHiddenInvitations(value: Boolean): Self = StObject.set(x, "showHiddenInvitations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHiddenInvitationsUndefined: Self = StObject.set(x, "showHiddenInvitations", js.undefined)
    
    @scala.inline
    def setSingleEvents(value: Boolean): Self = StObject.set(x, "singleEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleEventsUndefined: Self = StObject.set(x, "singleEvents", js.undefined)
    
    @scala.inline
    def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
    
    @scala.inline
    def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
    
    @scala.inline
    def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    @scala.inline
    def setUpdatedMin(value: String): Self = StObject.set(x, "updatedMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedMinUndefined: Self = StObject.set(x, "updatedMin", js.undefined)
    
    @scala.inline
    def setUserIp(value: String): Self = StObject.set(x, "userIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIpUndefined: Self = StObject.set(x, "userIp", js.undefined)
  }
}
