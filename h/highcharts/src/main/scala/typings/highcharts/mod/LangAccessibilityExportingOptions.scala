package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityExportingOptions extends js.Object {
  var chartMenuLabel: js.UndefOr[String] = js.undefined
  var exportRegionLabel: js.UndefOr[String] = js.undefined
  var menuButtonLabel: js.UndefOr[String] = js.undefined
}

object LangAccessibilityExportingOptions {
  @scala.inline
  def apply(chartMenuLabel: String = null, exportRegionLabel: String = null, menuButtonLabel: String = null): LangAccessibilityExportingOptions = {
    val __obj = js.Dynamic.literal()
    if (chartMenuLabel != null) __obj.updateDynamic("chartMenuLabel")(chartMenuLabel.asInstanceOf[js.Any])
    if (exportRegionLabel != null) __obj.updateDynamic("exportRegionLabel")(exportRegionLabel.asInstanceOf[js.Any])
    if (menuButtonLabel != null) __obj.updateDynamic("menuButtonLabel")(menuButtonLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityExportingOptions]
  }
}

