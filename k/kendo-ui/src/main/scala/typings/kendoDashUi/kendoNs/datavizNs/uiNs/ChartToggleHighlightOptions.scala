package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartToggleHighlightOptions extends js.Object {
  var category: js.UndefOr[String] = js.undefined
  var series: js.UndefOr[String] = js.undefined
}

object ChartToggleHighlightOptions {
  @scala.inline
  def apply(category: String = null, series: String = null): ChartToggleHighlightOptions = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[ChartToggleHighlightOptions]
  }
}

