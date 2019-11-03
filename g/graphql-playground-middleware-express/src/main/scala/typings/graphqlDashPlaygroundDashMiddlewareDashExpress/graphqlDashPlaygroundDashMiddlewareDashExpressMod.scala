package typings.graphqlDashPlaygroundDashMiddlewareDashExpress

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.graphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod.MiddlewareOptions
import typings.graphqlDashPlaygroundDashMiddlewareDashExpress.graphqlDashPlaygroundDashMiddlewareDashExpressMod.ExpressPlaygroundMiddleware
import typings.graphqlDashPlaygroundDashMiddlewareDashExpress.graphqlDashPlaygroundDashMiddlewareDashExpressMod.Register
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-playground-middleware-express", JSImport.Namespace)
@js.native
object graphqlDashPlaygroundDashMiddlewareDashExpressMod extends js.Object {
  val default: Register = js.native
  type ExpressPlaygroundMiddleware = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* next */ js.Function0[Unit], 
    Unit
  ]
  type Register = js.Function1[/* options */ MiddlewareOptions, ExpressPlaygroundMiddleware]
}

