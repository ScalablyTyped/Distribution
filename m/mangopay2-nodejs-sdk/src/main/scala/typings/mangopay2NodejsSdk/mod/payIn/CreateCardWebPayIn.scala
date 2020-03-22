package typings.mangopay2NodejsSdk.mod.payIn

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CARD
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.SecureMode
import typings.mangopay2NodejsSdk.mod.card.CardType
import typings.mangopay2NodejsSdk.typesMod.CountryISO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCardWebPayIn extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String
  /**
    * The type of card
    */
  var CardType: typings.mangopay2NodejsSdk.mod.card.CardType
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
  var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.undefined
  /**
    * A custom description to appear on the user's bank statement. It can be up to 10 characters long, and
    * can only include alphanumeric characters or spaces. See here for important info. Note that each bank handles this information differently, some show less or no information.
    */
  var StatementDescriptor: js.UndefOr[String] = js.undefined
  /**
    * A URL to an SSL page to allow you to customise the payment page. Must be in the format: array("PAYLINE"=>"https://...") and meet all the
    * specifications listed here. Note that only a template for Payline is currently available
    */
  var TemplateURLOptions: js.UndefOr[typings.mangopay2NodejsSdk.mod.payIn.TemplateURLOptions] = js.undefined
}

object CreateCardWebPayIn {
  @scala.inline
  def apply(
    AuthorId: String,
    CardType: CardType,
    CreditedWalletId: String,
    Culture: CountryISO,
    DebitedFunds: MoneyData,
    ExecutionType: WEB,
    Fees: MoneyData,
    PaymentType: CARD,
    ReturnURL: String,
    CreditedUserId: String = null,
    SecureMode: SecureMode = null,
    StatementDescriptor: String = null,
    TemplateURLOptions: TemplateURLOptions = null
  ): CreateCardWebPayIn = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardType = CardType.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], Culture = Culture.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], ExecutionType = ExecutionType.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any], PaymentType = PaymentType.asInstanceOf[js.Any], ReturnURL = ReturnURL.asInstanceOf[js.Any])
    if (CreditedUserId != null) __obj.updateDynamic("CreditedUserId")(CreditedUserId.asInstanceOf[js.Any])
    if (SecureMode != null) __obj.updateDynamic("SecureMode")(SecureMode.asInstanceOf[js.Any])
    if (StatementDescriptor != null) __obj.updateDynamic("StatementDescriptor")(StatementDescriptor.asInstanceOf[js.Any])
    if (TemplateURLOptions != null) __obj.updateDynamic("TemplateURLOptions")(TemplateURLOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardWebPayIn]
  }
}

