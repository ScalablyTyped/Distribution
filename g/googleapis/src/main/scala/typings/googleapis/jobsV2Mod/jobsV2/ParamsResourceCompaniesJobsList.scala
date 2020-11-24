package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceCompaniesJobsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required.  The resource name of the company that owns the jobs to be
    * listed, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    */
  var companyName: js.UndefOr[String] = js.native
  
  /**
    * Optional.  If set to `true`, only job ID, job requisition ID and language
    * code will be returned.  A typical use is to synchronize job repositories.
    * Defaults to false.
    */
  var idsOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Deprecated. Please DO NOT use this field except for small companies.
    * Suggest counting jobs page by page instead.  Optional.  Set to true if
    * the total number of open jobs is to be returned.  Defaults to false.
    */
  var includeJobsCount: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional.  The requisition ID, also known as posting ID, assigned by the
    * company to the job.  The maximum number of allowable characters is 225.
    */
  var jobRequisitionId: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The maximum number of jobs to be returned per page of results.
    * If ids_only is set to true, the maximum allowed page size is 1000.
    * Otherwise, the maximum allowed page size is 100.  Default is 100 if empty
    * or a number < 1 is specified.
    */
  var pageSize: js.UndefOr[Double] = js.native
  
  /**
    * Optional.  The starting point of a query result.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceCompaniesJobsList {
  
  @scala.inline
  def apply(): ParamsResourceCompaniesJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCompaniesJobsList]
  }
  
  @scala.inline
  implicit class ParamsResourceCompaniesJobsListOps[Self <: ParamsResourceCompaniesJobsList] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setIdsOnly(value: Boolean): Self = this.set("idsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdsOnly: Self = this.set("idsOnly", js.undefined)
    
    @scala.inline
    def setIncludeJobsCount(value: Boolean): Self = this.set("includeJobsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeJobsCount: Self = this.set("includeJobsCount", js.undefined)
    
    @scala.inline
    def setJobRequisitionId(value: String): Self = this.set("jobRequisitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobRequisitionId: Self = this.set("jobRequisitionId", js.undefined)
    
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
