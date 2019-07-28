package typings.heredatalens.HNs.datalensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RawDataProviderNs {
  /**
    * A GeoJSON feature
    * A GeoJSON feature object which conforms to the standard GeoJSON spec
    */
  type Feature = js.Any
  /**
    * Geographic coordinates
    * A geographic coordinates pair [lat, lng]
    */
  type GeoCoordinates = js.Tuple2[Double, Double]
  /**
    * Latitude coordinate
    * The latitude in the geographic coordinates pair
    */
  type Latitude = Double
  /**
    * Longitude coordinate
    * The longitude in the geographic coordinates pair
    */
  type Longitude = Double
  /**
    * Pixel coordinate in the x direction
    * The x coordinate of the pixel coordinates pair [px, py]
    */
  type PX = Double
  /**
    * Pixel coordinate in the y direction
    * The y coordinate of the pixel coordinates pair [px, py]
    */
  type PY = Double
  /**
    * Pixel coordinates
    * Pixel coordinates [px, py] pair
    */
  type PixelCoordinates = js.Tuple2[Double, Double]
  /**
    * Tile size
    * The tile size in pixels.
    */
  type TileSize = js.Any
}
