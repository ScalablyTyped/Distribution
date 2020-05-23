package typings.haversine.mod

import typings.haversine.anon.Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.haversine.mod._ParamType because Already inherited */ trait GeoJSON extends _Coordinate {
  var geometry: Coordinates
}

object GeoJSON {
  @scala.inline
  def apply(geometry: Coordinates): GeoJSON = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSON]
  }
}

