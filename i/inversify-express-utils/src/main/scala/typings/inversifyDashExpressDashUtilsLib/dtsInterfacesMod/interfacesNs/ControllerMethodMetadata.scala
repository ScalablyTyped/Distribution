package typings
package inversifyDashExpressDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMethodMetadata extends ControllerMetadata {
  var key: java.lang.String
  var method: java.lang.String
}

object ControllerMethodMetadata {
  @scala.inline
  def apply(
    key: java.lang.String,
    method: java.lang.String,
    middleware: js.Array[Middleware],
    path: java.lang.String,
    target: js.Any
  ): ControllerMethodMetadata = {
    val __obj = js.Dynamic.literal(key = key, method = method, middleware = middleware, path = path, target = target)
  
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
}

