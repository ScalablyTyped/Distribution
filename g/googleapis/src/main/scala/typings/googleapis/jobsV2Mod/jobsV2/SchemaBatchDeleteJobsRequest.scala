package typings.googleapis.jobsV2Mod.jobsV2

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
    * &quot;companies/123&quot; AND requisitionId = &quot;req-1&quot;
    */
  var filter: js.UndefOr[String] = js.undefined
}
object SchemaBatchDeleteJobsRequest {
  
  @scala.inline
  def apply(): SchemaBatchDeleteJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeleteJobsRequest]
  }
  
  @scala.inline
  implicit class SchemaBatchDeleteJobsRequestMutableBuilder[Self <: SchemaBatchDeleteJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
