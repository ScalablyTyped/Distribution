package typings
package limeDashJsLib.limeDashJsMod.LimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends ITransportStateListener {
  var compression: java.lang.String
  var encryption: java.lang.String
  def close(): scala.Unit
  def getSupportedCompression(): js.Array[java.lang.String]
  def getSupportedEncryption(): js.Array[java.lang.String]
  def onEnvelope(envelope: Envelope): js.Any
  def open(uri: java.lang.String): scala.Unit
  def send(envelope: Envelope): scala.Unit
  def setCompression(compression: java.lang.String): scala.Unit
  def setEncryption(encryption: java.lang.String): scala.Unit
}

object Transport {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    compression: java.lang.String,
    encryption: java.lang.String,
    getSupportedCompression: js.Function0[js.Array[java.lang.String]],
    getSupportedEncryption: js.Function0[js.Array[java.lang.String]],
    onClose: js.Function0[scala.Unit],
    onEnvelope: js.Function1[Envelope, js.Any],
    onError: js.Function1[java.lang.String, scala.Unit],
    onOpen: js.Function0[scala.Unit],
    open: js.Function1[java.lang.String, scala.Unit],
    send: js.Function1[Envelope, scala.Unit],
    setCompression: js.Function1[java.lang.String, scala.Unit],
    setEncryption: js.Function1[java.lang.String, scala.Unit]
  ): Transport = {
    val __obj = js.Dynamic.literal(close = close, compression = compression, encryption = encryption, getSupportedCompression = getSupportedCompression, getSupportedEncryption = getSupportedEncryption, onClose = onClose, onEnvelope = onEnvelope, onError = onError, onOpen = onOpen, open = open, send = send, setCompression = setCompression, setEncryption = setEncryption)
  
    __obj.asInstanceOf[Transport]
  }
}

