package typings.googleapis.spannerV1Mod.spannerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesGetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetIamPolicyRequest] = js.undefined
  
  /**
    * REQUIRED: The Cloud Spanner resource for which the policy is being
    * retrieved. The format is `projects/<project ID>/instances/<instance ID>`
    * for instance resources and `projects/<project ID>/instances/<instance
    * ID>/databases/<database ID>` for database resources.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesGetiampolicy {
  
  @scala.inline
  def apply(): ParamsResourceProjectsInstancesGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesGetiampolicy]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsInstancesGetiampolicyMutableBuilder[Self <: ParamsResourceProjectsInstancesGetiampolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaGetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
