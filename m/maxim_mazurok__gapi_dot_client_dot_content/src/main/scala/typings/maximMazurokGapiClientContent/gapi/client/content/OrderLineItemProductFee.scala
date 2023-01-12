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
  
  inline def apply(): OrderLineItemProductFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemProductFee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderLineItemProductFee] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
