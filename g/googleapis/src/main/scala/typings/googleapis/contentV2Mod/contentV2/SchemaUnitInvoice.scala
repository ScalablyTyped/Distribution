package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUnitInvoice extends js.Object {
  
  /**
    * Additional charges for a unit, e.g. shipping costs.
    */
  var additionalCharges: js.UndefOr[js.Array[SchemaUnitInvoiceAdditionalCharge]] = js.native
  
  /**
    * Deprecated.
    */
  var promotions: js.UndefOr[js.Array[SchemaPromotion]] = js.native
  
  /**
    * [required] Price of the unit, before applying taxes.
    */
  var unitPricePretax: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * Tax amounts to apply to the unit price.
    */
  var unitPriceTaxes: js.UndefOr[js.Array[SchemaUnitInvoiceTaxLine]] = js.native
}
object SchemaUnitInvoice {
  
  @scala.inline
  def apply(): SchemaUnitInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoice]
  }
  
  @scala.inline
  implicit class SchemaUnitInvoiceOps[Self <: SchemaUnitInvoice] (val x: Self) extends AnyVal {
    
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
    def setAdditionalChargesVarargs(value: SchemaUnitInvoiceAdditionalCharge*): Self = this.set("additionalCharges", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalCharges(value: js.Array[SchemaUnitInvoiceAdditionalCharge]): Self = this.set("additionalCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalCharges: Self = this.set("additionalCharges", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: SchemaPromotion*): Self = this.set("promotions", js.Array(value :_*))
    
    @scala.inline
    def setPromotions(value: js.Array[SchemaPromotion]): Self = this.set("promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotions: Self = this.set("promotions", js.undefined)
    
    @scala.inline
    def setUnitPricePretax(value: SchemaPrice): Self = this.set("unitPricePretax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPricePretax: Self = this.set("unitPricePretax", js.undefined)
    
    @scala.inline
    def setUnitPriceTaxesVarargs(value: SchemaUnitInvoiceTaxLine*): Self = this.set("unitPriceTaxes", js.Array(value :_*))
    
    @scala.inline
    def setUnitPriceTaxes(value: js.Array[SchemaUnitInvoiceTaxLine]): Self = this.set("unitPriceTaxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnitPriceTaxes: Self = this.set("unitPriceTaxes", js.undefined)
  }
}
