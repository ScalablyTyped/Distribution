package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsCompaniesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The starting indicator from which to return results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the tenant under which the company is created. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Set to true if the companies requested must have open jobs. Defaults to false. If true, at most page_size of companies are fetched, among which only those with open jobs are returned.
    */
  var requireOpenJobs: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceProjectsTenantsCompaniesList {
  
  inline def apply(): ParamsResourceProjectsTenantsCompaniesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsCompaniesList]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsCompaniesList](x: Self) {
    
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
