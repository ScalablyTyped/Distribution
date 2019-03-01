package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionSelection extends js.Object {
  var handles: js.UndefOr[DiagramConnectionSelectionHandles] = js.undefined
}

object DiagramConnectionSelection {
  @scala.inline
  def apply(handles: DiagramConnectionSelectionHandles = null): DiagramConnectionSelection = {
    val __obj = js.Dynamic.literal()
    if (handles != null) __obj.updateDynamic("handles")(handles)
    __obj.asInstanceOf[DiagramConnectionSelection]
  }
}

