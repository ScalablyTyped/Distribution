package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeText extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[BarcodeTextMargin] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object BarcodeText {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    font: java.lang.String = null,
    margin: BarcodeTextMargin = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): BarcodeText = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[BarcodeText]
  }
}

