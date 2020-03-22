package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT
import typings.mangopay2NodejsSdk.mod.BillingData
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.SecureMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCardDirectPayIn extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String
  /**
    * Contains useful information related to the user billing
    */
  var Billing: js.UndefOr[BillingData] = js.undefined
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
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData
  var ExecutionType: DIRECT
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  var PaymentType: CARD
  /**
    * The SecureMode corresponds to '3D secure' for CB Visa and MasterCard. This field lets you activate it manually. The field lets you activate it automatically
    *  with "DEFAULT" (Secured Mode will be activated from €50 or when MANGOPAY detects there is a higher risk ), "FORCE" (if you wish to specifically force the secured mode).
    */
  var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.undefined
  /**
    * This is the URL where users are automatically redirected after 3D secure validation (if activated)
    */
  var SecureModeReturnURL: String
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and can only include alphanumeric characters or spaces.
    * See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: js.UndefOr[String] = js.undefined
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
    SecureModeReturnURL: String,
    Billing: BillingData = null,
    CreditedUserId: String = null,
    SecureMode: SecureMode = null,
    StatementDescriptor: String = null
  ): CreateCardDirectPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
    if (Billing != null) __obj.updateDynamic("Billing")(Billing.asInstanceOf[js.Any])
    if (CreditedUserId != null) __obj.updateDynamic("CreditedUserId")(CreditedUserId.asInstanceOf[js.Any])
    if (SecureMode != null) __obj.updateDynamic("SecureMode")(SecureMode.asInstanceOf[js.Any])
    if (StatementDescriptor != null) __obj.updateDynamic("StatementDescriptor")(StatementDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardDirectPayIn]
  }
}

