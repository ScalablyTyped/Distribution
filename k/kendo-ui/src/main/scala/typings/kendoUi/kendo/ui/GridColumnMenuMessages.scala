package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridColumnMenuMessages extends js.Object {
  var columns: js.UndefOr[String] = js.undefined
  var done: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var lock: js.UndefOr[String] = js.undefined
  var settings: js.UndefOr[String] = js.undefined
  var sortAscending: js.UndefOr[String] = js.undefined
  var sortDescending: js.UndefOr[String] = js.undefined
  var unlock: js.UndefOr[String] = js.undefined
}

object GridColumnMenuMessages {
  @scala.inline
  def apply(
    columns: String = null,
    done: String = null,
    filter: String = null,
    lock: String = null,
    settings: String = null,
    sortAscending: String = null,
    sortDescending: String = null,
    unlock: String = null
  ): GridColumnMenuMessages = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (lock != null) __obj.updateDynamic("lock")(lock.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sortAscending != null) __obj.updateDynamic("sortAscending")(sortAscending.asInstanceOf[js.Any])
    if (sortDescending != null) __obj.updateDynamic("sortDescending")(sortDescending.asInstanceOf[js.Any])
    if (unlock != null) __obj.updateDynamic("unlock")(unlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridColumnMenuMessages]
  }
}

