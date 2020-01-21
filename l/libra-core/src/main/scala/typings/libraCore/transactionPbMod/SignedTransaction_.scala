package typings.libraCore.transactionPbMod

import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransaction")
@js.native
class SignedTransaction_ () extends Message {
  def getRawTxnBytes(): Uint8Array | String = js.native
  def getRawTxnBytes_asB64(): String = js.native
  def getRawTxnBytes_asU8(): Uint8Array = js.native
  def getSenderPublicKey(): Uint8Array | String = js.native
  def getSenderPublicKey_asB64(): String = js.native
  def getSenderPublicKey_asU8(): Uint8Array = js.native
  def getSenderSignature(): Uint8Array | String = js.native
  def getSenderSignature_asB64(): String = js.native
  def getSenderSignature_asU8(): Uint8Array = js.native
  def setRawTxnBytes(value: String): Unit = js.native
  def setRawTxnBytes(value: Uint8Array): Unit = js.native
  def setSenderPublicKey(value: String): Unit = js.native
  def setSenderPublicKey(value: Uint8Array): Unit = js.native
  def setSenderSignature(value: String): Unit = js.native
  def setSenderSignature(value: Uint8Array): Unit = js.native
}

