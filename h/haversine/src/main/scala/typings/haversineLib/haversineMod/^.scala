package typings
package haversineLib.haversineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("haversine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Determines the great-circle distance between two points on a sphere given their longitudes and latitudes
    */
  def apply(
    start: haversineLib.haversineMod.haversineNs.Coordinate,
    end: haversineLib.haversineMod.haversineNs.Coordinate
  ): scala.Double = js.native
  def apply(
    start: haversineLib.haversineMod.haversineNs.Coordinate,
    end: haversineLib.haversineMod.haversineNs.Coordinate,
    options: haversineLib.haversineMod.haversineNs.Options
  ): scala.Double = js.native
}

