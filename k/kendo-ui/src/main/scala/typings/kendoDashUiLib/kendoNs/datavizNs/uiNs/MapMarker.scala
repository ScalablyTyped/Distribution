package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarker extends js.Object {
  var location: js.UndefOr[js.Any | kendoDashUiLib.kendoNs.datavizNs.mapNs.Location] = js.undefined
  var shape: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[MapMarkerTooltip] = js.undefined
}

object MapMarker {
  @scala.inline
  def apply(
    location: js.Any | kendoDashUiLib.kendoNs.datavizNs.mapNs.Location = null,
    shape: java.lang.String = null,
    title: java.lang.String = null,
    tooltip: MapMarkerTooltip = null
  ): MapMarker = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[MapMarker]
  }
}

