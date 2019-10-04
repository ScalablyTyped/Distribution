package typings.koaDashBouncer.koaDashBouncerMod

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bouncer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isSafeInteger(n: Double): Boolean = js.native
  def middleware(): Middleware[DefaultState, DefaultContext] = js.native
  def middleware(opts: MiddlewareOption): Middleware[DefaultState, DefaultContext] = js.native
}

