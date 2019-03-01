package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeExportSVGOptions extends js.Object {
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}

object QRCodeExportSVGOptions {
  @scala.inline
  def apply(raw: js.UndefOr[scala.Boolean] = js.undefined): QRCodeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[QRCodeExportSVGOptions]
  }
}

