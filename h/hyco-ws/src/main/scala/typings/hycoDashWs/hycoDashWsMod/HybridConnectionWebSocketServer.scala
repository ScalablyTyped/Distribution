package typings.hycoDashWs.hycoDashWsMod

import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hyco-ws", "HybridConnectionWebSocketServer")
@js.native
class HybridConnectionWebSocketServer protected () extends EventEmitter {
  def this(options: js.Any) = this()
  var clients: js.Array[typings.ws.wsMod.^] = js.native
  var closeRequested: Boolean = js.native
  var controlChannel: typings.ws.wsMod.^ = js.native
  var listenUri: String = js.native
  var options: js.Any = js.native
  var path: String = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
}

