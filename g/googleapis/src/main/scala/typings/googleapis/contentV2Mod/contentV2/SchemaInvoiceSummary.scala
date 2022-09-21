package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvoiceSummary extends StObject {
  
  /**
    * Summary of the total amounts of the additional charges.
    */
  var additionalChargeSummaries: js.UndefOr[js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]] = js.undefined
  
  /**
    * Deprecated.
    */
  var customerBalance: js.UndefOr[SchemaAmount] = js.undefined
  
  /**
    * Deprecated.
    */
  var googleBalance: js.UndefOr[SchemaAmount] = js.undefined
  
  /**
    * Deprecated.
    */
  var merchantBalance: js.UndefOr[SchemaAmount] = js.undefined
  
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[SchemaAmount] = js.undefined
  
  /**
    * Deprecated.
    */
  var promotionSummaries: js.UndefOr[js.Array[SchemaPromotion]] = js.undefined
}
object SchemaInvoiceSummary {
  
  inline def apply(): SchemaInvoiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoiceSummary]
  }
  
  extension [Self <: SchemaInvoiceSummary](x: Self) {
    
    inline def setAdditionalChargeSummaries(value: js.Array[SchemaInvoiceSummaryAdditionalChargeSummary]): Self = StObject.set(x, "additionalChargeSummaries", value.asInstanceOf[js.Any])
    
    inline def setAdditionalChargeSummariesUndefined: Self = StObject.set(x, "additionalChargeSummaries", js.undefined)
    
    inline def setAdditionalChargeSummariesVarargs(value: SchemaInvoiceSummaryAdditionalChargeSummary*): Self = StObject.set(x, "additionalChargeSummaries", js.Array(value*))
    
    inline def setCustomerBalance(value: SchemaAmount): Self = StObject.set(x, "customerBalance", value.asInstanceOf[js.Any])
    
    inline def setCustomerBalanceUndefined: Self = StObject.set(x, "customerBalance", js.undefined)
    
    inline def setGoogleBalance(value: SchemaAmount): Self = StObject.set(x, "googleBalance", value.asInstanceOf[js.Any])
    
    inline def setGoogleBalanceUndefined: Self = StObject.set(x, "googleBalance", js.undefined)
    
    inline def setMerchantBalance(value: SchemaAmount): Self = StObject.set(x, "merchantBalance", value.asInstanceOf[js.Any])
    
    inline def setMerchantBalanceUndefined: Self = StObject.set(x, "merchantBalance", js.undefined)
    
    inline def setProductTotal(value: SchemaAmount): Self = StObject.set(x, "productTotal", value.asInstanceOf[js.Any])
    
    inline def setProductTotalUndefined: Self = StObject.set(x, "productTotal", js.undefined)
    
    inline def setPromotionSummaries(value: js.Array[SchemaPromotion]): Self = StObject.set(x, "promotionSummaries", value.asInstanceOf[js.Any])
    
    inline def setPromotionSummariesUndefined: Self = StObject.set(x, "promotionSummaries", js.undefined)
    
    inline def setPromotionSummariesVarargs(value: SchemaPromotion*): Self = StObject.set(x, "promotionSummaries", js.Array(value*))
  }
}
