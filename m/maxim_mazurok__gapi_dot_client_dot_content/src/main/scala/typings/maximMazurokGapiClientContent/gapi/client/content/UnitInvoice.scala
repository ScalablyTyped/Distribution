package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnitInvoice extends StObject {
  
  /** Additional charges for a unit, for example, shipping costs. */
  var additionalCharges: js.UndefOr[js.Array[UnitInvoiceAdditionalCharge]] = js.undefined
  
  /**
    * [required] Pre-tax or post-tax price of one unit depending on the locality of the order. *Note:* Invoicing works on a per unit basis. The `unitPrice` is the price of a single unit,
    * and will be multiplied by the number of entries in `shipmentUnitId`.
    */
  var unitPrice: js.UndefOr[Price] = js.undefined
  
  /** Tax amounts to apply to the unit price. */
  var unitPriceTaxes: js.UndefOr[js.Array[UnitInvoiceTaxLine]] = js.undefined
}
object UnitInvoice {
  
  inline def apply(): UnitInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitInvoice]
  }
  
  extension [Self <: UnitInvoice](x: Self) {
    
    inline def setAdditionalCharges(value: js.Array[UnitInvoiceAdditionalCharge]): Self = StObject.set(x, "additionalCharges", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChargesUndefined: Self = StObject.set(x, "additionalCharges", js.undefined)
    
    inline def setAdditionalChargesVarargs(value: UnitInvoiceAdditionalCharge*): Self = StObject.set(x, "additionalCharges", js.Array(value*))
    
    inline def setUnitPrice(value: Price): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceTaxes(value: js.Array[UnitInvoiceTaxLine]): Self = StObject.set(x, "unitPriceTaxes", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceTaxesUndefined: Self = StObject.set(x, "unitPriceTaxes", js.undefined)
    
    inline def setUnitPriceTaxesVarargs(value: UnitInvoiceTaxLine*): Self = StObject.set(x, "unitPriceTaxes", js.Array(value*))
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
