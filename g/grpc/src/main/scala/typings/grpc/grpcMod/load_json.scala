package typings.grpc.grpcMod

import typings.grpc.grpcStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "load")
@js.native
object load_json extends js.Object {
  def apply[T](filename: Filename, format: json): T = js.native
  def apply[T](filename: Filename, format: json, options: LoadOptions): T = js.native
}

