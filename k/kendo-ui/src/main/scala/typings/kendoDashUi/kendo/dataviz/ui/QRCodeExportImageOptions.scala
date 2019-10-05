package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeExportImageOptions extends js.Object {
  var height: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object QRCodeExportImageOptions {
  @scala.inline
  def apply(height: String = null, width: String = null): QRCodeExportImageOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[QRCodeExportImageOptions]
  }
}

