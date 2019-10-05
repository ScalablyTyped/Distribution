package typings.kendoDashUi.kendo.ui

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
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort)
    if (initialDirection != null) __obj.updateDynamic("initialDirection")(initialDirection)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(showIndexes)) __obj.updateDynamic("showIndexes")(showIndexes)
    __obj.asInstanceOf[GridSortable]
  }
}

