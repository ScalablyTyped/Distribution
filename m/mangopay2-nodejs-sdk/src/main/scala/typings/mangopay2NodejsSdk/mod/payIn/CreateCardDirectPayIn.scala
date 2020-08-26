package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mod.BillingData
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.SecureMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCardDirectPayIn extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * Contains useful information related to the user billing
    */
  var Billing: js.UndefOr[BillingData] = js.native
  /**
    * The ID of a card
    */
  var CardId: String = js.native
  /**
    * The user ID who is credited (defaults to the owner of the wallet)
    */
  var CreditedUserId: js.UndefOr[String] = js.native
  /**
    * The ID of the wallet where money will be credited
    */
  var CreditedWalletId: String = js.native
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  var ExecutionType: DIRECT = js.native
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData = js.native
  var PaymentType: CARD = js.native
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it automatically
    *  with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.native
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String = js.native
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: js.UndefOr[String] = js.native
}

object CreateCardDirectPayIn {
  @scala.inline
  def apply(
    AuthorId: String,
    CardId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    ExecutionType: DIRECT,
    Fees: MoneyData,
    PaymentType: CARD,
    SecureModeReturnURL: String
  ): CreateCardDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardDirectPayIn]
  }
  @scala.inline
  implicit class CreateCardDirectPayInOps[Self <: CreateCardDirectPayIn] (val x: Self) extends AnyVal {
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
    def setAuthorId(value: String): Self = this.set("AuthorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardId(value: String): Self = this.set("CardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreditedWalletId(value: String): Self = this.set("CreditedWalletId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebitedFunds(value: MoneyData): Self = this.set("DebitedFunds", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutionType(value: DIRECT): Self = this.set("ExecutionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFees(value: MoneyData): Self = this.set("Fees", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaymentType(value: CARD): Self = this.set("PaymentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecureModeReturnURL(value: String): Self = this.set("SecureModeReturnURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling(value: BillingData): Self = this.set("Billing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling: Self = this.set("Billing", js.undefined)
    @scala.inline
    def setCreditedUserId(value: String): Self = this.set("CreditedUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditedUserId: Self = this.set("CreditedUserId", js.undefined)
    @scala.inline
    def setSecureMode(value: SecureMode): Self = this.set("SecureMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureMode: Self = this.set("SecureMode", js.undefined)
    @scala.inline
    def setStatementDescriptor(value: String): Self = this.set("StatementDescriptor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatementDescriptor: Self = this.set("StatementDescriptor", js.undefined)
  }
  
}

