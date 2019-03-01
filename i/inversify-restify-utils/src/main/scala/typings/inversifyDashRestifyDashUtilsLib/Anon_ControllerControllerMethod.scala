package typings
package inversifyDashRestifyDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ControllerControllerMethod extends js.Object {
  var controller: java.lang.String
  var controllerMethod: java.lang.String
}

object Anon_ControllerControllerMethod {
  @scala.inline
  def apply(controller: java.lang.String, controllerMethod: java.lang.String): Anon_ControllerControllerMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("controllerMethod")(controllerMethod)
    __obj.asInstanceOf[Anon_ControllerControllerMethod]
  }
}

