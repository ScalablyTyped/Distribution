package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartLegendInactiveItemsLabels extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object ChartLegendInactiveItemsLabels {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    font: java.lang.String = null,
    template: java.lang.String | js.Function = null
  ): ChartLegendInactiveItemsLabels = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendInactiveItemsLabels]
  }
}

