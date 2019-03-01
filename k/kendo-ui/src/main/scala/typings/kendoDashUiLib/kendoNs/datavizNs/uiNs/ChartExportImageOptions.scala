package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartExportImageOptions extends js.Object {
  var cors: js.UndefOr[java.lang.String] = js.undefined
  var height: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object ChartExportImageOptions {
  @scala.inline
  def apply(cors: java.lang.String = null, height: java.lang.String = null, width: java.lang.String = null): ChartExportImageOptions = {
    val __obj = js.Dynamic.literal()
    if (cors != null) __obj.updateDynamic("cors")(cors)
    if (height != null) __obj.updateDynamic("height")(height)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ChartExportImageOptions]
  }
}

