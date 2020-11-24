package typings.maximMazurokGapiClientAdmin.anon

import typings.maximMazurokGapiClientAdmin.gapi.client.admin.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActorIpAddress extends js.Object {
  
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  
  /**
    * The Internet Protocol (IP) Address of host where the event was performed. This is an additional way to filter a report's summary using the IP address of the user whose activity
    * is being reported. This IP address may or may not reflect the user's physical location. For example, the IP address can be the user's proxy server's address or a virtual private
    * network (VPN) address. This parameter supports both IPv4 and IPv6 address versions.
    */
  var actorIpAddress: js.UndefOr[String] = js.native
  
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  
  /** Application name for which the events are to be retrieved. */
  var applicationName: String = js.native
  
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  
  /** The unique ID of the customer to retrieve data for. */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * Sets the end of the range of time shown in the report. The date is in the RFC 3339 format, for example 2010-10-28T10:26:35.000Z. The default value is the approximate time of the
    * API request. An API report has three basic time concepts: - *Date of the API's request for a report*: When the API created and retrieved the report. - *Report's start time*: The
    * beginning of the timespan shown in the report. The startTime must be before the endTime (if specified) and the current time when the request is made, or the API returns an
    * error. - *Report's end time*: The end of the timespan shown in the report. For example, the timespan of events summarized in a report can start in April and end in May. The
    * report itself can be requested in August. If the endTime is not specified, the report returns all activities from the startTime until the current time or the most recent 180
    * days if the startTime is more than 180 days in the past.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The name of the event being queried by the API. Each eventName is related to a specific G Suite service or feature which the API organizes into types of events. An example is
    * the Google Calendar events in the Admin console application's reports. The Calendar Settings type structure has all of the Calendar eventName activities reported by the API.
    * When an administrator changes a Calendar setting, the API reports this activity in the Calendar Settings type and eventName parameters. For more information about eventName
    * query strings and parameters, see the list of event names for various applications above in applicationName.
    */
  var eventName: js.UndefOr[String] = js.native
  
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  
  /**
    * The filters query string is a comma-separated list. The list is composed of event parameters that are manipulated by relational operators. Event parameters are in the form
    * parameter1 name[parameter1 value],parameter2 name[parameter2 value],... These event parameters are associated with a specific eventName. An empty report is returned if the
    * filtered request's parameter does not belong to the eventName. For more information about eventName parameters, see the list of event names for various applications above in
    * applicationName. In the following Admin Activity example, the <> operator is URL-encoded in the request's query string (%3C%3E): GET...&eventName=CHANGE_CALENDAR_SETTING
    * &filters=NEW_VALUE%3C%3EREAD_ONLY_ACCESS In the following Drive example, the list can be a view or edit event's doc_id parameter with a value that is manipulated by an 'equal
    * to' (==) or 'not equal to' (<>) relational operator. In the first example, the report returns each edited document's doc_id. In the second example, the report returns each
    * viewed document's doc_id that equals the value 12345 and does not return any viewed document's which have a doc_id value of 98765. The <> operator is URL-encoded in the
    * request's query string (%3C%3E): GET...&eventName=edit&filters=doc_id GET...&eventName=view&filters=doc_id==12345,doc_id%3C%3E98765 The relational operators include: - == -
    * 'equal to'. - <> - 'not equal to'. It is URL-encoded (%3C%3E). - < - 'less than'. It is URL-encoded (%3C). - <= - 'less than or equal to'. It is URL-encoded (%3C=). - > -
    * 'greater than'. It is URL-encoded (%3E). - >= - 'greater than or equal to'. It is URL-encoded (%3E=). *Note:* The API doesn't accept multiple values of a parameter. If a
    * particular parameter is supplied more than once in the API request, the API only accepts the last value of that request parameter. In addition, if an invalid request parameter
    * is supplied in the API request, the API ignores that request parameter and returns the response corresponding to the remaining valid request parameters. If no parameters are
    * requested, all parameters are returned.
    */
  var filters: js.UndefOr[String] = js.native
  
  /**
    * Comma separated group ids (obfuscated) on which user activities are filtered, i.e, the response will contain activities for only those users that are a part of at least one of
    * the group ids mentioned here. Format: "id:abc123,id:xyz456"
    */
  var groupIdFilter: js.UndefOr[String] = js.native
  
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Determines how many activity records are shown on each response page. For example, if the request sets maxResults=1 and the report has two activities, the report has two pages.
    * The response's nextPageToken property has the token to the second page. The maxResults query string is optional in the request. The default value is 1000.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  
  /**
    * ID of the organizational unit to report on. Activity records will be shown only for users who belong to the specified organizational unit. Data before Dec 17, 2018 doesn't
    * appear in the filtered results.
    */
  var orgUnitID: js.UndefOr[String] = js.native
  
  /**
    * The token to specify next page. A report with multiple pages has a nextPageToken property in the response. In your follow-on request getting the next page of the report, enter
    * the nextPageToken value in the pageToken query string.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  
  /** Request body */
  var resource: Channel = js.native
  
  /**
    * Sets the beginning of the range of time shown in the report. The date is in the RFC 3339 format, for example 2010-10-28T10:26:35.000Z. The report returns all activities from
    * startTime until endTime. The startTime must be before the endTime (if specified) and the current time when the request is made, or the API returns an error.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  
  /**
    * Represents the profile ID or the user email for which the data should be filtered. Can be all for all information, or userKey for a user's unique G Suite profile ID or their
    * primary email address.
    */
  var userKey: String = js.native
}
object ActorIpAddress {
  
  @scala.inline
  def apply(applicationName: String, resource: Channel, userKey: String): ActorIpAddress = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActorIpAddress]
  }
  
  @scala.inline
  implicit class ActorIpAddressOps[Self <: ActorIpAddress] (val x: Self) extends AnyVal {
    
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
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: Channel): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKey(value: String): Self = this.set("userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    
    @scala.inline
    def setActorIpAddress(value: String): Self = this.set("actorIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActorIpAddress: Self = this.set("actorIpAddress", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setGroupIdFilter(value: String): Self = this.set("groupIdFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupIdFilter: Self = this.set("groupIdFilter", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    
    @scala.inline
    def setOrgUnitID(value: String): Self = this.set("orgUnitID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitID: Self = this.set("orgUnitID", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
  }
}
