package typings.haversine.haversineMod

import typings.haversine.Anon_Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.haversine.haversineMod._ParamType because Already inherited */ trait GeoJSON extends _Coordinate {
  var geometry: Anon_Coordinates
}

object GeoJSON {
  @scala.inline
  def apply(geometry: Anon_Coordinates): GeoJSON = {
    val __obj = js.Dynamic.literal(geometry = geometry)
  
    __obj.asInstanceOf[GeoJSON]
  }
}

