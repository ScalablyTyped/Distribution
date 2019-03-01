package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsOptions extends js.Object {
  var items: js.UndefOr[js.Array[LabelItem]] = js.undefined
  var style: js.UndefOr[CSSObject] = js.undefined
}

object LabelsOptions {
  @scala.inline
  def apply(items: js.Array[LabelItem] = null, style: CSSObject = null): LabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LabelsOptions]
  }
}

