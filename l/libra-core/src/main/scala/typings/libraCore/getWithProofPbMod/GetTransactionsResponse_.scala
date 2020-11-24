package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionPbMod.TransactionListWithProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetTransactionsResponse")
@js.native
class GetTransactionsResponse_ () extends Message {
  
  def clearTxnListWithProof(): Unit = js.native
  
  def getTxnListWithProof(): js.UndefOr[TransactionListWithProof] = js.native
  
  def hasTxnListWithProof(): Boolean = js.native
  
  def setTxnListWithProof(): Unit = js.native
  def setTxnListWithProof(value: TransactionListWithProof): Unit = js.native
}
