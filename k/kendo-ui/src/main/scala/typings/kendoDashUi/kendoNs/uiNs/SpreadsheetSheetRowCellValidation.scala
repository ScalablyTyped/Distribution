package typings.kendoDashUi.kendoNs.uiNs

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
    if (!js.isUndefined(allowNulls)) __obj.updateDynamic("allowNulls")(allowNulls)
    if (comparerType != null) __obj.updateDynamic("comparerType")(comparerType)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (from != null) __obj.updateDynamic("from")(from)
    if (messageTemplate != null) __obj.updateDynamic("messageTemplate")(messageTemplate)
    if (!js.isUndefined(showButton)) __obj.updateDynamic("showButton")(showButton)
    if (titleTemplate != null) __obj.updateDynamic("titleTemplate")(titleTemplate)
    if (to != null) __obj.updateDynamic("to")(to)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SpreadsheetSheetRowCellValidation]
  }
}

