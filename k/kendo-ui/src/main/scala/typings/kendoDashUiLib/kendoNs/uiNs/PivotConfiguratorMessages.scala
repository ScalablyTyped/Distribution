package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotConfiguratorMessages extends js.Object {
  var columns: js.UndefOr[java.lang.String] = js.undefined
  var columnsLabel: js.UndefOr[java.lang.String] = js.undefined
  var fieldMenu: js.UndefOr[PivotConfiguratorMessagesFieldMenu] = js.undefined
  var fieldsLabel: js.UndefOr[java.lang.String] = js.undefined
  var measures: js.UndefOr[java.lang.String] = js.undefined
  var measuresLabel: js.UndefOr[java.lang.String] = js.undefined
  var rows: js.UndefOr[java.lang.String] = js.undefined
  var rowsLabel: js.UndefOr[java.lang.String] = js.undefined
}

object PivotConfiguratorMessages {
  @scala.inline
  def apply(
    columns: java.lang.String = null,
    columnsLabel: java.lang.String = null,
    fieldMenu: PivotConfiguratorMessagesFieldMenu = null,
    fieldsLabel: java.lang.String = null,
    measures: java.lang.String = null,
    measuresLabel: java.lang.String = null,
    rows: java.lang.String = null,
    rowsLabel: java.lang.String = null
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

