package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
}

object TreeListSortable {
  @scala.inline
  def apply(allowUnsort: js.UndefOr[Boolean] = js.undefined, mode: String = null): TreeListSortable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[TreeListSortable]
  }
}

