package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TierRate extends StObject {
  
  /** Usage is priced at this rate only after this amount. Example: start_usage_amount of 10 indicates that the usage will be priced at the unit_price after the first 10 usage_units. */
  var startUsageAmount: js.UndefOr[Double] = js.undefined
  
  /** The price per unit of usage. Example: unit_price of amount $10 indicates that each unit will cost $10. */
  var unitPrice: js.UndefOr[Money] = js.undefined
}
object TierRate {
  
  inline def apply(): TierRate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TierRate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TierRate] (val x: Self) extends AnyVal {
    
    inline def setStartUsageAmount(value: Double): Self = StObject.set(x, "startUsageAmount", value.asInstanceOf[js.Any])
    
    inline def setStartUsageAmountUndefined: Self = StObject.set(x, "startUsageAmount", js.undefined)
    
    inline def setUnitPrice(value: Money): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
