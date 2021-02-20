package typings.googleapis.vaultV1Mod.vaultV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMattersHoldsAccountsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The hold ID.
    */
  var holdId: js.UndefOr[String] = js.native
  
  /**
    * The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
}
object ParamsResourceMattersHoldsAccountsList {
  
  @scala.inline
  def apply(): ParamsResourceMattersHoldsAccountsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMattersHoldsAccountsList]
  }
  
  @scala.inline
  implicit class ParamsResourceMattersHoldsAccountsListMutableBuilder[Self <: ParamsResourceMattersHoldsAccountsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHoldId(value: String): Self = StObject.set(x, "holdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoldIdUndefined: Self = StObject.set(x, "holdId", js.undefined)
    
    @scala.inline
    def setMatterId(value: String): Self = StObject.set(x, "matterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatterIdUndefined: Self = StObject.set(x, "matterId", js.undefined)
  }
}
