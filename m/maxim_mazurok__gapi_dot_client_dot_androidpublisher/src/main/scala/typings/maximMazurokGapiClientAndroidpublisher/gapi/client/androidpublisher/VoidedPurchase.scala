package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoidedPurchase extends StObject {
  
  /** This kind represents a voided purchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The order id which uniquely identifies a one-time purchase, subscription purchase, or subscription renewal. */
  var orderId: js.UndefOr[String] = js.undefined
  
  /** The time at which the purchase was made, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[String] = js.undefined
  
  /** The token which uniquely identifies a one-time purchase or subscription. To uniquely identify subscription renewals use order_id (available starting from version 3 of the API). */
  var purchaseToken: js.UndefOr[String] = js.undefined
  
  /** The reason why the purchase was voided, possible values are: 0. Other 1. Remorse 2. Not_received 3. Defective 4. Accidental_purchase 5. Fraud 6. Friendly_fraud 7. Chargeback */
  var voidedReason: js.UndefOr[Double] = js.undefined
  
  /** The initiator of voided purchase, possible values are: 0. User 1. Developer 2. Google */
  var voidedSource: js.UndefOr[Double] = js.undefined
  
  /** The time at which the purchase was canceled/refunded/charged-back, in milliseconds since the epoch (Jan 1, 1970). */
  var voidedTimeMillis: js.UndefOr[String] = js.undefined
}
object VoidedPurchase {
  
  inline def apply(): VoidedPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoidedPurchase]
  }
  
  extension [Self <: VoidedPurchase](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setPurchaseTimeMillis(value: String): Self = StObject.set(x, "purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTimeMillisUndefined: Self = StObject.set(x, "purchaseTimeMillis", js.undefined)
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
    
    inline def setVoidedReason(value: Double): Self = StObject.set(x, "voidedReason", value.asInstanceOf[js.Any])
    
    inline def setVoidedReasonUndefined: Self = StObject.set(x, "voidedReason", js.undefined)
    
    inline def setVoidedSource(value: Double): Self = StObject.set(x, "voidedSource", value.asInstanceOf[js.Any])
    
    inline def setVoidedSourceUndefined: Self = StObject.set(x, "voidedSource", js.undefined)
    
    inline def setVoidedTimeMillis(value: String): Self = StObject.set(x, "voidedTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setVoidedTimeMillisUndefined: Self = StObject.set(x, "voidedTimeMillis", js.undefined)
  }
}
