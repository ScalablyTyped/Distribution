package typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod

import org.scalablytyped.runtime.NumberDictionary
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryReader
import typings.googleDashProtobuf.googleDashProtobufMod.BinaryWriter
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldBinaryInfo
import typings.googleDashProtobuf.googleDashProtobufMod.ExtensionFieldInfo
import typings.googleDashProtobuf.googleDashProtobufMod.Message
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckRequest")
@js.native
class HealthCheckRequest () extends Message

/* static members */
@JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckRequest")
@js.native
object HealthCheckRequest extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): HealthCheckRequest = js.native
  def deserializeBinaryFromReader(message: HealthCheckRequest, reader: BinaryReader): HealthCheckRequest = js.native
  def serializeBinaryToWriter(message: HealthCheckRequest, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: HealthCheckRequest): AsObject = js.native
  type AsObject = js.Object
}

