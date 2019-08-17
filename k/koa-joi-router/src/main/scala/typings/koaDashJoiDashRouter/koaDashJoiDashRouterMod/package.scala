package typings.koaDashJoiDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashJoiDashRouterMod {
  import typings.koa.koaMod.Context
  import typings.std.RegExp

  type FullHandler = js.Function2[/* ctx */ Context, /* next */ js.Function0[js.Promise[js.Any]], js.Any]
  type Handler = FullHandler | NestedHandler
  type Method = js.Function3[
    /* path */ String | RegExp, 
    /* handlerOrConfig */ Handler | Config, 
    /* repeated */ Handler, 
    Router
  ]
}
