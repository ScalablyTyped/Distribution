package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceServicesAllocatequota extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAllocateQuotaRequest] = js.native
  
  /**
    * Name of the service as specified in the service configuration. For
    * example, `"pubsub.googleapis.com"`.  See google.api.Service for the
    * definition of a service name.
    */
  var serviceName: js.UndefOr[String] = js.native
}
object ParamsResourceServicesAllocatequota {
  
  @scala.inline
  def apply(): ParamsResourceServicesAllocatequota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesAllocatequota]
  }
  
  @scala.inline
  implicit class ParamsResourceServicesAllocatequotaMutableBuilder[Self <: ParamsResourceServicesAllocatequota] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAllocateQuotaRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
