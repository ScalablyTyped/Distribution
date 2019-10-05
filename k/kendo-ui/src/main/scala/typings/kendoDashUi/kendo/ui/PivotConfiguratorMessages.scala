package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotConfiguratorMessages extends js.Object {
  var columns: js.UndefOr[String] = js.undefined
  var columnsLabel: js.UndefOr[String] = js.undefined
  var fieldMenu: js.UndefOr[PivotConfiguratorMessagesFieldMenu] = js.undefined
  var fieldsLabel: js.UndefOr[String] = js.undefined
  var measures: js.UndefOr[String] = js.undefined
  var measuresLabel: js.UndefOr[String] = js.undefined
  var rows: js.UndefOr[String] = js.undefined
  var rowsLabel: js.UndefOr[String] = js.undefined
}

object PivotConfiguratorMessages {
  @scala.inline
  def apply(
    columns: String = null,
    columnsLabel: String = null,
    fieldMenu: PivotConfiguratorMessagesFieldMenu = null,
    fieldsLabel: String = null,
    measures: String = null,
    measuresLabel: String = null,
    rows: String = null,
    rowsLabel: String = null
  ): PivotConfiguratorMessages = {
    val __obj = js.Dynamic.literal()
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (columnsLabel != null) __obj.updateDynamic("columnsLabel")(columnsLabel)
    if (fieldMenu != null) __obj.updateDynamic("fieldMenu")(fieldMenu)
    if (fieldsLabel != null) __obj.updateDynamic("fieldsLabel")(fieldsLabel)
    if (measures != null) __obj.updateDynamic("measures")(measures)
    if (measuresLabel != null) __obj.updateDynamic("measuresLabel")(measuresLabel)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (rowsLabel != null) __obj.updateDynamic("rowsLabel")(rowsLabel)
    __obj.asInstanceOf[PivotConfiguratorMessages]
  }
}

