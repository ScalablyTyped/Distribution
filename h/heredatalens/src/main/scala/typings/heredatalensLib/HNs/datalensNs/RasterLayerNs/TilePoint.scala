package typings
package heredatalensLib.HNs.datalensNs.RasterLayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Defines the input data format for heat map rendering.
         * To collect data rows for each tile with respect to the buffer, each row must be represented as a point within the map tile.
         */

trait TilePoint extends js.Object {
  /** Reference to source data row */
  var data: js.UndefOr[Row] = js.undefined
  /** Row relative to tile */
  var x: scala.Double
  /** Column relative to tile */
  var y: scala.Double
}

