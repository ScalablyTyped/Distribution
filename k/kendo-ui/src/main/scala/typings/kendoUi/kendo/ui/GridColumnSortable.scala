package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
  var compare: js.UndefOr[js.Function] = js.undefined
  var initialDirection: js.UndefOr[String] = js.undefined
}

object GridColumnSortable {
  @scala.inline
  def apply(
    allowUnsort: js.UndefOr[Boolean] = js.undefined,
    compare: js.Function = null,
    initialDirection: String = null
  ): GridColumnSortable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort.asInstanceOf[js.Any])
    if (compare != null) __obj.updateDynamic("compare")(compare.asInstanceOf[js.Any])
    if (initialDirection != null) __obj.updateDynamic("initialDirection")(initialDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnSortable]
  }
}

