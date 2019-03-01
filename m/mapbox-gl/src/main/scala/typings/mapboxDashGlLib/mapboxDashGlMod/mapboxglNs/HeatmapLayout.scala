package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapLayout extends js.Object {
  var visibility: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.visible | mapboxDashGlLib.mapboxDashGlLibStrings.none
  ] = js.undefined
}

object HeatmapLayout {
  @scala.inline
  def apply(
    visibility: mapboxDashGlLib.mapboxDashGlLibStrings.visible | mapboxDashGlLib.mapboxDashGlLibStrings.none = null
  ): HeatmapLayout = {
    val __obj = js.Dynamic.literal()
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapLayout]
  }
}

