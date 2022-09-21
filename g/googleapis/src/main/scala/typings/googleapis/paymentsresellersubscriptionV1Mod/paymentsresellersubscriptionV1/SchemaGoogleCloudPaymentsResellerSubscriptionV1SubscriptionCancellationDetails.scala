package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails extends StObject {
  
  /**
    * The reason of the cancellation.
    */
  var reason: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionCancellationDetails](x: Self) {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
