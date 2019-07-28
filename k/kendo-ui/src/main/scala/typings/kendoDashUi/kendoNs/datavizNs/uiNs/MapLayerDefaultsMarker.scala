package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapLayerDefaultsMarker extends js.Object {
  var opacity: js.UndefOr[Double] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[MapLayerDefaultsMarkerTooltip] = js.undefined
}

object MapLayerDefaultsMarker {
  @scala.inline
  def apply(opacity: Int | Double = null, shape: String = null, tooltip: MapLayerDefaultsMarkerTooltip = null): MapLayerDefaultsMarker = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[MapLayerDefaultsMarker]
  }
}

