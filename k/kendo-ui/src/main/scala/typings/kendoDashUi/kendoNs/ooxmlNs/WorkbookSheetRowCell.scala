package typings.kendoDashUi.kendoNs.ooxmlNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookSheetRowCell extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var borderBottom: js.UndefOr[WorkbookSheetRowCellBorderBottom] = js.undefined
  var borderLeft: js.UndefOr[WorkbookSheetRowCellBorderLeft] = js.undefined
  var borderRight: js.UndefOr[WorkbookSheetRowCellBorderRight] = js.undefined
  var borderTop: js.UndefOr[WorkbookSheetRowCellBorderTop] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontName: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var formula: js.UndefOr[String] = js.undefined
  var hAlign: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[js.Any] = js.undefined
  var italic: js.UndefOr[Boolean] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
  var vAlign: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[Date | Double | String | Boolean] = js.undefined
  var verticalAlign: js.UndefOr[String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object WorkbookSheetRowCell {
  @scala.inline
  def apply(
    background: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    borderBottom: WorkbookSheetRowCellBorderBottom = null,
    borderLeft: WorkbookSheetRowCellBorderLeft = null,
    borderRight: WorkbookSheetRowCellBorderRight = null,
    borderTop: WorkbookSheetRowCellBorderTop = null,
    colSpan: Int | Double = null,
    color: String = null,
    fontFamily: String = null,
    fontName: String = null,
    fontSize: Int | Double = null,
    format: String = null,
    formula: String = null,
    hAlign: String = null,
    index: js.Any = null,
    italic: js.UndefOr[Boolean] = js.undefined,
    rowSpan: Int | Double = null,
    textAlign: String = null,
    underline: js.UndefOr[Boolean] = js.undefined,
    vAlign: String = null,
    value: Date | Double | String | Boolean = null,
    verticalAlign: String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): WorkbookSheetRowCell = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom)
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft)
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight)
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontName != null) __obj.updateDynamic("fontName")(fontName)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign)
    if (index != null) __obj.updateDynamic("index")(index)
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[WorkbookSheetRowCell]
  }
}

