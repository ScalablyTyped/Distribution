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
  
  @scala.inline
  def apply(): OrderreturnsPartialRefund = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsPartialRefund]
  }
  
  @scala.inline
  implicit class OrderreturnsPartialRefundMutableBuilder[Self <: OrderreturnsPartialRefund] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriceAmount(value: Price): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: Price): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
