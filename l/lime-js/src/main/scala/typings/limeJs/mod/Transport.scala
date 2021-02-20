package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transport extends ITransportStateListener {
  
  def close(): Unit = js.native
  
  var compression: String = js.native
  
  var encryption: String = js.native
  
  def getSupportedCompression(): js.Array[String] = js.native
  
  def getSupportedEncryption(): js.Array[String] = js.native
  
  def onEnvelope(envelope: Envelope): js.Any = js.native
  
  def open(uri: String): Unit = js.native
  
  def send(envelope: Envelope): Unit = js.native
  
  def setCompression(compression: String): Unit = js.native
  
  def setEncryption(encryption: String): Unit = js.native
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
  
  @scala.inline
  implicit class TransportMutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetSupportedCompression(value: () => js.Array[String]): Self = StObject.set(x, "getSupportedCompression", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSupportedEncryption(value: () => js.Array[String]): Self = StObject.set(x, "getSupportedEncryption", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnEnvelope(value: Envelope => js.Any): Self = StObject.set(x, "onEnvelope", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: String => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSend(value: Envelope => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCompression(value: String => Unit): Self = StObject.set(x, "setCompression", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEncryption(value: String => Unit): Self = StObject.set(x, "setEncryption", js.Any.fromFunction1(value))
  }
}
