package typings.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bridge extends StObject {
  
  def callNative(moduleName: String, methodName: String, args: Any*): Unit
  
  def callNativeWithCallbackId(moduleName: String, methodName: String, args: Any*): Double
  
  def callNativeWithPromise[T](moduleName: String, methodName: String, args: Any*): js.Promise[T]
  
  def removeNativeCallback(callbackId: Double): Unit
}
object Bridge {
  
  inline def apply(
    callNative: (String, String, /* repeated */ Any) => Unit,
    callNativeWithCallbackId: (String, String, /* repeated */ Any) => Double,
    callNativeWithPromise: (String, String, /* repeated */ Any) => js.Promise[Any],
    removeNativeCallback: Double => Unit
  ): Bridge = {
    val __obj = js.Dynamic.literal(callNative = js.Any.fromFunction3(callNative), callNativeWithCallbackId = js.Any.fromFunction3(callNativeWithCallbackId), callNativeWithPromise = js.Any.fromFunction3(callNativeWithPromise), removeNativeCallback = js.Any.fromFunction1(removeNativeCallback))
    __obj.asInstanceOf[Bridge]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bridge] (val x: Self) extends AnyVal {
    
    inline def setCallNative(value: (String, String, /* repeated */ Any) => Unit): Self = StObject.set(x, "callNative", js.Any.fromFunction3(value))
    
    inline def setCallNativeWithCallbackId(value: (String, String, /* repeated */ Any) => Double): Self = StObject.set(x, "callNativeWithCallbackId", js.Any.fromFunction3(value))
    
    inline def setCallNativeWithPromise(value: (String, String, /* repeated */ Any) => js.Promise[Any]): Self = StObject.set(x, "callNativeWithPromise", js.Any.fromFunction3(value))
    
    inline def setRemoveNativeCallback(value: Double => Unit): Self = StObject.set(x, "removeNativeCallback", js.Any.fromFunction1(value))
  }
}
