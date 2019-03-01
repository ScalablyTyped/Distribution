package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionEndCapFill extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object DiagramConnectionEndCapFill {
  @scala.inline
  def apply(color: java.lang.String = null): DiagramConnectionEndCapFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[DiagramConnectionEndCapFill]
  }
}

