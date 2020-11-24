package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInvoiceSummaryAdditionalChargeSummary extends js.Object {
  
  /**
    * [required] Total additional charge for this type.
    */
  var totalAmount: js.UndefOr[SchemaAmount] = js.native
  
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaInvoiceSummaryAdditionalChargeSummary {
  
  @scala.inline
  def apply(): SchemaInvoiceSummaryAdditionalChargeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummaryAdditionalChargeSummary]
  }
  
  @scala.inline
  implicit class SchemaInvoiceSummaryAdditionalChargeSummaryOps[Self <: SchemaInvoiceSummaryAdditionalChargeSummary] (val x: Self) extends AnyVal {
    
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
    def setTotalAmount(value: SchemaAmount): Self = this.set("totalAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalAmount: Self = this.set("totalAmount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
