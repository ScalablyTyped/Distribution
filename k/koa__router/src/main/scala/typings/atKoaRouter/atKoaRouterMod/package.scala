package typings.atKoaRouter

import typings.koa.koaMod.ParameterizedContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atKoaRouterMod {
  type Middleware[StateT, CustomT] = typings.koa.koaMod.Middleware[StateT, CustomT with (RouterParamContext[StateT, CustomT])]
  type ParamMiddleware = js.Function3[
    /* param */ String, 
    /* ctx */ RouterContext[js.Any, js.Object], 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  type RouterContext[StateT, CustomT] = ParameterizedContext[StateT, CustomT with (RouterParamContext[StateT, CustomT])]
}
