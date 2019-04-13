package typings
package limeDashJsLib.limeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lime-js", "WebSocketTransport")
@js.native
class WebSocketTransport () extends Transport {
  def this(traceEnabled: scala.Boolean) = this()
  /* CompleteClass */
  override var compression: java.lang.String = js.native
  /* CompleteClass */
  override var encryption: java.lang.String = js.native
  var webSocket: stdLib.WebSocket = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def getSupportedCompression(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def getSupportedEncryption(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def onClose(): scala.Unit = js.native
  /* CompleteClass */
  override def onEnvelope(envelope: Envelope): js.Any = js.native
  /* CompleteClass */
  override def onError(error: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def onOpen(): scala.Unit = js.native
  /* CompleteClass */
  override def open(uri: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def send(envelope: Envelope): scala.Unit = js.native
  /* CompleteClass */
  override def setCompression(compression: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def setEncryption(encryption: java.lang.String): scala.Unit = js.native
}

