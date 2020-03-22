package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.transfer.CreateTransfer> */
trait PartialCreateTransfer extends js.Object {
  var AuthorId: js.UndefOr[String] = js.undefined
  var CreditedUserId: js.UndefOr[String] = js.undefined
  var CreditedWalletId: js.UndefOr[String] = js.undefined
  var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
  var DebitedWalletId: js.UndefOr[String] = js.undefined
  var Fees: js.UndefOr[MoneyData] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object PartialCreateTransfer {
  @scala.inline
  def apply(
    AuthorId: String = null,
    CreditedUserId: String = null,
    CreditedWalletId: String = null,
    DebitedFunds: MoneyData = null,
    DebitedWalletId: String = null,
    Fees: MoneyData = null,
    Tag: String = null
  ): PartialCreateTransfer = {
    val __obj = js.Dynamic.literal()
    if (AuthorId != null) __obj.updateDynamic("AuthorId")(AuthorId.asInstanceOf[js.Any])
    if (CreditedUserId != null) __obj.updateDynamic("CreditedUserId")(CreditedUserId.asInstanceOf[js.Any])
    if (CreditedWalletId != null) __obj.updateDynamic("CreditedWalletId")(CreditedWalletId.asInstanceOf[js.Any])
    if (DebitedFunds != null) __obj.updateDynamic("DebitedFunds")(DebitedFunds.asInstanceOf[js.Any])
    if (DebitedWalletId != null) __obj.updateDynamic("DebitedWalletId")(DebitedWalletId.asInstanceOf[js.Any])
    if (Fees != null) __obj.updateDynamic("Fees")(Fees.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCreateTransfer]
  }
}

