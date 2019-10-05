package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotConfiguratorMessagesFieldMenu extends js.Object {
  var cancel: js.UndefOr[String] = js.undefined
  var clear: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
  var filterFields: js.UndefOr[String] = js.undefined
  var include: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var ok: js.UndefOr[String] = js.undefined
  var operators: js.UndefOr[PivotConfiguratorMessagesFieldMenuOperators] = js.undefined
  var sortAscending: js.UndefOr[String] = js.undefined
  var sortDescending: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object PivotConfiguratorMessagesFieldMenu {
  @scala.inline
  def apply(
    cancel: String = null,
    clear: String = null,
    filter: String = null,
    filterFields: String = null,
    include: String = null,
    info: String = null,
    ok: String = null,
    operators: PivotConfiguratorMessagesFieldMenuOperators = null,
    sortAscending: String = null,
    sortDescending: String = null,
    title: String = null
  ): PivotConfiguratorMessagesFieldMenu = {
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
    __obj.asInstanceOf[PivotConfiguratorMessagesFieldMenu]
  }
}

