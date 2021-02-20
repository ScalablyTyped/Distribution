package typings.googleapis.jobsV3Mod.jobsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsJobsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required.  The filter string specifies the jobs to be enumerated.
    * Supported operator: =, AND  The fields eligible for filtering are:  *
    * `companyName` (Required) * `requisitionId` (Optional)  Sample Query:  *
    * companyName = "projects/api-test-project/companies/123" * companyName =
    * "projects/api-test-project/companies/123" AND requisitionId = "req-1"
    */
  var filter: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The desired job attributes returned for jobs in the search
    * response. Defaults to JobView.JOB_VIEW_FULL if no value is specified.
    */
  var jobView: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The maximum number of jobs to be returned per page of results.
    * If job_view is set to JobView.JOB_VIEW_ID_ONLY, the maximum allowed page
    * size is 1000. Otherwise, the maximum allowed page size is 100.  Default
    * is 100 if empty or a number < 1 is specified.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional.  The starting point of a query result.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * Required.  The resource name of the project under which the job is
    * created.  The format is "projects/{project_id}", for example,
    * "projects/api-test-project".
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsJobsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsJobsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsJobsListMutableBuilder[Self <: ParamsResourceProjectsJobsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setJobView(value: String): Self = StObject.set(x, "jobView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobViewUndefined: Self = StObject.set(x, "jobView", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
