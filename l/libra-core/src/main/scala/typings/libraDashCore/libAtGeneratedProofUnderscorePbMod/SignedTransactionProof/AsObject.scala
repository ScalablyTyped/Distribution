package typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.SignedTransactionProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfoToTransactionInfoProof: js.UndefOr[
    typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject
  ] = js.undefined
  var transactionInfo: js.UndefOr[
    typings.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    ledgerInfoToTransactionInfoProof: typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null,
    transactionInfo: typings.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (ledgerInfoToTransactionInfoProof != null) __obj.updateDynamic("ledgerInfoToTransactionInfoProof")(ledgerInfoToTransactionInfoProof)
    if (transactionInfo != null) __obj.updateDynamic("transactionInfo")(transactionInfo)
    __obj.asInstanceOf[AsObject]
  }
}

