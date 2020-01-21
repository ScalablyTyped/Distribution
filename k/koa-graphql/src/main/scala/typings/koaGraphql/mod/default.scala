package typings.koaGraphql.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-graphql", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(options: Options): Middleware[DefaultState, DefaultContext] = js.native
}

