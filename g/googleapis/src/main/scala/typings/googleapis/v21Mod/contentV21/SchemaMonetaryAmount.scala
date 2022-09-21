package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonetaryAmount extends StObject {
  
  /**
    * The pre-tax or post-tax price depends on the location of the order. - For countries (for example, "US". where price attribute excludes tax, this field corresponds to the pre-tax value. - For coutries (for example, "France") where price attribute includes tax, this field corresponds to the post-tax value .
    */
  var priceAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Tax value, present only for countries where price attribute excludes tax (for example, "US". No tax is referenced as 0 value with the corresponding `currency`.
    */
  var taxAmount: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaMonetaryAmount {
  
  inline def apply(): SchemaMonetaryAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonetaryAmount]
  }
  
  extension [Self <: SchemaMonetaryAmount](x: Self) {
    
    inline def setPriceAmount(value: SchemaPrice): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    inline def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    inline def setTaxAmount(value: SchemaPrice): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
