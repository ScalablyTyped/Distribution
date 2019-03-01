package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomAnimEvent extends LeafletEvent {
  var center: LatLng
  var noUpdate: scala.Boolean
  var zoom: scala.Double
}

object ZoomAnimEvent {
  @scala.inline
  def apply(
    center: LatLng,
    noUpdate: scala.Boolean,
    target: js.Any,
    `type`: java.lang.String,
    zoom: scala.Double
  ): ZoomAnimEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("noUpdate")(noUpdate)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[ZoomAnimEvent]
  }
}

