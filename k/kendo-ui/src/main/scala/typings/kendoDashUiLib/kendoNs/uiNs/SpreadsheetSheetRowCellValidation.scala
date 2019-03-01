package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRowCellValidation extends js.Object {
  var allowNulls: js.UndefOr[scala.Boolean] = js.undefined
  var comparerType: js.UndefOr[java.lang.String] = js.undefined
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var messageTemplate: js.UndefOr[java.lang.String] = js.undefined
  var showButton: js.UndefOr[scala.Boolean] = js.undefined
  var titleTemplate: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SpreadsheetSheetRowCellValidation {
  @scala.inline
  def apply(
    allowNulls: js.UndefOr[scala.Boolean] = js.undefined,
    comparerType: java.lang.String = null,
    dataType: java.lang.String = null,
    from: java.lang.String = null,
    messageTemplate: java.lang.String = null,
    showButton: js.UndefOr[scala.Boolean] = js.undefined,
    titleTemplate: java.lang.String = null,
    to: java.lang.String = null,
    `type`: java.lang.String = null
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

