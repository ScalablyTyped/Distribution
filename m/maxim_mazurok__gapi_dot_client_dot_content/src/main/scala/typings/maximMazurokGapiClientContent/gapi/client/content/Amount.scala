package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amount extends StObject {
  
  /** [required] The pre-tax or post-tax price depending on the location of the order. */
  var priceAmount: js.UndefOr[Price] = js.undefined
  
  /** [required] Tax value. */
  var taxAmount: js.UndefOr[Price] = js.undefined
}
object Amount {
  
  @scala.inline
  def apply(): Amount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Amount]
  }
  
  @scala.inline
  implicit class AmountMutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
    
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
