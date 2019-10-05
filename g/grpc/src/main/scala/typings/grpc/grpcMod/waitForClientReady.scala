package typings.grpc.grpcMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "waitForClientReady")
@js.native
object waitForClientReady extends js.Object {
  def apply(client: Client, deadline: Deadline, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
}

