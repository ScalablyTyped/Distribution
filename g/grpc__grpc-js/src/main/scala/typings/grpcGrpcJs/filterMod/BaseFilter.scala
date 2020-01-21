package typings.grpcGrpcJs.filterMod

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.callStreamMod.WriteObject
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/filter", "BaseFilter")
@js.native
abstract class BaseFilter () extends js.Object {
  def receiveMessage(message: js.Promise[Buffer]): js.Promise[Buffer] = js.native
  def receiveMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
  def receiveTrailers(status: js.Promise[StatusObject]): js.Promise[StatusObject] = js.native
  def sendMessage(message: js.Promise[WriteObject]): js.Promise[WriteObject] = js.native
  def sendMetadata(metadata: js.Promise[Metadata]): js.Promise[Metadata] = js.native
}

