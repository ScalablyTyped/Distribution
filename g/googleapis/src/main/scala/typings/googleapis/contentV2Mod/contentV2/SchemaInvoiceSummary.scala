package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInvoiceSummary extends js.Object {
  
  /**
    * Summary of the total amounts of the additional charges.
    */
  var additionalChargeSummaries: js.UndefOr[js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]] = js.native
  
  /**
    * Deprecated.
    */
  var customerBalance: js.UndefOr[SchemaAmount] = js.native
  
  /**
    * Deprecated.
    */
  var googleBalance: js.UndefOr[SchemaAmount] = js.native
  
  /**
    * Deprecated.
    */
  var merchantBalance: js.UndefOr[SchemaAmount] = js.native
  
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[SchemaAmount] = js.native
  
  /**
    * Deprecated.
    */
  var promotionSummaries: js.UndefOr[js.Array[SchemaPromotion]] = js.native
}
object SchemaInvoiceSummary {
  
  @scala.inline
  def apply(): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
  
  @scala.inline
  implicit class SchemaInvoiceSummaryOps[Self <: SchemaInvoiceSummary] (val x: Self) extends AnyVal {
    
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
    def setAdditionalChargeSummariesVarargs(value: SchemaInvoiceSummaryAdditionalChargeSummary*): Self = this.set("additionalChargeSummaries", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalChargeSummaries(value: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]): Self = this.set("additionalChargeSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalChargeSummaries: Self = this.set("additionalChargeSummaries", js.undefined)
    
    @scala.inline
    def setCustomerBalance(value: SchemaAmount): Self = this.set("customerBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerBalance: Self = this.set("customerBalance", js.undefined)
    
    @scala.inline
    def setGoogleBalance(value: SchemaAmount): Self = this.set("googleBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleBalance: Self = this.set("googleBalance", js.undefined)
    
    @scala.inline
    def setMerchantBalance(value: SchemaAmount): Self = this.set("merchantBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantBalance: Self = this.set("merchantBalance", js.undefined)
    
    @scala.inline
    def setProductTotal(value: SchemaAmount): Self = this.set("productTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductTotal: Self = this.set("productTotal", js.undefined)
    
    @scala.inline
    def setPromotionSummariesVarargs(value: SchemaPromotion*): Self = this.set("promotionSummaries", js.Array(value :_*))
    
    @scala.inline
    def setPromotionSummaries(value: js.Array[SchemaPromotion]): Self = this.set("promotionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromotionSummaries: Self = this.set("promotionSummaries", js.undefined)
  }
}
