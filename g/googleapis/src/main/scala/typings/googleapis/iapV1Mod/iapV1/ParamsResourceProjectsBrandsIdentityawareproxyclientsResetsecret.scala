package typings.googleapis.iapV1Mod.iapV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the Identity Aware Proxy client to that will have its secret reset. In the following format: projects/{project_number/id\}/brands/{brand\}/identityAwareProxyClients/{client_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaResetIdentityAwareProxyClientSecretRequest] = js.undefined
}
object ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret {
  
  inline def apply(): ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret]
  }
  
  extension [Self <: ParamsResourceProjectsBrandsIdentityawareproxyclientsResetsecret](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaResetIdentityAwareProxyClientSecretRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
