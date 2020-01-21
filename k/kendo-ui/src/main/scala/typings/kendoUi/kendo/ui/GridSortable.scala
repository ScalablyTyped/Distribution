package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
  var initialDirection: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var showIndexes: js.UndefOr[Boolean] = js.undefined
}

object GridSortable {
  @scala.inline
  def apply(
    allowUnsort: js.UndefOr[Boolean] = js.undefined,
    initialDirection: String = null,
    mode: String = null,
    showIndexes: js.UndefOr[Boolean] = js.undefined
  ): GridSortable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort.asInstanceOf[js.Any])
    if (initialDirection != null) __obj.updateDynamic("initialDirection")(initialDirection.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(showIndexes)) __obj.updateDynamic("showIndexes")(showIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridSortable]
  }
}

