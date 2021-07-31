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
  
  @scala.inline
  def apply(): DealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealServingMetadataDealPauseStatus]
  }
  
  @scala.inline
  implicit class DealServingMetadataDealPauseStatusMutableBuilder[Self <: DealServingMetadataDealPauseStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyerPauseReason(value: String): Self = StObject.set(x, "buyerPauseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyerPauseReasonUndefined: Self = StObject.set(x, "buyerPauseReason", js.undefined)
    
    @scala.inline
    def setFirstPausedBy(value: String): Self = StObject.set(x, "firstPausedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstPausedByUndefined: Self = StObject.set(x, "firstPausedBy", js.undefined)
    
    @scala.inline
    def setHasBuyerPaused(value: Boolean): Self = StObject.set(x, "hasBuyerPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasBuyerPausedUndefined: Self = StObject.set(x, "hasBuyerPaused", js.undefined)
    
    @scala.inline
    def setHasSellerPaused(value: Boolean): Self = StObject.set(x, "hasSellerPaused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSellerPausedUndefined: Self = StObject.set(x, "hasSellerPaused", js.undefined)
    
    @scala.inline
    def setSellerPauseReason(value: String): Self = StObject.set(x, "sellerPauseReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerPauseReasonUndefined: Self = StObject.set(x, "sellerPauseReason", js.undefined)
  }
}
