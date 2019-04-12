package typings
package atHapiHapiLib.atHapiHapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandlerDecorationMethod extends js.Object {
  var defaults: js.UndefOr[RouteOptions | (js.Function1[/* method */ js.Any, RouteOptions])] = js.native
  def apply(route: RouteOptions, options: js.Any): atHapiHapiLib.atHapiHapiMod.LifecycleNs.Method = js.native
}

