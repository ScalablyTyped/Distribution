package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesAddsubnetwork
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. A tenant project in the service producer organization, in the
    * following format: services/{service}/{collection-id}/{resource-id}.
    * {collection-id} is the cloud resource collection type that represents the
    * tenant project. Only `projects` are supported. {resource-id} is the
    * tenant project numeric id, such as `123456`. {service} the name of the
    * peering service, such as `service-peering.example.com`. This service must
    * already be enabled in the service consumer's project.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAddSubnetworkRequest] = js.undefined
}
object ParamsResourceServicesAddsubnetwork {
  
  inline def apply(): ParamsResourceServicesAddsubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesAddsubnetwork]
  }
  
  extension [Self <: ParamsResourceServicesAddsubnetwork](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAddSubnetworkRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
