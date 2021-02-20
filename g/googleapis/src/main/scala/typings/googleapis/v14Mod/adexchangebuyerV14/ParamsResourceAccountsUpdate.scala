package typings.googleapis.v14Mod.adexchangebuyerV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsUpdate extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Confirmation for erasing bidder and cookie matching urls.
    */
  var confirmUnsafeAccountChange: js.UndefOr[Boolean] = js.native
  
  /**
    * The account id
    */
  var id: js.UndefOr[Double] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccount] = js.native
}
object ParamsResourceAccountsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceAccountsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsUpdateMutableBuilder[Self <: ParamsResourceAccountsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setConfirmUnsafeAccountChange(value: Boolean): Self = StObject.set(x, "confirmUnsafeAccountChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmUnsafeAccountChangeUndefined: Self = StObject.set(x, "confirmUnsafeAccountChange", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAccount): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
