package typings.koaDashSession.koaDashSessionMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(CONFIG: Partial[opts], app: typings.koa.koaMod.^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext] = js.native
  def apply(app: typings.koa.koaMod.^[DefaultState, DefaultContext]): Middleware[DefaultState, DefaultContext] = js.native
}

