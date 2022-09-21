package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsAssetsRundiscovery
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the organization to run asset discovery for. Its format is "organizations/[organization_id]".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRunAssetDiscoveryRequest] = js.undefined
}
object ParamsResourceOrganizationsAssetsRundiscovery {
  
  inline def apply(): ParamsResourceOrganizationsAssetsRundiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsAssetsRundiscovery]
  }
  
  extension [Self <: ParamsResourceOrganizationsAssetsRundiscovery](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaRunAssetDiscoveryRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
