package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A VoidedPurchase resource indicates a purchase that was either
  * canceled/refunded/charged-back.
  */
trait SchemaVoidedPurchase extends StObject {
  
  /**
    * This kind represents a voided purchase object in the androidpublisher
    * service.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the purchase was made, in milliseconds since the epoch
    * (Jan 1, 1970).
    */
  var purchaseTimeMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The token that was generated when a purchase was made. This uniquely
    * identifies a purchase.
    */
  var purchaseToken: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the purchase was canceled/refunded/charged-back, in
    * milliseconds since the epoch (Jan 1, 1970).
    */
  var voidedTimeMillis: js.UndefOr[String] = js.undefined
}
object SchemaVoidedPurchase {
  
  inline def apply(): SchemaVoidedPurchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVoidedPurchase]
  }
  
  extension [Self <: SchemaVoidedPurchase](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPurchaseTimeMillis(value: String): Self = StObject.set(x, "purchaseTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTimeMillisUndefined: Self = StObject.set(x, "purchaseTimeMillis", js.undefined)
    
    inline def setPurchaseToken(value: String): Self = StObject.set(x, "purchaseToken", value.asInstanceOf[js.Any])
    
    inline def setPurchaseTokenUndefined: Self = StObject.set(x, "purchaseToken", js.undefined)
    
    inline def setVoidedTimeMillis(value: String): Self = StObject.set(x, "voidedTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setVoidedTimeMillisUndefined: Self = StObject.set(x, "voidedTimeMillis", js.undefined)
  }
}
