package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mod.BillingData
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.SecureMode
import typings.mangopay2NodejsSdk.mod.SecurityInfoData
import typings.mangopay2NodejsSdk.mod.Timestamp
import typings.mangopay2NodejsSdk.mod.transaction.TransactionNature
import typings.mangopay2NodejsSdk.mod.transaction.TransactionStatus
import typings.mangopay2NodejsSdk.mod.transaction.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardDirectPayInData
  extends BasePayInData
     with PayInData {
  /**
    * Contains useful information related to the user billing
    */
  var Billing: BillingData = js.native
  /**
    * The ID of a card
    */
  var CardId: String = js.native
  @JSName("ExecutionType")
  var ExecutionType_CardDirectPayInData: DIRECT = js.native
  @JSName("PaymentType")
  var PaymentType_CardDirectPayInData: CARD = js.native
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it
    * automatically with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: typings.mangopay2NodejsSdk.mod.SecureMode = js.native
  /**
    * The value is 'true' if the SecureMode was used
    */
  var SecureModeNeeded: Boolean = js.native
  /**
    * This is the URL where to redirect users to proceed to 3D secure validation
    */
  var SecureModeRedirectURL: String = js.native
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String = js.native
  /**
    * Contains information related to security and fraud
    */
  var SecurityInfo: SecurityInfoData = js.native
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric
    * characters or spaces. See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: String = js.native
}

object CardDirectPayInData {
  @scala.inline
  def apply(
    AuthorId: String,
    Billing: BillingData,
    CardId: String,
    CreationDate: Double,
    CreditedFunds: MoneyData,
    CreditedUserId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    ExecutionDate: Timestamp,
    ExecutionType: DIRECT,
    Fees: MoneyData,
    Id: String,
    Nature: TransactionNature,
    PaymentType: CARD,
    ResultCode: String,
    ResultMessage: String,
    SecureMode: SecureMode,
    SecureModeNeeded: Boolean,
    SecureModeRedirectURL: String,
    SecureModeReturnURL: String,
    SecurityInfo: SecurityInfoData,
    StatementDescriptor: String,
    Status: TransactionStatus,
    Tag: String,
    Type: TransactionType
  ): CardDirectPayInData = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], Billing = Billing.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], CreditedFunds = CreditedFunds.asInstanceOf[js.Any], CreditedUserId = CreditedUserId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], ExecutionDate = ExecutionDate.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Nature = Nature.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], SecureMode = SecureMode.asInstanceOf[js.Any], SecureModeNeeded = SecureModeNeeded.asInstanceOf[js.Any], SecureModeRedirectURL = SecureModeRedirectURL.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any], SecurityInfo = SecurityInfo.asInstanceOf[js.Any], StatementDescriptor = StatementDescriptor.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardDirectPayInData]
  }
  @scala.inline
  implicit class CardDirectPayInDataOps[Self <: CardDirectPayInData] (val x: Self) extends AnyVal {
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
    def setBilling(value: BillingData): Self = this.set("Billing", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardId(value: String): Self = this.set("CardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionType(value: DIRECT): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentType(value: CARD): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureMode(value: SecureMode): Self = this.set("SecureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureModeNeeded(value: Boolean): Self = this.set("SecureModeNeeded", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureModeRedirectURL(value: String): Self = this.set("SecureModeRedirectURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureModeReturnURL(value: String): Self = this.set("SecureModeReturnURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityInfo(value: SecurityInfoData): Self = this.set("SecurityInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatementDescriptor(value: String): Self = this.set("StatementDescriptor", value.asInstanceOf[js.Any])
  }
  
}

