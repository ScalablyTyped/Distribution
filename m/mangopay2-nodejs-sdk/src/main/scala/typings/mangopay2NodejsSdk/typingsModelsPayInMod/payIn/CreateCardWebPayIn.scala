package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.BillingData
import typings.mangopay2NodejsSdk.typingsModelsCardMod.card.CardType
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsShippingMod.shipping.ShippingData
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCardWebPayIn extends StObject {
  
  /**
    * A user's ID
    */
  var AuthorId: String
  
  /**
    * Contains useful information related to the user billing
    */
  var Billing: js.UndefOr[BillingData] = js.undefined
  
  /**
    * The type of card
    */
  var CardType: typings.mangopay2NodejsSdk.typingsModelsCardMod.card.CardType
  
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
  var Culture: CountryISO
  
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  
  var ExecutionType: WEB
  
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  
  var PaymentType: CARD
  
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String
  
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
    * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects
    * there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode] = js.undefined
  
  /**
    * Contains every useful information's related to the user shipping
    */
  var Shipping: js.UndefOr[ShippingData] = js.undefined
  
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and
    * can only include alphanumeric characters or spaces. See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: js.UndefOr[String] = js.undefined
  
  /**
    * A URL to an SSL page to allow you to customise the payment page. Must be in the format: array("PAYLINE"=>"https://...") and meet all the
    * specifications listed here. Note that only a template for Payline is currently available
    */
  var TemplateURLOptions: js.UndefOr[typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.TemplateURLOptions] = js.undefined
}
object CreateCardWebPayIn {
  
  inline def apply(
    AuthorId: String,
    CardType: CardType,
    CreditedWalletId: String,
    Culture: CountryISO,
    DebitedFunds: MoneyData,
    Fees: MoneyData,
    ReturnURL: String
  ): CreateCardWebPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = "WEB", Fees = Fees.asInstanceOf[js.Any], PaymentType = "CARD", ReturnURL = ReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardWebPayIn]
  }
  
  extension [Self <: CreateCardWebPayIn](x: Self) {
    
    inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: BillingData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
    
    inline def setBillingUndefined: Self = StObject.set(x, "Billing", js.undefined)
    
    inline def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserId(value: String): Self = StObject.set(x, "CreditedUserId", value.asInstanceOf[js.Any])
    
    inline def setCreditedUserIdUndefined: Self = StObject.set(x, "CreditedUserId", js.undefined)
    
    inline def setCreditedWalletId(value: String): Self = StObject.set(x, "CreditedWalletId", value.asInstanceOf[js.Any])
    
    inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setDebitedFunds(value: MoneyData): Self = StObject.set(x, "DebitedFunds", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setFees(value: MoneyData): Self = StObject.set(x, "Fees", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
    
    inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
    
    inline def setSecureModeUndefined: Self = StObject.set(x, "SecureMode", js.undefined)
    
    inline def setShipping(value: ShippingData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "Shipping", js.undefined)
    
    inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptorUndefined: Self = StObject.set(x, "StatementDescriptor", js.undefined)
    
    inline def setTemplateURLOptions(value: TemplateURLOptions): Self = StObject.set(x, "TemplateURLOptions", value.asInstanceOf[js.Any])
    
    inline def setTemplateURLOptionsUndefined: Self = StObject.set(x, "TemplateURLOptions", js.undefined)
  }
}
