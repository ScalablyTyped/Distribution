package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramExportSVGOptions extends js.Object {
  var raw: js.UndefOr[Boolean] = js.undefined
}

object DiagramExportSVGOptions {
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] = js.undefined): DiagramExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[DiagramExportSVGOptions]
  }
}

