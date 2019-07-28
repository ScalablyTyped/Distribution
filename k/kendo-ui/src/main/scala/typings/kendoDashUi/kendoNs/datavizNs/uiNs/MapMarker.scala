package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.mapNs.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarker extends js.Object {
  var location: js.UndefOr[js.Any | Location] = js.undefined
  var shape: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var tooltip: js.UndefOr[MapMarkerTooltip] = js.undefined
}

object MapMarker {
  @scala.inline
  def apply(
    location: js.Any | Location = null,
    shape: String = null,
    title: String = null,
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

