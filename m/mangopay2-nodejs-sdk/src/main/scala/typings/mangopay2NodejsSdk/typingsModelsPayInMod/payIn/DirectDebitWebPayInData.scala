package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectDebitWebPayInData
  extends StObject
     with BasePayInData {
  
  /**
    * The language to use for the payment page - needs to be the ISO code of the language
    */
  var Culture: CountryISO
  
  /**
    * The type of web direct debit
    */
  var DirectDebitType: typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn.DirectDebitType
  
  /**
    * The URL to redirect to user to for them to proceed with the payment
    */
  var ReturnURL: String
  
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnUrl: String
  
  /**
    * The SecureMode is used to select a 3DS1 and 3DS2 protocol for CB Visa and MasterCard.
    * The field lets you ask for an Frictionless payment with the value "DEFAULT".
    * The value "NO_CHOICE" will allow you to make the transaction eligible for Frictionless, but the exemption will be applied by the other payment actors.
    * The value force "FORCE" will force customer authentification.
    */
  var SecureMode: typings.mangopay2NodejsSdk.typingsTypesMod.SecureMode
  
  /**
    * The URL to use for the payment page template
    */
  var TemplateURL: String
}
object DirectDebitWebPayInData {
  
  inline def apply(
    AuthorId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    Culture: CountryISO,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    DirectDebitType: DirectDebitType,
    ExecutionDate: Timestamp,
    ExecutionType: PayInExecutionType,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: PayInPaymentType,
    ResultCode: String,
    ResultMessage: String,
    ReturnURL: String,
    ReturnUrl: String,
    SecureMode: SecureMode,
    Status: TransactionStatus,
    Tag: String,
    TemplateURL: String,
    Type: TransactionType
  ): DirectDebitWebPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DirectDebitType = DirectDebitType.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], ReturnUrl = ReturnUrl.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectDebitWebPayInData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectDebitWebPayInData] (val x: Self) extends AnyVal {
    
    inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setDirectDebitType(value: DirectDebitType): Self = StObject.set(x, "DirectDebitType", value.asInstanceOf[js.Any])
    
    inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
    
    inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
    
    inline def setTemplateURL(value: String): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
  }
}
