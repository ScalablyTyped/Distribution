package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCompaniesJobsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required.  The resource name of the company that owns the jobs to be
    * listed, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    */
  var companyName: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  If set to `true`, only job ID, job requisition ID and language
    * code will be returned.  A typical use is to synchronize job repositories.
    * Defaults to false.
    */
  var idsOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated. Please DO NOT use this field except for small companies.
    * Suggest counting jobs page by page instead.  Optional.  Set to true if
    * the total number of open jobs is to be returned.  Defaults to false.
    */
  var includeJobsCount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional.  The requisition ID, also known as posting ID, assigned by the
    * company to the job.  The maximum number of allowable characters is 225.
    */
  var jobRequisitionId: js.UndefOr[String] = js.undefined
  
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
object ParamsResourceCompaniesJobsList {
  
  inline def apply(): ParamsResourceCompaniesJobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCompaniesJobsList]
  }
  
  extension [Self <: ParamsResourceCompaniesJobsList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    inline def setIdsOnly(value: Boolean): Self = StObject.set(x, "idsOnly", value.asInstanceOf[js.Any])
    
    inline def setIdsOnlyUndefined: Self = StObject.set(x, "idsOnly", js.undefined)
    
    inline def setIncludeJobsCount(value: Boolean): Self = StObject.set(x, "includeJobsCount", value.asInstanceOf[js.Any])
    
    inline def setIncludeJobsCountUndefined: Self = StObject.set(x, "includeJobsCount", js.undefined)
    
    inline def setJobRequisitionId(value: String): Self = StObject.set(x, "jobRequisitionId", value.asInstanceOf[js.Any])
    
    inline def setJobRequisitionIdUndefined: Self = StObject.set(x, "jobRequisitionId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
