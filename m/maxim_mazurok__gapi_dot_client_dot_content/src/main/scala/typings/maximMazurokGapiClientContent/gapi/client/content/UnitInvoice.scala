package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitInvoice extends StObject {
  
  /** Additional charges for a unit, e.g. shipping costs. */
  var additionalCharges: js.UndefOr[js.Array[UnitInvoiceAdditionalCharge]] = js.native
  
  /** [required] Pre-tax or post-tax price of the unit depending on the locality of the order. */
  var unitPrice: js.UndefOr[Price] = js.native
  
  /** Tax amounts to apply to the unit price. */
  var unitPriceTaxes: js.UndefOr[js.Array[UnitInvoiceTaxLine]] = js.native
}
object UnitInvoice {
  
  @scala.inline
  def apply(): UnitInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoice]
  }
  
  @scala.inline
  implicit class UnitInvoiceMutableBuilder[Self <: UnitInvoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalCharges(value: js.Array[UnitInvoiceAdditionalCharge]): Self = StObject.set(x, "additionalCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargesUndefined: Self = StObject.set(x, "additionalCharges", js.undefined)
    
    @scala.inline
    def setAdditionalChargesVarargs(value: UnitInvoiceAdditionalCharge*): Self = StObject.set(x, "additionalCharges", js.Array(value :_*))
    
    @scala.inline
    def setUnitPrice(value: Price): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceTaxes(value: js.Array[UnitInvoiceTaxLine]): Self = StObject.set(x, "unitPriceTaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceTaxesUndefined: Self = StObject.set(x, "unitPriceTaxes", js.undefined)
    
    @scala.inline
    def setUnitPriceTaxesVarargs(value: UnitInvoiceTaxLine*): Self = StObject.set(x, "unitPriceTaxes", js.Array(value :_*))
    
    @scala.inline
    def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
