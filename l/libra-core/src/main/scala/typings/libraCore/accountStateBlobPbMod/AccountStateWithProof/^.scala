package typings.libraCore.accountStateBlobPbMod.AccountStateWithProof

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

@JSImport("libra-core/lib/@/generated/account_state_blob_pb", "AccountStateWithProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.libraCore.accountStateBlobPbMod.AccountStateWithProof = js.native
  def deserializeBinaryFromReader(message: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof, reader: BinaryReader): typings.libraCore.accountStateBlobPbMod.AccountStateWithProof = js.native
  def serializeBinaryToWriter(message: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.libraCore.accountStateBlobPbMod.AccountStateWithProof): AsObject = js.native
}

