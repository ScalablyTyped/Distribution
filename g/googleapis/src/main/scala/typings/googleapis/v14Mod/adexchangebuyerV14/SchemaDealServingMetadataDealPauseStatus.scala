package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealServingMetadataDealPauseStatus extends StObject {
  
  var buyerPauseReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If the deal is paused, records which party paused the deal first.
    */
  var firstPausedBy: js.UndefOr[String | Null] = js.undefined
  
  var hasBuyerPaused: js.UndefOr[Boolean | Null] = js.undefined
  
  var hasSellerPaused: js.UndefOr[Boolean | Null] = js.undefined
  
  var sellerPauseReason: js.UndefOr[String | Null] = js.undefined
}
object SchemaDealServingMetadataDealPauseStatus {
  
  inline def apply(): SchemaDealServingMetadataDealPauseStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealServingMetadataDealPauseStatus]
  }
  
  extension [Self <: SchemaDealServingMetadataDealPauseStatus](x: Self) {
    
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
