package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePipelinesGetcontrollerconfig extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The operation to retrieve controller configuration for.
    */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    *
    */
  var validationToken: js.UndefOr[String] = js.native
}
object ParamsResourcePipelinesGetcontrollerconfig {
  
  @scala.inline
  def apply(): ParamsResourcePipelinesGetcontrollerconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePipelinesGetcontrollerconfig]
  }
  
  @scala.inline
  implicit class ParamsResourcePipelinesGetcontrollerconfigMutableBuilder[Self <: ParamsResourcePipelinesGetcontrollerconfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setValidationToken(value: String): Self = StObject.set(x, "validationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationTokenUndefined: Self = StObject.set(x, "validationToken", js.undefined)
  }
}
