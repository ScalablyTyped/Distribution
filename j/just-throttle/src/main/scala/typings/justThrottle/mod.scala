package typings.justThrottle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Func /* <: js.Function1[/* repeated */ Any, Any] */](fn: Func, interval: Double): Func & Methods = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[Func & Methods]
  inline def default[Func /* <: js.Function1[/* repeated */ Any, Any] */](fn: Func, interval: Double, options: options): Func & Methods = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Func & Methods]
  
  trait Methods extends StObject {
    
    def cancel(): Unit
    
    def flush(): Unit
  }
  object Methods {
    
    inline def apply(cancel: () => Unit, flush: () => Unit): Methods = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush))
      __obj.asInstanceOf[Methods]
    }
    
    extension [Self <: Methods](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    }
  }
  
  trait options extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object options {
    
    inline def apply(): options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[options]
    }
    
    extension [Self <: options](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
