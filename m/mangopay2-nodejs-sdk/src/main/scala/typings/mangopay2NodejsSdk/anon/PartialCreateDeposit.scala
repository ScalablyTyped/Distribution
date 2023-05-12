package typings.mangopay2NodejsSdk.anon

import typings.mangopay2NodejsSdk.typingsBaseMod.base.BrowserInfoData
import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.CompleteBillingData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsShippingMod.shipping.ShippingData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/deposit.deposit.CreateDeposit> */
trait PartialCreateDeposit extends StObject {
  
  var AuthorId: js.UndefOr[String] = js.undefined
  
  var Billing: js.UndefOr[CompleteBillingData] = js.undefined
  
  var BrowserInfo: js.UndefOr[BrowserInfoData] = js.undefined
  
  var CardId: js.UndefOr[String] = js.undefined
  
  var Culture: js.UndefOr[CountryISO] = js.undefined
  
  var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
  
  var IpAddress: js.UndefOr[String] = js.undefined
  
  var SecureModeReturnURL: js.UndefOr[String] = js.undefined
  
  var Shipping: js.UndefOr[ShippingData] = js.undefined
  
  var StatementDescriptor: js.UndefOr[String] = js.undefined
}
object PartialCreateDeposit {
  
  inline def apply(): PartialCreateDeposit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateDeposit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCreateDeposit] (val x: Self) extends AnyVal {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setAuthorIdUndefined: Self = StObject.set(x, "AuthorId", js.undefined)
    
    inline def setBilling(value: CompleteBillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
    
    inline def setBrowserInfo(value: BrowserInfoData): Self = StObject.set(x, "BrowserInfo", value.asInstanceOf[js.Any])
    
    inline def setBrowserInfoUndefined: Self = StObject.set(x, "BrowserInfo", js.undefined)
    
    inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
    
    inline def setCardIdUndefined: Self = StObject.set(x, "CardId", js.undefined)
    
    inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "Culture", js.undefined)
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setDebitedFundsUndefined: Self = StObject.set(x, "DebitedFunds", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
    
    inline def setSecureModeReturnURLUndefined: Self = StObject.set(x, "SecureModeReturnURL", js.undefined)
    
    inline def setShipping(value: ShippingData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "Shipping", js.undefined)
    
    inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
  }
}
