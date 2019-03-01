package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendItem extends js.Object {
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartLegendItem {
  @scala.inline
  def apply(cursor: java.lang.String = null, visual: js.Function = null): ChartLegendItem = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartLegendItem]
  }
}

