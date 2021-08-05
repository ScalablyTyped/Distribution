package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ProductPurchase resource indicates the status of a user&#39;s inapp
  * product purchase.
  */
trait SchemaProductPurchase extends StObject {
  
  /**
    * The consumption state of the inapp product. Possible values are:   - Yet
    * to be consumed  - Consumed
    */
  var consumptionState: js.UndefOr[Double] = js.undefined
  
  /**
    * A developer-specified string that contains supplemental information about
    * an order.
    */
  var developerPayload: js.UndefOr[String] = js.undefined
  
  /**
    * This kind represents an inappPurchase object in the androidpublisher
    * service.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The order id associated with the purchase of the inapp product.
    */
  var orderId: js.UndefOr[String] = js.undefined
  
  /**
    * The purchase state of the order. Possible values are:   - Purchased  -
    * Canceled
    */
  var purchaseState: js.UndefOr[Double] = js.undefined
  
  /**
    * The time the product was purchased, in milliseconds since the epoch (Jan
    * 1, 1970).
    */
  var purchaseTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The type of purchase of the inapp product. This field is only set if this
    * purchase was not made using the standard in-app billing flow. Possible
    * values are:   - Test (i.e. purchased from a license testing account)  -
    * Promo (i.e. purchased using a promo code)  - Rewarded (i.e. from watching
    * a video ad instead of paying)
    */
  var purchaseType: js.UndefOr[Double] = js.undefined
}
object SchemaProductPurchase {
  
  inline def apply(): SchemaProductPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductPurchase]
  }
  
  extension [Self <: SchemaProductPurchase](x: Self) {
    
    inline def setConsumptionState(value: Double): Self = StObject.set(x, "consumptionState", value.asInstanceOf[js.Any])
    
    inline def setConsumptionStateUndefined: Self = StObject.set(x, "consumptionState", js.undefined)
    
    inline def setDeveloperPayload(value: String): Self = StObject.set(x, "developerPayload", value.asInstanceOf[js.Any])
    
    inline def setDeveloperPayloadUndefined: Self = StObject.set(x, "developerPayload", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setPurchaseState(value: Double): Self = StObject.set(x, "purchaseState", value.asInstanceOf[js.Any])
    
    inline def setPurchaseStateUndefined: Self = StObject.set(x, "purchaseState", js.undefined)
    
    inline def setPurchaseTimeMillis(value: String): Self = StObject.set(x, "purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTimeMillisUndefined: Self = StObject.set(x, "purchaseTimeMillis", js.undefined)
    
    inline def setPurchaseType(value: Double): Self = StObject.set(x, "purchaseType", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTypeUndefined: Self = StObject.set(x, "purchaseType", js.undefined)
  }
}
