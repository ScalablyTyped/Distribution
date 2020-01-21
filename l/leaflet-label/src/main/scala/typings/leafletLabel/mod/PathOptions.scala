package typings.leafletLabel.mod

import typings.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends js.Object {
  var labelAnchor: js.UndefOr[Point_] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(labelAnchor: Point_ = null): PathOptions = {
    val __obj = js.Dynamic.literal()
    if (labelAnchor != null) __obj.updateDynamic("labelAnchor")(labelAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOptions]
  }
}

