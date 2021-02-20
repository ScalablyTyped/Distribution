package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tracks which parties (if any) have paused a deal. The deal is considered
  * paused if has_buyer_paused || has_seller_paused. Each of the
  * has_buyer_paused or the has_seller_paused bits can be set independently.
  */
@js.native
trait SchemaDealServingMetadataDealPauseStatus extends StObject {
  
  var buyerPauseReason: js.UndefOr[String] = js.native
  
  /**
    * If the deal is paused, records which party paused the deal first.
    */
  var firstPausedBy: js.UndefOr[String] = js.native
  
  var hasBuyerPaused: js.UndefOr[Boolean] = js.native
  
  var hasSellerPaused: js.UndefOr[Boolean] = js.native
  
  var sellerPauseReason: js.UndefOr[String] = js.native
}
object SchemaDealServingMetadataDealPauseStatus {
  
  @scala.inline
  def apply(): SchemaDealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealServingMetadataDealPauseStatus]
  }
  
  @scala.inline
  implicit class SchemaDealServingMetadataDealPauseStatusMutableBuilder[Self <: SchemaDealServingMetadataDealPauseStatus] (val x: Self) extends AnyVal {
    
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
