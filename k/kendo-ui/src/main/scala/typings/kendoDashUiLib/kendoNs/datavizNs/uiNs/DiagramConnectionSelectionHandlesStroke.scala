package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionSelectionHandlesStroke extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
}

object DiagramConnectionSelectionHandlesStroke {
  @scala.inline
  def apply(color: java.lang.String = null): DiagramConnectionSelectionHandlesStroke = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[DiagramConnectionSelectionHandlesStroke]
  }
}

