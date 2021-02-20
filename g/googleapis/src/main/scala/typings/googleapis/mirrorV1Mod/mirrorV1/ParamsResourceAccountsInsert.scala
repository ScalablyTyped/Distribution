package typings.googleapis.mirrorV1Mod.mirrorV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsInsert extends StandardParameters {
  
  /**
    * The name of the account to be passed to the Android Account Manager.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * Account type to be passed to Android Account Manager.
    */
  var accountType: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAccount] = js.native
  
  /**
    * The ID for the user.
    */
  var userToken: js.UndefOr[String] = js.native
}
object ParamsResourceAccountsInsert {
  
  @scala.inline
  def apply(): ParamsResourceAccountsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsInsertMutableBuilder[Self <: ParamsResourceAccountsInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    @scala.inline
    def setAccountType(value: String): Self = StObject.set(x, "accountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountTypeUndefined: Self = StObject.set(x, "accountType", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaAccount): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
  }
}
