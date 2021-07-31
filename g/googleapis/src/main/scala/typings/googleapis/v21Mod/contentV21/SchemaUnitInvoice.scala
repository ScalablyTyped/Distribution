package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUnitInvoice extends StObject {
  
  /**
    * Additional charges for a unit, e.g. shipping costs.
    */
  var additionalCharges: js.UndefOr[js.Array[SchemaUnitInvoiceAdditionalCharge]] = js.undefined
  
  /**
    * [required] Pre-tax or post-tax price of the unit depending on the
    * locality of the order.
    */
  var unitPrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Tax amounts to apply to the unit price.
    */
  var unitPriceTaxes: js.UndefOr[js.Array[SchemaUnitInvoiceTaxLine]] = js.undefined
}
object SchemaUnitInvoice {
  
  @scala.inline
  def apply(): SchemaUnitInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoice]
  }
  
  @scala.inline
  implicit class SchemaUnitInvoiceMutableBuilder[Self <: SchemaUnitInvoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalCharges(value: js.Array[SchemaUnitInvoiceAdditionalCharge]): Self = StObject.set(x, "additionalCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargesUndefined: Self = StObject.set(x, "additionalCharges", js.undefined)
    
    @scala.inline
    def setAdditionalChargesVarargs(value: SchemaUnitInvoiceAdditionalCharge*): Self = StObject.set(x, "additionalCharges", js.Array(value :_*))
    
    @scala.inline
    def setUnitPrice(value: SchemaPrice): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceTaxes(value: js.Array[SchemaUnitInvoiceTaxLine]): Self = StObject.set(x, "unitPriceTaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceTaxesUndefined: Self = StObject.set(x, "unitPriceTaxes", js.undefined)
    
    @scala.inline
    def setUnitPriceTaxesVarargs(value: SchemaUnitInvoiceTaxLine*): Self = StObject.set(x, "unitPriceTaxes", js.Array(value :_*))
    
    @scala.inline
    def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
  }
}
