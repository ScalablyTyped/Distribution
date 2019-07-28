package typings.hycoDashWs.hycoDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hyco-ws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
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
  def createRelayedServer(options: js.Any, fn: js.Function1[/* ws */ typings.ws.wsMod.^, Unit]): HybridConnectionWebSocketServer = js.native
  def relayedConnect(address: String, fn: js.Function0[Unit]): typings.ws.wsMod.^ = js.native
}

