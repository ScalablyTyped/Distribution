package typings.jsonRpcWs.mod

import typings.ws.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rpc-ws", "Client")
@js.native
class Client[TConnection /* <: Connection */] protected () extends Base[TConnection] {
  def this(WebSocket: ^) = this()
  def this(WebSocket: ^, browser: Boolean) = this()
  /**
    * Connect to a json-rpc-ws server
    */
  def connect(url: String, connected: js.Function0[Unit]): Unit = js.native
  /**
    * Close the current connection
    */
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  /**
    * Return the current connection (there can be only one)
    */
  def getConnection(): TConnection = js.native
  /**
    * Test whether we have a connection or not
    */
  def isConnected(): Boolean = js.native
}

