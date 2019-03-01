package typings
package leafletDashLabelLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends js.Object {
  var labelAnchor: js.UndefOr[leafletLib.leafletMod.Point] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(labelAnchor: leafletLib.leafletMod.Point = null): PathOptions = {
    val __obj = js.Dynamic.literal()
    if (labelAnchor != null) __obj.updateDynamic("labelAnchor")(labelAnchor)
    __obj.asInstanceOf[PathOptions]
  }
}

