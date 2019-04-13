package typings
package koaDashRouteLib.koaDashRouteMod.KoaRouteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Method extends js.Object {
  def apply(path: Path): CreateRoute = js.native
  def apply(path: Path, fn: Handler): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(
    path: Path,
    fn: Handler,
    opts: pathDashToDashRegexpLib.pathDashToDashRegexpMod.ParseOptions with pathDashToDashRegexpLib.pathDashToDashRegexpMod.RegExpOptions
  ): koaLib.koaMod.Middleware[_, js.Object] = js.native
}

