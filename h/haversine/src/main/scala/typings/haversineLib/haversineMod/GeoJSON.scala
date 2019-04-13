package typings
package haversineLib.haversineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSON extends _Coordinate {
  var geometry: haversineLib.Anon_Coordinates
}

object GeoJSON {
  @scala.inline
  def apply(geometry: haversineLib.Anon_Coordinates): GeoJSON = {
    val __obj = js.Dynamic.literal(geometry = geometry)
  
    __obj.asInstanceOf[GeoJSON]
  }
}

