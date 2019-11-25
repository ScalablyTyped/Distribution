package typings.kendoDashUi.kendo.ooxml

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
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (borderBottom != null) __obj.updateDynamic("borderBottom")(borderBottom.asInstanceOf[js.Any])
    if (borderLeft != null) __obj.updateDynamic("borderLeft")(borderLeft.asInstanceOf[js.Any])
    if (borderRight != null) __obj.updateDynamic("borderRight")(borderRight.asInstanceOf[js.Any])
    if (borderTop != null) __obj.updateDynamic("borderTop")(borderTop.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontName != null) __obj.updateDynamic("fontName")(fontName.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (hAlign != null) __obj.updateDynamic("hAlign")(hAlign.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(italic)) __obj.updateDynamic("italic")(italic.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (vAlign != null) __obj.updateDynamic("vAlign")(vAlign.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookSheetRowCell]
  }
}

