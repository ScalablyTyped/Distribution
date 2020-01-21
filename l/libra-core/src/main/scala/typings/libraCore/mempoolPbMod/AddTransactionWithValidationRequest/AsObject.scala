package typings.libraCore.mempoolPbMod.AddTransactionWithValidationRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountBalance: String
  var latestSequenceNumber: String
  var maxGasCost: String
  var signedTxn: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    accountBalance: String,
    latestSequenceNumber: String,
    maxGasCost: String,
    signedTxn: typings.libraCore.transactionPbMod.SignedTransaction.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountBalance = accountBalance.asInstanceOf[js.Any], latestSequenceNumber = latestSequenceNumber.asInstanceOf[js.Any], maxGasCost = maxGasCost.asInstanceOf[js.Any])
    if (signedTxn != null) __obj.updateDynamic("signedTxn")(signedTxn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

