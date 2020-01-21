package typings.libraCore.mempoolPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_pb", "TransactionExclusion")
@js.native
class TransactionExclusion_ () extends Message {
  def getSender(): Uint8Array | String = js.native
  def getSender_asB64(): String = js.native
  def getSender_asU8(): Uint8Array = js.native
  def getSequenceNumber(): String = js.native
  def setSender(value: String): Unit = js.native
  def setSender(value: Uint8Array): Unit = js.native
  def setSequenceNumber(value: String): Unit = js.native
}

