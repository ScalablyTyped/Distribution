package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeText extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var font: js.UndefOr[String] = js.undefined
  var margin: js.UndefOr[BarcodeTextMargin] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object BarcodeText {
  @scala.inline
  def apply(
    color: String = null,
    font: String = null,
    margin: BarcodeTextMargin = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): BarcodeText = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeText]
  }
}

