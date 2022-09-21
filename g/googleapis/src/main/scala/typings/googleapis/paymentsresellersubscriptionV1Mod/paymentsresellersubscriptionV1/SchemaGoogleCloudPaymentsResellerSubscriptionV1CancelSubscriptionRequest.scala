package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest extends StObject {
  
  /**
    * Optional. If true, the subscription will be cancelled immediately. Otherwise, the subscription will be cancelled at renewal_time, and therefore no prorated refund will be issued for the rest of the cycle.
    */
  var cancelImmediately: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the reason for the cancellation.
    */
  var cancellationReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest](x: Self) {
    
    inline def setCancelImmediately(value: Boolean): Self = StObject.set(x, "cancelImmediately", value.asInstanceOf[js.Any])
    
    inline def setCancelImmediatelyNull: Self = StObject.set(x, "cancelImmediately", null)
    
    inline def setCancelImmediatelyUndefined: Self = StObject.set(x, "cancelImmediately", js.undefined)
    
    inline def setCancellationReason(value: String): Self = StObject.set(x, "cancellationReason", value.asInstanceOf[js.Any])
    
    inline def setCancellationReasonNull: Self = StObject.set(x, "cancellationReason", null)
    
    inline def setCancellationReasonUndefined: Self = StObject.set(x, "cancellationReason", js.undefined)
  }
}
