package typings.koaRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Middleware[StateT, CustomT] = typings.koa.mod.Middleware[StateT, CustomT with (typings.koaRouter.mod.RouterParamContext[StateT, CustomT])]
  type ParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ typings.koaRouter.anon.RouterContextany, 
    /* next */ typings.koa.mod.Next, 
    js.Any
  ]
  type RouterContext[StateT, CustomT] = typings.koa.mod.ParameterizedContext[StateT, CustomT with (typings.koaRouter.mod.RouterParamContext[StateT, CustomT])]
}
