package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductAmount extends StObject {
  
  /** The pre-tax or post-tax price depending on the location of the order. */
  var priceAmount: js.UndefOr[Price] = js.undefined
  
  /** Remitted tax value. */
  var remittedTaxAmount: js.UndefOr[Price] = js.undefined
  
  /** Tax value. */
  var taxAmount: js.UndefOr[Price] = js.undefined
}
object ProductAmount {
  
  inline def apply(): ProductAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductAmount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductAmount] (val x: Self) extends AnyVal {
    
    inline def setPriceAmount(value: Price): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    inline def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    inline def setRemittedTaxAmount(value: Price): Self = StObject.set(x, "remittedTaxAmount", value.asInstanceOf[js.Any])
    
    inline def setRemittedTaxAmountUndefined: Self = StObject.set(x, "remittedTaxAmount", js.undefined)
    
    inline def setTaxAmount(value: Price): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
