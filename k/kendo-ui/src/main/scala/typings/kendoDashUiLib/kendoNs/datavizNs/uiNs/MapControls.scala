package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapControls extends js.Object {
  var attribution: js.UndefOr[scala.Boolean | MapControlsAttribution] = js.undefined
  var navigator: js.UndefOr[scala.Boolean | MapControlsNavigator] = js.undefined
  var zoom: js.UndefOr[scala.Boolean | MapControlsZoom] = js.undefined
}

object MapControls {
  @scala.inline
  def apply(
    attribution: scala.Boolean | MapControlsAttribution = null,
    navigator: scala.Boolean | MapControlsNavigator = null,
    zoom: scala.Boolean | MapControlsZoom = null
  ): MapControls = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (navigator != null) __obj.updateDynamic("navigator")(navigator.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapControls]
  }
}

