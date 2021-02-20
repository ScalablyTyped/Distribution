package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductAmount extends StObject {
  
  /** The pre-tax or post-tax price depending on the location of the order. */
  var priceAmount: js.UndefOr[Price] = js.native
  
  /** Remitted tax value. */
  var remittedTaxAmount: js.UndefOr[Price] = js.native
  
  /** Tax value. */
  var taxAmount: js.UndefOr[Price] = js.native
}
object ProductAmount {
  
  @scala.inline
  def apply(): ProductAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductAmount]
  }
  
  @scala.inline
  implicit class ProductAmountMutableBuilder[Self <: ProductAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriceAmount(value: Price): Self = StObject.set(x, "priceAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceAmountUndefined: Self = StObject.set(x, "priceAmount", js.undefined)
    
    @scala.inline
    def setRemittedTaxAmount(value: Price): Self = StObject.set(x, "remittedTaxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemittedTaxAmountUndefined: Self = StObject.set(x, "remittedTaxAmount", js.undefined)
    
    @scala.inline
    def setTaxAmount(value: Price): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
