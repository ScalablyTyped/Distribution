package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePerformancereportList
  extends StObject
     with StandardParameters {
  
  /**
    * The account id to get the reports.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The end time of the report in ISO 8601 timestamp format using UTC.
    */
  var endDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of entries returned on one result page. If not set, the
    * default is 100. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token, used to page through performance reports. To
    * retrieve the next page, set this parameter to the value of
    * "nextPageToken" from the previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The start time of the report in ISO 8601 timestamp format using UTC.
    */
  var startDateTime: js.UndefOr[String] = js.undefined
}
object ParamsResourcePerformancereportList {
  
  @scala.inline
  def apply(): ParamsResourcePerformancereportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePerformancereportList]
  }
  
  @scala.inline
  implicit class ParamsResourcePerformancereportListMutableBuilder[Self <: ParamsResourcePerformancereportList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: String): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: String): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
