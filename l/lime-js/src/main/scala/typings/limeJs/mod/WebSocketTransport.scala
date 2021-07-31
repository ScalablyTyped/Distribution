package typings.limeJs.mod

import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lime-js", "WebSocketTransport")
@js.native
class WebSocketTransport ()
  extends StObject
     with Transport {
  def this(traceEnabled: Boolean) = this()
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /* CompleteClass */
  var compression: String = js.native
  
  /* CompleteClass */
  var encryption: String = js.native
  
  /* CompleteClass */
  override def getSupportedCompression(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def getSupportedEncryption(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def onClose(): Unit = js.native
  
  /* CompleteClass */
  override def onEnvelope(envelope: Envelope): js.Any = js.native
  
  /* CompleteClass */
  override def onError(error: String): Unit = js.native
  
  /* CompleteClass */
  override def onOpen(): Unit = js.native
  
  /* CompleteClass */
  override def open(uri: String): Unit = js.native
  
  /* CompleteClass */
  override def send(envelope: Envelope): Unit = js.native
  
  /* CompleteClass */
  override def setCompression(compression: String): Unit = js.native
  
  /* CompleteClass */
  override def setEncryption(encryption: String): Unit = js.native
  
  var webSocket: WebSocket = js.native
}
