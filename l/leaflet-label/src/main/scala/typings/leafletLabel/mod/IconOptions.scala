package typings.leafletLabel.mod

import typings.leaflet.mod.Point_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconOptions extends js.Object {
  var labelAnchor: js.UndefOr[Point_] = js.undefined
}

object IconOptions {
  @scala.inline
  def apply(labelAnchor: Point_ = null): IconOptions = {
    val __obj = js.Dynamic.literal()
    if (labelAnchor != null) __obj.updateDynamic("labelAnchor")(labelAnchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconOptions]
  }
}

