package typings.keystonejsEmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Root extends StObject {
    
    var root: js.UndefOr[String] = js.undefined
    
    var transport: js.UndefOr[String] = js.undefined
  }
  object Root {
    
    inline def apply(): Root = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait Send extends StObject {
    
    def send(rendererOpts: Any, transportOptions: Any): Any
  }
  object Send {
    
    inline def apply(send: (Any, Any) => Any): Send = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
      __obj.asInstanceOf[Send]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Send] (val x: Self) extends AnyVal {
      
      inline def setSend(value: (Any, Any) => Any): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    }
  }
}
