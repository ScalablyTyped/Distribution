package typings.graphqlDashApiDashKoa.graphqlDashApiDashKoaMod

import typings.graphqlDashApiDashKoa.Anon_Ctx
import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-api-koa", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def errorHandler(): Middleware[DefaultState, DefaultContext] = js.native
  def execute[StateT, CustomT](options: ExecuteOptions with (Anon_Ctx[StateT, CustomT])): Middleware[StateT, CustomT] = js.native
}

