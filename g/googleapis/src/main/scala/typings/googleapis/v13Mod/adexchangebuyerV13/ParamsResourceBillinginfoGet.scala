package typings.googleapis.v13Mod.adexchangebuyerV13

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBillinginfoGet
  extends StObject
     with StandardParameters {
  
  /**
    * The account id.
    */
  var accountId: js.UndefOr[Double] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
}
object ParamsResourceBillinginfoGet {
  
  @scala.inline
  def apply(): ParamsResourceBillinginfoGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBillinginfoGet]
  }
  
  @scala.inline
  implicit class ParamsResourceBillinginfoGetMutableBuilder[Self <: ParamsResourceBillinginfoGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: Double): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
  }
}
