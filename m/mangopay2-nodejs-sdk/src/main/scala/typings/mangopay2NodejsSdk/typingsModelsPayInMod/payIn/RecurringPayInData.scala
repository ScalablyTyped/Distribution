package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsBaseMod.base.BrowserInfoData
import typings.mangopay2NodejsSdk.typingsModelsBillingMod.billing.BillingOrShippingRecurringPayInData
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsSecurityInfoMod.securityInfo.SecurityInfoData
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecurringPayInData
  extends StObject
     with BasePayInData {
  
  var Applied3DSVersion: `3DSVersion`
  
  var Billing: BillingOrShippingRecurringPayInData
  
  var BrowserInfo: BrowserInfoData
  
  /**
    * The ID of a card
    */
  var CardId: String
  
  /**
    * The language to use for the payment page - needs to be the ISO code of the language
    */
  var Culture: CountryISO
  
  var IpAddress: String
  
  var RecurringPayinRegistrationId: String
  
  var Requested3DSVersion: `3DSVersion`
  
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually.
    * The field lets you activate it automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ),
    * "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode
  
  /**
    * The value is 'true' if the SecureMode was used
    */
  var SecureModeNeeded: Boolean
  
  /**
    * This is the URL where to redirect users to proceed to 3D secure validation
    */
  var SecureModeRedirectURL: String
  
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String
  
  /**
    * Contains useful information related to security and fraud
    */
  var SecurityInfo: SecurityInfoData
  
  var Shipping: BillingOrShippingRecurringPayInData
  
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: String
}
object RecurringPayInData {
  
  inline def apply(
    Applied3DSVersion: `3DSVersion`,
    AuthorId: String,
    Billing: BillingOrShippingRecurringPayInData,
    BrowserInfo: BrowserInfoData,
    CardId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    Culture: CountryISO,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    ExecutionType: PayInExecutionType,
    Fees: MoneyData,
    Id: String,
    IpAddress: String,
    Nature: TransactionNature,
    PaymentType: PayInPaymentType,
    RecurringPayinRegistrationId: String,
    Requested3DSVersion: `3DSVersion`,
    ResultCode: String,
    ResultMessage: String,
    SecureMode: SecureMode,
    SecureModeNeeded: Boolean,
    SecureModeRedirectURL: String,
    SecureModeReturnURL: String,
    SecurityInfo: SecurityInfoData,
    Shipping: BillingOrShippingRecurringPayInData,
    StatementDescriptor: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): RecurringPayInData = {
    val __obj = js.Dynamic.literal(Applied3DSVersion = Applied3DSVersion.asInstanceOf[js.Any], AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], BrowserInfo = BrowserInfo.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IpAddress = IpAddress.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], RecurringPayinRegistrationId = RecurringPayinRegistrationId.asInstanceOf[js.Any], Requested3DSVersion = Requested3DSVersion.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], Shipping = Shipping.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecurringPayInData]
  }
  
  extension [Self <: RecurringPayInData](x: Self) {
    
    inline def setApplied3DSVersion(value: `3DSVersion`): Self = StObject.set(x, "Applied3DSVersion", value.asInstanceOf[js.Any])
    
    inline def setBilling(value: BillingOrShippingRecurringPayInData): Self = StObject.set(x, "Billing", value.asInstanceOf[js.Any])
    
    inline def setBrowserInfo(value: BrowserInfoData): Self = StObject.set(x, "BrowserInfo", value.asInstanceOf[js.Any])
    
    inline def setCardId(value: String): Self = StObject.set(x, "CardId", value.asInstanceOf[js.Any])
    
    inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setRecurringPayinRegistrationId(value: String): Self = StObject.set(x, "RecurringPayinRegistrationId", value.asInstanceOf[js.Any])
    
    inline def setRequested3DSVersion(value: `3DSVersion`): Self = StObject.set(x, "Requested3DSVersion", value.asInstanceOf[js.Any])
    
    inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
    
    inline def setSecureModeNeeded(value: Boolean): Self = StObject.set(x, "SecureModeNeeded", value.asInstanceOf[js.Any])
    
    inline def setSecureModeRedirectURL(value: String): Self = StObject.set(x, "SecureModeRedirectURL", value.asInstanceOf[js.Any])
    
    inline def setSecureModeReturnURL(value: String): Self = StObject.set(x, "SecureModeReturnURL", value.asInstanceOf[js.Any])
    
    inline def setSecurityInfo(value: SecurityInfoData): Self = StObject.set(x, "SecurityInfo", value.asInstanceOf[js.Any])
    
    inline def setShipping(value: BillingOrShippingRecurringPayInData): Self = StObject.set(x, "Shipping", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
  }
}
