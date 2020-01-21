package typings.inversifyExpressUtils.interfacesMod.interfaces

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
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
}

