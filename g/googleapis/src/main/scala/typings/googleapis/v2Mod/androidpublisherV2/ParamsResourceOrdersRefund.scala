package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrdersRefund extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The order ID provided to the user when the subscription or in-app order
    * was purchased.
    */
  var orderId: js.UndefOr[String] = js.native
  
  /**
    * The package name of the application for which this subscription or in-app
    * item was purchased (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * Whether to revoke the purchased item. If set to true, access to the
    * subscription or in-app item will be terminated immediately. If the item
    * is a recurring subscription, all future payments will also be terminated.
    * Consumed in-app items need to be handled by developer's app. (optional)
    */
  var revoke: js.UndefOr[Boolean] = js.native
}
object ParamsResourceOrdersRefund {
  
  @scala.inline
  def apply(): ParamsResourceOrdersRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrdersRefund]
  }
  
  @scala.inline
  implicit class ParamsResourceOrdersRefundMutableBuilder[Self <: ParamsResourceOrdersRefund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setRevoke(value: Boolean): Self = StObject.set(x, "revoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevokeUndefined: Self = StObject.set(x, "revoke", js.undefined)
  }
}
