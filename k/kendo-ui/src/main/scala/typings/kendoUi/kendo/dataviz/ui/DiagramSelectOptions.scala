package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramSelectOptions extends js.Object {
  var addToSelection: js.UndefOr[Boolean] = js.undefined
}

object DiagramSelectOptions {
  @scala.inline
  def apply(addToSelection: js.UndefOr[Boolean] = js.undefined): DiagramSelectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addToSelection)) __obj.updateDynamic("addToSelection")(addToSelection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramSelectOptions]
  }
}

