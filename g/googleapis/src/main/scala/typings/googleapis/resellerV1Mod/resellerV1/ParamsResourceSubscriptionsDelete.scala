package typings.googleapis.resellerV1Mod.resellerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Either the customer's primary domain name or the customer's unique
    * identifier. If using the domain name, we do not recommend using a
    * customerId as a key for persistent data. If the domain name for a
    * customerId is changed, the Google system automatically updates.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * The deletionType query string enables the cancellation, downgrade, or
    * suspension of a subscription.
    */
  var deletionType: js.UndefOr[String] = js.undefined
  
  /**
    * This is a required property. The subscriptionId is the subscription
    * identifier and is unique for each customer. Since a subscriptionId
    * changes when a subscription is updated, we recommend to not use this ID
    * as a key for persistent data. And the subscriptionId can be found using
    * the retrieve all reseller subscriptions method.
    */
  var subscriptionId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSubscriptionsDelete {
  
  @scala.inline
  def apply(): ParamsResourceSubscriptionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceSubscriptionsDeleteMutableBuilder[Self <: ParamsResourceSubscriptionsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    @scala.inline
    def setDeletionType(value: String): Self = StObject.set(x, "deletionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionTypeUndefined: Self = StObject.set(x, "deletionType", js.undefined)
    
    @scala.inline
    def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
  }
}
