package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridMessagesFieldMenu extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var clear: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filterFields: js.UndefOr[String] = js.undefined
  var include: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var ok: js.UndefOr[String] = js.undefined
  var operators: js.UndefOr[PivotGridMessagesFieldMenuOperators] = js.undefined
  var sortAscending: js.UndefOr[String] = js.undefined
  var sortDescending: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PivotGridMessagesFieldMenu {
  @scala.inline
  def apply(
    cancel: String = null,
    clear: String = null,
    filter: String = null,
    filterFields: String = null,
    include: String = null,
    info: String = null,
    ok: String = null,
    operators: PivotGridMessagesFieldMenuOperators = null,
    sortAscending: String = null,
    sortDescending: String = null,
    title: String = null
  ): PivotGridMessagesFieldMenu = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterFields != null) __obj.updateDynamic("filterFields")(filterFields.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(ok.asInstanceOf[js.Any])
    if (operators != null) __obj.updateDynamic("operators")(operators.asInstanceOf[js.Any])
    if (sortAscending != null) __obj.updateDynamic("sortAscending")(sortAscending.asInstanceOf[js.Any])
    if (sortDescending != null) __obj.updateDynamic("sortDescending")(sortDescending.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridMessagesFieldMenu]
  }
}

