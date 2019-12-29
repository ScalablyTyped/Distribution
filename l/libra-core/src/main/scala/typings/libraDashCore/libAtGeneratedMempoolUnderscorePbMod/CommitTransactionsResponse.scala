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

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse")
@js.native
class CommitTransactionsResponse () extends Message

/* static members */
@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse")
@js.native
object CommitTransactionsResponse extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: Uint8Array): CommitTransactionsResponse = js.native
  def deserializeBinaryFromReader(message: CommitTransactionsResponse, reader: BinaryReader): CommitTransactionsResponse = js.native
  def serializeBinaryToWriter(message: CommitTransactionsResponse, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: CommitTransactionsResponse): AsObject = js.native
  type AsObject = js.Object
}

