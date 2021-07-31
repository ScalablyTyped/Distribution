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
    
    @scala.inline
    def apply(): Root = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Root]
    }
    
    @scala.inline
    implicit class RootMutableBuilder[Self <: Root] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait Send extends StObject {
    
    def send(rendererOpts: js.Any, transportOptions: js.Any): js.Any
  }
  object Send {
    
    @scala.inline
    def apply(send: (js.Any, js.Any) => js.Any): Send = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
      __obj.asInstanceOf[Send]
    }
    
    @scala.inline
    implicit class SendMutableBuilder[Self <: Send] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSend(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    }
  }
}
