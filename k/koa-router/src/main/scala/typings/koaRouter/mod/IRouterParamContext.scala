package typings.koaRouter.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouterParamContext[StateT, CustomT] extends js.Object {
  /**
    * Matched route
    */
  var _matchedRoute: js.UndefOr[String | RegExp] = js.native
  var _matchedRouteName: js.UndefOr[String] = js.native
  /**
    * url params
    */
  var params: js.Any = js.native
  /**
    * the router instance
    */
  var router: Router[StateT, CustomT] = js.native
}

object IRouterParamContext {
  @scala.inline
  def apply[StateT, CustomT](params: js.Any, router: Router[StateT, CustomT]): IRouterParamContext[StateT, CustomT] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouterParamContext[StateT, CustomT]]
  }
  @scala.inline
  implicit class IRouterParamContextOps[Self <: IRouterParamContext[_, _], StateT, CustomT] (val x: Self with (IRouterParamContext[StateT, CustomT])) extends AnyVal {
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
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouter(value: Router[StateT, CustomT]): Self = this.set("router", value.asInstanceOf[js.Any])
    @scala.inline
    def set_matchedRoute(value: String | RegExp): Self = this.set("_matchedRoute", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_matchedRoute: Self = this.set("_matchedRoute", js.undefined)
    @scala.inline
    def set_matchedRouteName(value: String): Self = this.set("_matchedRouteName", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_matchedRouteName: Self = this.set("_matchedRouteName", js.undefined)
  }
  
}

