package typings.grpcGrpcJs.clientInterceptorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/client-interceptors", "RequesterBuilder")
@js.native
class RequesterBuilder () extends js.Object {
  var cancel: js.Any = js.native
  var halfClose: js.Any = js.native
  var message: js.Any = js.native
  var start: js.Any = js.native
  def build(): Requester = js.native
  def withCancel(cancel: CancelRequester): this.type = js.native
  def withHalfClose(halfClose: CloseRequester): this.type = js.native
  def withSendMessage(sendMessage: MessageRequester): this.type = js.native
  def withStart(start: MetadataRequester): this.type = js.native
}

