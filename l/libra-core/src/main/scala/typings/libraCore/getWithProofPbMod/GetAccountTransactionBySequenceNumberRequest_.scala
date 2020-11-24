package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest")
@js.native
class GetAccountTransactionBySequenceNumberRequest_ () extends Message {
  
  def getAccount(): Uint8Array | String = js.native
  
  def getAccount_asB64(): String = js.native
  
  def getAccount_asU8(): Uint8Array = js.native
  
  def getFetchEvents(): Boolean = js.native
  
  def getSequenceNumber(): String = js.native
  
  def setAccount(value: String): Unit = js.native
  def setAccount(value: Uint8Array): Unit = js.native
  
  def setFetchEvents(value: Boolean): Unit = js.native
  
  def setSequenceNumber(value: String): Unit = js.native
}
