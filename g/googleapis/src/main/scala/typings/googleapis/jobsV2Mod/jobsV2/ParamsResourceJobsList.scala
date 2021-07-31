package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceJobsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required.  The filter string specifies the jobs to be enumerated.
    * Supported operator: =, AND  The fields eligible for filtering are:  *
    * `companyName` (Required) * `requisitionId` (Optional)  Sample Query:  *
    * companyName = "companies/123" * companyName = "companies/123" AND
    * requisitionId = "req-1"
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  If set to `true`, only Job.name, Job.requisition_id and
    * Job.language_code will be returned.  A typical use case is to synchronize
    * job repositories.  Defaults to false.
    */
  var idsOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.  The maximum number of jobs to be returned per page of results.
    * If ids_only is set to true, the maximum allowed page size is 1000.
    * Otherwise, the maximum allowed page size is 100.  Default is 100 if empty
    * or a number < 1 is specified.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional.  The starting point of a query result.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceJobsList {
  
  @scala.inline
  def apply(): ParamsResourceJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsList]
  }
  
  @scala.inline
  implicit class ParamsResourceJobsListMutableBuilder[Self <: ParamsResourceJobsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setIdsOnly(value: Boolean): Self = StObject.set(x, "idsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdsOnlyUndefined: Self = StObject.set(x, "idsOnly", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
