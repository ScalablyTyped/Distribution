package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListSortable extends js.Object {
  var allowUnsort: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListSortable {
  @scala.inline
  def apply(allowUnsort: js.UndefOr[scala.Boolean] = js.undefined, mode: java.lang.String = null): TreeListSortable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[TreeListSortable]
  }
}

