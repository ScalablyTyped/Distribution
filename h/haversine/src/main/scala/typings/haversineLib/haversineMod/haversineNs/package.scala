package typings
package haversineLib.haversineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object haversineNs {
  type Coordinate = CoordinateLongitudeLatitude | CoordinateLonLat | LatLonTuple | GeoJSON
  type LatLonTuple = js.Tuple2[scala.Double, scala.Double]
}
