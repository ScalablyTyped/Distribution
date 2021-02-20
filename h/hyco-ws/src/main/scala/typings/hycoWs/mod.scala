package typings.hycoWs

import typings.node.eventsMod.EventEmitter
import typings.ws.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hyco-ws", "HybridConnectionWebSocketServer")
  @js.native
  class HybridConnectionWebSocketServer protected () extends EventEmitter {
    def this(options: js.Any) = this()
    
    var clients: js.Array[^] = js.native
    
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var closeRequested: Boolean = js.native
    
    var controlChannel: ^ = js.native
    
    var listenUri: String = js.native
    
    var options: js.Any = js.native
    
    var path: String = js.native
  }
  
  @JSImport("hyco-ws", "appendRelayToken")
  @js.native
  def appendRelayToken(uri: String, key_name: String, key: String): String = js.native
  @JSImport("hyco-ws", "appendRelayToken")
  @js.native
  def appendRelayToken(uri: String, key_name: String, key: String, expiry: Double): String = js.native
  
  @JSImport("hyco-ws", "createRelayBaseUri")
  @js.native
  def createRelayBaseUri(serviceBusNamespace: String, path: String): String = js.native
  
  @JSImport("hyco-ws", "createRelayListenUri")
  @js.native
  def createRelayListenUri(serviceBusNamespace: String, path: String): String = js.native
  @JSImport("hyco-ws", "createRelayListenUri")
  @js.native
  def createRelayListenUri(serviceBusNamespace: String, path: String, token: js.UndefOr[scala.Nothing], id: js.Any): String = js.native
  @JSImport("hyco-ws", "createRelayListenUri")
  @js.native
  def createRelayListenUri(serviceBusNamespace: String, path: String, token: js.Any): String = js.native
  @JSImport("hyco-ws", "createRelayListenUri")
  @js.native
  def createRelayListenUri(serviceBusNamespace: String, path: String, token: js.Any, id: js.Any): String = js.native
  
  @JSImport("hyco-ws", "createRelaySendUri")
  @js.native
  def createRelaySendUri(serviceBusNamespace: String, path: String): String = js.native
  @JSImport("hyco-ws", "createRelaySendUri")
  @js.native
  def createRelaySendUri(serviceBusNamespace: String, path: String, token: js.UndefOr[scala.Nothing], id: js.Any): String = js.native
  @JSImport("hyco-ws", "createRelaySendUri")
  @js.native
  def createRelaySendUri(serviceBusNamespace: String, path: String, token: js.Any): String = js.native
  @JSImport("hyco-ws", "createRelaySendUri")
  @js.native
  def createRelaySendUri(serviceBusNamespace: String, path: String, token: js.Any, id: js.Any): String = js.native
  
  @JSImport("hyco-ws", "createRelayToken")
  @js.native
  def createRelayToken(uri: String, key_name: String, key: String): String = js.native
  @JSImport("hyco-ws", "createRelayToken")
  @js.native
  def createRelayToken(uri: String, key_name: String, key: String, expiry: Double): String = js.native
  
  @JSImport("hyco-ws", "createRelayedServer")
  @js.native
  def createRelayedServer(options: js.Any, fn: js.Function1[/* ws */ ^, Unit]): HybridConnectionWebSocketServer = js.native
  
  @JSImport("hyco-ws", "relayedConnect")
  @js.native
  def relayedConnect(address: String, fn: js.Function0[Unit]): ^ = js.native
}
