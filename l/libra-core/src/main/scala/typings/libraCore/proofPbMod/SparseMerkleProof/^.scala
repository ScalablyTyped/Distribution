package typings.libraCore.proofPbMod.SparseMerkleProof

import org.scalablytyped.runtime.NumberDictionary
import typings.googleProtobuf.mod.BinaryReader
import typings.googleProtobuf.mod.BinaryWriter
import typings.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typings.googleProtobuf.mod.ExtensionFieldInfo
import typings.googleProtobuf.mod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/proof_pb", "SparseMerkleProof")
@js.native
object ^ extends js.Object {
  
  def deserializeBinary(bytes: Uint8Array): typings.libraCore.proofPbMod.SparseMerkleProof = js.native
  
  def deserializeBinaryFromReader(message: typings.libraCore.proofPbMod.SparseMerkleProof, reader: BinaryReader): typings.libraCore.proofPbMod.SparseMerkleProof = js.native
  
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  
  def serializeBinaryToWriter(message: typings.libraCore.proofPbMod.SparseMerkleProof, writer: BinaryWriter): Unit = js.native
  
  def toObject(includeInstance: Boolean, msg: typings.libraCore.proofPbMod.SparseMerkleProof): AsObject = js.native
}
