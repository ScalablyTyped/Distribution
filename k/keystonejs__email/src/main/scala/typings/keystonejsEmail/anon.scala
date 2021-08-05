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
    
    extension [Self <: Root](x: Self) {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait Send extends StObject {
    
    def send(rendererOpts: js.Any, transportOptions: js.Any): js.Any
  }
  object Send {
    
    inline def apply(send: (js.Any, js.Any) => js.Any): Send = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
      __obj.asInstanceOf[Send]
    }
    
    extension [Self <: Send](x: Self) {
      
      inline def setSend(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    }
  }
}
