package typings.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceV1beta1Testiampermissions extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleIamV1TestIamPermissionsRequest] = js.native
  
  /**
    * REQUIRED: The resource for which the policy detail is being requested.
    * See the operation documentation for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.native
}
object ParamsResourceV1beta1Testiampermissions {
  
  @scala.inline
  def apply(): ParamsResourceV1beta1Testiampermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1beta1Testiampermissions]
  }
  
  @scala.inline
  implicit class ParamsResourceV1beta1TestiampermissionsMutableBuilder[Self <: ParamsResourceV1beta1Testiampermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGoogleIamV1TestIamPermissionsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
