package typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys

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

@JSImport("libra-core/lib/@/generated/validator_public_keys_pb", "ValidatorPublicKeys")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys = js.native
  def deserializeBinaryFromReader(message: typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys, reader: BinaryReader): typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys = js.native
  def serializeBinaryToWriter(message: typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys): AsObject = js.native
}

