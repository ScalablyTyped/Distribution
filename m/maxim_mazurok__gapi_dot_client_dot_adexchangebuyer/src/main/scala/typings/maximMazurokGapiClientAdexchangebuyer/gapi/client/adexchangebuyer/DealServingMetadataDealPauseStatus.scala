package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DealServingMetadataDealPauseStatus extends StObject {
  
  var buyerPauseReason: js.UndefOr[String] = js.undefined
  
  /** If the deal is paused, records which party paused the deal first. */
  var firstPausedBy: js.UndefOr[String] = js.undefined
  
  var hasBuyerPaused: js.UndefOr[Boolean] = js.undefined
  
  var hasSellerPaused: js.UndefOr[Boolean] = js.undefined
  
  var sellerPauseReason: js.UndefOr[String] = js.undefined
}
object DealServingMetadataDealPauseStatus {
  
  inline def apply(): DealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadataDealPauseStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DealServingMetadataDealPauseStatus] (val x: Self) extends AnyVal {
    
    inline def setBuyerPauseReason(value: String): Self = StObject.set(x, "buyerPauseReason", value.asInstanceOf[js.Any])
    
    inline def setBuyerPauseReasonUndefined: Self = StObject.set(x, "buyerPauseReason", js.undefined)
    
    inline def setFirstPausedBy(value: String): Self = StObject.set(x, "firstPausedBy", value.asInstanceOf[js.Any])
    
    inline def setFirstPausedByUndefined: Self = StObject.set(x, "firstPausedBy", js.undefined)
    
    inline def setHasBuyerPaused(value: Boolean): Self = StObject.set(x, "hasBuyerPaused", value.asInstanceOf[js.Any])
    
    inline def setHasBuyerPausedUndefined: Self = StObject.set(x, "hasBuyerPaused", js.undefined)
    
    inline def setHasSellerPaused(value: Boolean): Self = StObject.set(x, "hasSellerPaused", value.asInstanceOf[js.Any])
    
    inline def setHasSellerPausedUndefined: Self = StObject.set(x, "hasSellerPaused", js.undefined)
    
    inline def setSellerPauseReason(value: String): Self = StObject.set(x, "sellerPauseReason", value.asInstanceOf[js.Any])
    
    inline def setSellerPauseReasonUndefined: Self = StObject.set(x, "sellerPauseReason", js.undefined)
  }
}
