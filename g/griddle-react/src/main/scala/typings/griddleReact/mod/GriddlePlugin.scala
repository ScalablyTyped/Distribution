package typings.griddleReact.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddlePlugin extends GriddleExtensibility {
  
  var initialState: js.UndefOr[GriddleInitialState] = js.native
  
  var reduxMiddleware: js.UndefOr[js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]] = js.native
}
object GriddlePlugin {
  
  @scala.inline
  def apply(): GriddlePlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddlePlugin]
  }
  
  @scala.inline
  implicit class GriddlePluginMutableBuilder[Self <: GriddlePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialState(value: GriddleInitialState): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
    @scala.inline
    def setReduxMiddleware(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): Self = StObject.set(x, "reduxMiddleware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduxMiddlewareUndefined: Self = StObject.set(x, "reduxMiddleware", js.undefined)
    
    @scala.inline
    def setReduxMiddlewareVarargs(value: (Middleware[js.Object, js.Any, Dispatch[AnyAction]])*): Self = StObject.set(x, "reduxMiddleware", js.Array(value :_*))
  }
}
