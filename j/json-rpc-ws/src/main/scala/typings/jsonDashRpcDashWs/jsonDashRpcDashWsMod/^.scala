package typings.jsonDashRpcDashWs.jsonDashRpcDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rpc-ws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Errors(`type`: String, id: String, data: js.Any): js.Any | Null = js.native
  def Errors(`type`: String, id: Double, data: js.Any): js.Any | Null = js.native
  def Errors(`type`: String, id: Null, data: js.Any): js.Any | Null = js.native
  def createClient[TConnection /* <: Connection */](): Client[TConnection] = js.native
  def createServer[TConnection /* <: Connection */](): Server[TConnection] = js.native
}

