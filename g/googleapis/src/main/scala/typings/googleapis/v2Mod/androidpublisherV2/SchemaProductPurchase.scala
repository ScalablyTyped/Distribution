package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ProductPurchase resource indicates the status of a user&#39;s inapp
  * product purchase.
  */
@js.native
trait SchemaProductPurchase extends StObject {
  
  /**
    * The consumption state of the inapp product. Possible values are:   - Yet
    * to be consumed  - Consumed
    */
  var consumptionState: js.UndefOr[Double] = js.native
  
  /**
    * A developer-specified string that contains supplemental information about
    * an order.
    */
  var developerPayload: js.UndefOr[String] = js.native
  
  /**
    * This kind represents an inappPurchase object in the androidpublisher
    * service.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The order id associated with the purchase of the inapp product.
    */
  var orderId: js.UndefOr[String] = js.native
  
  /**
    * The purchase state of the order. Possible values are:   - Purchased  -
    * Canceled
    */
  var purchaseState: js.UndefOr[Double] = js.native
  
  /**
    * The time the product was purchased, in milliseconds since the epoch (Jan
    * 1, 1970).
    */
  var purchaseTimeMillis: js.UndefOr[String] = js.native
  
  /**
    * The type of purchase of the inapp product. This field is only set if this
    * purchase was not made using the standard in-app billing flow. Possible
    * values are:   - Test (i.e. purchased from a license testing account)  -
    * Promo (i.e. purchased using a promo code)  - Rewarded (i.e. from watching
    * a video ad instead of paying)
    */
  var purchaseType: js.UndefOr[Double] = js.native
}
object SchemaProductPurchase {
  
  @scala.inline
  def apply(): SchemaProductPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPurchase]
  }
  
  @scala.inline
  implicit class SchemaProductPurchaseMutableBuilder[Self <: SchemaProductPurchase] (val x: Self) extends AnyVal {
    
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
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setPurchaseState(value: Double): Self = StObject.set(x, "purchaseState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseStateUndefined: Self = StObject.set(x, "purchaseState", js.undefined)
    
    @scala.inline
    def setPurchaseTimeMillis(value: String): Self = StObject.set(x, "purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTimeMillisUndefined: Self = StObject.set(x, "purchaseTimeMillis", js.undefined)
    
    @scala.inline
    def setPurchaseType(value: Double): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
  }
}
