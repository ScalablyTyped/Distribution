package typings.koaDashBouncer.koaDashBouncerMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bouncer", "middleware")
@js.native
object middleware extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: MiddlewareOption): Middleware[DefaultState, DefaultContext] = js.native
}

