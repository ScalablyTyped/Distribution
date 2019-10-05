package typings.inversifyDashExpressDashUtils.dtsInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMethodMetadata extends ControllerMetadata {
  var key: String
  var method: String
}

object ControllerMethodMetadata {
  @scala.inline
  def apply(key: String, method: String, middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMethodMetadata = {
    val __obj = js.Dynamic.literal(key = key, method = method, middleware = middleware, path = path, target = target)
  
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
}

