package typings
package inversifyDashExpressDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Controller extends js.Object {
  var controller: java.lang.String
  var controllerMethod: java.lang.String
  var controllerParameter: java.lang.String
  var httpContext: java.lang.String
}

object Anon_Controller {
  @scala.inline
  def apply(
    controller: java.lang.String,
    controllerMethod: java.lang.String,
    controllerParameter: java.lang.String,
    httpContext: java.lang.String
  ): Anon_Controller = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("controllerMethod")(controllerMethod)
    __obj.updateDynamic("controllerParameter")(controllerParameter)
    __obj.updateDynamic("httpContext")(httpContext)
    __obj.asInstanceOf[Anon_Controller]
  }
}

