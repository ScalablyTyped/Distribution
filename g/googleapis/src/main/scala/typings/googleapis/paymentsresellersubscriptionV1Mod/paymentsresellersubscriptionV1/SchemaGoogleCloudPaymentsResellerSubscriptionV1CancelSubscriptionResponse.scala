package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse extends StObject {
  
  /**
    * The cancelled subscription resource.
    */
  var subscription: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionResponse](x: Self) {
    
    inline def setSubscription(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
