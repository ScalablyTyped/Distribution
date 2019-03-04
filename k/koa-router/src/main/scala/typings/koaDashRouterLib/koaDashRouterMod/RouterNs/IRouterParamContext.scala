package typings
package koaDashRouterLib.koaDashRouterMod.RouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRouterParamContext[StateT, CustomT] extends js.Object {
  /**
    * Matched route
    */
  var _matchedRoute: js.UndefOr[java.lang.String | stdLib.RegExp]
  var _matchedRouteName: js.UndefOr[java.lang.String]
  /**
    * url params
    */
  var params: js.Any
  /**
    * the router instance
    */
  var router: koaDashRouterLib.koaDashRouterMod.Router[StateT, CustomT]
}

object IRouterParamContext {
  @scala.inline
  def apply[StateT, CustomT](
    params: js.Any,
    router: koaDashRouterLib.koaDashRouterMod.Router[StateT, CustomT],
    _matchedRoute: java.lang.String | stdLib.RegExp = null,
    _matchedRouteName: java.lang.String = null
  ): IRouterParamContext[StateT, CustomT] = {
    val __obj = js.Dynamic.literal(params = params, router = router)
    if (_matchedRoute != null) __obj.updateDynamic("_matchedRoute")(_matchedRoute.asInstanceOf[js.Any])
    if (_matchedRouteName != null) __obj.updateDynamic("_matchedRouteName")(_matchedRouteName)
    __obj.asInstanceOf[IRouterParamContext[StateT, CustomT]]
  }
}

