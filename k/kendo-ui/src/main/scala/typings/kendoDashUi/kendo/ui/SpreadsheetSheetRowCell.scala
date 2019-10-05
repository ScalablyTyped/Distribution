package typings.kendoDashUi.kendo.ui

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetSheetRowCell extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var borderBottom: js.UndefOr[SpreadsheetSheetRowCellBorderBottom] = js.undefined
  var borderLeft: js.UndefOr[SpreadsheetSheetRowCellBorderLeft] = js.undefined
  var borderRight: js.UndefOr[SpreadsheetSheetRowCellBorderRight] = js.undefined
  var borderTop: js.UndefOr[SpreadsheetSheetRowCellBorderTop] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var enable: js.UndefOr[Boolean] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var formula: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var link: js.UndefOr[String] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
  var validation: js.UndefOr[SpreadsheetSheetRowCellValidation] = js.undefined
  var value: js.UndefOr[Double | String | Boolean | Date] = js.undefined
  var verticalAlign: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object SpreadsheetSheetRowCell {
  @scala.inline
  def apply(
    background: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    borderBottom: SpreadsheetSheetRowCellBorderBottom = null,
    borderLeft: SpreadsheetSheetRowCellBorderLeft = null,
    borderRight: SpreadsheetSheetRowCellBorderRight = null,
    borderTop: SpreadsheetSheetRowCellBorderTop = null,
    color: String = null,
    comment: String = null,
    enable: js.UndefOr[Boolean] = js.undefined,
    fontFamily: String = null,
    fontSize: Int | Double = null,
    format: String = null,
    formula: String = null,
    index: Int | Double = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    link: String = null,
    textAlign: String = null,
    underline: js.UndefOr[Boolean] = js.undefined,
    validation: SpreadsheetSheetRowCellValidation = null,
    value: Double | String | Boolean | Date = null,
    verticalAlign: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): SpreadsheetSheetRowCell = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom)
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft)
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight)
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop)
    if (color != null) __obj.updateDynamic("color")(color)
    if (comment != null) __obj.updateDynamic("comment")(comment)
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

