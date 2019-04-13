package typings
package jsonDashRpcDashWsLib.jsonDashRpcDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rpc-ws", "Server")
@js.native
class Server[TConnection /* <: Connection */] () extends Base[TConnection] {
  var server: wsLib.wsMod.Server = js.native
  /**
    * Start the server
    */
  def start(): scala.Unit = js.native
  def start(options: wsLib.wsMod.ServerOptions): scala.Unit = js.native
  def start(options: wsLib.wsMod.ServerOptions, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Stop the server
    */
  def stop(): scala.Unit = js.native
}

