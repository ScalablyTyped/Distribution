package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsCompaniesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional.  The maximum number of companies to be returned, at most 100.
    * Default is 100 if a non-positive number is provided.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional.  The starting indicator from which to return results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required.  Resource name of the project under which the company is
    * created.  The format is "projects/{project_id}", for example,
    * "projects/api-test-project".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Optional.  Set to true if the companies requested must have open jobs.
    * Defaults to false.  If true, at most page_size of companies are fetched,
    * among which only those with open jobs are returned.
    */
  var requireOpenJobs: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsCompaniesList {
  
  inline def apply(): ParamsResourceProjectsCompaniesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsCompaniesList]
  }
  
  extension [Self <: ParamsResourceProjectsCompaniesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequireOpenJobs(value: Boolean): Self = StObject.set(x, "requireOpenJobs", value.asInstanceOf[js.Any])
    
    inline def setRequireOpenJobsUndefined: Self = StObject.set(x, "requireOpenJobs", js.undefined)
  }
}
