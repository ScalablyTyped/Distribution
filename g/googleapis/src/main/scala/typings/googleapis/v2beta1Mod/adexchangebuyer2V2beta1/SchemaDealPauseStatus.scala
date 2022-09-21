package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealPauseStatus extends StObject {
  
  /**
    * The buyer's reason for pausing, if the buyer paused the deal.
    */
  var buyerPauseReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The role of the person who first paused this deal.
    */
  var firstPausedBy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True, if the buyer has paused the deal unilaterally.
    */
  var hasBuyerPaused: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * True, if the seller has paused the deal unilaterally.
    */
  var hasSellerPaused: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The seller's reason for pausing, if the seller paused the deal.
    */
  var sellerPauseReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaDealPauseStatus {
  
  inline def apply(): SchemaDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealPauseStatus]
  }
  
  extension [Self <: SchemaDealPauseStatus](x: Self) {
    
    inline def setBuyerPauseReason(value: String): Self = StObject.set(x, "buyerPauseReason", value.asInstanceOf[js.Any])
    
    inline def setBuyerPauseReasonNull: Self = StObject.set(x, "buyerPauseReason", null)
    
    inline def setBuyerPauseReasonUndefined: Self = StObject.set(x, "buyerPauseReason", js.undefined)
    
    inline def setFirstPausedBy(value: String): Self = StObject.set(x, "firstPausedBy", value.asInstanceOf[js.Any])
    
    inline def setFirstPausedByNull: Self = StObject.set(x, "firstPausedBy", null)
    
    inline def setFirstPausedByUndefined: Self = StObject.set(x, "firstPausedBy", js.undefined)
    
    inline def setHasBuyerPaused(value: Boolean): Self = StObject.set(x, "hasBuyerPaused", value.asInstanceOf[js.Any])
    
    inline def setHasBuyerPausedNull: Self = StObject.set(x, "hasBuyerPaused", null)
    
    inline def setHasBuyerPausedUndefined: Self = StObject.set(x, "hasBuyerPaused", js.undefined)
    
    inline def setHasSellerPaused(value: Boolean): Self = StObject.set(x, "hasSellerPaused", value.asInstanceOf[js.Any])
    
    inline def setHasSellerPausedNull: Self = StObject.set(x, "hasSellerPaused", null)
    
    inline def setHasSellerPausedUndefined: Self = StObject.set(x, "hasSellerPaused", js.undefined)
    
    inline def setSellerPauseReason(value: String): Self = StObject.set(x, "sellerPauseReason", value.asInstanceOf[js.Any])
    
    inline def setSellerPauseReasonNull: Self = StObject.set(x, "sellerPauseReason", null)
    
    inline def setSellerPauseReasonUndefined: Self = StObject.set(x, "sellerPauseReason", js.undefined)
  }
}
