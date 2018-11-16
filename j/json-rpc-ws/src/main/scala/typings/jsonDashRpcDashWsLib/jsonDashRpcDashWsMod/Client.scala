package typings
package jsonDashRpcDashWsLib.jsonDashRpcDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-rpc-ws", "Client")
@js.native
class Client[TConnection /* <: Connection */] protected () extends Base[TConnection] {
  def this(WebSocket: wsLib.wsMod.namespaced) = this()
  def this(WebSocket: wsLib.wsMod.namespaced, browser: scala.Boolean) = this()
  /**
       * Connect to a json-rpc-ws server
       */
  def connect(url: java.lang.String, connected: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Close the current connection
       */
  def disconnect(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Return the current connection (there can be only one)
       */
  def getConnection(): TConnection = js.native
  /**
       * Test whether we have a connection or not
       */
  def isConnected(): scala.Boolean = js.native
}

