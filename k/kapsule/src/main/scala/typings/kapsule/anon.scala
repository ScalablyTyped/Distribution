package typings.kapsule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<kapsule.kapsule.State> */
  trait PartialState extends StObject {
    
    var _rerender: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var initialised: js.UndefOr[Boolean] = js.undefined
  }
  object PartialState {
    
    inline def apply(): PartialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialState] (val x: Self) extends AnyVal {
      
      inline def setInitialised(value: Boolean): Self = StObject.set(x, "initialised", value.asInstanceOf[js.Any])
      
      inline def setInitialisedUndefined: Self = StObject.set(x, "initialised", js.undefined)
      
      inline def set_rerender(value: () => Unit): Self = StObject.set(x, "_rerender", js.Any.fromFunction0(value))
      
      inline def set_rerenderUndefined: Self = StObject.set(x, "_rerender", js.undefined)
    }
  }
}
