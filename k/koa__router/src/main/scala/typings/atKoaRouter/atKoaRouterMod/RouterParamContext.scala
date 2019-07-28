package typings.atKoaRouter.atKoaRouterMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterParamContext[StateT, CustomT] extends js.Object {
  /**
    * Matched route
    */
  var _matchedRoute: js.UndefOr[String | RegExp] = js.undefined
  var _matchedRouteName: js.UndefOr[String] = js.undefined
  /**
    * url params
    */
  var params: js.Any
  /**
    * the router instance
    */
  var router: Router[StateT, CustomT]
}

object RouterParamContext {
  @scala.inline
  def apply[StateT, CustomT](
    params: js.Any,
    router: Router[StateT, CustomT],
    _matchedRoute: String | RegExp = null,
    _matchedRouteName: String = null
  ): RouterParamContext[StateT, CustomT] = {
    val __obj = js.Dynamic.literal(params = params, router = router)
    if (_matchedRoute != null) __obj.updateDynamic("_matchedRoute")(_matchedRoute.asInstanceOf[js.Any])
    if (_matchedRouteName != null) __obj.updateDynamic("_matchedRouteName")(_matchedRouteName)
    __obj.asInstanceOf[RouterParamContext[StateT, CustomT]]
  }
}

