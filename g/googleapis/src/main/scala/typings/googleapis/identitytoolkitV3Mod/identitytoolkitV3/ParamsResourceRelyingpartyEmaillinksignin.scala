package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceRelyingpartyEmaillinksignin extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest] = js.native
}
object ParamsResourceRelyingpartyEmaillinksignin {
  
  @scala.inline
  def apply(): ParamsResourceRelyingpartyEmaillinksignin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRelyingpartyEmaillinksignin]
  }
  
  @scala.inline
  implicit class ParamsResourceRelyingpartyEmaillinksigninMutableBuilder[Self <: ParamsResourceRelyingpartyEmaillinksignin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaIdentitytoolkitRelyingpartyEmailLinkSigninRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
