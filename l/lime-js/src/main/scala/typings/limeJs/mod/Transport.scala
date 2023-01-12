package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transport
  extends StObject
     with ITransportStateListener {
  
  def close(): Unit
  
  var compression: String
  
  var encryption: String
  
  def getSupportedCompression(): js.Array[String]
  
  def getSupportedEncryption(): js.Array[String]
  
  def onEnvelope(envelope: Envelope): Any
  
  def open(uri: String): Unit
  
  def send(envelope: Envelope): Unit
  
  def setCompression(compression: String): Unit
  
  def setEncryption(encryption: String): Unit
}
object Transport {
  
  inline def apply(
    close: () => Unit,
    compression: String,
    encryption: String,
    getSupportedCompression: () => js.Array[String],
    getSupportedEncryption: () => js.Array[String],
    onClose: () => Unit,
    onEnvelope: Envelope => Any,
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
  implicit open class MutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setEncryption(value: String): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    inline def setGetSupportedCompression(value: () => js.Array[String]): Self = StObject.set(x, "getSupportedCompression", js.Any.fromFunction0(value))
    
    inline def setGetSupportedEncryption(value: () => js.Array[String]): Self = StObject.set(x, "getSupportedEncryption", js.Any.fromFunction0(value))
    
    inline def setOnEnvelope(value: Envelope => Any): Self = StObject.set(x, "onEnvelope", js.Any.fromFunction1(value))
    
    inline def setOpen(value: String => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
    
    inline def setSend(value: Envelope => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    
    inline def setSetCompression(value: String => Unit): Self = StObject.set(x, "setCompression", js.Any.fromFunction1(value))
    
    inline def setSetEncryption(value: String => Unit): Self = StObject.set(x, "setEncryption", js.Any.fromFunction1(value))
  }
}
