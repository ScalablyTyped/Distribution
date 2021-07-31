package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductPurchase extends StObject {
  
  /** The acknowledgement state of the inapp product. Possible values are: 0. Yet to be acknowledged 1. Acknowledged */
  var acknowledgementState: js.UndefOr[Double] = js.undefined
  
  /** The consumption state of the inapp product. Possible values are: 0. Yet to be consumed 1. Consumed */
  var consumptionState: js.UndefOr[Double] = js.undefined
  
  /** A developer-specified string that contains supplemental information about an order. */
  var developerPayload: js.UndefOr[String] = js.undefined
  
  /** This kind represents an inappPurchase object in the androidpublisher service. */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's account in your app. Only present if specified using
    * https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedaccountid when the purchase was made.
    */
  var obfuscatedExternalAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * An obfuscated version of the id that is uniquely associated with the user's profile in your app. Only present if specified using
    * https://developer.android.com/reference/com/android/billingclient/api/BillingFlowParams.Builder#setobfuscatedprofileid when the purchase was made.
    */
  var obfuscatedExternalProfileId: js.UndefOr[String] = js.undefined
  
  /** The order id associated with the purchase of the inapp product. */
  var orderId: js.UndefOr[String] = js.undefined
  
  /** The inapp product SKU. */
  var productId: js.UndefOr[String] = js.undefined
  
  /** The purchase state of the order. Possible values are: 0. Purchased 1. Canceled 2. Pending */
  var purchaseState: js.UndefOr[Double] = js.undefined
  
  /** The time the product was purchased, in milliseconds since the epoch (Jan 1, 1970). */
  var purchaseTimeMillis: js.UndefOr[String] = js.undefined
  
  /** The purchase token generated to identify this purchase. */
  var purchaseToken: js.UndefOr[String] = js.undefined
  
  /**
    * The type of purchase of the inapp product. This field is only set if this purchase was not made using the standard in-app billing flow. Possible values are: 0. Test (i.e. purchased
    * from a license testing account) 1. Promo (i.e. purchased using a promo code) 2. Rewarded (i.e. from watching a video ad instead of paying)
    */
  var purchaseType: js.UndefOr[Double] = js.undefined
  
  /** The quantity associated with the purchase of the inapp product. */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /** ISO 3166-1 alpha-2 billing region code of the user at the time the product was granted. */
  var regionCode: js.UndefOr[String] = js.undefined
}
object ProductPurchase {
  
  @scala.inline
  def apply(): ProductPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPurchase]
  }
  
  @scala.inline
  implicit class ProductPurchaseMutableBuilder[Self <: ProductPurchase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledgementState(value: Double): Self = StObject.set(x, "acknowledgementState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgementStateUndefined: Self = StObject.set(x, "acknowledgementState", js.undefined)
    
    @scala.inline
    def setConsumptionState(value: Double): Self = StObject.set(x, "consumptionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumptionStateUndefined: Self = StObject.set(x, "consumptionState", js.undefined)
    
    @scala.inline
    def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setObfuscatedExternalAccountId(value: String): Self = StObject.set(x, "obfuscatedExternalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObfuscatedExternalAccountIdUndefined: Self = StObject.set(x, "obfuscatedExternalAccountId", js.undefined)
    
    @scala.inline
    def setObfuscatedExternalProfileId(value: String): Self = StObject.set(x, "obfuscatedExternalProfileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObfuscatedExternalProfileIdUndefined: Self = StObject.set(x, "obfuscatedExternalProfileId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    @scala.inline
    def setPurchaseState(value: Double): Self = StObject.set(x, "purchaseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseStateUndefined: Self = StObject.set(x, "purchaseState", js.undefined)
    
    @scala.inline
    def setPurchaseTimeMillis(value: String): Self = StObject.set(x, "purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTimeMillisUndefined: Self = StObject.set(x, "purchaseTimeMillis", js.undefined)
    
    @scala.inline
    def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
    
    @scala.inline
    def setPurchaseType(value: Double): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
