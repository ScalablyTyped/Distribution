package typings.libraCore.mempoolPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_pb", "GetBlockRequest")
@js.native
class GetBlockRequest_ () extends Message {
  def addTransactions(): TransactionExclusion = js.native
  def addTransactions(value: js.UndefOr[scala.Nothing], index: Double): TransactionExclusion = js.native
  def addTransactions(value: TransactionExclusion): TransactionExclusion = js.native
  def addTransactions(value: TransactionExclusion, index: Double): TransactionExclusion = js.native
  def clearTransactionsList(): Unit = js.native
  def getMaxBlockSize(): String = js.native
  def getTransactionsList(): js.Array[TransactionExclusion] = js.native
  def setMaxBlockSize(value: String): Unit = js.native
  def setTransactionsList(value: js.Array[TransactionExclusion]): Unit = js.native
}

