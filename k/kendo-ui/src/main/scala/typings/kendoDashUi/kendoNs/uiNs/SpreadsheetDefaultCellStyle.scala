package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetDefaultCellStyle extends js.Object {
  var Italic: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[String] = js.undefined
  var bold: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var fontFamily: js.UndefOr[String] = js.undefined
  var fontSize: js.UndefOr[String] = js.undefined
  var underline: js.UndefOr[Boolean] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object SpreadsheetDefaultCellStyle {
  @scala.inline
  def apply(
    Italic: js.UndefOr[Boolean] = js.undefined,
    background: String = null,
    bold: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    underline: js.UndefOr[Boolean] = js.undefined,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): SpreadsheetDefaultCellStyle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Italic)) __obj.updateDynamic("Italic")(Italic)
    if (background != null) __obj.updateDynamic("background")(background)
    if (!js.isUndefined(bold)) __obj.updateDynamic("bold")(bold)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (!js.isUndefined(underline)) __obj.updateDynamic("underline")(underline)
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[SpreadsheetDefaultCellStyle]
  }
}

