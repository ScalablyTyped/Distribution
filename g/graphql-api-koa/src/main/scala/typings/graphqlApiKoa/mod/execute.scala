package typings.graphqlApiKoa.mod

import typings.graphqlApiKoa.AnonCtx
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-api-koa", "execute")
@js.native
object execute extends js.Object {
  def apply[StateT, CustomT](options: ExecuteOptions with (AnonCtx[StateT, CustomT])): Middleware[StateT, CustomT] = js.native
}

