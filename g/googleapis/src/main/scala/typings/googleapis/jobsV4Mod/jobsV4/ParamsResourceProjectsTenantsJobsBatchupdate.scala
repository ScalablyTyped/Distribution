package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsJobsBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the tenant under which the job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchUpdateJobsRequest] = js.undefined
}
object ParamsResourceProjectsTenantsJobsBatchupdate {
  
  inline def apply(): ParamsResourceProjectsTenantsJobsBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsJobsBatchupdate]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsJobsBatchupdate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchUpdateJobsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
