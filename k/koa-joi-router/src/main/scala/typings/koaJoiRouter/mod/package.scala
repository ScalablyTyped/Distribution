package typings.koaJoiRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FullHandler = js.Function2[/* ctx */ typings.koa.mod.Context, /* next */ typings.koa.mod.Next, js.Any]
  type Handler = typings.koaJoiRouter.mod.FullHandler | typings.koaJoiRouter.mod.NestedHandler
  type Method = js.Function3[
    /* path */ java.lang.String | typings.std.RegExp, 
    /* handlerOrConfig */ typings.koaJoiRouter.mod.Handler | typings.koaJoiRouter.mod.Config, 
    /* repeated */ typings.koaJoiRouter.mod.Handler, 
    typings.koaJoiRouter.mod.Router
  ]
}
