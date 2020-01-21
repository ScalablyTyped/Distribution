package typings.graphqlApiKoa.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-api-koa", "errorHandler")
@js.native
object errorHandler extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
}

