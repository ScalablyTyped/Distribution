package typings.libraCore.transactionPbMod.AccountState

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "AccountState")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.libraCore.transactionPbMod.AccountState = js.native
  def deserializeBinaryFromReader(message: typings.libraCore.transactionPbMod.AccountState, reader: BinaryReader): typings.libraCore.transactionPbMod.AccountState = js.native
  def serializeBinaryToWriter(message: typings.libraCore.transactionPbMod.AccountState, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.libraCore.transactionPbMod.AccountState): AsObject = js.native
}

