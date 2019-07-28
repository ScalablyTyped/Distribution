package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportingAccessibilityOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable accessibility support for
    * the export menu.
    */
  var enabled: js.UndefOr[js.Any] = js.undefined
}

object ExportingAccessibilityOptions {
  @scala.inline
  def apply(enabled: js.Any = null): ExportingAccessibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[ExportingAccessibilityOptions]
  }
}

