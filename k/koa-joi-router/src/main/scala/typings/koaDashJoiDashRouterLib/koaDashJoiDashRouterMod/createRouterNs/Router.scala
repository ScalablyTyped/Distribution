package typings
package koaDashJoiDashRouterLib.koaDashJoiDashRouterMod.createRouterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  var routes: js.Array[Spec] = js.native
  def middleware(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def prefix(path: java.lang.String): scala.Unit = js.native
  def route(spec: js.Array[Spec]): Router = js.native
  def route(spec: Spec): Router = js.native
}

