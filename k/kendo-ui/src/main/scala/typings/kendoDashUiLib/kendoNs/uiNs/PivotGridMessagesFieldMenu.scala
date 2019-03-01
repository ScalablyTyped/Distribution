package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridMessagesFieldMenu extends js.Object {
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  var clear: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var filterFields: js.UndefOr[java.lang.String] = js.undefined
  var include: js.UndefOr[java.lang.String] = js.undefined
  var info: js.UndefOr[java.lang.String] = js.undefined
  var ok: js.UndefOr[java.lang.String] = js.undefined
  var operators: js.UndefOr[PivotGridMessagesFieldMenuOperators] = js.undefined
  var sortAscending: js.UndefOr[java.lang.String] = js.undefined
  var sortDescending: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object PivotGridMessagesFieldMenu {
  @scala.inline
  def apply(
    cancel: java.lang.String = null,
    clear: java.lang.String = null,
    filter: java.lang.String = null,
    filterFields: java.lang.String = null,
    include: java.lang.String = null,
    info: java.lang.String = null,
    ok: java.lang.String = null,
    operators: PivotGridMessagesFieldMenuOperators = null,
    sortAscending: java.lang.String = null,
    sortDescending: java.lang.String = null,
    title: java.lang.String = null
  ): PivotGridMessagesFieldMenu = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (filterFields != null) __obj.updateDynamic("filterFields")(filterFields)
    if (include != null) __obj.updateDynamic("include")(include)
    if (info != null) __obj.updateDynamic("info")(info)
    if (ok != null) __obj.updateDynamic("ok")(ok)
    if (operators != null) __obj.updateDynamic("operators")(operators)
    if (sortAscending != null) __obj.updateDynamic("sortAscending")(sortAscending)
    if (sortDescending != null) __obj.updateDynamic("sortDescending")(sortDescending)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PivotGridMessagesFieldMenu]
  }
}

