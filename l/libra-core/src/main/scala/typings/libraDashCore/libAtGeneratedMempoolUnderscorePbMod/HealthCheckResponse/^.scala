package typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse

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

@JSImport("libra-core/lib/@/generated/mempool_pb", "HealthCheckResponse")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse = js.native
  def deserializeBinaryFromReader(
    message: typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse,
    reader: BinaryReader
  ): typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse = js.native
  def serializeBinaryToWriter(
    message: typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typings.libraDashCore.libAtGeneratedMempoolUnderscorePbMod.HealthCheckResponse
  ): AsObject = js.native
}

