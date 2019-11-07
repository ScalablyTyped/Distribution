package typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.EventProof

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
  var transactionInfoToEventProof: js.UndefOr[
    typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    ledgerInfoToTransactionInfoProof: typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null,
    transactionInfo: typings.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject = null,
    transactionInfoToEventProof: typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (ledgerInfoToTransactionInfoProof != null) __obj.updateDynamic("ledgerInfoToTransactionInfoProof")(ledgerInfoToTransactionInfoProof)
    if (transactionInfo != null) __obj.updateDynamic("transactionInfo")(transactionInfo)
    if (transactionInfoToEventProof != null) __obj.updateDynamic("transactionInfoToEventProof")(transactionInfoToEventProof)
    __obj.asInstanceOf[AsObject]
  }
}

