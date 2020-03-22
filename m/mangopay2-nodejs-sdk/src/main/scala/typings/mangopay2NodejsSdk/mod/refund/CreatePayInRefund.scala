package typings.mangopay2NodejsSdk.mod.refund

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePayInRefund extends js.Object {
  var AuthorId: String
  var DebitedFunds: js.UndefOr[MoneyData] = js.undefined
  var Fees: js.UndefOr[MoneyData] = js.undefined
  var Tag: js.UndefOr[String] = js.undefined
}

object CreatePayInRefund {
  @scala.inline
  def apply(AuthorId: String, DebitedFunds: MoneyData = null, Fees: MoneyData = null, Tag: String = null): CreatePayInRefund = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any])
    if (DebitedFunds != null) __obj.updateDynamic("DebitedFunds")(DebitedFunds.asInstanceOf[js.Any])
    if (Fees != null) __obj.updateDynamic("Fees")(Fees.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayInRefund]
  }
}

