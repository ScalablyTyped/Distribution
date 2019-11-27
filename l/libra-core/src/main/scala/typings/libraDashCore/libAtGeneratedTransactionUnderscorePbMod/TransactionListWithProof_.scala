package typings.libraDashCore.libAtGeneratedTransactionUnderscorePbMod

import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventsForVersions
import typings.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof
import typings.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionListWithProof")
@js.native
class TransactionListWithProof_ () extends Message {
  def addInfos(): TransactionInfo = js.native
  def addInfos(value: TransactionInfo): TransactionInfo = js.native
  def addInfos(value: TransactionInfo, index: Double): TransactionInfo = js.native
  def addTransactions(): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction, index: Double): SignedTransaction = js.native
  def clearEventsForVersions(): Unit = js.native
  def clearFirstTransactionVersion(): Unit = js.native
  def clearInfosList(): Unit = js.native
  def clearProofOfFirstTransaction(): Unit = js.native
  def clearProofOfLastTransaction(): Unit = js.native
  def clearTransactionsList(): Unit = js.native
  def getEventsForVersions(): js.UndefOr[EventsForVersions] = js.native
  def getFirstTransactionVersion(): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_wrappers_pb.UInt64Value */ js.Any
  ] = js.native
  def getInfosList(): js.Array[TransactionInfo] = js.native
  def getProofOfFirstTransaction(): js.UndefOr[AccumulatorProof] = js.native
  def getProofOfLastTransaction(): js.UndefOr[AccumulatorProof] = js.native
  def getTransactionsList(): js.Array[SignedTransaction] = js.native
  def hasEventsForVersions(): Boolean = js.native
  def hasFirstTransactionVersion(): Boolean = js.native
  def hasProofOfFirstTransaction(): Boolean = js.native
  def hasProofOfLastTransaction(): Boolean = js.native
  def setEventsForVersions(): Unit = js.native
  def setEventsForVersions(value: EventsForVersions): Unit = js.native
  def setFirstTransactionVersion(): Unit = js.native
  def setFirstTransactionVersion(
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify google_protobuf_wrappers_pb.UInt64Value */ js.Any
  ): Unit = js.native
  def setInfosList(value: js.Array[TransactionInfo]): Unit = js.native
  def setProofOfFirstTransaction(): Unit = js.native
  def setProofOfFirstTransaction(value: AccumulatorProof): Unit = js.native
  def setProofOfLastTransaction(): Unit = js.native
  def setProofOfLastTransaction(value: AccumulatorProof): Unit = js.native
  def setTransactionsList(value: js.Array[SignedTransaction]): Unit = js.native
}

