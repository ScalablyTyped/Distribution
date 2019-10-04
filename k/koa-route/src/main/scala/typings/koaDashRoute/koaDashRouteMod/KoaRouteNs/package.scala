package typings.koaDashRoute.koaDashRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KoaRouteNs {
  import typings.koa.koaMod.Context
  import typings.koa.koaMod.DefaultContext
  import typings.koa.koaMod.DefaultState
  import typings.koa.koaMod.Middleware
  import typings.std.RegExp

  type CreateMethod = js.Function1[/* method */ String, Method]
  type CreateRoute = js.Function1[/* routeFunc */ Handler, Middleware[DefaultState, DefaultContext]]
  type Handler = js.ThisFunction2[/* this */ Context, /* ctx */ Context, /* repeated */ js.Any, js.Any]
  type Path = String | RegExp | (js.Array[String | RegExp])
}
