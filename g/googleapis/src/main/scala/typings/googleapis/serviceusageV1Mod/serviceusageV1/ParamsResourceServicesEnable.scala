package typings.googleapis.serviceusageV1Mod.serviceusageV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceServicesEnable extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of the consumer and service to enable the service on.  The
    * `EnableService` and `DisableService` methods currently only support
    * projects.  Enabling a service requires that the service is public or is
    * shared with the user enabling the service.  An example name would be:
    * `projects/123/services/serviceusage.googleapis.com` where `123` is the
    * project number (not project ID).
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEnableServiceRequest] = js.native
}
object ParamsResourceServicesEnable {
  
  @scala.inline
  def apply(): ParamsResourceServicesEnable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesEnable]
  }
  
  @scala.inline
  implicit class ParamsResourceServicesEnableMutableBuilder[Self <: ParamsResourceServicesEnable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaEnableServiceRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
