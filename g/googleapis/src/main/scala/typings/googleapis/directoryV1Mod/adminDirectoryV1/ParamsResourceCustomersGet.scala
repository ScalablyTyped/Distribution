package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCustomersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Id of the customer to be retrieved
    */
  var customerKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceCustomersGet {
  
  @scala.inline
  def apply(): ParamsResourceCustomersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCustomersGet]
  }
  
  @scala.inline
  implicit class ParamsResourceCustomersGetMutableBuilder[Self <: ParamsResourceCustomersGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerKey(value: String): Self = StObject.set(x, "customerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerKeyUndefined: Self = StObject.set(x, "customerKey", js.undefined)
  }
}
