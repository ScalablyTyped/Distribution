package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketTransport extends Transport {
  var webSocket: stdLib.WebSocket
}

object WebSocketTransport {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    compression: java.lang.String,
    encryption: java.lang.String,
    getSupportedCompression: () => js.Array[java.lang.String],
    getSupportedEncryption: () => js.Array[java.lang.String],
    onClose: () => scala.Unit,
    onEnvelope: Envelope => scala.Unit,
    onError: java.lang.String => scala.Unit,
    onOpen: () => scala.Unit,
    open: java.lang.String => scala.Unit,
    send: Envelope => scala.Unit,
    setCompression: java.lang.String => scala.Unit,
    setEncryption: java.lang.String => scala.Unit,
    webSocket: stdLib.WebSocket
  ): WebSocketTransport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), compression = compression, encryption = encryption, getSupportedCompression = js.Any.fromFunction0(getSupportedCompression), getSupportedEncryption = js.Any.fromFunction0(getSupportedEncryption), onClose = js.Any.fromFunction0(onClose), onEnvelope = js.Any.fromFunction1(onEnvelope), onError = js.Any.fromFunction1(onError), onOpen = js.Any.fromFunction0(onOpen), open = js.Any.fromFunction1(open), send = js.Any.fromFunction1(send), setCompression = js.Any.fromFunction1(setCompression), setEncryption = js.Any.fromFunction1(setEncryption), webSocket = webSocket)
  
    __obj.asInstanceOf[WebSocketTransport]
  }
}

