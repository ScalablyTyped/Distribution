package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeListColumnMenuMessages extends js.Object {
  var columns: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var lock: js.UndefOr[java.lang.String] = js.undefined
  var settings: js.UndefOr[java.lang.String] = js.undefined
  var sortAscending: js.UndefOr[java.lang.String] = js.undefined
  var sortDescending: js.UndefOr[java.lang.String] = js.undefined
  var unlock: js.UndefOr[java.lang.String] = js.undefined
}

object TreeListColumnMenuMessages {
  @scala.inline
  def apply(
    columns: java.lang.String = null,
    filter: java.lang.String = null,
    lock: java.lang.String = null,
    settings: java.lang.String = null,
    sortAscending: java.lang.String = null,
    sortDescending: java.lang.String = null,
    unlock: java.lang.String = null
  ): TreeListColumnMenuMessages = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (lock != null) __obj.updateDynamic("lock")(lock)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (sortAscending != null) __obj.updateDynamic("sortAscending")(sortAscending)
    if (sortDescending != null) __obj.updateDynamic("sortDescending")(sortDescending)
    if (unlock != null) __obj.updateDynamic("unlock")(unlock)
    __obj.asInstanceOf[TreeListColumnMenuMessages]
  }
}

