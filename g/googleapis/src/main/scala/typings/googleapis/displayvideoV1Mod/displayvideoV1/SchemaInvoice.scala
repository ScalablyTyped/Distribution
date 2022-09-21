package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInvoice extends StObject {
  
  /**
    * The budget grouping ID for this invoice. This field will only be set if the invoice level of the corresponding billing profile was set to "Budget invoice grouping ID".
    */
  var budgetInvoiceGroupingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of summarized information for each budget associated with this invoice. This field will only be set if the invoice detail level of the corresponding billing profile was set to "Budget level PO".
    */
  var budgetSummaries: js.UndefOr[js.Array[SchemaBudgetSummary]] = js.undefined
  
  /**
    * The ID of the original invoice being adjusted by this invoice, if applicable. May appear on the invoice PDF as `Reference invoice number`. If replaced_invoice_ids is set, this field will be empty.
    */
  var correctedInvoiceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The currency used in the invoice in ISO 4217 format.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The display name of the invoice.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date when the invoice is due.
    */
  var dueDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The unique ID of the invoice.
    */
  var invoiceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The type of invoice document.
    */
  var invoiceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date when the invoice was issued.
    */
  var issueDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The resource name of the invoice.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total amount of costs or adjustments not tied to a particular budget, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar.
    */
  var nonBudgetMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the payments account the invoice belongs to. Appears on the invoice PDF as `Billing Account Number`.
    */
  var paymentsAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the payments profile the invoice belongs to. Appears on the invoice PDF as `Billing ID`.
    */
  var paymentsProfileId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL to download a PDF copy of the invoice. This URL is user specific and requires a valid OAuth 2.0 access token to access. The access token must be provided in an `Authorization: Bearer` HTTP header and be authorized for one of the following scopes: * `https://www.googleapis.com/auth/display-video-mediaplanning` * `https://www.googleapis.com/auth/display-video` The URL will be valid for 7 days after retrieval of this invoice object or until this invoice is retrieved again.
    */
  var pdfUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Purchase order number associated with the invoice.
    */
  var purchaseOrderNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID(s) of any originally issued invoice that is being cancelled by this invoice, if applicable. Multiple invoices may be listed if those invoices are being consolidated into a single invoice. May appear on invoice PDF as `Replaced invoice numbers`. If corrected_invoice_id is set, this field will be empty.
    */
  var replacedInvoiceIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The service start and end dates which are covered by this invoice.
    */
  var serviceDateRange: js.UndefOr[SchemaDateRange] = js.undefined
  
  /**
    * The pre-tax subtotal amount, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar.
    */
  var subtotalAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The invoice total amount, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar.
    */
  var totalAmountMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The sum of all taxes in invoice, in micros of the invoice's currency. For example, if currency_code is `USD`, then 1000000 represents one US dollar.
    */
  var totalTaxAmountMicros: js.UndefOr[String | Null] = js.undefined
}
object SchemaInvoice {
  
  inline def apply(): SchemaInvoice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvoice]
  }
  
  extension [Self <: SchemaInvoice](x: Self) {
    
    inline def setBudgetInvoiceGroupingId(value: String): Self = StObject.set(x, "budgetInvoiceGroupingId", value.asInstanceOf[js.Any])
    
    inline def setBudgetInvoiceGroupingIdNull: Self = StObject.set(x, "budgetInvoiceGroupingId", null)
    
    inline def setBudgetInvoiceGroupingIdUndefined: Self = StObject.set(x, "budgetInvoiceGroupingId", js.undefined)
    
    inline def setBudgetSummaries(value: js.Array[SchemaBudgetSummary]): Self = StObject.set(x, "budgetSummaries", value.asInstanceOf[js.Any])
    
    inline def setBudgetSummariesUndefined: Self = StObject.set(x, "budgetSummaries", js.undefined)
    
    inline def setBudgetSummariesVarargs(value: SchemaBudgetSummary*): Self = StObject.set(x, "budgetSummaries", js.Array(value*))
    
    inline def setCorrectedInvoiceId(value: String): Self = StObject.set(x, "correctedInvoiceId", value.asInstanceOf[js.Any])
    
    inline def setCorrectedInvoiceIdNull: Self = StObject.set(x, "correctedInvoiceId", null)
    
    inline def setCorrectedInvoiceIdUndefined: Self = StObject.set(x, "correctedInvoiceId", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDueDate(value: SchemaDate): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setInvoiceId(value: String): Self = StObject.set(x, "invoiceId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceIdNull: Self = StObject.set(x, "invoiceId", null)
    
    inline def setInvoiceIdUndefined: Self = StObject.set(x, "invoiceId", js.undefined)
    
    inline def setInvoiceType(value: String): Self = StObject.set(x, "invoiceType", value.asInstanceOf[js.Any])
    
    inline def setInvoiceTypeNull: Self = StObject.set(x, "invoiceType", null)
    
    inline def setInvoiceTypeUndefined: Self = StObject.set(x, "invoiceType", js.undefined)
    
    inline def setIssueDate(value: SchemaDate): Self = StObject.set(x, "issueDate", value.asInstanceOf[js.Any])
    
    inline def setIssueDateUndefined: Self = StObject.set(x, "issueDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNonBudgetMicros(value: String): Self = StObject.set(x, "nonBudgetMicros", value.asInstanceOf[js.Any])
    
    inline def setNonBudgetMicrosNull: Self = StObject.set(x, "nonBudgetMicros", null)
    
    inline def setNonBudgetMicrosUndefined: Self = StObject.set(x, "nonBudgetMicros", js.undefined)
    
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
    
    inline def setServiceDateRange(value: SchemaDateRange): Self = StObject.set(x, "serviceDateRange", value.asInstanceOf[js.Any])
    
    inline def setServiceDateRangeUndefined: Self = StObject.set(x, "serviceDateRange", js.undefined)
    
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
