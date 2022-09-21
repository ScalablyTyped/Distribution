package typings.googleapis.networksecurityV1beta1Mod.networksecurityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClienttlspoliciesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Short name of the ClientTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. "client_mtls_policy".
    */
  var clientTlsPolicyId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the ClientTlsPolicy. Must be in the format `projects/x/locations/{location\}`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaClientTlsPolicy] = js.undefined
}
object ParamsResourceProjectsLocationsClienttlspoliciesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsClienttlspoliciesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClienttlspoliciesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsClienttlspoliciesCreate](x: Self) {
    
    inline def setClientTlsPolicyId(value: String): Self = StObject.set(x, "clientTlsPolicyId", value.asInstanceOf[js.Any])
    
    inline def setClientTlsPolicyIdUndefined: Self = StObject.set(x, "clientTlsPolicyId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaClientTlsPolicy): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
