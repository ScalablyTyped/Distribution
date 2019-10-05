package typings.heredatalens.H.datalens

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HeatmapLayer {
  /**
    * Defines a constant for the bandwidth
    * A number that sets a constant for the bandwidth across all zoom levels.
    */
  type Bandwidth = Double
  /**
    * TODO: this is missing in the documentation: https://developer.here.com/visualization/documentation/datalens/h-datalens-heatmaplayer-options.html
    */
  type BandwidthCallback = js.Function0[Unit]
  /**
    * Tile X coordinate (column)
    * Coordinate in XYZ tile numbering scheme.
    */
  type X = Double
  /**
    * Tile Y coordinate (row)
    * Coordinate in XYZ tile numbering scheme.
    */
  type Y = Double
}
