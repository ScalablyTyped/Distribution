package typings.googleapis.resellerV1Mod.resellerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceSubscriptionsDelete extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Either the customer's primary domain name or the customer's unique
    * identifier. If using the domain name, we do not recommend using a
    * customerId as a key for persistent data. If the domain name for a
    * customerId is changed, the Google system automatically updates.
    */
  var customerId: js.UndefOr[String] = js.native
  
  /**
    * The deletionType query string enables the cancellation, downgrade, or
    * suspension of a subscription.
    */
  var deletionType: js.UndefOr[String] = js.native
  
  /**
    * This is a required property. The subscriptionId is the subscription
    * identifier and is unique for each customer. Since a subscriptionId
    * changes when a subscription is updated, we recommend to not use this ID
    * as a key for persistent data. And the subscriptionId can be found using
    * the retrieve all reseller subscriptions method.
    */
  var subscriptionId: js.UndefOr[String] = js.native
}
object ParamsResourceSubscriptionsDelete {
  
  @scala.inline
  def apply(): ParamsResourceSubscriptionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceSubscriptionsDeleteOps[Self <: ParamsResourceSubscriptionsDelete] (val x: Self) extends AnyVal {
    
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    
    @scala.inline
    def setDeletionType(value: String): Self = this.set("deletionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionType: Self = this.set("deletionType", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionId: Self = this.set("subscriptionId", js.undefined)
  }
}
