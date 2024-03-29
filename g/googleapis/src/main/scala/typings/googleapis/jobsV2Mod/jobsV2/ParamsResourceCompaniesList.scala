package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCompaniesList
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Set to true if the companies request must have open jobs. Defaults to false. If true, at most page_size of companies are fetched, among which only those with open jobs are returned.
    */
  var mustHaveOpenJobs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. The maximum number of companies to be returned, at most 100. Default is 100 if a non-positive number is provided.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. The starting indicator from which to return results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceCompaniesList {
  
  inline def apply(): ParamsResourceCompaniesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCompaniesList]
  }
  
  extension [Self <: ParamsResourceCompaniesList](x: Self) {
    
    inline def setMustHaveOpenJobs(value: Boolean): Self = StObject.set(x, "mustHaveOpenJobs", value.asInstanceOf[js.Any])
    
    inline def setMustHaveOpenJobsUndefined: Self = StObject.set(x, "mustHaveOpenJobs", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
