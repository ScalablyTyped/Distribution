package typings
package limeDashJsLib.limeDashJsMod

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
    close: () => scala.Unit,
    compression: java.lang.String,
    encryption: java.lang.String,
    getSupportedCompression: () => js.Array[java.lang.String],
    getSupportedEncryption: () => js.Array[java.lang.String],
    onClose: () => scala.Unit,
    onEnvelope: Envelope => js.Any,
    onError: java.lang.String => scala.Unit,
    onOpen: () => scala.Unit,
    open: java.lang.String => scala.Unit,
    send: Envelope => scala.Unit,
    setCompression: java.lang.String => scala.Unit,
    setEncryption: java.lang.String => scala.Unit
  ): Transport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), compression = compression, encryption = encryption, getSupportedCompression = js.Any.fromFunction0(getSupportedCompression), getSupportedEncryption = js.Any.fromFunction0(getSupportedEncryption), onClose = js.Any.fromFunction0(onClose), onEnvelope = js.Any.fromFunction1(onEnvelope), onError = js.Any.fromFunction1(onError), onOpen = js.Any.fromFunction0(onOpen), open = js.Any.fromFunction1(open), send = js.Any.fromFunction1(send), setCompression = js.Any.fromFunction1(setCompression), setEncryption = js.Any.fromFunction1(setEncryption))
  
    __obj.asInstanceOf[Transport]
  }
}

