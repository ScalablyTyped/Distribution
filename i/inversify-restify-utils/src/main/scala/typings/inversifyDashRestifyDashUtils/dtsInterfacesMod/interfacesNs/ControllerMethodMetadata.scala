package typings.inversifyDashRestifyDashUtils.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMethodMetadata extends js.Object {
  var key: String
  var method: String
  var middleware: js.Array[Middleware]
  var options: RouteOptions
  var target: js.Any
}

object ControllerMethodMetadata {
  @scala.inline
  def apply(
    key: String,
    method: String,
    middleware: js.Array[Middleware],
    options: RouteOptions,
    target: js.Any
  ): ControllerMethodMetadata = {
    val __obj = js.Dynamic.literal(key = key, method = method, middleware = middleware, options = options.asInstanceOf[js.Any], target = target)
  
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
}

