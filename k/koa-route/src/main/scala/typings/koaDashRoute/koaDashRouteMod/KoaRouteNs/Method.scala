package typings.koaDashRoute.koaDashRouteMod.KoaRouteNs

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.ParseOptions
import typings.pathDashToDashRegexp.pathDashToDashRegexpMod.RegExpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  def apply(path: Path): CreateRoute = js.native
  def apply(path: Path, fn: Handler): Middleware[DefaultState, DefaultContext] = js.native
  def apply(path: Path, fn: Handler, opts: ParseOptions with RegExpOptions): Middleware[DefaultState, DefaultContext] = js.native
}

