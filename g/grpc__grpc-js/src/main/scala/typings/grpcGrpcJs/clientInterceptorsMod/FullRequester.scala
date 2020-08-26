package typings.grpcGrpcJs.clientInterceptorsMod

import typings.grpcGrpcJs.callStreamMod.InterceptingListener
import typings.grpcGrpcJs.callStreamMod.Listener
import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullRequester extends js.Object {
  @JSName("cancel")
  var cancel_Original: CancelRequester = js.native
  @JSName("halfClose")
  var halfClose_Original: CloseRequester = js.native
  @JSName("sendMessage")
  var sendMessage_Original: MessageRequester = js.native
  @JSName("start")
  var start_Original: MetadataRequester = js.native
  def cancel(next: js.Function0[Unit]): Unit = js.native
  def halfClose(next: js.Function0[Unit]): Unit = js.native
  def sendMessage(message: js.Any, next: js.Function1[/* message */ js.Any, Unit]): Unit = js.native
  def start(
    metadata: Metadata,
    listener: InterceptingListener,
    next: js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit]
  ): Unit = js.native
}

