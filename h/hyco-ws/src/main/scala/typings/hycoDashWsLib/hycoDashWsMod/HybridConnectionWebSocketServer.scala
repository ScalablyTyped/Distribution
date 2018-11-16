package typings
package hycoDashWsLib.hycoDashWsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hyco-ws", "HybridConnectionWebSocketServer")
@js.native
class HybridConnectionWebSocketServer protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(options: js.Any) = this()
  var clients: js.Array[wsLib.wsMod.namespaced] = js.native
  var closeRequested: scala.Boolean = js.native
  var controlChannel: wsLib.wsMod.namespaced = js.native
  var listenUri: java.lang.String = js.native
  var options: js.Any = js.native
  var path: java.lang.String = js.native
  def close(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

