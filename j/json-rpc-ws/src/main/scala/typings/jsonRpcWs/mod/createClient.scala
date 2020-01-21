package typings.jsonRpcWs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rpc-ws", "createClient")
@js.native
object createClient extends js.Object {
  def apply[TConnection /* <: Connection */](): Client[TConnection] = js.native
}

