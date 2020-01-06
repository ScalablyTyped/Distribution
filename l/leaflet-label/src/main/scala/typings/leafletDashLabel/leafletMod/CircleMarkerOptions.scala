package typings.leafletDashLabel.leafletMod

import typings.leaflet.leafletMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleMarkerOptions extends js.Object {
  var labelAnchor: js.UndefOr[Point] = js.undefined
}

object CircleMarkerOptions {
  @scala.inline
  def apply(labelAnchor: Point = null): CircleMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (labelAnchor != null) __obj.updateDynamic("labelAnchor")(labelAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleMarkerOptions]
  }
}

