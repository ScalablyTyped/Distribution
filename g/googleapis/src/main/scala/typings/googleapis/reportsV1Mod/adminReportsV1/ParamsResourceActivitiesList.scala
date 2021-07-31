package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceActivitiesList
  extends StObject
     with StandardParameters {
  
  /**
    * IP Address of host where the event was performed. Supports both IPv4 and
    * IPv6 addresses.
    */
  var actorIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Application name for which the events are to be retrieved.
    */
  var applicationName: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Represents the customer for which the data is to be fetched.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * Return events which occurred at or before this time.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the event being queried.
    */
  var eventName: js.UndefOr[String] = js.undefined
  
  /**
    * Event parameters in the form [parameter1 name][operator][parameter1
    * value],[parameter2 name][operator][parameter2 value],...
    */
  var filters: js.UndefOr[String] = js.undefined
  
  /**
    * Number of activity records to be shown in each page.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * the organizational unit's(OU) ID to filter activities from users
    * belonging to a specific OU or one of its sub-OU(s)
    */
  var orgUnitID: js.UndefOr[String] = js.undefined
  
  /**
    * Token to specify next page.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Return events which occurred at or after this time.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the profile id or the user email for which the data should be
    * filtered. When 'all' is specified as the userKey, it returns usageReports
    * for all users.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceActivitiesList {
  
  @scala.inline
  def apply(): ParamsResourceActivitiesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceActivitiesList]
  }
  
  @scala.inline
  implicit class ParamsResourceActivitiesListMutableBuilder[Self <: ParamsResourceActivitiesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActorIpAddress(value: String): Self = StObject.set(x, "actorIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActorIpAddressUndefined: Self = StObject.set(x, "actorIpAddress", js.undefined)
    
    @scala.inline
    def setApplicationName(value: String): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setOrgUnitID(value: String): Self = StObject.set(x, "orgUnitID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrgUnitIDUndefined: Self = StObject.set(x, "orgUnitID", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
