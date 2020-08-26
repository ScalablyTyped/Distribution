package typings.grpcGrpcJs.callStreamMod

import typings.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullListener extends js.Object {
  @JSName("onReceiveMessage")
  var onReceiveMessage_Original: MessageListener = js.native
  @JSName("onReceiveMetadata")
  var onReceiveMetadata_Original: MetadataListener = js.native
  @JSName("onReceiveStatus")
  var onReceiveStatus_Original: StatusListener = js.native
  def onReceiveMessage(message: js.Any, next: js.Function1[/* message */ js.Any, Unit]): Unit = js.native
  def onReceiveMetadata(metadata: Metadata, next: js.Function1[/* metadata */ Metadata, Unit]): Unit = js.native
  def onReceiveStatus(status: StatusObject, next: js.Function1[/* status */ StatusObject, Unit]): Unit = js.native
}

