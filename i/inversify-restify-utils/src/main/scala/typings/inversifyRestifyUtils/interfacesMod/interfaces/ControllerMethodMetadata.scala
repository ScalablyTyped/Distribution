package typings.inversifyRestifyUtils.interfacesMod.interfaces

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
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
}

