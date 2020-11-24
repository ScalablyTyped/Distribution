package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnitInvoice extends js.Object {
  
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
  implicit class UnitInvoiceOps[Self <: UnitInvoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditionalChargesVarargs(value: UnitInvoiceAdditionalCharge*): Self = this.set("additionalCharges", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalCharges(value: js.Array[UnitInvoiceAdditionalCharge]): Self = this.set("additionalCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalCharges: Self = this.set("additionalCharges", js.undefined)
    
    @scala.inline
    def setUnitPrice(value: Price): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
    
    @scala.inline
    def setUnitPriceTaxesVarargs(value: UnitInvoiceTaxLine*): Self = this.set("unitPriceTaxes", js.Array(value :_*))
    
    @scala.inline
    def setUnitPriceTaxes(value: js.Array[UnitInvoiceTaxLine]): Self = this.set("unitPriceTaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPriceTaxes: Self = this.set("unitPriceTaxes", js.undefined)
  }
}
