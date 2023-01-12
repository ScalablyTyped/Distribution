package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PAYCONIQ
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.typingsModelsMoneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayconiqWebPayInData
  extends StObject
     with BasePayInData
     with PayInData {
  
  /**
    * The URL to be used in App2App workflow
    */
  var DeepLinkURL: String
  
  @JSName("ExecutionType")
  var ExecutionType_PayconiqWebPayInData: WEB
  
  /**
    * Time in millis when the page consult will expire.
    */
  var ExpirationDate: Timestamp
  
  @JSName("PaymentType")
  var PaymentType_PayconiqWebPayInData: PAYCONIQ
  
  /**
    * The URL to redirect to user to for them to proceed with the payment
    */
  var RedirectURL: String
  
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String
}
object PayconiqWebPayInData {
  
  inline def apply(
    AuthorId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    DeepLinkURL: String,
    ExecutionDate: Timestamp,
    ExpirationDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    RedirectURL: String,
    ResultCode: String,
    ResultMessage: String,
    ReturnURL: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): PayconiqWebPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], DeepLinkURL = DeepLinkURL.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "WEB", ExpirationDate = ExpirationDate.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "PAYCONIQ", RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayconiqWebPayInData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayconiqWebPayInData] (val x: Self) extends AnyVal {
    
    inline def setDeepLinkURL(value: String): Self = StObject.set(x, "DeepLinkURL", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setExpirationDate(value: Timestamp): Self = StObject.set(x, "ExpirationDate", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: PAYCONIQ): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
  }
}
