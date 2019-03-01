package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSortable extends js.Object {
  var allowUnsort: js.UndefOr[scala.Boolean] = js.undefined
  var initialDirection: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var showIndexes: js.UndefOr[scala.Boolean] = js.undefined
}

object GridSortable {
  @scala.inline
  def apply(
    allowUnsort: js.UndefOr[scala.Boolean] = js.undefined,
    initialDirection: java.lang.String = null,
    mode: java.lang.String = null,
    showIndexes: js.UndefOr[scala.Boolean] = js.undefined
  ): GridSortable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort)
    if (initialDirection != null) __obj.updateDynamic("initialDirection")(initialDirection)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(showIndexes)) __obj.updateDynamic("showIndexes")(showIndexes)
    __obj.asInstanceOf[GridSortable]
  }
}

