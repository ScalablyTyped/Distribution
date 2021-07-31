package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsReportsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * If set, only reports created after the specified date/time are returned.
    */
  var createdAfter: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the job.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The content owner's external ID on which behalf the user is acting on. If
    * not set, the user is acting for himself (his own channel).
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * Requested page size. Server may return fewer report types than requested.
    * If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of ListReportsResponse.next_page_token
    * returned in response to the previous call to the `ListReports` method.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * If set, only reports whose start time is greater than or equal the
    * specified date/time are returned.
    */
  var startTimeAtOrAfter: js.UndefOr[String] = js.undefined
  
  /**
    * If set, only reports whose start time is smaller than the specified
    * date/time are returned.
    */
  var startTimeBefore: js.UndefOr[String] = js.undefined
}
object ParamsResourceJobsReportsList {
  
  @scala.inline
  def apply(): ParamsResourceJobsReportsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsReportsList]
  }
  
  @scala.inline
  implicit class ParamsResourceJobsReportsListMutableBuilder[Self <: ParamsResourceJobsReportsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCreatedAfter(value: String): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStartTimeAtOrAfter(value: String): Self = StObject.set(x, "startTimeAtOrAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeAtOrAfterUndefined: Self = StObject.set(x, "startTimeAtOrAfter", js.undefined)
    
    @scala.inline
    def setStartTimeBefore(value: String): Self = StObject.set(x, "startTimeBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeBeforeUndefined: Self = StObject.set(x, "startTimeBefore", js.undefined)
  }
}
