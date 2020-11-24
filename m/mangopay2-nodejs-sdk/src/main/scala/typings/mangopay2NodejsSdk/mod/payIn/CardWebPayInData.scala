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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardWebPayInData
  extends BasePayInData
     with PayInData {
  
  /**
    * The type of card
    */
  var CardType: typings.mangopay2NodejsSdk.mod.card.CardType = js.native
  
  /**
    * The language to use for the payment page - needs to be the ISO code of the language
    */
  var Culture: CountryISO = js.native
  
  @JSName("ExecutionType")
  var ExecutionType_CardWebPayInData: WEB = js.native
  
  @JSName("PaymentType")
  var PaymentType_CardWebPayInData: CARD = js.native
  
  /**
    * The URL to redirect to user to for them to proceed with the payment
    */
  var RedirectURL: String = js.native
  
  /**
    * The URL to redirect to after payment (whether successful or not)
    */
  var ReturnURL: String = js.native
  
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it
    * automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode = js.native
  
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: String = js.native
  
  /**
    * The URL to use for the payment page template
    */
  var TemplateURL: String = js.native
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
  
  @scala.inline
  implicit class CardWebPayInDataOps[Self <: CardWebPayInData] (val x: Self) extends AnyVal {
    
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
    def setCardType(value: CardType): Self = this.set("CardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCulture(value: CountryISO): Self = this.set("Culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionType(value: WEB): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentType(value: CARD): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectURL(value: String): Self = this.set("RedirectURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnURL(value: String): Self = this.set("ReturnURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureMode(value: SecureMode): Self = this.set("SecureMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementDescriptor(value: String): Self = this.set("StatementDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateURL(value: String): Self = this.set("TemplateURL", value.asInstanceOf[js.Any])
  }
}
