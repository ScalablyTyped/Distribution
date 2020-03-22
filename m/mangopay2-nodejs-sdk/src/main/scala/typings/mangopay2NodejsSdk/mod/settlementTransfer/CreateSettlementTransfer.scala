package typings.mangopay2NodejsSdk.mod.settlementTransfer

import typings.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.settlementTransfer.SettlementTransferData, 'Tag', 'AuthorId' | 'DebitedFunds' | 'Fees'> */
trait CreateSettlementTransfer extends js.Object {
  var AuthorId: String
  var DebitedFunds: MoneyData
  var Fees: MoneyData
  var Tag: js.UndefOr[String] = js.undefined
}

object CreateSettlementTransfer {
  @scala.inline
  def apply(AuthorId: String, DebitedFunds: MoneyData, Fees: MoneyData, Tag: String = null): CreateSettlementTransfer = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSettlementTransfer]
  }
}

