package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracks which parties (if any) have paused a deal. The deal is considered
  * paused if either hasBuyerPaused or hasSellPaused is true.
  */
@js.native
trait SchemaDealPauseStatus extends StObject {
  
  /**
    * The buyer&#39;s reason for pausing, if the buyer paused the deal.
    */
  var buyerPauseReason: js.UndefOr[String] = js.native
  
  /**
    * The role of the person who first paused this deal.
    */
  var firstPausedBy: js.UndefOr[String] = js.native
  
  /**
    * True, if the buyer has paused the deal unilaterally.
    */
  var hasBuyerPaused: js.UndefOr[Boolean] = js.native
  
  /**
    * True, if the seller has paused the deal unilaterally.
    */
  var hasSellerPaused: js.UndefOr[Boolean] = js.native
  
  /**
    * The seller&#39;s reason for pausing, if the seller paused the deal.
    */
  var sellerPauseReason: js.UndefOr[String] = js.native
}
object SchemaDealPauseStatus {
  
  @scala.inline
  def apply(): SchemaDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealPauseStatus]
  }
  
  @scala.inline
  implicit class SchemaDealPauseStatusMutableBuilder[Self <: SchemaDealPauseStatus] (val x: Self) extends AnyVal {
    
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
