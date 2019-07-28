package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsOptions extends js.Object {
  /**
    * (Highcharts, Highstock) An HTML label that can be positioned anywhere in
    * the chart area.
    */
  var items: js.UndefOr[js.Array[LabelsItemsOptions]] = js.undefined
  /**
    * (Highcharts, Highstock) Shared CSS styles for all labels.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object LabelsOptions {
  @scala.inline
  def apply(items: js.Array[LabelsItemsOptions] = null, style: CSSObject = null): LabelsOptions = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LabelsOptions]
  }
}

