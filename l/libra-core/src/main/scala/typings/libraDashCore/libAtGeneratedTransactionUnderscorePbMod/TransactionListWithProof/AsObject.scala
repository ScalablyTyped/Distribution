package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionListWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventsForVersions: js.UndefOr[
    typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventsForVersions.AsObject
  ] = js.undefined
  var firstTransactionVersion: js.UndefOr[
    typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.UInt64Value.AsObject
  ] = js.undefined
  var infosList: js.Array[
    typings.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject
  ]
  var proofOfFirstTransaction: js.UndefOr[
    typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject
  ] = js.undefined
  var proofOfLastTransaction: js.UndefOr[
    typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject
  ] = js.undefined
  var transactionsList: js.Array[
    typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    infosList: js.Array[
      typings.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject
    ],
    transactionsList: js.Array[
      typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
    ],
    eventsForVersions: typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventsForVersions.AsObject = null,
    firstTransactionVersion: typings.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.UInt64Value.AsObject = null,
    proofOfFirstTransaction: typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null,
    proofOfLastTransaction: typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(infosList = infosList, transactionsList = transactionsList)
    if (eventsForVersions != null) __obj.updateDynamic("eventsForVersions")(eventsForVersions)
    if (firstTransactionVersion != null) __obj.updateDynamic("firstTransactionVersion")(firstTransactionVersion)
    if (proofOfFirstTransaction != null) __obj.updateDynamic("proofOfFirstTransaction")(proofOfFirstTransaction)
    if (proofOfLastTransaction != null) __obj.updateDynamic("proofOfLastTransaction")(proofOfLastTransaction)
    __obj.asInstanceOf[AsObject]
  }
}

