package typings
package inversifyDashExpressDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ControllerEndpoints extends js.Object {
  var controller: js.Any
  var endpoints: js.Array[Anon_Args]
}

object Anon_ControllerEndpoints {
  @scala.inline
  def apply(controller: js.Any, endpoints: js.Array[Anon_Args]): Anon_ControllerEndpoints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("endpoints")(endpoints)
    __obj.asInstanceOf[Anon_ControllerEndpoints]
  }
}

