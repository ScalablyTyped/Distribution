package typings
package leafletDashLabelLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleMarkerOptions extends js.Object {
  var labelAnchor: js.UndefOr[leafletLib.leafletMod.Point] = js.undefined
}

object CircleMarkerOptions {
  @scala.inline
  def apply(labelAnchor: leafletLib.leafletMod.Point = null): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (labelAnchor != null) __obj.updateDynamic("labelAnchor")(labelAnchor)
    __obj.asInstanceOf[CircleMarkerOptions]
  }
}

