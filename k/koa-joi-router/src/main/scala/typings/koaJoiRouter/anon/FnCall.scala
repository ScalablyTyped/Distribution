package typings.koaJoiRouter.anon

import typings.koaRouter.mod.IMiddleware
import typings.koaRouter.mod.Router
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: String, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: js.Array[String], middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
  def apply(path: RegExp, middleware: (IMiddleware[_, js.Object])*): Router[_, js.Object] = js.native
}

