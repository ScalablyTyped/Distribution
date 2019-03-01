package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRowCell extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var bold: js.UndefOr[scala.Boolean] = js.undefined
  var borderBottom: js.UndefOr[SpreadsheetSheetRowCellBorderBottom] = js.undefined
  var borderLeft: js.UndefOr[SpreadsheetSheetRowCellBorderLeft] = js.undefined
  var borderRight: js.UndefOr[SpreadsheetSheetRowCellBorderRight] = js.undefined
  var borderTop: js.UndefOr[SpreadsheetSheetRowCellBorderTop] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var formula: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var italic: js.UndefOr[scala.Boolean] = js.undefined
  var link: js.UndefOr[java.lang.String] = js.undefined
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var underline: js.UndefOr[scala.Boolean] = js.undefined
  var validation: js.UndefOr[SpreadsheetSheetRowCellValidation] = js.undefined
  var value: js.UndefOr[scala.Double | java.lang.String | scala.Boolean | stdLib.Date] = js.undefined
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  var wrap: js.UndefOr[scala.Boolean] = js.undefined
}

object SpreadsheetSheetRowCell {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    bold: js.UndefOr[scala.Boolean] = js.undefined,
    borderBottom: SpreadsheetSheetRowCellBorderBottom = null,
    borderLeft: SpreadsheetSheetRowCellBorderLeft = null,
    borderRight: SpreadsheetSheetRowCellBorderRight = null,
    borderTop: SpreadsheetSheetRowCellBorderTop = null,
    color: java.lang.String = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: java.lang.String = null,
    fontSize: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    formula: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    italic: js.UndefOr[scala.Boolean] = js.undefined,
    link: java.lang.String = null,
    textAlign: java.lang.String = null,
    underline: js.UndefOr[scala.Boolean] = js.undefined,
    validation: SpreadsheetSheetRowCellValidation = null,
    value: scala.Double | java.lang.String | scala.Boolean | stdLib.Date = null,
    verticalAlign: java.lang.String = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): SpreadsheetSheetRowCell = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom)
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft)
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight)
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (link != null) __obj.updateDynamic("link")(link)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    if (validation != null) __obj.updateDynamic("validation")(validation)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[SpreadsheetSheetRowCell]
  }
}

