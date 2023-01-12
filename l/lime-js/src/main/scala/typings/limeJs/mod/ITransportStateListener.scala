package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITransportStateListener extends StObject {
  
  def onClose(): Unit
  
  def onError(error: String): Unit
  
  def onOpen(): Unit
}
object ITransportStateListener {
  
  inline def apply(onClose: () => Unit, onError: String => Unit, onOpen: () => Unit): ITransportStateListener = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), onError = js.Any.fromFunction1(onError), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[ITransportStateListener]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITransportStateListener] (val x: Self) extends AnyVal {
    
    inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
    
    inline def setOnError(value: String => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnOpen(value: () => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction0(value))
  }
}
