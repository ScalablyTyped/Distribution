package typings.libraCore.proofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionInfoPbMod.TransactionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/proof_pb", "EventProof")
@js.native
class EventProof_ () extends Message {
  def clearLedgerInfoToTransactionInfoProof(): Unit = js.native
  def clearTransactionInfo(): Unit = js.native
  def clearTransactionInfoToEventProof(): Unit = js.native
  def getLedgerInfoToTransactionInfoProof(): js.UndefOr[AccumulatorProof] = js.native
  def getTransactionInfo(): js.UndefOr[TransactionInfo] = js.native
  def getTransactionInfoToEventProof(): js.UndefOr[AccumulatorProof] = js.native
  def hasLedgerInfoToTransactionInfoProof(): Boolean = js.native
  def hasTransactionInfo(): Boolean = js.native
  def hasTransactionInfoToEventProof(): Boolean = js.native
  def setLedgerInfoToTransactionInfoProof(): Unit = js.native
  def setLedgerInfoToTransactionInfoProof(value: AccumulatorProof): Unit = js.native
  def setTransactionInfo(): Unit = js.native
  def setTransactionInfo(value: TransactionInfo): Unit = js.native
  def setTransactionInfoToEventProof(): Unit = js.native
  def setTransactionInfoToEventProof(value: AccumulatorProof): Unit = js.native
}

