package typings.koa

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(value: js.Any): Unit = js.native
    def apply(value: js.Any, status: Double): Unit = js.native
    def apply(value: js.Any, status: Double, msg: String): Unit = js.native
    def apply(value: js.Any, status: Double, msg: String, opts: js.Object): Unit = js.native
    def apply(value: js.Any, status: Double, msg: Unit, opts: js.Object): Unit = js.native
    def apply(value: js.Any, status: Double, opts: js.Object): Unit = js.native
    def apply(value: js.Any, status: Unit, msg: String): Unit = js.native
    def apply(value: js.Any, status: Unit, msg: String, opts: js.Object): Unit = js.native
    def apply(value: js.Any, status: Unit, msg: Unit, opts: js.Object): Unit = js.native
    def apply(value: js.Any, status: Unit, opts: js.Object): Unit = js.native
  }
  
  trait State[StateT] extends StObject {
    
    var state: StateT
  }
  object State {
    
    inline def apply[StateT](state: StateT): State[StateT] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[State[StateT]]
    }
    
    extension [Self <: State[?], StateT](x: Self & State[StateT]) {
      
      inline def setState(value: StateT): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
