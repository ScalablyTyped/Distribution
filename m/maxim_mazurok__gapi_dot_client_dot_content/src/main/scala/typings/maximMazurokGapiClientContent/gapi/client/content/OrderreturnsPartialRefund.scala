package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsPartialRefund extends StObject {
  
  /** The pre-tax or post-tax amount to be refunded, depending on the location of the order. */
  var priceAmount: js.UndefOr[Price] = js.undefined
  
  /** Tax amount to be refunded. Note: This has different meaning depending on the location of the order. */
  var taxAmount: js.UndefOr[Price] = js.undefined
}
object OrderreturnsPartialRefund {
  
  inline def apply(): OrderreturnsPartialRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsPartialRefund]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderreturnsPartialRefund] (val x: Self) extends AnyVal {
    
    inline def setPriceAmount(value: Price): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    inline def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    inline def setTaxAmount(value: Price): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
