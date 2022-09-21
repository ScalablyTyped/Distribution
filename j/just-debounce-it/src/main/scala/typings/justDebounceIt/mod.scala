package typings.justDebounceIt

import typings.justDebounceIt.justDebounceItBooleans.`false`
import typings.justDebounceIt.justDebounceItBooleans.`true`
import typings.justDebounceIt.justDebounceItNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-debounce-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function */](fn: T): T & MethodTypes = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[T & MethodTypes]
  inline def default[T /* <: js.Function */](fn: T, wait: Double): (js.Function1[/* args */ ArgumentTypes[T], Unit]) & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* args */ ArgumentTypes[T], Unit]) & MethodTypes]
  inline def default[T /* <: js.Function */](fn: T, wait: Unit, callFirst: Boolean): T & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T & MethodTypes]
  
  inline def default_0[T /* <: js.Function */](fn: T, wait: `0`): T & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T & MethodTypes]
  inline def default_0[T /* <: js.Function */](fn: T, wait: `0`, callFirst: Boolean): T & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T & MethodTypes]
  
  inline def default_false[T /* <: js.Function */](fn: T, wait: Double, callFirst: `false`): (js.Function1[/* args */ ArgumentTypes[T], Unit]) & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[(js.Function1[/* args */ ArgumentTypes[T], Unit]) & MethodTypes]
  
  inline def default_true[T /* <: js.Function */](fn: T, wait: Double, callFirst: `true`): T & MethodTypes = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], callFirst.asInstanceOf[js.Any])).asInstanceOf[T & MethodTypes]
  
  type ArgumentTypes[F /* <: js.Function */] = Any
  
  trait MethodTypes extends StObject {
    
    def cancel(): Unit
    
    def flush(): Unit
  }
  object MethodTypes {
    
    inline def apply(cancel: () => Unit, flush: () => Unit): MethodTypes = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), flush = js.Any.fromFunction0(flush))
      __obj.asInstanceOf[MethodTypes]
    }
    
    extension [Self <: MethodTypes](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    }
  }
}
