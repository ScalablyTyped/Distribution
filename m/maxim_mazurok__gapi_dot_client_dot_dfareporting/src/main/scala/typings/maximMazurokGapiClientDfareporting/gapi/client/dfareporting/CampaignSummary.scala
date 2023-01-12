package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignSummary extends StObject {
  
  /** Campaign billing invoice code. */
  var billingInvoiceCode: js.UndefOr[String] = js.undefined
  
  /** Campaign ID. */
  var campaignId: js.UndefOr[String] = js.undefined
  
  /** The pre-tax amount for this campaign, in micros of the invoice's currency. */
  var preTaxAmountMicros: js.UndefOr[String] = js.undefined
  
  /** The tax amount for this campaign, in micros of the invoice's currency. */
  var taxAmountMicros: js.UndefOr[String] = js.undefined
  
  /** The total amount of charges for this campaign, in micros of the invoice's currency. */
  var totalAmountMicros: js.UndefOr[String] = js.undefined
}
object CampaignSummary {
  
  inline def apply(): CampaignSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CampaignSummary] (val x: Self) extends AnyVal {
    
    inline def setBillingInvoiceCode(value: String): Self = StObject.set(x, "billingInvoiceCode", value.asInstanceOf[js.Any])
    
    inline def setBillingInvoiceCodeUndefined: Self = StObject.set(x, "billingInvoiceCode", js.undefined)
    
    inline def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setPreTaxAmountMicros(value: String): Self = StObject.set(x, "preTaxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setPreTaxAmountMicrosUndefined: Self = StObject.set(x, "preTaxAmountMicros", js.undefined)
    
    inline def setTaxAmountMicros(value: String): Self = StObject.set(x, "taxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountMicrosUndefined: Self = StObject.set(x, "taxAmountMicros", js.undefined)
    
    inline def setTotalAmountMicros(value: String): Self = StObject.set(x, "totalAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountMicrosUndefined: Self = StObject.set(x, "totalAmountMicros", js.undefined)
  }
}
