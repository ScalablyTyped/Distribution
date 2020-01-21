package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridMessages extends js.Object {
  var columnFields: js.UndefOr[String] = js.undefined
  var fieldMenu: js.UndefOr[PivotGridMessagesFieldMenu] = js.undefined
  var measureFields: js.UndefOr[String] = js.undefined
  var rowFields: js.UndefOr[String] = js.undefined
}

object PivotGridMessages {
  @scala.inline
  def apply(
    columnFields: String = null,
    fieldMenu: PivotGridMessagesFieldMenu = null,
    measureFields: String = null,
    rowFields: String = null
  ): PivotGridMessages = {
    val __obj = js.Dynamic.literal()
    if (columnFields != null) __obj.updateDynamic("columnFields")(columnFields.asInstanceOf[js.Any])
    if (fieldMenu != null) __obj.updateDynamic("fieldMenu")(fieldMenu.asInstanceOf[js.Any])
    if (measureFields != null) __obj.updateDynamic("measureFields")(measureFields.asInstanceOf[js.Any])
    if (rowFields != null) __obj.updateDynamic("rowFields")(rowFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridMessages]
  }
}

