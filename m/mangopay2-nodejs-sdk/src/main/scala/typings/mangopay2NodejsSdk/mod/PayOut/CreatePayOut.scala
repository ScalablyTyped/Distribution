package typings.mangopay2NodejsSdk.mod.PayOut

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePayOut extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String
  /**
    * An ID of a Bank Account
    */
  var BankAccountId: String
  /**
    * A custom reference you wish to appear on the user’s bank statement (your Client Name is already shown). This reference can contain max 12 characters
    */
  var BankWireRef: js.UndefOr[String] = js.undefined
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
  var Tag: js.UndefOr[String] = js.undefined
}

object CreatePayOut {
  @scala.inline
  def apply(
    AuthorId: String,
    BankAccountId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    Fees: MoneyData,
    BankWireRef: String = null,
    Tag: String = null
  ): CreatePayOut = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
    if (BankWireRef != null) __obj.updateDynamic("BankWireRef")(BankWireRef.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayOut]
  }
}

