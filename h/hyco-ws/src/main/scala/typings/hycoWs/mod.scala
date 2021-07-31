package typings.hycoWs

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hyco-ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hyco-ws", "HybridConnectionWebSocketServer")
  @js.native
  class HybridConnectionWebSocketServer protected () extends EventEmitter {
    def this(options: js.Any) = this()
    
    var clients: js.Array[typings.ws.mod.^] = js.native
    
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var closeRequested: Boolean = js.native
    
    var controlChannel: typings.ws.mod.^ = js.native
    
    var listenUri: String = js.native
    
    var options: js.Any = js.native
    
    var path: String = js.native
  }
  
  @scala.inline
  def appendRelayToken(uri: String, key_name: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendRelayToken")(uri.asInstanceOf[js.Any], key_name.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def appendRelayToken(uri: String, key_name: String, key: String, expiry: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendRelayToken")(uri.asInstanceOf[js.Any], key_name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], expiry.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createRelayBaseUri(serviceBusNamespace: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelayBaseUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createRelayListenUri(serviceBusNamespace: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelayListenUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createRelayListenUri(serviceBusNamespace: String, path: String, token: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelayListenUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createRelayListenUri(serviceBusNamespace: String, path: String, token: js.Any, id: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelayListenUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any], token.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createRelayListenUri(serviceBusNamespace: String, path: String, token: Unit, id: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelayListenUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any], token.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createRelaySendUri(serviceBusNamespace: String, path: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelaySendUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createRelaySendUri(serviceBusNamespace: String, path: String, token: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelaySendUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createRelaySendUri(serviceBusNamespace: String, path: String, token: js.Any, id: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelaySendUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any], token.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createRelaySendUri(serviceBusNamespace: String, path: String, token: Unit, id: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelaySendUri")(serviceBusNamespace.asInstanceOf[js.Any], path.asInstanceOf[js.Any], token.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createRelayToken(uri: String, key_name: String, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelayToken")(uri.asInstanceOf[js.Any], key_name.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def createRelayToken(uri: String, key_name: String, key: String, expiry: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelayToken")(uri.asInstanceOf[js.Any], key_name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], expiry.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createRelayedServer(options: js.Any, fn: js.Function1[/* ws */ typings.ws.mod.^, Unit]): HybridConnectionWebSocketServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelayedServer")(options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[HybridConnectionWebSocketServer]
  
  @scala.inline
  def relayedConnect(address: String, fn: js.Function0[Unit]): typings.ws.mod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("relayedConnect")(address.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typings.ws.mod.^]
}
