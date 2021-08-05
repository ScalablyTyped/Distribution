package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceV1beta1Getsettings
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Optional. The unique identifier of the G Suite organization account of
    * the customer the alert settings are associated with. Inferred from the
    * caller identity if not provided.
    */
  var customerId: js.UndefOr[String] = js.undefined
}
object ParamsResourceV1beta1Getsettings {
  
  inline def apply(): ParamsResourceV1beta1Getsettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceV1beta1Getsettings]
  }
  
  extension [Self <: ParamsResourceV1beta1Getsettings](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
