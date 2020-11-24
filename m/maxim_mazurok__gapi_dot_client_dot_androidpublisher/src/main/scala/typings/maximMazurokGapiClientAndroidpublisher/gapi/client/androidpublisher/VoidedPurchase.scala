package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoidedPurchase extends js.Object {
  
  /** This kind represents a voided purchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.native
  
  /** The order id which uniquely identifies a one-time purchase, subscription purchase, or subscription renewal. */
  var orderId: js.UndefOr[String] = js.native
  
  /** The time at which the purchase was made, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[String] = js.native
  
  /** The token which uniquely identifies a one-time purchase or subscription. To uniquely identify subscription renewals use order_id (available starting from version 3 of the API). */
  var purchaseToken: js.UndefOr[String] = js.native
  
  /** The reason why the purchase was voided, possible values are: 0. Other 1. Remorse 2. Not_received 3. Defective 4. Accidental_purchase 5. Fraud 6. Friendly_fraud 7. Chargeback */
  var voidedReason: js.UndefOr[Double] = js.native
  
  /** The initiator of voided purchase, possible values are: 0. User 1. Developer 2. Google */
  var voidedSource: js.UndefOr[Double] = js.native
  
  /** The time at which the purchase was canceled/refunded/charged-back, in milliseconds since the epoch (Jan 1, 1970). */
  var voidedTimeMillis: js.UndefOr[String] = js.native
}
object VoidedPurchase {
  
  @scala.inline
  def apply(): VoidedPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoidedPurchase]
  }
  
  @scala.inline
  implicit class VoidedPurchaseOps[Self <: VoidedPurchase] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPurchaseTimeMillis(value: String): Self = this.set("purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseTimeMillis: Self = this.set("purchaseTimeMillis", js.undefined)
    
    @scala.inline
    def setPurchaseToken(value: String): Self = this.set("purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseToken: Self = this.set("purchaseToken", js.undefined)
    
    @scala.inline
    def setVoidedReason(value: Double): Self = this.set("voidedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoidedReason: Self = this.set("voidedReason", js.undefined)
    
    @scala.inline
    def setVoidedSource(value: Double): Self = this.set("voidedSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoidedSource: Self = this.set("voidedSource", js.undefined)
    
    @scala.inline
    def setVoidedTimeMillis(value: String): Self = this.set("voidedTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoidedTimeMillis: Self = this.set("voidedTimeMillis", js.undefined)
  }
}
