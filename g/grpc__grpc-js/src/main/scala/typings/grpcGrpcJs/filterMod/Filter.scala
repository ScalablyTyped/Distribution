package typings.grpcGrpcJs.filterMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.callStreamMod.WriteObject
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer]
  def receiveMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata]
  def receiveTrailers(status: js.Promise[StatusObject]): js.Promise[StatusObject]
  def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject]
  def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata]
}

object Filter {
  @scala.inline
  def apply(
    receiveMessage: js.Promise[Buffer] => js.Promise[Buffer],
    receiveMetadata: js.Promise[Metadata] => js.Promise[Metadata],
    receiveTrailers: js.Promise[StatusObject] => js.Promise[StatusObject],
    sendMessage: js.Promise[WriteObject] => js.Promise[WriteObject],
    sendMetadata: js.Promise[Metadata] => js.Promise[Metadata]
  ): Filter = {
    val __obj = js.Dynamic.literal(receiveMessage = js.Any.fromFunction1(receiveMessage), receiveMetadata = js.Any.fromFunction1(receiveMetadata), receiveTrailers = js.Any.fromFunction1(receiveTrailers), sendMessage = js.Any.fromFunction1(sendMessage), sendMetadata = js.Any.fromFunction1(sendMetadata))
    __obj.asInstanceOf[Filter]
  }
}

