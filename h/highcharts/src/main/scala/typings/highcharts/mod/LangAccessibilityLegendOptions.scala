package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityLegendOptions extends js.Object {
  var legendItem: js.UndefOr[String] = js.undefined
  var legendLabel: js.UndefOr[String] = js.undefined
}

object LangAccessibilityLegendOptions {
  @scala.inline
  def apply(legendItem: String = null, legendLabel: String = null): LangAccessibilityLegendOptions = {
    val __obj = js.Dynamic.literal()
    if (legendItem != null) __obj.updateDynamic("legendItem")(legendItem.asInstanceOf[js.Any])
    if (legendLabel != null) __obj.updateDynamic("legendLabel")(legendLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityLegendOptions]
  }
}

