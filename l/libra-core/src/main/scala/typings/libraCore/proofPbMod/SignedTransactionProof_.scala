package typings.libraCore.proofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionInfoPbMod.TransactionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof")
@js.native
class SignedTransactionProof_ () extends Message {
  def clearLedgerInfoToTransactionInfoProof(): Unit = js.native
  def clearTransactionInfo(): Unit = js.native
  def getLedgerInfoToTransactionInfoProof(): js.UndefOr[AccumulatorProof] = js.native
  def getTransactionInfo(): js.UndefOr[TransactionInfo] = js.native
  def hasLedgerInfoToTransactionInfoProof(): Boolean = js.native
  def hasTransactionInfo(): Boolean = js.native
  def setLedgerInfoToTransactionInfoProof(): Unit = js.native
  def setLedgerInfoToTransactionInfoProof(value: AccumulatorProof): Unit = js.native
  def setTransactionInfo(): Unit = js.native
  def setTransactionInfo(value: TransactionInfo): Unit = js.native
}

