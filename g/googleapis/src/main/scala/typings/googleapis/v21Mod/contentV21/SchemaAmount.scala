package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAmount extends StObject {
  
  /**
    * [required] The pre-tax or post-tax price depending on the location of the
    * order.
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * [required] Tax value.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaAmount {
  
  inline def apply(): SchemaAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAmount]
  }
  
  extension [Self <: SchemaAmount](x: Self) {
    
    inline def setPriceAmount(value: SchemaPrice): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    inline def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    inline def setTaxAmount(value: SchemaPrice): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
