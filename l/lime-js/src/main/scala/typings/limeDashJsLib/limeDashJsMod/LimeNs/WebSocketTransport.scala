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
    close: js.Function0[scala.Unit],
    compression: java.lang.String,
    encryption: java.lang.String,
    getSupportedCompression: js.Function0[js.Array[java.lang.String]],
    getSupportedEncryption: js.Function0[js.Array[java.lang.String]],
    onClose: js.Function0[scala.Unit],
    onEnvelope: js.Function1[Envelope, scala.Unit],
    onError: js.Function1[java.lang.String, scala.Unit],
    onOpen: js.Function0[scala.Unit],
    open: js.Function1[java.lang.String, scala.Unit],
    send: js.Function1[Envelope, scala.Unit],
    setCompression: js.Function1[java.lang.String, scala.Unit],
    setEncryption: js.Function1[java.lang.String, scala.Unit],
    webSocket: stdLib.WebSocket
  ): WebSocketTransport = {
    val __obj = js.Dynamic.literal(close = close, compression = compression, encryption = encryption, getSupportedCompression = getSupportedCompression, getSupportedEncryption = getSupportedEncryption, onClose = onClose, onEnvelope = onEnvelope, onError = onError, onOpen = onOpen, open = open, send = send, setCompression = setCompression, setEncryption = setEncryption, webSocket = webSocket)
  
    __obj.asInstanceOf[WebSocketTransport]
  }
}

