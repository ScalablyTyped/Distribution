package typings
package heredatalensLib.HNs.datalensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HeatmapLayerNs {
  /**
           * Defines a constant for the bandwidth
           * A number that sets a constant for the bandwidth across all zoom levels.
           */
  type Bandwidth = scala.Double
  /**
           * TODO: this is missing in the documentation: https://developer.here.com/visualization/documentation/datalens/h-datalens-heatmaplayer-options.html
           */
  type BandwidthCallback = js.Function0[scala.Unit]
  /**
           * Tile X coordinate (column)
           * Coordinate in XYZ tile numbering scheme.
           */
  type X = scala.Double
  /**
           * Tile Y coordinate (row)
           * Coordinate in XYZ tile numbering scheme.
           */
  type Y = scala.Double
}
