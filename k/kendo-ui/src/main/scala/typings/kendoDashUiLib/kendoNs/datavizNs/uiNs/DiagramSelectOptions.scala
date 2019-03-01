package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramSelectOptions extends js.Object {
  var addToSelection: js.UndefOr[scala.Boolean] = js.undefined
}

object DiagramSelectOptions {
  @scala.inline
  def apply(addToSelection: js.UndefOr[scala.Boolean] = js.undefined): DiagramSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToSelection)) __obj.updateDynamic("addToSelection")(addToSelection)
    __obj.asInstanceOf[DiagramSelectOptions]
  }
}

