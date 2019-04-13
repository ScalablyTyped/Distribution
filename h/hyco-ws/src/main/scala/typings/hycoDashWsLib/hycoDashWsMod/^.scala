package typings
package hycoDashWsLib.hycoDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hyco-ws", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def appendRelayToken(uri: java.lang.String, key_name: java.lang.String, key: java.lang.String): java.lang.String = js.native
  def appendRelayToken(uri: java.lang.String, key_name: java.lang.String, key: java.lang.String, expiry: scala.Double): java.lang.String = js.native
  def createRelayBaseUri(serviceBusNamespace: java.lang.String, path: java.lang.String): java.lang.String = js.native
  def createRelayListenUri(serviceBusNamespace: java.lang.String, path: java.lang.String): java.lang.String = js.native
  def createRelayListenUri(serviceBusNamespace: java.lang.String, path: java.lang.String, token: js.Any): java.lang.String = js.native
  def createRelayListenUri(serviceBusNamespace: java.lang.String, path: java.lang.String, token: js.Any, id: js.Any): java.lang.String = js.native
  def createRelaySendUri(serviceBusNamespace: java.lang.String, path: java.lang.String): java.lang.String = js.native
  def createRelaySendUri(serviceBusNamespace: java.lang.String, path: java.lang.String, token: js.Any): java.lang.String = js.native
  def createRelaySendUri(serviceBusNamespace: java.lang.String, path: java.lang.String, token: js.Any, id: js.Any): java.lang.String = js.native
  def createRelayToken(uri: java.lang.String, key_name: java.lang.String, key: java.lang.String): java.lang.String = js.native
  def createRelayToken(uri: java.lang.String, key_name: java.lang.String, key: java.lang.String, expiry: scala.Double): java.lang.String = js.native
  def createRelayedServer(options: js.Any, fn: js.Function1[/* ws */ wsLib.wsMod.^, scala.Unit]): HybridConnectionWebSocketServer = js.native
  def relayedConnect(address: java.lang.String, fn: js.Function0[scala.Unit]): wsLib.wsMod.^ = js.native
}

