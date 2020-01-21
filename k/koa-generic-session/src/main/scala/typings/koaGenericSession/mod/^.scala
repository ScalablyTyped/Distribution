package typings.koaGenericSession.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-generic-session", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: SessionOptions): Middleware[DefaultState, DefaultContext] = js.native
}

