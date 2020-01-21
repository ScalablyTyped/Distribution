package typings.jimpPluginPrint.mod

import typings.jimpPluginPrint.AnonCb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Print extends js.Object {
  var `class`: PrintClass
  var constants: AnonCb
}

object Print {
  @scala.inline
  def apply(`class`: PrintClass, constants: AnonCb): Print = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print]
  }
}

