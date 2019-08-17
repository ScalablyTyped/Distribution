package typings.graphqlDashPlaygroundDashMiddlewareDashExpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashPlaygroundDashMiddlewareDashExpressMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response
  import typings.graphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.MiddlewareOptions

  type ExpressPlaygroundMiddleware = js.Function3[/* req */ Request, /* res */ Response, /* next */ js.Function0[Unit], Unit]
  type Register = js.Function1[/* options */ MiddlewareOptions, ExpressPlaygroundMiddleware]
}
