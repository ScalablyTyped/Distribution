package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnSortable extends js.Object {
  var allowUnsort: js.UndefOr[scala.Boolean] = js.undefined
  var compare: js.UndefOr[js.Function] = js.undefined
  var initialDirection: js.UndefOr[java.lang.String] = js.undefined
}

object GridColumnSortable {
  @scala.inline
  def apply(
    allowUnsort: js.UndefOr[scala.Boolean] = js.undefined,
    compare: js.Function = null,
    initialDirection: java.lang.String = null
  ): GridColumnSortable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort)
    if (compare != null) __obj.updateDynamic("compare")(compare)
    if (initialDirection != null) __obj.updateDynamic("initialDirection")(initialDirection)
    __obj.asInstanceOf[GridColumnSortable]
  }
}

