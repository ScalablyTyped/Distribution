package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo extends StObject {
  
  /**
    * The timestamp (in ms since epoch) when the original reservation price for the deal was first converted to DFP currency. This is used to convert the contracted price into buyer's currency without discrepancy.
    */
  var currencyConversionTimeMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The DFP line item id associated with this deal. For features like CPD, buyers can retrieve the DFP line item for billing reconciliation.
    */
  var dfpLineItemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The original contracted quantity (# impressions) for this deal. To ensure delivery, sometimes the publisher will book the deal with a impression buffer, such that guaranteed_looks is greater than the contracted quantity. However clients are billed using the original contracted quantity.
    */
  var originalContractedQuantity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The original reservation price for the deal, if the currency code is different from the one used in negotiation.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
}
object SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo {
  
  inline def apply(): SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo]
  }
  
  extension [Self <: SchemaDealTermsGuaranteedFixedPriceTermsBillingInfo](x: Self) {
    
    inline def setCurrencyConversionTimeMs(value: String): Self = StObject.set(x, "currencyConversionTimeMs", value.asInstanceOf[js.Any])
    
    inline def setCurrencyConversionTimeMsNull: Self = StObject.set(x, "currencyConversionTimeMs", null)
    
    inline def setCurrencyConversionTimeMsUndefined: Self = StObject.set(x, "currencyConversionTimeMs", js.undefined)
    
    inline def setDfpLineItemId(value: String): Self = StObject.set(x, "dfpLineItemId", value.asInstanceOf[js.Any])
    
    inline def setDfpLineItemIdNull: Self = StObject.set(x, "dfpLineItemId", null)
    
    inline def setDfpLineItemIdUndefined: Self = StObject.set(x, "dfpLineItemId", js.undefined)
    
    inline def setOriginalContractedQuantity(value: String): Self = StObject.set(x, "originalContractedQuantity", value.asInstanceOf[js.Any])
    
    inline def setOriginalContractedQuantityNull: Self = StObject.set(x, "originalContractedQuantity", null)
    
    inline def setOriginalContractedQuantityUndefined: Self = StObject.set(x, "originalContractedQuantity", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
