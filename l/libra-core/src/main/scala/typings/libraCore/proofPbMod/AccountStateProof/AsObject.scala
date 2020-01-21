package typings.libraCore.proofPbMod.AccountStateProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfoToTransactionInfoProof: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.undefined
  var transactionInfo: js.UndefOr[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.undefined
  var transactionInfoToAccountProof: js.UndefOr[typings.libraCore.proofPbMod.SparseMerkleProof.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    ledgerInfoToTransactionInfoProof: typings.libraCore.proofPbMod.AccumulatorProof.AsObject = null,
    transactionInfo: typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject = null,
    transactionInfoToAccountProof: typings.libraCore.proofPbMod.SparseMerkleProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (ledgerInfoToTransactionInfoProof != null) __obj.updateDynamic("ledgerInfoToTransactionInfoProof")(ledgerInfoToTransactionInfoProof.asInstanceOf[js.Any])
    if (transactionInfo != null) __obj.updateDynamic("transactionInfo")(transactionInfo.asInstanceOf[js.Any])
    if (transactionInfoToAccountProof != null) __obj.updateDynamic("transactionInfoToAccountProof")(transactionInfoToAccountProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

