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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("compression")(compression)
    __obj.updateDynamic("encryption")(encryption)
    __obj.updateDynamic("getSupportedCompression")(getSupportedCompression)
    __obj.updateDynamic("getSupportedEncryption")(getSupportedEncryption)
    __obj.updateDynamic("onClose")(onClose)
    __obj.updateDynamic("onEnvelope")(onEnvelope)
    __obj.updateDynamic("onError")(onError)
    __obj.updateDynamic("onOpen")(onOpen)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("setCompression")(setCompression)
    __obj.updateDynamic("setEncryption")(setEncryption)
    __obj.asInstanceOf[Transport]
  }
}

