package typings.griddleReact.mod

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class GriddlePluginOps[Self <: GriddlePlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInitialState(value: GriddleInitialState): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setReduxMiddlewareVarargs(value: (Middleware[js.Object, js.Any, Dispatch[AnyAction]])*): Self = this.set("reduxMiddleware", js.Array(value :_*))
    @scala.inline
    def setReduxMiddleware(value: js.Array[Middleware[js.Object, _, Dispatch[AnyAction]]]): Self = this.set("reduxMiddleware", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReduxMiddleware: Self = this.set("reduxMiddleware", js.undefined)
  }
  
}

