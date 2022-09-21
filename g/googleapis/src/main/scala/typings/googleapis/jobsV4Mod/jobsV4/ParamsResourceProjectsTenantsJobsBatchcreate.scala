package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsJobsBatchcreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the tenant under which the job is created. The format is "projects/{project_id\}/tenants/{tenant_id\}". For example, "projects/foo/tenants/bar".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchCreateJobsRequest] = js.undefined
}
object ParamsResourceProjectsTenantsJobsBatchcreate {
  
  inline def apply(): ParamsResourceProjectsTenantsJobsBatchcreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsJobsBatchcreate]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsJobsBatchcreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchCreateJobsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
