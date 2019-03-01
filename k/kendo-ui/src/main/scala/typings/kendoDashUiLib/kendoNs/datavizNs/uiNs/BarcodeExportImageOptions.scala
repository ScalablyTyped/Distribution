package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeExportImageOptions extends js.Object {
  var height: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object BarcodeExportImageOptions {
  @scala.inline
  def apply(height: java.lang.String = null, width: java.lang.String = null): BarcodeExportImageOptions = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[BarcodeExportImageOptions]
  }
}

