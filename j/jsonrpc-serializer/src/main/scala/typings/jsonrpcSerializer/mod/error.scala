package typings.jsonrpcSerializer.mod

import typings.jsonrpcSerializer.mod.err.JsonRpcError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonrpc-serializer", "error")
@js.native
object error extends js.Object {
  def apply(id: String, error: JsonRpcError): String = js.native
  def apply(id: Double, error: JsonRpcError): String = js.native
}

