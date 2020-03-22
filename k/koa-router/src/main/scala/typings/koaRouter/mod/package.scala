package typings.koaRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IMiddleware[StateT, CustomT] = typings.koa.mod.Middleware[StateT, CustomT with (typings.koaRouter.mod.IRouterParamContext[StateT, CustomT])]
  type IParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ typings.koaRouter.RouterContextany, 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  type RouterContext[StateT, CustomT] = typings.koa.mod.ParameterizedContext[StateT, CustomT with (typings.koaRouter.mod.IRouterParamContext[StateT, CustomT])]
}
