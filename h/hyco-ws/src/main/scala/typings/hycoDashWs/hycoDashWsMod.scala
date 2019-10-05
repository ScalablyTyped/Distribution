package typings.hycoDashWs

import typings.hycoDashWs.hycoDashWsMod.HybridConnectionWebSocketServer
import typings.node.NodeJS.EventEmitter
import typings.ws.wsMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hyco-ws", JSImport.Namespace)
@js.native
object hycoDashWsMod extends js.Object {
  @js.native
  class HybridConnectionWebSocketServer protected () extends EventEmitter {
    def this(options: js.Any) = this()
    var clients: js.Array[^] = js.native
    var closeRequested: Boolean = js.native
    var controlChannel: ^ = js.native
    var listenUri: String = js.native
    var options: js.Any = js.native
    var path: String = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
  }
  
  def appendRelayToken(uri: String, key_name: String, key: String): String = js.native
  def appendRelayToken(uri: String, key_name: String, key: String, expiry: Double): String = js.native
  def createRelayBaseUri(serviceBusNamespace: String, path: String): String = js.native
  def createRelayListenUri(serviceBusNamespace: String, path: String): String = js.native
  def createRelayListenUri(serviceBusNamespace: String, path: String, token: js.Any): String = js.native
  def createRelayListenUri(serviceBusNamespace: String, path: String, token: js.Any, id: js.Any): String = js.native
  def createRelaySendUri(serviceBusNamespace: String, path: String): String = js.native
  def createRelaySendUri(serviceBusNamespace: String, path: String, token: js.Any): String = js.native
  def createRelaySendUri(serviceBusNamespace: String, path: String, token: js.Any, id: js.Any): String = js.native
  def createRelayToken(uri: String, key_name: String, key: String): String = js.native
  def createRelayToken(uri: String, key_name: String, key: String, expiry: Double): String = js.native
  def createRelayedServer(options: js.Any, fn: js.Function1[/* ws */ ^, Unit]): HybridConnectionWebSocketServer = js.native
  def relayedConnect(address: String, fn: js.Function0[Unit]): ^ = js.native
}

