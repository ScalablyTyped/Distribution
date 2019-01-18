package typings
package koaDashRouterLib.koaDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RouterNs {
  type IMiddleware[StateT, CustomT] = koaLib.koaMod.ApplicationNs.Middleware[StateT, CustomT with (IRouterParamContext[StateT, CustomT])]
  type IParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ RouterContext[js.Any, js.Object], 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  type IRouterContext = RouterContext[js.Any, js.Object]
  type RouterContext[StateT, CustomT] = koaLib.koaMod.ApplicationNs.ParameterizedContext[StateT, CustomT with (IRouterParamContext[StateT, CustomT])]
}
