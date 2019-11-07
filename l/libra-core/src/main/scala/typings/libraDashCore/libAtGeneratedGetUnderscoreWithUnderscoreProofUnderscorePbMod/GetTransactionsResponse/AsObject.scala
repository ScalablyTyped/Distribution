package typings.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetTransactionsResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var txnListWithProof: js.UndefOr[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionListWithProof.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    txnListWithProof: typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionListWithProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (txnListWithProof != null) __obj.updateDynamic("txnListWithProof")(txnListWithProof)
    __obj.asInstanceOf[AsObject]
  }
}

