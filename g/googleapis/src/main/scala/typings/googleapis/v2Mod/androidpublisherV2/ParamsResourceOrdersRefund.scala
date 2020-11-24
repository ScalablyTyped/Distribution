package typings.googleapis.v2Mod.androidpublisherV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
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
  implicit class ParamsResourceOrdersRefundOps[Self <: ParamsResourceOrdersRefund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setRevoke(value: Boolean): Self = this.set("revoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevoke: Self = this.set("revoke", js.undefined)
  }
}
