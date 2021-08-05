package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNotificationsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The unique ID for the customer's G Suite account. The customerId is also
    * returned as part of the Users resource.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the notification.
    */
  var notificationId: js.UndefOr[String] = js.undefined
}
object ParamsResourceNotificationsGet {
  
  inline def apply(): ParamsResourceNotificationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNotificationsGet]
  }
  
  extension [Self <: ParamsResourceNotificationsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setNotificationId(value: String): Self = StObject.set(x, "notificationId", value.asInstanceOf[js.Any])
    
    inline def setNotificationIdUndefined: Self = StObject.set(x, "notificationId", js.undefined)
  }
}
