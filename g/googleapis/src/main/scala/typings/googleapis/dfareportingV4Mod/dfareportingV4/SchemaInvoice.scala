package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvoice extends StObject {
  
  /**
    * The list of summarized campaign information associated with this invoice.
    */
  var campaign_summaries: js.UndefOr[js.Array[SchemaCampaignSummary]] = js.undefined
  
  /**
    * The originally issued invoice that is being adjusted by this invoice, if applicable. May appear on invoice PDF as *Reference invoice number*.
    */
  var correctedInvoiceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Invoice currency code in ISO 4217 format.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The invoice due date.
    */
  var dueDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this invoice.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of invoice document.
    */
  var invoiceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date when the invoice was issued.
    */
  var issueDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#invoice".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the payments account the invoice belongs to. Appears on the invoice PDF as *Billing Account Number*.
    */
  var paymentsAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the payments profile the invoice belongs to. Appears on the invoice PDF as *Billing ID*.
    */
  var paymentsProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL to download a PDF copy of the invoice. Note that this URL is user specific and requires a valid OAuth 2.0 access token to access. The access token must be provided in an *Authorization: Bearer* HTTP header. The URL will only be usable for 7 days from when the api is called.
    */
  var pdfUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Purchase order number associated with the invoice.
    */
  var purchaseOrderNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The originally issued invoice(s) that is being cancelled by this invoice, if applicable. May appear on invoice PDF as *Replaced invoice numbers*. Note: There may be multiple replaced invoices due to consolidation of multiple invoices into a single invoice.
    */
  var replacedInvoiceIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The invoice service end date.
    */
  var serviceEndDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The invoice service start date.
    */
  var serviceStartDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The pre-tax subtotal amount, in micros of the invoice's currency.
    */
  var subtotalAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The invoice total amount, in micros of the invoice's currency.
    */
  var totalAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sum of all taxes in invoice, in micros of the invoice's currency.
    */
  var totalTaxAmountMicros: js.UndefOr[String | Null] = js.undefined
}
object SchemaInvoice {
  
  inline def apply(): SchemaInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoice]
  }
  
  extension [Self <: SchemaInvoice](x: Self) {
    
    inline def setCampaign_summaries(value: js.Array[SchemaCampaignSummary]): Self = StObject.set(x, "campaign_summaries", value.asInstanceOf[js.Any])
    
    inline def setCampaign_summariesUndefined: Self = StObject.set(x, "campaign_summaries", js.undefined)
    
    inline def setCampaign_summariesVarargs(value: SchemaCampaignSummary*): Self = StObject.set(x, "campaign_summaries", js.Array(value*))
    
    inline def setCorrectedInvoiceId(value: String): Self = StObject.set(x, "correctedInvoiceId", value.asInstanceOf[js.Any])
    
    inline def setCorrectedInvoiceIdNull: Self = StObject.set(x, "correctedInvoiceId", null)
    
    inline def setCorrectedInvoiceIdUndefined: Self = StObject.set(x, "correctedInvoiceId", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDueDate(value: String): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateNull: Self = StObject.set(x, "dueDate", null)
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInvoiceType(value: String): Self = StObject.set(x, "invoiceType", value.asInstanceOf[js.Any])
    
    inline def setInvoiceTypeNull: Self = StObject.set(x, "invoiceType", null)
    
    inline def setInvoiceTypeUndefined: Self = StObject.set(x, "invoiceType", js.undefined)
    
    inline def setIssueDate(value: String): Self = StObject.set(x, "issueDate", value.asInstanceOf[js.Any])
    
    inline def setIssueDateNull: Self = StObject.set(x, "issueDate", null)
    
    inline def setIssueDateUndefined: Self = StObject.set(x, "issueDate", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPaymentsAccountId(value: String): Self = StObject.set(x, "paymentsAccountId", value.asInstanceOf[js.Any])
    
    inline def setPaymentsAccountIdNull: Self = StObject.set(x, "paymentsAccountId", null)
    
    inline def setPaymentsAccountIdUndefined: Self = StObject.set(x, "paymentsAccountId", js.undefined)
    
    inline def setPaymentsProfileId(value: String): Self = StObject.set(x, "paymentsProfileId", value.asInstanceOf[js.Any])
    
    inline def setPaymentsProfileIdNull: Self = StObject.set(x, "paymentsProfileId", null)
    
    inline def setPaymentsProfileIdUndefined: Self = StObject.set(x, "paymentsProfileId", js.undefined)
    
    inline def setPdfUrl(value: String): Self = StObject.set(x, "pdfUrl", value.asInstanceOf[js.Any])
    
    inline def setPdfUrlNull: Self = StObject.set(x, "pdfUrl", null)
    
    inline def setPdfUrlUndefined: Self = StObject.set(x, "pdfUrl", js.undefined)
    
    inline def setPurchaseOrderNumber(value: String): Self = StObject.set(x, "purchaseOrderNumber", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderNumberNull: Self = StObject.set(x, "purchaseOrderNumber", null)
    
    inline def setPurchaseOrderNumberUndefined: Self = StObject.set(x, "purchaseOrderNumber", js.undefined)
    
    inline def setReplacedInvoiceIds(value: js.Array[String]): Self = StObject.set(x, "replacedInvoiceIds", value.asInstanceOf[js.Any])
    
    inline def setReplacedInvoiceIdsNull: Self = StObject.set(x, "replacedInvoiceIds", null)
    
    inline def setReplacedInvoiceIdsUndefined: Self = StObject.set(x, "replacedInvoiceIds", js.undefined)
    
    inline def setReplacedInvoiceIdsVarargs(value: String*): Self = StObject.set(x, "replacedInvoiceIds", js.Array(value*))
    
    inline def setServiceEndDate(value: String): Self = StObject.set(x, "serviceEndDate", value.asInstanceOf[js.Any])
    
    inline def setServiceEndDateNull: Self = StObject.set(x, "serviceEndDate", null)
    
    inline def setServiceEndDateUndefined: Self = StObject.set(x, "serviceEndDate", js.undefined)
    
    inline def setServiceStartDate(value: String): Self = StObject.set(x, "serviceStartDate", value.asInstanceOf[js.Any])
    
    inline def setServiceStartDateNull: Self = StObject.set(x, "serviceStartDate", null)
    
    inline def setServiceStartDateUndefined: Self = StObject.set(x, "serviceStartDate", js.undefined)
    
    inline def setSubtotalAmountMicros(value: String): Self = StObject.set(x, "subtotalAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setSubtotalAmountMicrosNull: Self = StObject.set(x, "subtotalAmountMicros", null)
    
    inline def setSubtotalAmountMicrosUndefined: Self = StObject.set(x, "subtotalAmountMicros", js.undefined)
    
    inline def setTotalAmountMicros(value: String): Self = StObject.set(x, "totalAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTotalAmountMicrosNull: Self = StObject.set(x, "totalAmountMicros", null)
    
    inline def setTotalAmountMicrosUndefined: Self = StObject.set(x, "totalAmountMicros", js.undefined)
    
    inline def setTotalTaxAmountMicros(value: String): Self = StObject.set(x, "totalTaxAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setTotalTaxAmountMicrosNull: Self = StObject.set(x, "totalTaxAmountMicros", null)
    
    inline def setTotalTaxAmountMicrosUndefined: Self = StObject.set(x, "totalTaxAmountMicros", js.undefined)
  }
}
