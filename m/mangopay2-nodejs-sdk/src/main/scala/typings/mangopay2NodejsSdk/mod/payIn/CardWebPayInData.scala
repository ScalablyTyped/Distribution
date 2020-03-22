package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.SecureMode
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.card.CardType
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardWebPayInData
  extends BasePayInData
     with PayInData {
  /**
    * The type of card
    */
  var CardType: typings.mangopay2NodejsSdk.mod.card.CardType
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
  var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode
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
  @scala.inline
  def apply(
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
    ExecutionType: WEB,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: CARD,
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
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], RedirectURL = RedirectURL.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CardWebPayInData]
  }
}

