package typings.googleapis.resellerV1Mod.resellerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * This can be either the customer's primary domain name or the customer's unique identifier. If the domain name for a customer changes, the old domain name cannot be used to access the customer, but the customer's unique identifier (as returned by the API) can always be used. We recommend storing the unique identifier in your systems where applicable.
    */
  var customerId: js.UndefOr[String] = js.undefined
  
  /**
    * The `deletionType` query string enables the cancellation, downgrade, or suspension of a subscription.
    */
  var deletionType: js.UndefOr[String] = js.undefined
  
  /**
    * This is a required property. The `subscriptionId` is the subscription identifier and is unique for each customer. Since a `subscriptionId` changes when a subscription is updated, we recommend to not use this ID as a key for persistent data. And the `subscriptionId` can be found using the retrieve all reseller subscriptions method.
    */
  var subscriptionId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSubscriptionsDelete {
  
  inline def apply(): ParamsResourceSubscriptionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsDelete]
  }
  
  extension [Self <: ParamsResourceSubscriptionsDelete](x: Self) {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
    
    inline def setDeletionType(value: String): Self = StObject.set(x, "deletionType", value.asInstanceOf[js.Any])
    
    inline def setDeletionTypeUndefined: Self = StObject.set(x, "deletionType", js.undefined)
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
  }
}
