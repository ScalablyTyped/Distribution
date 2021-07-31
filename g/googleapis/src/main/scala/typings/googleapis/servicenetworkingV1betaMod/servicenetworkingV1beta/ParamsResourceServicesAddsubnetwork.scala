package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

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
  
  @scala.inline
  def apply(): ParamsResourceServicesAddsubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesAddsubnetwork]
  }
  
  @scala.inline
  implicit class ParamsResourceServicesAddsubnetworkMutableBuilder[Self <: ParamsResourceServicesAddsubnetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAddSubnetworkRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
