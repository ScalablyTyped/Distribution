package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridSortable extends js.Object {
  var allowUnsort: js.UndefOr[Boolean] = js.undefined
}

object PivotGridSortable {
  @scala.inline
  def apply(allowUnsort: js.UndefOr[Boolean] = js.undefined): PivotGridSortable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsort)) __obj.updateDynamic("allowUnsort")(allowUnsort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridSortable]
  }
}

