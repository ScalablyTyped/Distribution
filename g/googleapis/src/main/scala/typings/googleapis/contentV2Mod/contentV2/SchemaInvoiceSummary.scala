package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInvoiceSummary extends StObject {
  
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
  implicit class SchemaInvoiceSummaryMutableBuilder[Self <: SchemaInvoiceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalChargeSummaries(value: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]): Self = StObject.set(x, "additionalChargeSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalChargeSummariesUndefined: Self = StObject.set(x, "additionalChargeSummaries", js.undefined)
    
    @scala.inline
    def setAdditionalChargeSummariesVarargs(value: SchemaInvoiceSummaryAdditionalChargeSummary*): Self = StObject.set(x, "additionalChargeSummaries", js.Array(value :_*))
    
    @scala.inline
    def setCustomerBalance(value: SchemaAmount): Self = StObject.set(x, "customerBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerBalanceUndefined: Self = StObject.set(x, "customerBalance", js.undefined)
    
    @scala.inline
    def setGoogleBalance(value: SchemaAmount): Self = StObject.set(x, "googleBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleBalanceUndefined: Self = StObject.set(x, "googleBalance", js.undefined)
    
    @scala.inline
    def setMerchantBalance(value: SchemaAmount): Self = StObject.set(x, "merchantBalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantBalanceUndefined: Self = StObject.set(x, "merchantBalance", js.undefined)
    
    @scala.inline
    def setProductTotal(value: SchemaAmount): Self = StObject.set(x, "productTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTotalUndefined: Self = StObject.set(x, "productTotal", js.undefined)
    
    @scala.inline
    def setPromotionSummaries(value: js.Array[SchemaPromotion]): Self = StObject.set(x, "promotionSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionSummariesUndefined: Self = StObject.set(x, "promotionSummaries", js.undefined)
    
    @scala.inline
    def setPromotionSummariesVarargs(value: SchemaPromotion*): Self = StObject.set(x, "promotionSummaries", js.Array(value :_*))
  }
}
