package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeExportSVGOptions extends js.Object {
  var raw: js.UndefOr[Boolean] = js.undefined
}

object BarcodeExportSVGOptions {
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] = js.undefined): BarcodeExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeExportSVGOptions]
  }
}

