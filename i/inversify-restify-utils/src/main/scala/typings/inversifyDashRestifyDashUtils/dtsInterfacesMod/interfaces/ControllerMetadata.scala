package typings.inversifyDashRestifyDashUtils.dtsInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMetadata extends js.Object {
  var middleware: js.Array[Middleware]
  var path: String
  var target: js.Any
}

object ControllerMetadata {
  @scala.inline
  def apply(middleware: js.Array[Middleware], path: String, target: js.Any): ControllerMetadata = {
    val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ControllerMetadata]
  }
}

