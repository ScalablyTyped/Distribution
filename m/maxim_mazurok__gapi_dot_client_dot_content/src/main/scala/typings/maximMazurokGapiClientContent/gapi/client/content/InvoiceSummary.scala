package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvoiceSummary extends js.Object {
  
  /** Summary of the total amounts of the additional charges. */
  var additionalChargeSummaries: js.UndefOr[js.Array[InvoiceSummaryAdditionalChargeSummary]] = js.native
  
  /** [required] Total price for the product. */
  var productTotal: js.UndefOr[Amount] = js.native
}
object InvoiceSummary {
  
  @scala.inline
  def apply(): InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvoiceSummary]
  }
  
  @scala.inline
  implicit class InvoiceSummaryOps[Self <: InvoiceSummary] (val x: Self) extends AnyVal {
    
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
    def setAdditionalChargeSummariesVarargs(value: InvoiceSummaryAdditionalChargeSummary*): Self = this.set("additionalChargeSummaries", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalChargeSummaries(value: js.Array[InvoiceSummaryAdditionalChargeSummary]): Self = this.set("additionalChargeSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalChargeSummaries: Self = this.set("additionalChargeSummaries", js.undefined)
    
    @scala.inline
    def setProductTotal(value: Amount): Self = this.set("productTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductTotal: Self = this.set("productTotal", js.undefined)
  }
}
