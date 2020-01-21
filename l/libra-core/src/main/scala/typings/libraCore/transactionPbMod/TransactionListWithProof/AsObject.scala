package typings.libraCore.transactionPbMod.TransactionListWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventsForVersions: js.UndefOr[typings.libraCore.eventsPbMod.EventsForVersions.AsObject] = js.undefined
  var firstTransactionVersion: js.UndefOr[typings.googleProtobuf.wrappersPbMod.UInt64Value.AsObject] = js.undefined
  var infosList: js.Array[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject]
  var proofOfFirstTransaction: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.undefined
  var proofOfLastTransaction: js.UndefOr[typings.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.undefined
  var transactionsList: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    infosList: js.Array[typings.libraCore.transactionInfoPbMod.TransactionInfo.AsObject],
    transactionsList: js.Array[typings.libraCore.transactionPbMod.SignedTransaction.AsObject],
    eventsForVersions: typings.libraCore.eventsPbMod.EventsForVersions.AsObject = null,
    firstTransactionVersion: typings.googleProtobuf.wrappersPbMod.UInt64Value.AsObject = null,
    proofOfFirstTransaction: typings.libraCore.proofPbMod.AccumulatorProof.AsObject = null,
    proofOfLastTransaction: typings.libraCore.proofPbMod.AccumulatorProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(infosList = infosList.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
    if (eventsForVersions != null) __obj.updateDynamic("eventsForVersions")(eventsForVersions.asInstanceOf[js.Any])
    if (firstTransactionVersion != null) __obj.updateDynamic("firstTransactionVersion")(firstTransactionVersion.asInstanceOf[js.Any])
    if (proofOfFirstTransaction != null) __obj.updateDynamic("proofOfFirstTransaction")(proofOfFirstTransaction.asInstanceOf[js.Any])
    if (proofOfLastTransaction != null) __obj.updateDynamic("proofOfLastTransaction")(proofOfLastTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

