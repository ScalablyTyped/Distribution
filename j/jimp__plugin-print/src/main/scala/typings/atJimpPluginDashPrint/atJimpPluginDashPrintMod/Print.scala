package typings.atJimpPluginDashPrint.atJimpPluginDashPrintMod

import typings.atJimpPluginDashPrint.Anon_Cb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Print extends js.Object {
  var `class`: PrintClass
  var constants: Anon_Cb
}

object Print {
  @scala.inline
  def apply(`class`: PrintClass, constants: Anon_Cb): Print = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print]
  }
}

