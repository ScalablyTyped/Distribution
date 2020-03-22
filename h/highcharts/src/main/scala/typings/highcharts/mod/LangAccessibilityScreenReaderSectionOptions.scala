package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityScreenReaderSectionOptions extends js.Object {
  var afterRegionLabel: js.UndefOr[String] = js.undefined
  var beforeRegionLabel: js.UndefOr[String] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Label for the end of the chart.
    * Announced by screen readers.
    */
  var endOfChartMarker: js.UndefOr[String] = js.undefined
}

object LangAccessibilityScreenReaderSectionOptions {
  @scala.inline
  def apply(afterRegionLabel: String = null, beforeRegionLabel: String = null, endOfChartMarker: String = null): LangAccessibilityScreenReaderSectionOptions = {
    val __obj = js.Dynamic.literal()
    if (afterRegionLabel != null) __obj.updateDynamic("afterRegionLabel")(afterRegionLabel.asInstanceOf[js.Any])
    if (beforeRegionLabel != null) __obj.updateDynamic("beforeRegionLabel")(beforeRegionLabel.asInstanceOf[js.Any])
    if (endOfChartMarker != null) __obj.updateDynamic("endOfChartMarker")(endOfChartMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityScreenReaderSectionOptions]
  }
}

