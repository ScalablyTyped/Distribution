package typings.grpcGrpcJs.serverCallMod

import typings.grpcGrpcJs.AnonCancelled
import typings.grpcGrpcJs.AnonRequest
import typings.grpcGrpcJs.makeClientMod.Serialize
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.objectStreamMod.ObjectWritable
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/server-call", "ServerWritableStreamImpl")
@js.native
class ServerWritableStreamImpl[RequestType, ResponseType] protected ()
  extends ObjectWritable[ResponseType]
     with AnonCancelled
     with AnonRequest[RequestType] {
  def this(
    call: Http2ServerCallStream[RequestType, ResponseType],
    metadata: Metadata,
    serialize: Serialize[ResponseType]
  ) = this()
  var call: js.Any = js.native
  /* CompleteClass */
  override var cancelled: Boolean = js.native
  var metadata: Metadata = js.native
  /* CompleteClass */
  override var request: RequestType | Null = js.native
  @JSName("serialize")
  var serialize_Original: Serialize[ResponseType] = js.native
  var trailingMetadata: js.Any = js.native
  def _final(callback: js.Function): Unit = js.native
  def _write(chunk: ResponseType, encoding: String, callback: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def getPeer(): String = js.native
  /* CompleteClass */
  override def sendMetadata(responseMetadata: Metadata): Unit = js.native
  def serialize(value: ResponseType): Buffer = js.native
}

