package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCampaignSummary extends StObject {
  
  /**
    * Campaign billing invoice code.
    */
  var billingInvoiceCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Campaign ID.
    */
  var campaignId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The pre-tax amount for this campaign, in micros of the invoice's currency.
    */
  var preTaxAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tax amount for this campaign, in micros of the invoice's currency.
    */
  var taxAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total amount of charges for this campaign, in micros of the invoice's currency.
    */
  var totalAmountMicros: js.UndefOr[String | Null] = js.undefined
}
object SchemaCampaignSummary {
  
  inline def apply(): SchemaCampaignSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaignSummary]
  }
  
  extension [Self <: SchemaCampaignSummary](x: Self) {
    
    inline def setBillingInvoiceCode(value: String): Self = StObject.set(x, "billingInvoiceCode", value.asInstanceOf[js.Any])
    
    inline def setBillingInvoiceCodeNull: Self = StObject.set(x, "billingInvoiceCode", null)
    
    inline def setBillingInvoiceCodeUndefined: Self = StObject.set(x, "billingInvoiceCode", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdNull: Self = StObject.set(x, "campaignId", null)
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setPreTaxAmountMicros(value: String): Self = StObject.set(x, "preTaxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setPreTaxAmountMicrosNull: Self = StObject.set(x, "preTaxAmountMicros", null)
    
    inline def setPreTaxAmountMicrosUndefined: Self = StObject.set(x, "preTaxAmountMicros", js.undefined)
    
    inline def setTaxAmountMicros(value: String): Self = StObject.set(x, "taxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountMicrosNull: Self = StObject.set(x, "taxAmountMicros", null)
    
    inline def setTaxAmountMicrosUndefined: Self = StObject.set(x, "taxAmountMicros", js.undefined)
    
    inline def setTotalAmountMicros(value: String): Self = StObject.set(x, "totalAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountMicrosNull: Self = StObject.set(x, "totalAmountMicros", null)
    
    inline def setTotalAmountMicrosUndefined: Self = StObject.set(x, "totalAmountMicros", js.undefined)
  }
}
