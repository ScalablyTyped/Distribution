package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Batch delete jobs request.
  */
trait SchemaBatchDeleteJobsRequest extends StObject {
  
  /**
    * Required.  The filter string specifies the jobs to be deleted.  Supported
    * operator: =, AND  The fields eligible for filtering are:  * `companyName`
    * (Required) * `requisitionId` (Required)  Sample Query: companyName =
    * &quot;projects/api-test-project/companies/123&quot; AND requisitionId =
    * &quot;req-1&quot;
    */
  var filter: js.UndefOr[String] = js.undefined
}
object SchemaBatchDeleteJobsRequest {
  
  inline def apply(): SchemaBatchDeleteJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteJobsRequest]
  }
  
  extension [Self <: SchemaBatchDeleteJobsRequest](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
