package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBillingProfile extends StObject {
  
  /**
    * Consolidated invoice option for this billing profile. Used to get a single, consolidated invoice across the chosen invoice level.
    */
  var consolidatedInvoice: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Country code of this billing profile.This is a read-only field.
    */
  var countryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Billing currency code in ISO 4217 format.This is a read-only field.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of this billing profile. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Invoice level for this billing profile. Used to group fees into separate invoices by account, advertiser, or campaign.
    */
  var invoiceLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the billing profile is the account default profile. This is a read-only field.
    */
  var isDefault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#billingProfile".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this billing profile. This is a required field and must be less than 256 characters long and must be unique among billing profile in the same account.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the payment account the billing profile belongs to. This is a read-only field.
    */
  var paymentsAccountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the payment customer the billing profile belongs to. This is a read-only field.
    */
  var paymentsCustomerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Purchase order (PO) for this billing profile. This PO number is used in the invoices for all of the advertisers in this billing profile.
    */
  var purchaseOrder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the secondary payment customer the billing profile belongs to. This is a read-only field.
    */
  var secondaryPaymentsCustomerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Status of this billing profile.This is a read-only field.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaBillingProfile {
  
  inline def apply(): SchemaBillingProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBillingProfile]
  }
  
  extension [Self <: SchemaBillingProfile](x: Self) {
    
    inline def setConsolidatedInvoice(value: Boolean): Self = StObject.set(x, "consolidatedInvoice", value.asInstanceOf[js.Any])
    
    inline def setConsolidatedInvoiceNull: Self = StObject.set(x, "consolidatedInvoice", null)
    
    inline def setConsolidatedInvoiceUndefined: Self = StObject.set(x, "consolidatedInvoice", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeNull: Self = StObject.set(x, "countryCode", null)
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInvoiceLevel(value: String): Self = StObject.set(x, "invoiceLevel", value.asInstanceOf[js.Any])
    
    inline def setInvoiceLevelNull: Self = StObject.set(x, "invoiceLevel", null)
    
    inline def setInvoiceLevelUndefined: Self = StObject.set(x, "invoiceLevel", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaymentsAccountId(value: String): Self = StObject.set(x, "paymentsAccountId", value.asInstanceOf[js.Any])
    
    inline def setPaymentsAccountIdNull: Self = StObject.set(x, "paymentsAccountId", null)
    
    inline def setPaymentsAccountIdUndefined: Self = StObject.set(x, "paymentsAccountId", js.undefined)
    
    inline def setPaymentsCustomerId(value: String): Self = StObject.set(x, "paymentsCustomerId", value.asInstanceOf[js.Any])
    
    inline def setPaymentsCustomerIdNull: Self = StObject.set(x, "paymentsCustomerId", null)
    
    inline def setPaymentsCustomerIdUndefined: Self = StObject.set(x, "paymentsCustomerId", js.undefined)
    
    inline def setPurchaseOrder(value: String): Self = StObject.set(x, "purchaseOrder", value.asInstanceOf[js.Any])
    
    inline def setPurchaseOrderNull: Self = StObject.set(x, "purchaseOrder", null)
    
    inline def setPurchaseOrderUndefined: Self = StObject.set(x, "purchaseOrder", js.undefined)
    
    inline def setSecondaryPaymentsCustomerId(value: String): Self = StObject.set(x, "secondaryPaymentsCustomerId", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPaymentsCustomerIdNull: Self = StObject.set(x, "secondaryPaymentsCustomerId", null)
    
    inline def setSecondaryPaymentsCustomerIdUndefined: Self = StObject.set(x, "secondaryPaymentsCustomerId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
