package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse extends StObject {
  
  /**
    * The subscription that has user linked to it.
    */
  var subscription: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1EntitleSubscriptionResponse](x: Self) {
    
    inline def setSubscription(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
