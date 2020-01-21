package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRowCellValidation extends js.Object {
  var allowNulls: js.UndefOr[Boolean] = js.undefined
  var comparerType: js.UndefOr[String] = js.undefined
  var dataType: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var messageTemplate: js.UndefOr[String] = js.undefined
  var showButton: js.UndefOr[Boolean] = js.undefined
  var titleTemplate: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object SpreadsheetSheetRowCellValidation {
  @scala.inline
  def apply(
    allowNulls: js.UndefOr[Boolean] = js.undefined,
    comparerType: String = null,
    dataType: String = null,
    from: String = null,
    messageTemplate: String = null,
    showButton: js.UndefOr[Boolean] = js.undefined,
    titleTemplate: String = null,
    to: String = null,
    `type`: String = null
  ): SpreadsheetSheetRowCellValidation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNulls)) __obj.updateDynamic("allowNulls")(allowNulls.asInstanceOf[js.Any])
    if (comparerType != null) __obj.updateDynamic("comparerType")(comparerType.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(showButton)) __obj.updateDynamic("showButton")(showButton.asInstanceOf[js.Any])
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadsheetSheetRowCellValidation]
  }
}

