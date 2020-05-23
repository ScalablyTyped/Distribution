package typings.grpcGrpcJs.serverCallMod

import typings.grpcGrpcJs.makeClientMod.Deserialize
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.Buffer
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.grpcGrpcJs.serverCallMod.ServerReadableStream because var conflicts: destroyed, readable. Inlined cancelled, getPeer, sendMetadata */ @JSImport("@grpc/grpc-js/build/src/server-call", "ServerReadableStreamImpl")
@js.native
class ServerReadableStreamImpl[RequestType, ResponseType] protected () extends Readable {
  def this(
    call: Http2ServerCallStream[RequestType, ResponseType],
    metadata: Metadata,
    deserialize: Deserialize[RequestType]
  ) = this()
  var call: js.Any = js.native
  var cancelled: Boolean = js.native
  @JSName("deserialize")
  var deserialize_Original: Deserialize[RequestType] = js.native
  var metadata: Metadata = js.native
  def deserialize(bytes: Buffer): RequestType = js.native
  def getPeer(): String = js.native
  def sendMetadata(responseMetadata: Metadata): Unit = js.native
}

