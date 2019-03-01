package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartToggleHighlightOptions extends js.Object {
  var category: js.UndefOr[java.lang.String] = js.undefined
  var series: js.UndefOr[java.lang.String] = js.undefined
}

object ChartToggleHighlightOptions {
  @scala.inline
  def apply(category: java.lang.String = null, series: java.lang.String = null): ChartToggleHighlightOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[ChartToggleHighlightOptions]
  }
}

