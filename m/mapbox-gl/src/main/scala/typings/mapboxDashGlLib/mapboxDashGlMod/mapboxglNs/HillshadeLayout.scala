package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HillshadeLayout extends js.Object {
  var visibility: js.UndefOr[
    mapboxDashGlLib.mapboxDashGlLibStrings.visible | mapboxDashGlLib.mapboxDashGlLibStrings.none
  ] = js.undefined
}

object HillshadeLayout {
  @scala.inline
  def apply(
    visibility: mapboxDashGlLib.mapboxDashGlLibStrings.visible | mapboxDashGlLib.mapboxDashGlLibStrings.none = null
  ): HillshadeLayout = {
    val __obj = js.Dynamic.literal()
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[HillshadeLayout]
  }
}

