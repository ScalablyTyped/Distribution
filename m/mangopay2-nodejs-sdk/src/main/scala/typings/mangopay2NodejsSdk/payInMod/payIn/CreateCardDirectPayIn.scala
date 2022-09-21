package typings.mangopay2NodejsSdk.payInMod.payIn

import typings.mangopay2NodejsSdk.baseMod.base.BrowserInfoData
import typings.mangopay2NodejsSdk.billingMod.billing.BillingData
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.shippingMod.shipping.ShippingData
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import typings.mangopay2NodejsSdk.typesMod.SecureMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCardDirectPayIn extends StObject {
  
  /**
    * A user's ID
    */
  var AuthorId: String
  
  /**
    * Contains useful information related to the user billing
    */
  var Billing: js.UndefOr[BillingData] = js.undefined
  
  /**
    * This object describes the Browser being user by an end user
    */
  var BrowserInfo: js.UndefOr[BrowserInfoData] = js.undefined
  
  /**
    * The ID of a card
    */
  var CardId: String
  
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String
  
  /**
    * The language to use for the payment page - needs to be the ISO code of the language
    */
  var Culture: js.UndefOr[CountryISO] = js.undefined
  
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  
  var ExecutionType: DIRECT
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  
  /**
    * IP Address of the end user (format IPV4 or IPV6)
    */
  var IpAddress: js.UndefOr[String] = js.undefined
  
  var PaymentType: CARD
  
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it automatically
    *  with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.typesMod.SecureMode] = js.undefined
  
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String
  
  /**
    * Contains every useful information's related to the user shipping
    */
  var Shipping: js.UndefOr[ShippingData] = js.undefined
  
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: js.UndefOr[String] = js.undefined
  
  /**
    * Custom data that you can add to this item
    */
  var Tag: js.UndefOr[String] = js.undefined
}
object CreateCardDirectPayIn {
  
  inline def apply(
    AuthorId: String,
    CardId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    Fees: MoneyData,
    SecureModeReturnURL: String
  ): CreateCardDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = "DIRECT", Fees = Fees.asInstanceOf[js.Any], PaymentType = "CARD", SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardDirectPayIn]
  }
  
  extension [Self <: CreateCardDirectPayIn](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
    
    inline def setBrowserInfo(value: BrowserInfoData): Self = StObject.set(x, "BrowserInfo", value.asInstanceOf[js.Any])
    
    inline def setBrowserInfoUndefined: Self = StObject.set(x, "BrowserInfo", js.undefined)
    
    inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setCultureUndefined: Self = StObject.set(x, "Culture", js.undefined)
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: DIRECT): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
    
    inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
    
    inline def setSecureModeUndefined: Self = StObject.set(x, "SecureMode", js.undefined)
    
    inline def setShipping(value: ShippingData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "Shipping", js.undefined)
    
    inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
  }
}
