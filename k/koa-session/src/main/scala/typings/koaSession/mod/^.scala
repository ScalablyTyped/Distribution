package typings.koaSession.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.koaSession.anon.Partialopts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(CONFIG: Partialopts, app: typings.koa.mod.^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext] = js.native
  def apply(app: typings.koa.mod.^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext] = js.native
}

