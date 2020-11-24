package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderCustomer extends js.Object {
  
  /** Full name of the customer. */
  var fullName: js.UndefOr[String] = js.native
  
  /**
    * Email address for the merchant to send value-added tax or invoice documentation of the order. Only the last document sent is made available to the customer. For more information,
    * see About automated VAT invoicing for Buy on Google.
    */
  var invoiceReceivingEmail: js.UndefOr[String] = js.native
  
  /** Loyalty program information. */
  var loyaltyInfo: js.UndefOr[OrderCustomerLoyaltyInfo] = js.native
  
  /**
    * Customer's marketing preferences. Contains the marketing opt-in information that is current at the time that the merchant call. User preference selections can change from one order
    * to the next so preferences must be checked with every order.
    */
  var marketingRightsInfo: js.UndefOr[OrderCustomerMarketingRightsInfo] = js.native
}
object OrderCustomer {
  
  @scala.inline
  def apply(): OrderCustomer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCustomer]
  }
  
  @scala.inline
  implicit class OrderCustomerOps[Self <: OrderCustomer] (val x: Self) extends AnyVal {
    
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
    def setFullName(value: String): Self = this.set("fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullName: Self = this.set("fullName", js.undefined)
    
    @scala.inline
    def setInvoiceReceivingEmail(value: String): Self = this.set("invoiceReceivingEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvoiceReceivingEmail: Self = this.set("invoiceReceivingEmail", js.undefined)
    
    @scala.inline
    def setLoyaltyInfo(value: OrderCustomerLoyaltyInfo): Self = this.set("loyaltyInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoyaltyInfo: Self = this.set("loyaltyInfo", js.undefined)
    
    @scala.inline
    def setMarketingRightsInfo(value: OrderCustomerMarketingRightsInfo): Self = this.set("marketingRightsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketingRightsInfo: Self = this.set("marketingRightsInfo", js.undefined)
  }
}
