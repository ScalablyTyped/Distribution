package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExchangeReviewStatus extends StObject {
  
  /**
    * The exchange reviewing the creative.
    */
  var exchange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of the exchange review.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaExchangeReviewStatus {
  
  inline def apply(): SchemaExchangeReviewStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExchangeReviewStatus]
  }
  
  extension [Self <: SchemaExchangeReviewStatus](x: Self) {
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeNull: Self = StObject.set(x, "exchange", null)
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
