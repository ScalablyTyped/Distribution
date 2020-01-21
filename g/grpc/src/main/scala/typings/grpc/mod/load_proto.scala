package typings.grpc.mod

import typings.grpc.grpcStrings.proto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "load")
@js.native
object load_proto extends js.Object {
  def apply[T](filename: Filename, format: proto): T = js.native
  def apply[T](filename: Filename, format: proto, options: LoadOptions): T = js.native
}

