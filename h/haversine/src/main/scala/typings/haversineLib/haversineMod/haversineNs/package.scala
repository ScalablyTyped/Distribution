package typings
package haversineLib.haversineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object haversineNs {
  /* Rewritten from type alias, can be one of: 
    - CoordinateLongitudeLatitude
    - CoordinateLonLat
    - CoordinateLatLng
    - LatLonTuple
    - GeoJSON
  */
  type Coordinate = _Coordinate | LatLonTuple
  type LatLonTuple = js.Tuple2[scala.Double, scala.Double]
}
