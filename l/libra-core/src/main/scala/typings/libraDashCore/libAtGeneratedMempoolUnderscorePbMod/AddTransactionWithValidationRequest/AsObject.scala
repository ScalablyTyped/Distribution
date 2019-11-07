package typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.AddTransactionWithValidationRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountBalance: String
  var latestSequenceNumber: String
  var maxGasCost: String
  var signedTxn: js.UndefOr[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    accountBalance: String,
    latestSequenceNumber: String,
    maxGasCost: String,
    signedTxn: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountBalance = accountBalance, latestSequenceNumber = latestSequenceNumber, maxGasCost = maxGasCost)
    if (signedTxn != null) __obj.updateDynamic("signedTxn")(signedTxn)
    __obj.asInstanceOf[AsObject]
  }
}

