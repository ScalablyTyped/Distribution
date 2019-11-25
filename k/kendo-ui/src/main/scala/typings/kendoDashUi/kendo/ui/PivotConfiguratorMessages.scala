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
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (columnsLabel != null) __obj.updateDynamic("columnsLabel")(columnsLabel.asInstanceOf[js.Any])
    if (fieldMenu != null) __obj.updateDynamic("fieldMenu")(fieldMenu.asInstanceOf[js.Any])
    if (fieldsLabel != null) __obj.updateDynamic("fieldsLabel")(fieldsLabel.asInstanceOf[js.Any])
    if (measures != null) __obj.updateDynamic("measures")(measures.asInstanceOf[js.Any])
    if (measuresLabel != null) __obj.updateDynamic("measuresLabel")(measuresLabel.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (rowsLabel != null) __obj.updateDynamic("rowsLabel")(rowsLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotConfiguratorMessages]
  }
}

