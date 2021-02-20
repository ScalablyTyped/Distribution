package typings.googleapis.v41Mod.adsensehostV41

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAccountsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Ad clients to list accounts for.
    */
  var filterAdClientId: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourceAccountsList {
  
  @scala.inline
  def apply(): ParamsResourceAccountsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAccountsListMutableBuilder[Self <: ParamsResourceAccountsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFilterAdClientId(value: js.Array[String]): Self = StObject.set(x, "filterAdClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterAdClientIdUndefined: Self = StObject.set(x, "filterAdClientId", js.undefined)
    
    @scala.inline
    def setFilterAdClientIdVarargs(value: String*): Self = StObject.set(x, "filterAdClientId", js.Array(value :_*))
  }
}
