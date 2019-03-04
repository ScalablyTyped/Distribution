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
    val __obj = js.Dynamic.literal(key = key, method = method, middleware = middleware, options = options.asInstanceOf[js.Any], target = target)
  
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
}

