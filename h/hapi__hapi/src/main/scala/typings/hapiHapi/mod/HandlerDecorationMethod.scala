package typings.hapiHapi.mod

import typings.hapiHapi.mod.Lifecycle.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerDecorationMethod extends js.Object {
  var defaults: js.UndefOr[RouteOptions | (js.Function1[/* method */ js.Any, RouteOptions])] = js.native
  def apply(route: RequestRoute, options: js.Any): Method = js.native
}

