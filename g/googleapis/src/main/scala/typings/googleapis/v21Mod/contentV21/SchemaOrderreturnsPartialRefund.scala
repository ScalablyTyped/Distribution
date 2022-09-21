package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreturnsPartialRefund extends StObject {
  
  /**
    * The pre-tax or post-tax amount to be refunded, depending on the location of the order.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Tax amount to be refunded. Note: This has different meaning depending on the location of the order.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaOrderreturnsPartialRefund {
  
  inline def apply(): SchemaOrderreturnsPartialRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreturnsPartialRefund]
  }
  
  extension [Self <: SchemaOrderreturnsPartialRefund](x: Self) {
    
    inline def setPriceAmount(value: SchemaPrice): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    inline def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    inline def setTaxAmount(value: SchemaPrice): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
