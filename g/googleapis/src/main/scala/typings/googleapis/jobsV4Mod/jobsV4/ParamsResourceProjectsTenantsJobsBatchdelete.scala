package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsJobsBatchdelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the tenant under which the job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar". The parent of all of the jobs specified in `names` must match this field.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchDeleteJobsRequest] = js.undefined
}
object ParamsResourceProjectsTenantsJobsBatchdelete {
  
  inline def apply(): ParamsResourceProjectsTenantsJobsBatchdelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsJobsBatchdelete]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsJobsBatchdelete](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchDeleteJobsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
