package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DealPauseStatus extends StObject {
  
  /** The buyer's reason for pausing, if the buyer paused the deal. */
  var buyerPauseReason: js.UndefOr[String] = js.native
  
  /** The role of the person who first paused this deal. */
  var firstPausedBy: js.UndefOr[String] = js.native
  
  /** True, if the buyer has paused the deal unilaterally. */
  var hasBuyerPaused: js.UndefOr[Boolean] = js.native
  
  /** True, if the seller has paused the deal unilaterally. */
  var hasSellerPaused: js.UndefOr[Boolean] = js.native
  
  /** The seller's reason for pausing, if the seller paused the deal. */
  var sellerPauseReason: js.UndefOr[String] = js.native
}
object DealPauseStatus {
  
  @scala.inline
  def apply(): DealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealPauseStatus]
  }
  
  @scala.inline
  implicit class DealPauseStatusMutableBuilder[Self <: DealPauseStatus] (val x: Self) extends AnyVal {
    
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
