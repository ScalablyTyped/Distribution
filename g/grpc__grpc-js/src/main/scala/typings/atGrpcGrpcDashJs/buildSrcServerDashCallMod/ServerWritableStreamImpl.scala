package typings.atGrpcGrpcDashJs.buildSrcServerDashCallMod

import typings.atGrpcGrpcDashJs.Anon_Cancelled
import typings.atGrpcGrpcDashJs.Anon_Request
import typings.atGrpcGrpcDashJs.buildSrcMakeDashClientMod.Serialize
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.atGrpcGrpcDashJs.buildSrcObjectDashStreamMod.ObjectWritable
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/server-call", "ServerWritableStreamImpl")
@js.native
class ServerWritableStreamImpl[RequestType, ResponseType] protected ()
  extends ObjectWritable[ResponseType]
     with Anon_Cancelled
     with Anon_Request[RequestType] {
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

