package typings.atKoaRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atKoaRouterMod {
  import typings.koa.koaMod.Next
  import typings.koa.koaMod.ParameterizedContext

  type Middleware[StateT, CustomT] = typings.koa.koaMod.Middleware[StateT, CustomT with (RouterParamContext[StateT, CustomT])]
  type ParamMiddleware = js.Function3[
    /* param */ String, 
    /* ctx */ RouterContext[js.Any, js.Object], 
    /* next */ Next, 
    js.Any
  ]
  type RouterContext[StateT, CustomT] = ParameterizedContext[StateT, CustomT with (RouterParamContext[StateT, CustomT])]
}
