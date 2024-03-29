package typings.googleapis.jobsV4Mod.jobsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsTenantsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required during tenant update. The resource name for a tenant. This is generated by the service when a tenant is created. The format is "projects/{project_id\}/tenants/{tenant_id\}", for example, "projects/foo/tenants/bar".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTenant] = js.undefined
  
  /**
    * Strongly recommended for the best service experience. If update_mask is provided, only the specified fields in tenant are updated. Otherwise all the fields are updated. A field mask to specify the tenant fields to be updated. Only top level fields of Tenant are supported.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsTenantsPatch {
  
  inline def apply(): ParamsResourceProjectsTenantsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsTenantsPatch]
  }
  
  extension [Self <: ParamsResourceProjectsTenantsPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaTenant): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
