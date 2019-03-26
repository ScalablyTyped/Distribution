package typings
package koaDashJoiDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Middleware extends js.Object {
  def apply(middleware: (koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware[_, js.Object])*): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def apply(
    path: java.lang.String,
    middleware: (koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware[_, js.Object])*
  ): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def apply(
    path: js.Array[java.lang.String],
    middleware: (koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware[_, js.Object])*
  ): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
  def apply(
    path: stdLib.RegExp,
    middleware: (koaDashRouterLib.koaDashRouterMod.RouterNs.IMiddleware[_, js.Object])*
  ): koaDashRouterLib.koaDashRouterMod.Router[_, js.Object] = js.native
}

