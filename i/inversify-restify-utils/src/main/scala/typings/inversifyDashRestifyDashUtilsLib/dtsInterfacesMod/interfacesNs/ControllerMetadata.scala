package typings
package inversifyDashRestifyDashUtilsLib.dtsInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControllerMetadata extends js.Object {
  var middleware: js.Array[Middleware]
  var path: java.lang.String
  var target: js.Any
}

object ControllerMetadata {
  @scala.inline
  def apply(middleware: js.Array[Middleware], path: java.lang.String, target: js.Any): ControllerMetadata = {
    val __obj = js.Dynamic.literal(middleware = middleware, path = path, target = target)
  
    __obj.asInstanceOf[ControllerMetadata]
  }
}

