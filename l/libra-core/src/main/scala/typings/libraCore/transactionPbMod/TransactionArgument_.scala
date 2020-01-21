package typings.libraCore.transactionPbMod

import typings.googleProtobuf.mod.Message
import typings.libraCore.transactionPbMod.TransactionArgument.ArgType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument")
@js.native
class TransactionArgument_ () extends Message {
  def getData(): Uint8Array | String = js.native
  def getData_asB64(): String = js.native
  def getData_asU8(): Uint8Array = js.native
  def getType(): ArgType = js.native
  def setData(value: String): Unit = js.native
  def setData(value: Uint8Array): Unit = js.native
  def setType(value: ArgType): Unit = js.native
}

