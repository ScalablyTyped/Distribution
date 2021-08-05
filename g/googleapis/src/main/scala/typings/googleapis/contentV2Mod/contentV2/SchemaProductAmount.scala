package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductAmount extends StObject {
  
  /**
    * The pre-tax or post-tax price depending on the location of the order.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Remitted tax value.
    */
  var remittedTaxAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Tax value.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaProductAmount {
  
  inline def apply(): SchemaProductAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductAmount]
  }
  
  extension [Self <: SchemaProductAmount](x: Self) {
    
    inline def setPriceAmount(value: SchemaPrice): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    inline def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    inline def setRemittedTaxAmount(value: SchemaPrice): Self = StObject.set(x, "remittedTaxAmount", value.asInstanceOf[js.Any])
    
    inline def setRemittedTaxAmountUndefined: Self = StObject.set(x, "remittedTaxAmount", js.undefined)
    
    inline def setTaxAmount(value: SchemaPrice): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
