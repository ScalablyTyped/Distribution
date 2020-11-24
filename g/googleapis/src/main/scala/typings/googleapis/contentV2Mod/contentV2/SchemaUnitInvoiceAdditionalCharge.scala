package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUnitInvoiceAdditionalCharge extends js.Object {
  
  /**
    * [required] Amount of the additional charge.
    */
  var additionalChargeAmount: js.UndefOr[SchemaAmount] = js.native
  
  /**
    * Deprecated.
    */
  var additionalChargePromotions: js.UndefOr[js.Array[SchemaPromotion]] = js.native
  
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaUnitInvoiceAdditionalCharge {
  
  @scala.inline
  def apply(): SchemaUnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnitInvoiceAdditionalCharge]
  }
  
  @scala.inline
  implicit class SchemaUnitInvoiceAdditionalChargeOps[Self <: SchemaUnitInvoiceAdditionalCharge] (val x: Self) extends AnyVal {
    
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
    def setAdditionalChargeAmount(value: SchemaAmount): Self = this.set("additionalChargeAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalChargeAmount: Self = this.set("additionalChargeAmount", js.undefined)
    
    @scala.inline
    def setAdditionalChargePromotionsVarargs(value: SchemaPromotion*): Self = this.set("additionalChargePromotions", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalChargePromotions(value: js.Array[SchemaPromotion]): Self = this.set("additionalChargePromotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalChargePromotions: Self = this.set("additionalChargePromotions", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
