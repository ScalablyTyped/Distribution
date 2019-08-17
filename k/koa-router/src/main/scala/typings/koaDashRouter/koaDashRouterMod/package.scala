package typings.koaDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashRouterMod {
  import typings.koa.koaMod.Middleware
  import typings.koa.koaMod.ParameterizedContext

  type IMiddleware[StateT, CustomT] = Middleware[StateT, CustomT with (IRouterParamContext[StateT, CustomT])]
  type IParamMiddleware = js.Function3[
    /* param */ String, 
    /* ctx */ RouterContext[js.Any, js.Object], 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  type IRouterContext = RouterContext[js.Any, js.Object]
  type RouterContext[StateT, CustomT] = ParameterizedContext[StateT, CustomT with (IRouterParamContext[StateT, CustomT])]
}
