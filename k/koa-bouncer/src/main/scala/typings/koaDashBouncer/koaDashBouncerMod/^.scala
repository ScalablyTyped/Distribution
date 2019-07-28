package typings.koaDashBouncer.koaDashBouncerMod

import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bouncer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isSafeInteger(n: Double): Boolean = js.native
  def middleware(): Middleware[_, js.Object] = js.native
  def middleware(opts: MiddlewareOption): Middleware[_, js.Object] = js.native
}

