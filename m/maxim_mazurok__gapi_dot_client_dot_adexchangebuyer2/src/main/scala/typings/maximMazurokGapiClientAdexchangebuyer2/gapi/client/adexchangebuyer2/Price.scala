package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Price extends StObject {
  
  /** The actual price with currency specified. */
  var amount: js.UndefOr[Money] = js.undefined
  
  /** The pricing type for the deal/product. (default: CPM) */
  var pricingType: js.UndefOr[String] = js.undefined
}
object Price {
  
  inline def apply(): Price = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Price]
  }
  
  extension [Self <: Price](x: Self) {
    
    inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setPricingType(value: String): Self = StObject.set(x, "pricingType", value.asInstanceOf[js.Any])
    
    inline def setPricingTypeUndefined: Self = StObject.set(x, "pricingType", js.undefined)
  }
}
