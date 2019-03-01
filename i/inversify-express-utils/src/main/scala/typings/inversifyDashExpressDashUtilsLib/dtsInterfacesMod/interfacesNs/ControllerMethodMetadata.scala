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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("middleware")(middleware)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ControllerMethodMetadata]
  }
}

