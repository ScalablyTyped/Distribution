package typings.libraCore.mempoolPbMod

import typings.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsRequest")
@js.native
class CommitTransactionsRequest_ () extends Message {
  
  def addTransactions(): CommittedTransaction = js.native
  def addTransactions(value: js.UndefOr[scala.Nothing], index: Double): CommittedTransaction = js.native
  def addTransactions(value: CommittedTransaction): CommittedTransaction = js.native
  def addTransactions(value: CommittedTransaction, index: Double): CommittedTransaction = js.native
  
  def clearTransactionsList(): Unit = js.native
  
  def getBlockTimestampUsecs(): String = js.native
  
  def getTransactionsList(): js.Array[CommittedTransaction] = js.native
  
  def setBlockTimestampUsecs(value: String): Unit = js.native
  
  def setTransactionsList(value: js.Array[CommittedTransaction]): Unit = js.native
}
