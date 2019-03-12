package typings
package jsonDashRpcDashWsLib.jsonDashRpcDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rpc-ws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Errors(`type`: java.lang.String, id: java.lang.String, data: js.Any): js.Any | scala.Null = js.native
  def Errors(`type`: java.lang.String, id: scala.Double, data: js.Any): js.Any | scala.Null = js.native
  def Errors(`type`: java.lang.String, id: scala.Null, data: js.Any): js.Any | scala.Null = js.native
  def createClient[TConnection /* <: Connection */](): Client[TConnection] = js.native
  def createServer[TConnection /* <: Connection */](): Server[TConnection] = js.native
}

