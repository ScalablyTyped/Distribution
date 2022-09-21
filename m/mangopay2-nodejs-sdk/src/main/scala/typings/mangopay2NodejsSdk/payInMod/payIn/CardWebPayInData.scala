package typings.mangopay2NodejsSdk.payInMod.payIn

import typings.mangopay2NodejsSdk.cardMod.card.CardType
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.moneyMod.money.MoneyData
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.transactionMod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import typings.mangopay2NodejsSdk.typesMod.SecureMode
import typings.mangopay2NodejsSdk.typesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardWebPayInData
  extends StObject
     with BasePayInData
     with PayInData {
  
  /**
    * The type of card
    */
  var CardType: typings.mangopay2NodejsSdk.cardMod.card.CardType
  
  /**
    * The language to use for the payment page - needs to be the ISO code of the language
    */
  var Culture: CountryISO
  
  @JSName("ExecutionType")
  var ExecutionType_CardWebPayInData: WEB
  
  @JSName("PaymentType")
  var PaymentType_CardWebPayInData: CARD
  
  /**
    * The URL to redirect to user to for them to proceed with the payment
    */
  var RedirectURL: String
  
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String
  
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it
    * automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: typings.mangopay2NodejsSdk.typesMod.SecureMode
  
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: String
  
  /**
    * The URL to use for the payment page template
    */
  var TemplateURL: String
}
object CardWebPayInData {
  
  inline def apply(
    AuthorId: String,
    CardType: CardType,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    Culture: CountryISO,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    RedirectURL: String,
    ResultCode: String,
    ResultMessage: String,
    ReturnURL: String,
    SecureMode: SecureMode,
    StatementDescriptor: String,
    Status: TransactionStatus,
    Tag: String,
    TemplateURL: String,
    Type: TransactionType
  ): CardWebPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = "WEB", Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = "CARD", RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardWebPayInData]
  }
  
  extension [Self <: CardWebPayInData](x: Self) {
    
    inline def setCardType(value: CardType): Self = StObject.set(x, "CardType", value.asInstanceOf[js.Any])
    
    inline def setCulture(value: CountryISO): Self = StObject.set(x, "Culture", value.asInstanceOf[js.Any])
    
    inline def setExecutionType(value: WEB): Self = StObject.set(x, "ExecutionType", value.asInstanceOf[js.Any])
    
    inline def setPaymentType(value: CARD): Self = StObject.set(x, "PaymentType", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "RedirectURL", value.asInstanceOf[js.Any])
    
    inline def setReturnURL(value: String): Self = StObject.set(x, "ReturnURL", value.asInstanceOf[js.Any])
    
    inline def setSecureMode(value: SecureMode): Self = StObject.set(x, "SecureMode", value.asInstanceOf[js.Any])
    
    inline def setStatementDescriptor(value: String): Self = StObject.set(x, "StatementDescriptor", value.asInstanceOf[js.Any])
    
    inline def setTemplateURL(value: String): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
  }
}
