package typings.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var proofOfCurrentSequenceNumber: js.UndefOr[typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.undefined
  var signedTransactionWithProof: js.UndefOr[typings.libraCore.transactionPbMod.SignedTransactionWithProof.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    proofOfCurrentSequenceNumber: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject = null,
    signedTransactionWithProof: typings.libraCore.transactionPbMod.SignedTransactionWithProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (proofOfCurrentSequenceNumber != null) __obj.updateDynamic("proofOfCurrentSequenceNumber")(proofOfCurrentSequenceNumber.asInstanceOf[js.Any])
    if (signedTransactionWithProof != null) __obj.updateDynamic("signedTransactionWithProof")(signedTransactionWithProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

