package typings.mangopay2NodejsSdk.mod.transfer

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTransfer extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String
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
  /**
    * The ID of the wallet that was debited
    */
  var DebitedWalletId: String
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData
  /**
    * Custom data that you can add to this item
    */
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateTransfer {
  @scala.inline
  def apply(
    AuthorId: String,
    CreditedWalletId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    Fees: MoneyData,
    CreditedUserId: String = null,
    Tag: String = null
  ): CreateTransfer = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], CreditedWalletId = CreditedWalletId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
    if (CreditedUserId != null) __obj.updateDynamic("CreditedUserId")(CreditedUserId.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransfer]
  }
}

