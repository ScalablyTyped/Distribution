package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Installment extends StObject {
  
  /** The amount the buyer has to pay per month. */
  var amount: js.UndefOr[Price] = js.undefined
  
  /** The number of installments the buyer has to pay. */
  var months: js.UndefOr[String] = js.undefined
}
object Installment {
  
  inline def apply(): Installment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Installment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Installment] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Price): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setMonths(value: String): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setMonthsUndefined: Self = StObject.set(x, "months", js.undefined)
  }
}
