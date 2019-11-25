package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerDefaults extends js.Object {
  var shape: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[MapMarkerDefaultsTooltip] = js.undefined
}

object MapMarkerDefaults {
  @scala.inline
  def apply(shape: String = null, tooltip: MapMarkerDefaultsTooltip = null): MapMarkerDefaults = {
    val __obj = js.Dynamic.literal()
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMarkerDefaults]
  }
}

