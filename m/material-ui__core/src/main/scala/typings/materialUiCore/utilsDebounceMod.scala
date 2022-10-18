package typings.materialUiCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsDebounceMod {
  
  @JSImport("@material-ui/core/utils/debounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): T & Cancelable = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any]).asInstanceOf[T & Cancelable]
  inline def default[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): T & Cancelable = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T & Cancelable]
  
  trait Cancelable extends StObject {
    
    def clear(): Unit
  }
  object Cancelable {
    
    inline def apply(clear: () => Unit): Cancelable = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[Cancelable]
    }
    
    extension [Self <: Cancelable](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
}
