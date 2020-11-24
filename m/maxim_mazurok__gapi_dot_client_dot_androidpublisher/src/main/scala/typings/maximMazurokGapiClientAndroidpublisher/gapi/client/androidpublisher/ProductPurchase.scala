package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductPurchase extends js.Object {
  
  /** The acknowledgement state of the inapp product. Possible values are: 0. Yet to be acknowledged 1. Acknowledged */
  var acknowledgementState: js.UndefOr[Double] = js.native
  
  /** The consumption state of the inapp product. Possible values are: 0. Yet to be consumed 1. Consumed */
  var consumptionState: js.UndefOr[Double] = js.native
  
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[String] = js.native
  
  /** This kind represents an inappPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's account in your app. Only present if specified using
    * https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedaccountid when the purchase was made.
    */
  var obfuscatedExternalAccountId: js.UndefOr[String] = js.native
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's profile in your app. Only present if specified using
    * https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedprofileid when the purchase was made.
    */
  var obfuscatedExternalProfileId: js.UndefOr[String] = js.native
  
  /** The order id associated with the purchase of the inapp product. */
  var orderId: js.UndefOr[String] = js.native
  
  /** The inapp product SKU. */
  var productId: js.UndefOr[String] = js.native
  
  /** The purchase state of the order. Possible values are: 0. Purchased 1. Canceled 2. Pending */
  var purchaseState: js.UndefOr[Double] = js.native
  
  /** The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[String] = js.native
  
  /** The purchase token generated to identify this purchase. */
  var purchaseToken: js.UndefOr[String] = js.native
  
  /**
    * The type of purchase of the inapp product. This field is only set if this purchase was not made using the standard in-app billing flow. Possible values are: 0. Test (i.e. purchased
    * from a license testing account) 1. Promo (i.e. purchased using a promo code) 2. Rewarded (i.e. from watching a video ad instead of paying)
    */
  var purchaseType: js.UndefOr[Double] = js.native
  
  /** The quantity associated with the purchase of the inapp product. */
  var quantity: js.UndefOr[Double] = js.native
  
  /** ISO 3166-1 alpha-2 billing region code of the user at the time the product was granted. */
  var regionCode: js.UndefOr[String] = js.native
}
object ProductPurchase {
  
  @scala.inline
  def apply(): ProductPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPurchase]
  }
  
  @scala.inline
  implicit class ProductPurchaseOps[Self <: ProductPurchase] (val x: Self) extends AnyVal {
    
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
    def setAcknowledgementState(value: Double): Self = this.set("acknowledgementState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcknowledgementState: Self = this.set("acknowledgementState", js.undefined)
    
    @scala.inline
    def setConsumptionState(value: Double): Self = this.set("consumptionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumptionState: Self = this.set("consumptionState", js.undefined)
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = this.set("developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperPayload: Self = this.set("developerPayload", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setObfuscatedExternalAccountId(value: String): Self = this.set("obfuscatedExternalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObfuscatedExternalAccountId: Self = this.set("obfuscatedExternalAccountId", js.undefined)
    
    @scala.inline
    def setObfuscatedExternalProfileId(value: String): Self = this.set("obfuscatedExternalProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObfuscatedExternalProfileId: Self = this.set("obfuscatedExternalProfileId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    
    @scala.inline
    def setPurchaseState(value: Double): Self = this.set("purchaseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseState: Self = this.set("purchaseState", js.undefined)
    
    @scala.inline
    def setPurchaseTimeMillis(value: String): Self = this.set("purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseTimeMillis: Self = this.set("purchaseTimeMillis", js.undefined)
    
    @scala.inline
    def setPurchaseToken(value: String): Self = this.set("purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseToken: Self = this.set("purchaseToken", js.undefined)
    
    @scala.inline
    def setPurchaseType(value: Double): Self = this.set("purchaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseType: Self = this.set("purchaseType", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
  }
}
