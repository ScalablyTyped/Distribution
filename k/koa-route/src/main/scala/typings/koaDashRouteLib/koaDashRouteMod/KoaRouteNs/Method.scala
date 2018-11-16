package typings
package koaDashRouteLib.koaDashRouteMod.KoaRouteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  def apply(path: Path): CreateRoute = js.native
  def apply(path: Path, fn: Handler): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def apply(
    path: Path,
    fn: Handler,
    opts: pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.ParseOptions with pathDashToDashRegexpLib.pathDashToDashRegexpMod.pathToRegexpNs.RegExpOptions
  ): koaLib.koaMod.ApplicationNs.Middleware = js.native
}

