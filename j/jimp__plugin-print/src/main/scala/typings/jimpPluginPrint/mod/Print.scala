package typings.jimpPluginPrint.mod

import typings.jimpPluginPrint.AnonFONTSANS10BLACK
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Print extends js.Object {
  var `class`: PrintClass
  var constants: AnonFONTSANS10BLACK
}

object Print {
  @scala.inline
  def apply(`class`: PrintClass, constants: AnonFONTSANS10BLACK): Print = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print]
  }
}

