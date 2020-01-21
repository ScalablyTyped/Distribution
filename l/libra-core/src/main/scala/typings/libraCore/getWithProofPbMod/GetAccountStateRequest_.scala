package typings.libraCore.getWithProofPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountStateRequest")
@js.native
class GetAccountStateRequest_ () extends Message {
  def getAddress(): Uint8Array | String = js.native
  def getAddress_asB64(): String = js.native
  def getAddress_asU8(): Uint8Array = js.native
  def setAddress(value: String): Unit = js.native
  def setAddress(value: Uint8Array): Unit = js.native
}

