package typings.grpcGrpcJs.serverCallMod

import typings.grpcGrpcJs.AnonCancelled
import typings.grpcGrpcJs.AnonRequest
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/server-call", "ServerUnaryCallImpl")
@js.native
class ServerUnaryCallImpl[RequestType, ResponseType] protected ()
  extends EventEmitter
     with AnonCancelled
     with AnonRequest[RequestType] {
  def this(call: Http2ServerCallStream[RequestType, ResponseType], metadata: Metadata) = this()
  var call: js.Any = js.native
  /* CompleteClass */
  override var cancelled: Boolean = js.native
  var metadata: Metadata = js.native
  /* CompleteClass */
  override var request: RequestType | Null = js.native
  /* CompleteClass */
  override def getPeer(): String = js.native
  /* CompleteClass */
  override def sendMetadata(responseMetadata: Metadata): Unit = js.native
}

