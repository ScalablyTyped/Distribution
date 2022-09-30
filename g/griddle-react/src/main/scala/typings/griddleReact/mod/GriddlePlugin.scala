package typings.griddleReact.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GriddlePlugin
  extends StObject
     with GriddleExtensibility {
  
  var initialState: js.UndefOr[GriddleInitialState] = js.undefined
  
  var reduxMiddleware: js.UndefOr[js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]] = js.undefined
}
object GriddlePlugin {
  
  inline def apply(): GriddlePlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddlePlugin]
  }
  
  extension [Self <: GriddlePlugin](x: Self) {
    
    inline def setInitialState(value: GriddleInitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    inline def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    inline def setReduxMiddleware(value: js.Array[Middleware[js.Object, Any, Dispatch[AnyAction]]]): Self = StObject.set(x, "reduxMiddleware", value.asInstanceOf[js.Any])
    
    inline def setReduxMiddlewareUndefined: Self = StObject.set(x, "reduxMiddleware", js.undefined)
    
    inline def setReduxMiddlewareVarargs(value: (Middleware[js.Object, Any, Dispatch[AnyAction]])*): Self = StObject.set(x, "reduxMiddleware", js.Array(value*))
  }
}
