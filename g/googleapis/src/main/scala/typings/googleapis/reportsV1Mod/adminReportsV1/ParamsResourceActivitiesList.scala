package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceActivitiesList extends StandardParameters {
  /**
    * IP Address of host where the event was performed. Supports both IPv4 and
    * IPv6 addresses.
    */
  var actorIpAddress: js.UndefOr[String] = js.native
  /**
    * Application name for which the events are to be retrieved.
    */
  var applicationName: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Represents the customer for which the data is to be fetched.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Return events which occurred at or before this time.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Name of the event being queried.
    */
  var eventName: js.UndefOr[String] = js.native
  /**
    * Event parameters in the form [parameter1 name][operator][parameter1
    * value],[parameter2 name][operator][parameter2 value],...
    */
  var filters: js.UndefOr[String] = js.native
  /**
    * Number of activity records to be shown in each page.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * the organizational unit's(OU) ID to filter activities from users
    * belonging to a specific OU or one of its sub-OU(s)
    */
  var orgUnitID: js.UndefOr[String] = js.native
  /**
    * Token to specify next page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Return events which occurred at or after this time.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Represents the profile id or the user email for which the data should be
    * filtered. When 'all' is specified as the userKey, it returns usageReports
    * for all users.
    */
  var userKey: js.UndefOr[String] = js.native
}

object ParamsResourceActivitiesList {
  @scala.inline
  def apply(): ParamsResourceActivitiesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceActivitiesList]
  }
  @scala.inline
  implicit class ParamsResourceActivitiesListOps[Self <: ParamsResourceActivitiesList] (val x: Self) extends AnyVal {
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
    def setActorIpAddress(value: String): Self = this.set("actorIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActorIpAddress: Self = this.set("actorIpAddress", js.undefined)
    @scala.inline
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
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
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOrgUnitID(value: String): Self = this.set("orgUnitID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrgUnitID: Self = this.set("orgUnitID", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setUserKey(value: String): Self = this.set("userKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserKey: Self = this.set("userKey", js.undefined)
  }
  
}

