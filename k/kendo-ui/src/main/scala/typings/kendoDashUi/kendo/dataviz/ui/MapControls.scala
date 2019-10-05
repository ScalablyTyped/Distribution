package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControls extends js.Object {
  var attribution: js.UndefOr[Boolean | MapControlsAttribution] = js.undefined
  var navigator: js.UndefOr[Boolean | MapControlsNavigator] = js.undefined
  var zoom: js.UndefOr[Boolean | MapControlsZoom] = js.undefined
}

object MapControls {
  @scala.inline
  def apply(
    attribution: Boolean | MapControlsAttribution = null,
    navigator: Boolean | MapControlsNavigator = null,
    zoom: Boolean | MapControlsZoom = null
  ): MapControls = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (navigator != null) __obj.updateDynamic("navigator")(navigator.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControls]
  }
}

