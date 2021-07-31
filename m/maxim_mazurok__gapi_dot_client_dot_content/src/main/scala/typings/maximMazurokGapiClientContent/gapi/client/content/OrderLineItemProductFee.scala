package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderLineItemProductFee extends StObject {
  
  /** Amount of the fee. */
  var amount: js.UndefOr[Price] = js.undefined
  
  /** Name of the fee. */
  var name: js.UndefOr[String] = js.undefined
}
object OrderLineItemProductFee {
  
  @scala.inline
  def apply(): OrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemProductFee]
  }
  
  @scala.inline
  implicit class OrderLineItemProductFeeMutableBuilder[Self <: OrderLineItemProductFee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
