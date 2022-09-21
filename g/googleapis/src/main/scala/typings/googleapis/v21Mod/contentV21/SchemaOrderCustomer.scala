package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderCustomer extends StObject {
  
  /**
    * Full name of the customer.
    */
  var fullName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Email address for the merchant to send value-added tax or invoice documentation of the order. Only the last document sent is made available to the customer. For more information, see About automated VAT invoicing for Buy on Google.
    */
  var invoiceReceivingEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Loyalty program information.
    */
  var loyaltyInfo: js.UndefOr[SchemaOrderCustomerLoyaltyInfo] = js.undefined
  
  /**
    * Customer's marketing preferences. Contains the marketing opt-in information that is current at the time that the merchant call. User preference selections can change from one order to the next so preferences must be checked with every order.
    */
  var marketingRightsInfo: js.UndefOr[SchemaOrderCustomerMarketingRightsInfo] = js.undefined
}
object SchemaOrderCustomer {
  
  inline def apply(): SchemaOrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderCustomer]
  }
  
  extension [Self <: SchemaOrderCustomer](x: Self) {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameNull: Self = StObject.set(x, "fullName", null)
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setInvoiceReceivingEmail(value: String): Self = StObject.set(x, "invoiceReceivingEmail", value.asInstanceOf[js.Any])
    
    inline def setInvoiceReceivingEmailNull: Self = StObject.set(x, "invoiceReceivingEmail", null)
    
    inline def setInvoiceReceivingEmailUndefined: Self = StObject.set(x, "invoiceReceivingEmail", js.undefined)
    
    inline def setLoyaltyInfo(value: SchemaOrderCustomerLoyaltyInfo): Self = StObject.set(x, "loyaltyInfo", value.asInstanceOf[js.Any])
    
    inline def setLoyaltyInfoUndefined: Self = StObject.set(x, "loyaltyInfo", js.undefined)
    
    inline def setMarketingRightsInfo(value: SchemaOrderCustomerMarketingRightsInfo): Self = StObject.set(x, "marketingRightsInfo", value.asInstanceOf[js.Any])
    
    inline def setMarketingRightsInfoUndefined: Self = StObject.set(x, "marketingRightsInfo", js.undefined)
  }
}
