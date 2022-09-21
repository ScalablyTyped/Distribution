package typings.googleapis.networksecurityV1Mod.networksecurityV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServertlspoliciesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the ServerTlsPolicy. Must be in the format `projects/x/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaServerTlsPolicy] = js.undefined
  
  /**
    * Required. Short name of the ServerTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. "server_mtls_policy".
    */
  var serverTlsPolicyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServertlspoliciesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsServertlspoliciesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServertlspoliciesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServertlspoliciesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaServerTlsPolicy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setServerTlsPolicyId(value: String): Self = StObject.set(x, "serverTlsPolicyId", value.asInstanceOf[js.Any])
    
    inline def setServerTlsPolicyIdUndefined: Self = StObject.set(x, "serverTlsPolicyId", js.undefined)
  }
}
