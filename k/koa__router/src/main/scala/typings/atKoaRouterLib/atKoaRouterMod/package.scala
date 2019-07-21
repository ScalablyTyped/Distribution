package typings
package atKoaRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atKoaRouterMod {
  type Middleware[StateT, CustomT] = koaLib.koaMod.Middleware[StateT, CustomT with (RouterParamContext[StateT, CustomT])]
  type ParamMiddleware = js.Function3[
    /* param */ java.lang.String, 
    /* ctx */ RouterContext[js.Any, js.Object], 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  type RouterContext[StateT, CustomT] = koaLib.koaMod.ParameterizedContext[StateT, CustomT with (RouterParamContext[StateT, CustomT])]
}
