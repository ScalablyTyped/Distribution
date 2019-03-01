package typings
package inversifyDashRestifyDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMethodMetadata extends js.Object {
  var key: java.lang.String
  var method: java.lang.String
  var middleware: js.Array[Middleware]
  var options: RouteOptions
  var target: js.Any
}

object ControllerMethodMetadata {
  @scala.inline
  def apply(
    key: java.lang.String,
    method: java.lang.String,
    middleware: js.Array[Middleware],
    options: RouteOptions,
    target: js.Any
  ): ControllerMethodMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("middleware")(middleware)
    __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
}

