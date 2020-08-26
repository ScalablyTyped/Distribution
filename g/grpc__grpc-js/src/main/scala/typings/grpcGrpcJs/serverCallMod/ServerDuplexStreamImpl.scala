package typings.grpcGrpcJs.serverCallMod

import typings.grpcGrpcJs.makeClientMod.Deserialize
import typings.grpcGrpcJs.makeClientMod.Serialize
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.Buffer
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.grpcGrpcJs.serverCallMod.ServerDuplexStream because var conflicts: _writev, destroyed, readable. Inlined cancelled, metadata, getPeer, sendMetadata */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerDuplexStreamImpl")
@js.native
class ServerDuplexStreamImpl[RequestType, ResponseType] protected () extends Duplex {
  def this(
    call: Http2ServerCallStream[RequestType, ResponseType],
    metadata: Metadata,
    serialize: Serialize[ResponseType],
    deserialize: Deserialize[RequestType]
  ) = this()
  var call: js.Any = js.native
  var cancelled: Boolean = js.native
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  var metadata: Metadata = js.native
  @JSName("serialize")
  var serialize_Original: Serialize[ResponseType] = js.native
  var trailingMetadata: js.Any = js.native
  def deserialize(bytes: Buffer): RequestType = js.native
  def getPeer(): String = js.native
  def sendMetadata(responseMetadata: Metadata): Unit = js.native
  def serialize(value: ResponseType): Buffer = js.native
}

