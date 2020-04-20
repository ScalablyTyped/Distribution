package typings.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends ITransportStateListener {
  var compression: String
  var encryption: String
  def close(): Unit
  def getSupportedCompression(): js.Array[String]
  def getSupportedEncryption(): js.Array[String]
  def onEnvelope(envelope: Envelope): js.Any
  def open(uri: String): Unit
  def send(envelope: Envelope): Unit
  def setCompression(compression: String): Unit
  def setEncryption(encryption: String): Unit
}

object Transport {
  @scala.inline
  def apply(
    close: () => Unit,
    compression: String,
    encryption: String,
    getSupportedCompression: () => js.Array[String],
    getSupportedEncryption: () => js.Array[String],
    onClose: () => Unit,
    onEnvelope: Envelope => js.Any,
    onError: String => Unit,
    onOpen: () => Unit,
    open: String => Unit,
    send: Envelope => Unit,
    setCompression: String => Unit,
    setEncryption: String => Unit
  ): Transport = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), compression = compression.asInstanceOf[js.Any], encryption = encryption.asInstanceOf[js.Any], getSupportedCompression = js.Any.fromFunction0(getSupportedCompression), getSupportedEncryption = js.Any.fromFunction0(getSupportedEncryption), onClose = js.Any.fromFunction0(onClose), onEnvelope = js.Any.fromFunction1(onEnvelope), onError = js.Any.fromFunction1(onError), onOpen = js.Any.fromFunction0(onOpen), open = js.Any.fromFunction1(open), send = js.Any.fromFunction1(send), setCompression = js.Any.fromFunction1(setCompression), setEncryption = js.Any.fromFunction1(setEncryption))
    __obj.asInstanceOf[Transport]
  }
}

