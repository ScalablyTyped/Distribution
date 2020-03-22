package typings.mangopay2NodejsSdk.mod.cardPreAuthorization

import typings.mangopay2NodejsSdk.mod.BillingData
import typings.mangopay2NodejsSdk.mod.MoneyData
import typings.mangopay2NodejsSdk.mod.SecureMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.cardPreAuthorization.CardPreAuthorizationData, 'Tag' | 'Billing' | 'SecureMode', 'AuthorId' | 'DebitedFunds' | 'CardId' | 'SecureModeReturnURL'> */
trait CreateCardPreAuthorization extends js.Object {
  var AuthorId: String
  var Billing: js.UndefOr[BillingData] = js.undefined
  var CardId: String
  var DebitedFunds: MoneyData
  var SecureMode: js.UndefOr[typings.mangopay2NodejsSdk.mod.SecureMode] = js.undefined
  var SecureModeReturnURL: String
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateCardPreAuthorization {
  @scala.inline
  def apply(
    AuthorId: String,
    CardId: String,
    DebitedFunds: MoneyData,
    SecureModeReturnURL: String,
    Billing: BillingData = null,
    SecureMode: SecureMode = null,
    Tag: String = null
  ): CreateCardPreAuthorization = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CardId = CardId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], SecureModeReturnURL = SecureModeReturnURL.asInstanceOf[js.Any])
    if (Billing != null) __obj.updateDynamic("Billing")(Billing.asInstanceOf[js.Any])
    if (SecureMode != null) __obj.updateDynamic("SecureMode")(SecureMode.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCardPreAuthorization]
  }
}

