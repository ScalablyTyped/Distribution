package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.accountStateBlobPbMod.AccountStateWithProof
import typings.libraCore.transactionPbMod.SignedTransactionWithProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberResponse")
@js.native
class GetAccountTransactionBySequenceNumberResponse_ () extends Message {
  def clearProofOfCurrentSequenceNumber(): Unit = js.native
  def clearSignedTransactionWithProof(): Unit = js.native
  def getProofOfCurrentSequenceNumber(): js.UndefOr[AccountStateWithProof] = js.native
  def getSignedTransactionWithProof(): js.UndefOr[SignedTransactionWithProof] = js.native
  def hasProofOfCurrentSequenceNumber(): Boolean = js.native
  def hasSignedTransactionWithProof(): Boolean = js.native
  def setProofOfCurrentSequenceNumber(): Unit = js.native
  def setProofOfCurrentSequenceNumber(value: AccountStateWithProof): Unit = js.native
  def setSignedTransactionWithProof(): Unit = js.native
  def setSignedTransactionWithProof(value: SignedTransactionWithProof): Unit = js.native
}

