package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.accountStateBlobPbMod.AccountStateWithProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateResponse")
@js.native
class GetAccountStateResponse_ () extends Message {
  
  def clearAccountStateWithProof(): Unit = js.native
  
  def getAccountStateWithProof(): js.UndefOr[AccountStateWithProof] = js.native
  
  def hasAccountStateWithProof(): Boolean = js.native
  
  def setAccountStateWithProof(): Unit = js.native
  def setAccountStateWithProof(value: AccountStateWithProof): Unit = js.native
}
