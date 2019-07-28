package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGaugeExportImageOptions extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object ArcGaugeExportImageOptions {
  @scala.inline
  def apply(height: String = null, width: String = null): ArcGaugeExportImageOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ArcGaugeExportImageOptions]
  }
}

