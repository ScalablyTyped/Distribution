package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse extends StObject {
  
  /**
    * The updated subscription resource.
    */
  var subscription: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1UndoCancelSubscriptionResponse](x: Self) {
    
    inline def setSubscription(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
