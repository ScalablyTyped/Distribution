package typings.leafletDashLabel.leafletMod

import typings.leaflet.leafletMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOptions extends js.Object {
  var labelAnchor: js.UndefOr[Point] = js.undefined
}

object IconOptions {
  @scala.inline
  def apply(labelAnchor: Point = null): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (labelAnchor != null) __obj.updateDynamic("labelAnchor")(labelAnchor)
    __obj.asInstanceOf[IconOptions]
  }
}

