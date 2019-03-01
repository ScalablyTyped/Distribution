package typings
package googlemapsLib.googleNs.mapsNs.DataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetGeometryEvent extends js.Object {
  var feature: Feature
  var newGeometry: Geometry
  var oldGeometry: Geometry
}

object SetGeometryEvent {
  @scala.inline
  def apply(feature: Feature, newGeometry: Geometry, oldGeometry: Geometry): SetGeometryEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("feature")(feature)
    __obj.updateDynamic("newGeometry")(newGeometry)
    __obj.updateDynamic("oldGeometry")(oldGeometry)
    __obj.asInstanceOf[SetGeometryEvent]
  }
}

