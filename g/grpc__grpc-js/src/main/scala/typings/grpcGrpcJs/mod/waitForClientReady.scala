package typings.grpcGrpcJs.mod

import typings.grpcGrpcJs.callStreamMod.Deadline
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js", "waitForClientReady")
@js.native
object waitForClientReady extends js.Object {
  def apply(
    client: typings.grpcGrpcJs.clientMod.Client,
    deadline: Deadline,
    callback: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}

