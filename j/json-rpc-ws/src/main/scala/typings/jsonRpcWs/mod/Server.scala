package typings.jsonRpcWs.mod

import typings.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-rpc-ws", "Server")
@js.native
class Server[TConnection /* <: Connection */] () extends Base[TConnection] {
  
  var server: typings.ws.mod.Server = js.native
  
  /**
    * Start the server
    */
  def start(): Unit = js.native
  def start(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def start(options: ServerOptions): Unit = js.native
  def start(options: ServerOptions, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Stop the server
    */
  def stop(): Unit = js.native
}
