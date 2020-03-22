package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityZoomOptions extends js.Object {
  var mapZoomIn: js.UndefOr[String] = js.undefined
  var mapZoomOut: js.UndefOr[String] = js.undefined
  var resetZoomButton: js.UndefOr[String] = js.undefined
}

object LangAccessibilityZoomOptions {
  @scala.inline
  def apply(mapZoomIn: String = null, mapZoomOut: String = null, resetZoomButton: String = null): LangAccessibilityZoomOptions = {
    val __obj = js.Dynamic.literal()
    if (mapZoomIn != null) __obj.updateDynamic("mapZoomIn")(mapZoomIn.asInstanceOf[js.Any])
    if (mapZoomOut != null) __obj.updateDynamic("mapZoomOut")(mapZoomOut.asInstanceOf[js.Any])
    if (resetZoomButton != null) __obj.updateDynamic("resetZoomButton")(resetZoomButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityZoomOptions]
  }
}

